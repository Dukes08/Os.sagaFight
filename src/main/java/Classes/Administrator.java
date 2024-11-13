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
                mutex1.acquire(); //Wait del semáforo de Star Wars para conseguir el personaje
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
                mutex1.release(); 
                
                changeStatsSW(); 

                mutex2.acquire(); 

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
                System.out.println("Se escogio uno de Star Trek");
                mutex2.release(); 
                
                changeStatsST(); 
            
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
                mutex2.acquire();
                if(chance>= 0 && chance <= 40){
                    System.out.println("Un personaje de Star Wars salió de la cola de refuerzos");
                    Node characterSW = Global.getSW().getRefuerzo().desencolar();
                    Global.getSW().getPrioridad1().encolar(characterSW.getElement());
                    Interfaz.getRefuerzoSW().setText(Global.getSW().getRefuerzo().show());
                    Interfaz.getPrioridad1SW().setText(Global.getSW().getPrioridad1().show());
                    System.out.println("Un personaje de Star Trek salió de la cola de refuerzos");
                    Node characterST = Global.getST().getRefuerzo().desencolar();
                    Global.getST().getPrioridad1().encolar(characterST.getElement());
                    Interfaz.getRefuerzoST().setText(Global.getST().getRefuerzo().show());
                    Interfaz.getPrioridad1ST().setText(Global.getST().getPrioridad1().show());
                }else{
                    System.out.println("Un personaje de Star Wars se mandó al final de la cola de refuerzos");
                    Node characterSW = Global.getSW().getRefuerzo().desencolar();
                    Global.getSW().getRefuerzo().encolar(characterSW.getElement());
                    Interfaz.getRefuerzoSW().setText(Global.getSW().getRefuerzo().show());
                    System.out.println("Un personaje de Star Trek se mandó al final de la cola de refuerzos");
                    Node characterST = Global.getST().getRefuerzo().desencolar();
                    Global.getST().getRefuerzo().encolar(characterST.getElement());
                    Interfaz.getRefuerzoST().setText(Global.getST().getRefuerzo().show());
                }
                mutex1.release();
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
        //crear un personaje de star wars
        int numP=(int) (Math.random()*19);
        int numO=(int) (Math.random()*9);
        Global.getSW().createCharacter(Global.getStarWars()[numP], Global.getObjetos()[numO],IdCh);
        IdCh++;
        
        //crear un personaje de star trek
        numP=(int) (Math.random()*19);
        numO=(int) (Math.random()*9);
        Global.getST().createCharacter(Global.getStarTrek()[numP], Global.getObjetos()[numO],IdCh);
        IdCh++;
        
    }
    
    public void Actualizar_colas() {
            Global.getSW().getPrioridad2().addCounter();
            Global.getSW().getPrioridad3().addCounter();
            
            Global.getST().getPrioridad2().addCounter();
            Global.getST().getPrioridad3().addCounter();
            
            Node deleted;
            //para prioridad 2 de star trek
            for (Node aux=Global.getST().getPrioridad2().getFirst(); aux!=null; aux=aux.getNext()) {
                if(aux.getElement().getCounter()==8) {//si es de 8 debe subir la prioridad
                    aux.getElement().setLevel(aux.getElement().getLevel()+1);
                    aux.getElement().setCounter(0);
                    int indice=Global.getST().getPrioridad2().search(aux);//indice del node a delete
                    if(indice==0) {
                        
                        deleted=Global.getST().getPrioridad2().desencolar();
                        
                    }
                    else {
                        deleted=Global.getST().getPrioridad2().delete(indice);//lo quito de la cola
                    }
                    Global.getST().getPrioridad1().encolar(aux.getElement());//lo meto a la de prioridad 1

                }
        
            }
            
            Interfaz.getPrioridad1ST().setText(Global.getST().getPrioridad1().show());
            Interfaz.getPrioridad2ST().setText(Global.getST().getPrioridad2().show());
                    
            
            //para prioridad 3 de star trek
            for (Node aux=Global.getST().getPrioridad3().getFirst(); aux!=null; aux=aux.getNext()) {
                if(aux.getElement().getCounter()==8) {//si es de 8 debe subir la prioridad
                    aux.getElement().setLevel(aux.getElement().getLevel()+1);
                    aux.getElement().setCounter(0);
                    int indice=Global.getST().getPrioridad3().search(aux);//indice del node a delete
                    if(indice==0) {
                        
                        deleted=Global.getST().getPrioridad3().desencolar();
                        
                    }
                    else {
                        deleted=Global.getST().getPrioridad3().delete(indice);//lo quito de la cola
                    }
                    Global.getST().getPrioridad2().encolar(aux.getElement());//lo meto a la de prioridad 1
                }
        
            }
            
            Interfaz.getPrioridad2ST().setText(Global.getST().getPrioridad2().show());
            Interfaz.getPrioridad3ST().setText(Global.getST().getPrioridad3().show());
                        
            //para prioridad 2 de star wars
            for (Node aux=Global.getSW().getPrioridad2().getFirst(); aux!=null; aux=aux.getNext()) {
                if(aux.getElement().getCounter()==8) {//si es de 8 debe subir la prioridad
                    aux.getElement().setLevel(aux.getElement().getLevel()+1);
                    aux.getElement().setCounter(0);
                    int indice=Global.getSW().getPrioridad2().search(aux);//indice del node a delete
                    if(indice==0) {
                        
                        deleted=Global.getSW().getPrioridad2().desencolar();
                        
                    }
                    else {
                        deleted=Global.getSW().getPrioridad2().delete(indice);//lo quito de la cola
                    }
                    Global.getSW().getPrioridad1().encolar(aux.getElement());//lo meto a la de prioridad 1
                }
        
            }
            
            Interfaz.getPrioridad1SW().setText(Global.getSW().getPrioridad1().show());
            Interfaz.getPrioridad2SW().setText(Global.getSW().getPrioridad2().show());
            
            //para prioridad 3 de star wars
            for (Node aux=Global.getSW().getPrioridad3().getFirst(); aux!=null; aux=aux.getNext()) {
                if(aux.getElement().getCounter()==8) {//si es de 8 debe subir la prioridad
                    aux.getElement().setLevel(aux.getElement().getLevel()+1);
                    aux.getElement().setCounter(0);
                    int indice=Global.getSW().getPrioridad3().search(aux);//indice del node a delete
                    if(indice==0) {
                        
                        deleted=Global.getSW().getPrioridad3().desencolar();
                        
                    }
                    else {
                        deleted=Global.getSW().getPrioridad3().delete(indice);//lo quito de la cola
                    }
                    Global.getSW().getPrioridad2().encolar(aux.getElement());//lo meto a la de prioridad 1
                }
        
            }
            
            Interfaz.getPrioridad2SW().setText(Global.getSW().getPrioridad2().show());
            Interfaz.getPrioridad3SW().setText(Global.getSW().getPrioridad3().show());
    
    
    
    
    
    }
    
    public void changeIcons(){
        String imageNameP2 = this.ia.getP2().getName() + ".jpg";
        String imageNameP1 = this.ia.getP1().getName() + ".jpg";

        Interfaz.getIconST().setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/" + imageNameP2)));
        Interfaz.getIconSW().setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/" + imageNameP1)));


    }
    
    public void changeStatsSW(){
        Interfaz.getNameSW().setText(this.ia.getP1().getName());
        System.out.println(this.ia.getP1().getName());
        Interfaz.getObjectSW().setText(this.ia.getP1().getObject());
        Interfaz.getAbilitySW().setText(Integer.toString(this.ia.getP1().getHability()));
        Interfaz.getStrengthSW().setText(Integer.toString(this.ia.getP1().getStrength()));
        Interfaz.getHPSW().setText(Integer.toString(this.ia.getP1().getHp()));
        Interfaz.getAgilitySW().setText(Integer.toString(this.ia.getP1().getAgility()));
    }
    
    public void changeStatsST(){
        Interfaz.getNameST().setText(this.ia.getP2().getName());
        Interfaz.getObjectST().setText(this.ia.getP2().getObject());
        Interfaz.getAbilityST().setText(Integer.toString(this.ia.getP2().getHability()));
        Interfaz.getStrengthST().setText(Integer.toString(this.ia.getP2().getStrength()));
        Interfaz.getHPST().setText(Integer.toString(this.ia.getP2().getHp()));
        Interfaz.getAgilityST().setText(Integer.toString(this.ia.getP2().getAgility()));
    }
    
    public void clearStats(){
        Interfaz.getNameSW().setText("-");
        Interfaz.getObjectSW().setText("-");
        Interfaz.getAbilitySW().setText("-");
        Interfaz.getStrengthSW().setText("-");
        Interfaz.getHPSW().setText("-");
        Interfaz.getAgilitySW().setText("-");
        
        Interfaz.getNameST().setText("-");
        Interfaz.getObjectST().setText("-");
        Interfaz.getAbilityST().setText("-");
        Interfaz.getStrengthST().setText("-");
        Interfaz.getHPST().setText("-");
        Interfaz.getAgilityST().setText("-");
    }
    
    public void clearIcons(){
        Interfaz.getIconST().setIcon(new ImageIcon(getClass().getResource("/images/Carta.jpg")));
        Interfaz.getIconSW().setIcon(new ImageIcon(getClass().getResource("/images/Carta.jpg")));
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
