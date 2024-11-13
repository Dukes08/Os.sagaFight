/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Wrld
 */
public class Character {
    private String name;
    private String object;
    private int id;
    private int counter=0;
    private int level;
    private int numCalidad;
    private int hability;
    private int hp;
    private int strength;
    private int Agility;

    public Character(String name, String object, int id) {
        this.name = name;
        this.object = object;
        this.id = id;
    }
    
    public void calculateStats() {
        int stat= (int) (Math.random()*100);
        
        if(stat>=0 && stat<60){
            this.hability=2;
            this.numCalidad++;
        } else {
            this.hability=0;
        }
        if(stat>=0 && stat<70) {
            this.hp=3;
            this.numCalidad++;
        } else {
            this.hp=1;
        }
        if(stat>=0 && stat<50){
            this.strength=4;
            this.numCalidad++;
        } else {
            this.strength=0;
        }
        if(stat>=0 && stat<40){
            this.Agility=5;
            this.numCalidad++;
        } else {
            this.Agility=0;
        }
        
        if(this.numCalidad==4) {
            this.level=1;
        }
        else if(this.numCalidad<=3 && this.numCalidad>=2) {
            this.level=2;
        }
        else if (this.numCalidad<=1 && this.numCalidad>=0) {
            this.level=3;
        }
        
       if (this.object.compareTo("Strength")==0) {
           this.hability+=2;
           this.hp+=3;
       }
       else if(this.object.compareTo("LightSaber")==0){
           this.strength+=3;
           this.hability+=2;
           this.Agility++;
       }
       
       else if(this.object.compareTo("Gun")==0) {
           this.hability+=3;
           this.Agility+=2;
           this.strength++;
       }
       
       else if(this.object.compareTo("RayGun")==0){
           this.Agility+=4;
           this.hp+=2;
           this.hability+=2;
       }
       
       else if(this.object.compareTo("SpecialSuit")==0){
           this.strength+=2;
           this.hp+=2;
           //this.habilidad++;
       }
       
       else if(this.object.compareTo("MindPowers")==0){
           this.Agility+=3;
           this.strength+=2;
          // this.habilidad+=2;
       }
       
       else if(this.object.compareTo("AlienWings")==0){
           this.hp+=2;
           this.strength+=4;
           this.Agility+=3;
       }
       else if(this.object.compareTo("DarkForceBlood")==0){
           this.Agility+=4;
           this.hability+=2;
           this.hp+=2;
       }
       
       else if(this.object.compareTo("PurpleLightSaber")==0){
           this.strength+=4;
           this.hability+=3;
           this.hp++;
       }
       
       else if(this.object.compareTo("RedLightSaber")==0){
           this.hp+=4;
           this.Agility+=2;
       }
       
    
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getNumCalidad() {
        return numCalidad;
    }

    public void setNumCalidad(int numCalidad) {
        this.numCalidad = numCalidad;
    }

    public int getHability() {
        return hability;
    }

    public void setHability(int hability) {
        this.hability = hability;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return Agility;
    }

    public void setAgility(int Agility) {
        this.Agility = Agility;
    }

    
}

