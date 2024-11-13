/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import EDD.Queue;

/**
 *
 * @author Wrld
 */
public class Fans {
    private String name;
//    private int IdCh=0;
    private Queue prioridad1;
    private Queue prioridad2;
    private Queue prioridad3;
    private Queue refuerzo;
    private int ganados=0;

    public Fans(String name) {
        this.name = name;
        this.prioridad1=new Queue();
        this.prioridad2=new Queue();
        this.prioridad3=new Queue();
        this.refuerzo=new Queue();
    }
    
    public void CreateCharacter(String name, String Object, int id){
        Character personaje = new Character(name,Object,id);
        personaje.CalculateStats();
        if (personaje.getLevel()==1){
            prioridad1.encolar(personaje);
        }
        else if (personaje.getLevel()==2) {
            prioridad2.encolar(personaje);
        }
        else if (personaje.getLevel()==3) {
            prioridad3.encolar(personaje);
        }
       
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Queue getPrioridad1() {
        return prioridad1;
    }

    public void setPrioridad1(Queue prioridad1) {
        this.prioridad1 = prioridad1;
    }

    public Queue getPrioridad2() {
        return prioridad2;
    }

    public void setPrioridad2(Queue prioridad2) {
        this.prioridad2 = prioridad2;
    }

    public Queue getPrioridad3() {
        return prioridad3;
    }

    public void setPrioridad3(Queue prioridad3) {
        this.prioridad3 = prioridad3;
    }

    public Queue getRefuerzo() {
        return refuerzo;
    }

    public void setRefuerzo(Queue refuerzo) {
        this.refuerzo = refuerzo;
    }

    public int getGanados() {
        return ganados;
    }

    public void setGanados(int ganados) {
        this.ganados = ganados;
    }
}
