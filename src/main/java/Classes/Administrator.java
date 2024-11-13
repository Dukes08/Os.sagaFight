/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import EDD.Node;
import Interfaces.Global;
import Interfaces.Interfaz;
import static Interfaces.Interfaz.getPrioridad1SW;
import static Interfaces.Interfaz.getPrioridad1ST;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author andresrivas
 */
public class Administrator extends Thread{
    
    private int ciclo; //cada 2 ciclos se revisa la probabilidad de que se cree uno nuevo
    public AICPU ia; //la IA con el que el Admin va a estar trabajando
    private Semaphore mutex1; //Semaforo de Star Wars
    private Semaphore mutex2; //Semaforo de Star Trek
    private int IdCh=0;
    
    public Administrator(AICPU ia){
        this.ciclo = 0;
        this.ia = ia;
        this.mutex1 = new Semaphore(1);
        this.mutex2 = new Semaphore(1);
        
    }
    
    @Override
    public void run(){
        while(true){
            try{
                checkEmpty();
                mutex1.acquire(); //Wait del semáforo de Cartoon Network para conseguir el personaje
                if(Global.getSW().getPrioridad1().getSize() > 0){
                    this.ia.setP1(Global.getSW().getPrioridad1().desencolar().getElement());
                    Interfaz.getPrioridad1SW().setText(Global.getSW().getPrioridad1().show());
                }else if(Global.getSW().getPrioridad2().getSize() > 0){
                    this.ia.setP1(Global.getSW().getPrioridad2().desencolar().getElement());
                    Interfaz.getPrioridad2SW().setText(Global.getSW().getPrioridad2().show());
                }else if(Global.getSW().getPrioridad3().getSize() > 0){
                    this.ia.setP1(Global.getSW().getPrioridad3().desencolar().getElement());
                    Interfaz.getPrioridad3SW().setText(Global.getSW().getPrioridad3().show());
                }
                System.out.println("Se escogio uno de Star Wars");
                mutex1.release(); //Se cierra la zona crítica de Cartoon Network
                
                changeStatsSW(); //Se cambian las Stats al personaje actual de Cartoon Network

                mutex2.acquire(); //Wait del Semáforo de Nickelodeon para conseguir el personaje

                if(Global.getST().getPrioridad1().getSize() > 0){
                    this.ia.setP2(Global.getST().getPrioridad1().desencolar().getElement());
                    Interfaz.getPrioridad1ST().setText(Global.getST().getPrioridad1().show());
                }else if(Global.getST().getPrioridad2().getSize() > 0){
                    this.ia.setP2(Global.getST().getPrioridad2().desencolar().getElement());
                    Interfaz.getPrioridad2ST().setText(Global.getST().getPrioridad2().show());
                }else if(Global.getST().getPrioridad3().getSize() > 0){
                    this.ia.setP2(Global.getST().getPrioridad3().desencolar().getElement());
                    Interfaz.getPrioridad3ST().setText(Global.getST().getPrioridad3().show());
                }
                System.out.println("Se escogio uno de Nick");
                mutex2.release(); //Se cierra la zona crítica de Nickelodeon
                
                changeStatsST(); //Se cambian las Stats al personaje actual de Nick
            
            changeIcons();    
                
            this.ia.run();
            
            clearStats();
            this.ciclo++;
            //hora de ver como se actualizan las colas
            Actualizar_colas();
            
            
            //Se terminó el combate y se actualizaron las colas, entonces, revisamos las listas de refuerzos
            if(Global.getSW().getRefuerzo().getSize()>0){
                int chance= (int) (Math.random()*100);
                mutex1.acquire();
                if(chance>= 0 && chance <= 40){
                    System.out.println("Un personaje de CN salió de la cola de refuerzos");
                    Node character = Global.getSW().getRefuerzo().desencolar();
                    Global.getSW().getPrioridad1().encolar(character.getElement());
                    Interfaz.getRefuerzoSW().setText(Global.getSW().getRefuerzo().show());
                    Interfaz.getPrioridad1SW().setText(Global.getSW().getPrioridad1().show());
                }else{
                    System.out.println("Un personaje de CN se mandó al final de la cola de refuerzos");
                    Node character = Global.getSW().getRefuerzo().desencolar();
                    Global.getSW().getRefuerzo().encolar(character.getElement());
                    Interfaz.getRefuerzoSW().setText(Global.getSW().getRefuerzo().show());
                }
                mutex1.release();
            }

            if(Global.getST().getRefuerzo().getSize()>0){
                int chance= (int) (Math.random()*100);
                mutex2.acquire();
                if(chance>= 0 && chance <= 40){
                    System.out.println("Un personaje de Nick salió de la cola de refuerzos");
                    Node character = Global.getST().getRefuerzo().desencolar();
                    Global.getST().getPrioridad1().encolar(character.getElement());
                    Interfaz.getRefuerzoST().setText(Global.getST().getRefuerzo().show());
                    Interfaz.getPrioridad1ST().setText(Global.getST().getPrioridad1().show());
                }else{
                    System.out.println("Un personaje de Nick se mandó al final de la cola de refuerzos");
                    Node character = Global.getST().getRefuerzo().desencolar();
                    Global.getST().getRefuerzo().encolar(character.getElement());
                    Interfaz.getRefuerzoST().setText(Global.getST().getRefuerzo().show());
                }
                mutex2.release();
            }
            //hora de ver si se crea un personaje o no 
            if(this.ciclo==2) {//se revisa si ya pasaron 2 ciclos
                int crear=(int) (Math.random()*100);
                
                if(crear>=0 && crear<80) {//entro en la probabilidad de crear
                    //System.out.println("se crea personaje");
                    AgregarPersonaje();
                }
                //si entra o no al final el contador de ciclo se reinicia a 0
                this.ciclo=0;
            }
            
                
            } catch (InterruptedException ex) {
                Logger.getLogger(AICPU.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    //antes de llamar a esta funcion se debe verificar que entro en el 80%
    public void AgregarPersonaje(){        
        //crear un personaje de cartoon network
        int numP=(int) (Math.random()*19);
        int numO=(int) (Math.random()*9);
        Global.getSW().createCharacter(Global.getStarWars()[numP], Global.getObjetos()[numO],IdCh);
        IdCh++;
        
        //crear un personaje de nick
        numP=(int) (Math.random()*19);
        numO=(int) (Math.random()*9);
        Global.getST().createCharacter(Global.getStarTrek()[numP], Global.getObjetos()[numO],IdCh);
        IdCh++;
        
    }
    
    public void Actualizar_colas() {
           // System.out.println("contador 2 de cn");
            Global.getSW().getPrioridad2().addCounter();
           // System.out.println("contador 3 de cn");
            Global.getSW().getPrioridad3().addCounter();
            
           // System.out.println("contador 2 de nick");
            Global.getST().getPrioridad2().addCounter();
           // System.out.println("contador 3 de nick");
            Global.getST().getPrioridad3().addCounter();
            
            //ahora veo como encolo y desencolo las que tienen 8 como contador
            Node deleted;
            //para prioridad 2 de nick
                System.out.println("personajes en cola de prioridad 2 de nick en admin");
            for (Node aux=Global.getST().getPrioridad2().getFirst(); aux!=null; aux=aux.getNext()) {
                if(aux.getElement().getCounter()==8) {//si es de 8 debe subir la prioridad
                   // System.out.println("contador: "+aux.getElement().getCounter()+" personaje "+aux.getElement().getName()+" id "+aux.getElement().getId());
                    aux.getElement().setLevel(aux.getElement().getLevel()+1);
                    aux.getElement().setCounter(0);
                    int indice=Global.getST().getPrioridad2().search(aux);//indice del node a delete
                   // System.out.println("indice: "+indice);
                    if(indice==0) {
                        
                        deleted=Global.getST().getPrioridad2().desencolar();
                        //System.out.println("pipipi "+borrado.getNext());
                        
                    }
                    else {
                        deleted=Global.getST().getPrioridad2().delete(indice);//lo quito de la cola
                    //System.out.println("node borrado "+borrado.getElement().getId());
                    }
                    Global.getST().getPrioridad1().encolar(aux.getElement());//lo meto a la de prioridad 1
//                    System.out.println("nueva prioridad 1");
//            Global.getST().getPrioridad1().show();
//            System.out.println("nueva prioridad 2");
//            Global.getST().getPrioridad2().show();
                    //System.out.println("AAAAAAA "+aux.getNext());
                }
        
            }
            
            Interfaz.getPrioridad1ST().setText(Global.getST().getPrioridad1().show());
            Interfaz.getPrioridad2ST().setText(Global.getST().getPrioridad2().show());
                    
            
            //para prioridad 3 de nick
            for (Node aux=Global.getST().getPrioridad3().getFirst(); aux!=null; aux=aux.getNext()) {
                if(aux.getElement().getCounter()==8) {//si es de 8 debe subir la prioridad
                   // System.out.println("contador: "+aux.getElement().getCounter()+" personaje "+aux.getElement().getName()+" id "+aux.getElement().getId());
                    aux.getElement().setLevel(aux.getElement().getLevel()+1);
                    aux.getElement().setCounter(0);
                    int indice=Global.getST().getPrioridad3().search(aux);//indice del node a delete
                   // System.out.println("indice: "+indice);
                    if(indice==0) {
                        
                        deleted=Global.getST().getPrioridad3().desencolar();
                        //System.out.println("pipipi "+borrado.getNext());
                        
                    }
                    else {
                        deleted=Global.getST().getPrioridad3().delete(indice);//lo quito de la cola
                    //System.out.println("node borrado "+borrado.getElement().getId());
                    }
                    Global.getST().getPrioridad2().encolar(aux.getElement());//lo meto a la de prioridad 1
//                    System.out.println("nueva prioridad 2");
//            Global.getST().getPrioridad2().show();
//            System.out.println("nueva prioridad 3");
//            Global.getST().getPrioridad3().show();
                    //System.out.println("AAAAAAA "+aux.getNext());
                }
        
            }
            
            Interfaz.getPrioridad2ST().setText(Global.getST().getPrioridad2().show());
            Interfaz.getPrioridad3ST().setText(Global.getST().getPrioridad3().show());
                        
            //para prioridad 2 de cartoon
                System.out.println("personajes en cola de prioridad 2 de cartoon en admin");
            for (Node aux=Global.getSW().getPrioridad2().getFirst(); aux!=null; aux=aux.getNext()) {
                if(aux.getElement().getCounter()==8) {//si es de 8 debe subir la prioridad
                   // System.out.println("contador: "+aux.getElement().getCounter()+" personaje "+aux.getElement().getName()+" id "+aux.getElement().getId());
                    aux.getElement().setLevel(aux.getElement().getLevel()+1);
                    aux.getElement().setCounter(0);
                    int indice=Global.getSW().getPrioridad2().search(aux);//indice del node a delete
                   // System.out.println("indice: "+indice);
                    if(indice==0) {
                        
                        deleted=Global.getSW().getPrioridad2().desencolar();
                        //System.out.println("pipipi "+borrado.getNext());
                        
                    }
                    else {
                        deleted=Global.getSW().getPrioridad2().delete(indice);//lo quito de la cola
                    //System.out.println("node borrado "+borrado.getElement().getId());
                    }
                    Global.getSW().getPrioridad1().encolar(aux.getElement());//lo meto a la de prioridad 1
//                    System.out.println("nueva prioridad 1");
//            Global.getSW().getPrioridad1().show();
//            System.out.println("nueva prioridad 2");
//            Global.getSW().getPrioridad2().show();
                    //System.out.println("AAAAAAA "+aux.getNext());
                }
        
            }
            
            Interfaz.getPrioridad1SW().setText(Global.getSW().getPrioridad1().show());
            Interfaz.getPrioridad2SW().setText(Global.getSW().getPrioridad2().show());
            
            //para prioridad 3 de cartoon
            for (Node aux=Global.getSW().getPrioridad3().getFirst(); aux!=null; aux=aux.getNext()) {
                if(aux.getElement().getCounter()==8) {//si es de 8 debe subir la prioridad
                   // System.out.println("contador: "+aux.getElement().getCounter()+" personaje "+aux.getElement().getName()+" id "+aux.getElement().getId());
                    aux.getElement().setLevel(aux.getElement().getLevel()+1);
                    aux.getElement().setCounter(0);
                    int indice=Global.getSW().getPrioridad3().search(aux);//indice del node a delete
                   // System.out.println("indice: "+indice);
                    if(indice==0) {
                        
                        deleted=Global.getSW().getPrioridad3().desencolar();
                        //System.out.println("pipipi "+borrado.getNext());
                        
                    }
                    else {
                        deleted=Global.getSW().getPrioridad3().delete(indice);//lo quito de la cola
                    //System.out.println("node borrado "+borrado.getElement().getId());
                    }
                    Global.getSW().getPrioridad2().encolar(aux.getElement());//lo meto a la de prioridad 1
//                    System.out.println("nueva prioridad 2");
//            Global.getSW().getPrioridad2().show();
//            System.out.println("nueva prioridad 3");
//            Global.getSW().getPrioridad3().show();
                    //System.out.println("AAAAAAA "+aux.getNext());
                }
        
            }
            
            Interfaz.getPrioridad2SW().setText(Global.getSW().getPrioridad2().show());
            Interfaz.getPrioridad3SW().setText(Global.getSW().getPrioridad3().show());
    
    
    
    
    
    }
    
    public void changeIcons(){
        Interfaz.getIconST().setIcon(new ImageIcon(getClass().getResource("/Users/andresrivas/proyectos-so/Os.sagaFight/src/main/java/InterfaceImages/"+this.ia.getP2().getName()+".png")));
        Interfaz.getIconSW().setIcon(new ImageIcon(getClass().getResource("/Users/andresrivas/proyectos-so/Os.sagaFight/src/main/java/InterfaceImages/"+this.ia.getP1().getName()+".png")));
    }
    
    public void changeStatsSW(){
        Interfaz.getObjectSW().setText(this.ia.getP1().getObject());
        Interfaz.getAbilitySW().setText(Integer.toString(this.ia.getP1().getHability()));
        Interfaz.getStrengthSW().setText(Integer.toString(this.ia.getP1().getStrength()));
        Interfaz.getHPSW().setText(Integer.toString(this.ia.getP1().getHp()));
        Interfaz.getAgilitySW().setText(Integer.toString(this.ia.getP1().getAgility()));
    }
    
    public void changeStatsST(){
        Interfaz.getObjectST().setText(this.ia.getP2().getObject());
        Interfaz.getAbilityST().setText(Integer.toString(this.ia.getP2().getHability()));
        Interfaz.getStrengthST().setText(Integer.toString(this.ia.getP2().getStrength()));
        Interfaz.getHPST().setText(Integer.toString(this.ia.getP2().getHp()));
        Interfaz.getAgilityST().setText(Integer.toString(this.ia.getP2().getAgility()));
    }
    
    public void clearStats(){
        Interfaz.getObjectSW().setText("-");
        Interfaz.getAbilitySW().setText("-");
        Interfaz.getStrengthSW().setText("-");
        Interfaz.getHPSW().setText("-");
        Interfaz.getAgilitySW().setText("-");
        
        Interfaz.getObjectST().setText("-");
        Interfaz.getAbilityST().setText("-");
        Interfaz.getStrengthST().setText("-");
        Interfaz.getHPST().setText("-");
        Interfaz.getAgilityST().setText("-");
    }
    
    public void clearIcons(){
        Interfaz.getIconST().setIcon(new ImageIcon(getClass().getResource("/Users/andresrivas/proyectos-so/Os.sagaFight/src/main/java/InterfaceImages/Carta.png")));
        Interfaz.getIconSW().setIcon(new ImageIcon(getClass().getResource("/Users/andresrivas/proyectos-so/Os.sagaFight/src/main/java/InterfaceImages/Carta.png")));
    }
    
    public void checkEmpty(){
        if(Global.getSW().getPrioridad1().getSize() == 0 && Global.getSW().getPrioridad2().getSize() == 0 && Global.getSW().getPrioridad3().getSize() == 0){
            int numP=(int) (Math.random()*19);
            int numO=(int) (Math.random()*9);
            Global.getSW().createCharacter(Global.getStarWars()[numP], Global.getObjetos()[numO],IdCh);
            IdCh++;            
        }
        
        if(Global.getST().getPrioridad1().getSize() == 0 && Global.getST().getPrioridad2().getSize() == 0 && Global.getST().getPrioridad3().getSize() == 0){
            int numP=(int) (Math.random()*19);
            int numO=(int) (Math.random()*9);
            Global.getST().createCharacter(Global.getStarTrek()[numP], Global.getObjetos()[numO],IdCh);
            IdCh++;
        }
    }

    /**
     * @return the ciclo
     */
    public int getCiclo() {
        return ciclo;
    }

    /**
     * @param ciclo the ciclo to set
     */
    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    /**
     * @return the ia
     */
    public AICPU getIa() {
        return ia;
    }

    /**
     * @param ia the ia to set
     */
    public void setIa(AICPU ia) {
        this.ia = ia;
    }

    /**
     * @return the mutex1
     */
    public Semaphore getMutex1() {
        return mutex1;
    }

    /**
     * @param mutex1 the mutex1 to set
     */
    public void setMutex1(Semaphore mutex1) {
        this.mutex1 = mutex1;
    }

    /**
     * @return the mutex2
     */
    public Semaphore getMutex2() {
        return mutex2;
    }

    /**
     * @param mutex2 the mutex2 to set
     */
    public void setMutex2(Semaphore mutex2) {
        this.mutex2 = mutex2;
    }

    /**
     * @return the IdCh
     */
    public int getIdCh() {
        return IdCh;
    }

    /**
     * @param IdCh the IdCh to set
     */
    public void setIdCh(int IdCh) {
        this.IdCh = IdCh;
    }
    
    
}
