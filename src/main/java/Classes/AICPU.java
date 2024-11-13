/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;
import EDD.Node;
import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Wrld
 */
public class AICPU {
    private Character p1; //Personaje de sw
    private Character p2; //Personaje de st
    private int CnWins;
    private int NickWins;
    private String state;
    private int WaitingTime;
    
     public AICPU () {
        this.p1 = null;
        this.p2 = null;
        this.CnWins = 0;
        this.NickWins = 0;
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
    
//    code starter function
   
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
        
//        add interface conditional to add winner
        
        
        return p1;
    }
}
