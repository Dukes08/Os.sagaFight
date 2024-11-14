/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;
import EDD.Node;
import Interfaces.Global;
import Interfaces.Interfaz;
import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Wrld
 */
public class AICPU extends Thread{
    private Character p1; //Personaje de sw
    private Character p2; //Personaje de st
    private int SWWins;
    private int STWins;
    private String state;
    private int WaitingTime;
    
     public AICPU () {
        this.p1 = null;
        this.p2 = null;
        this.SWWins = 0;
        this.STWins = 0;
        this.state = "Esperando...";
        this.WaitingTime = 10000;
    }

    public Character getP1() {
        return p1;
    }

    public void setP1(Character p1) {
        this.p1 = p1;
    }

    public Character getP2() {
        return p2;
    }

    public void setP2(Character p2) {
        this.p2 = p2;
    }    

    public int getWaitingTime() {
        return WaitingTime;
    }

    public void setWaitingTime(int WaitingTime) {
        this.WaitingTime = WaitingTime;
    }
    
    @Override
    
    public void run(){                    
        try {
//          
            int resultadonum= (int) (Math.random()*100) ; // se escoge el resultado de la batalla
            this.state = "Decidiendo";
            Interfaz.getIA_State().setText(this.state);
            sleep(this.WaitingTime); //duerme 10 segundos en los que "piensa"
            //ahora el resultado
            this.state = "Anunciando resultados";
            Interfaz.getIA_State().setText(this.state);
            
            Character ganador;
            System.out.println("decision: "+resultadonum);
            if(resultadonum<40) { //hay un ganador
                System.out.println("Hay un ganador, combatientes: "+p1.getName()+" "+p2.getName());
                System.out.println("personaje 1, id: "+p1.getId()+" nombre "+p1.getName()+" stats:\nAgilidad: "+p1.getAgility()+"\nFuerza: "+p1.getStrength()+"\nHabilidad: "+p1.getHability()+"\nHP: "+p1.getHp());
                System.out.println("personaje 2, id: "+p2.getId()+" nombre "+p2.getName()+" stats:\nAgilidad: "+p2.getAgility()+"\nFuerza: "+p2.getStrength()+"\nHabilidad: "+p2.getHability()+"\nHP: "+p2.getHp());
                Interfaz.getResultado_Combate().setText("Hubo un ganador!");
                
                ganador=winner();
                System.out.println(ganador.getName() +" "+ ganador.getLevel() +" "+ ganador.getId());
                
                Global.getGanadores().insertBegin(ganador);

            }

            else if(resultadonum>=40 && resultadonum<67){ //hay empate
                System.out.println("Hubo empate");
                Interfaz.getResultado_Combate().setText("Hubo un empate!");
                Global.getSW().getPrioridad1().encolar(p1);
                Global.getST().getPrioridad1().encolar(p2);
            }
            else if (resultadonum>=67 && resultadonum<100){//no sucede el combate
                System.out.println("Alquien tuvo una luxación y el combate no se puede hacer");
                Interfaz.getResultado_Combate().setText("Suspendido!");
                Global.getSW().getRefuerzo().encolar(p1);
                Global.getST().getRefuerzo().encolar(p2); 
                Interfaz.getRefuerzoSW().setText(Global.getSW().getRefuerzo().show());
                Interfaz.getRefuerzoST().setText(Global.getST().getRefuerzo().show());
            }            

            sleep(3000); //Duerme 3 segundos para que el resultado se pueda ver reflejado en la interfaz, propenso a cambio
            
            this.state = "Esperando...";
            Interfaz.getIA_State().setText(this.state);
            Interfaz.getResultado_Combate().setText("Esperando...");
        } catch (InterruptedException ex) {
            Logger.getLogger(AICPU.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
        
   
    public Character winner(){ //determinar cual de los dos personajes gano 
        int advantage_p1=0;
        int advantage_p2=0;
                
        if(p1.getAgility()>p2.getAgility()){
            advantage_p1++;
        }else {
            advantage_p2++;
        }
                
        if(p1.getStrength()>=p2.getStrength()){
            advantage_p1++;
        }else {
            advantage_p2++;
        }
                
        if(p1.getHability()>p2.getHability()) {
            advantage_p1++;
        }else {
            advantage_p2++;
        }
        if(p1.getHp()>=p2.getHp()) {
            advantage_p1++;
        }else {
            advantage_p2++;
        }
        
        if(advantage_p1>advantage_p2){
            System.out.println(p1.getName()+" es el ganador");
            Interfaz.getListaGanadores().append("SW-"+p1.getId()+'\n');
            Interfaz.getIconST().setIcon(new ImageIcon(getClass().getResource("/images/StarTrek.jpg"))); // Se quita la foto del perdedor
            this.SWWins ++;
            Interfaz.getMarcadorSW().setText(Integer.toString(this.SWWins));
            
            return p1;
        }else{
            System.out.println(p2.getName()+" es el ganador");
            Interfaz.getListaGanadores().append("ST-"+p2.getId()+'\n');
            Interfaz.getIconSW().setIcon(new ImageIcon(getClass().getResource("/images/Star Wars.jpg"))); // Se quita la foto del Perdedor
            this.STWins ++;
            Interfaz.getMarcadorST().setText(Integer.toString(this.STWins));
            
            return p2;
        }
    }
}
