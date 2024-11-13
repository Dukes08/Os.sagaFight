/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;
import Classes.Character;
import Classes.Fans;
import EDD.List;

/**
 *
 * @author andresrivas
 */
public class Global {
    private static String[] starWars={"Darth Vader", "Anakin Skywalker", "Luke Skywalker", "Han Solo", "Obi-Wan Kenobi", "Yoda", "Princesa Leia", "Chewbacca", "Mando", "Boba Fett", "Qui-Gon Jinn", "Ahsoka Tano", "Darth Maul", "Mace Windu", "Emperador Palpatine", "Lando Calrissian", "General Grievous", "Poe Dameron", "Rey", "Kylo Ren"} ;
    private static String[] starTreck={"James Kirk", "Spock", "Jean-Luc Picard", "Leonard McCoy", "Khan Noonien Singh", "Odo", "Benjamin Sisko", "Q", "Worf", "Kira Nerys", "Sarek", "Elim Garak", "Dukat", "Montgomery Scott", "Miles O'Brien", "Kathryn Janeway", "Tasha Yar", "Gowron", "Charles Tucker", "William Riker"};
    
    private static String[] objetos={"Strength","LightSaber","Gun","RayGun","SpecialSuit","MindPowers","AlienWings","DarkForceBlood","PurpleLightSaber","RedLightSaber"};
  
    private static Fans starW;
    private static Fans starT;
    
    private static List ganadores=new List(); //lista de ganadores

    /**
     * @return the starWars
     */
    public static String[] getStarWars() {
        return starWars;
    }

    /**
     * @param aStarWars the starWars to set
     */
    public static void setStarWars(String[] aStarWars) {
        starWars = aStarWars;
    }

    /**
     * @return the starTreck
     */
    public static String[] getStarTreck() {
        return starTreck;
    }

    /**
     * @param aStarTreck the starTreck to set
     */
    public static void setStarTreck(String[] aStarTreck) {
        starTreck = aStarTreck;
    }

    /**
     * @return the objetos
     */
    public static String[] getObjetos() {
        return objetos;
    }

    /**
     * @param aObjetos the objetos to set
     */
    public static void setObjetos(String[] aObjetos) {
        objetos = aObjetos;
    }

    /**
     * @return the starW
     */
    public static Fans getStarW() {
        return starW;
    }

    /**
     * @param aStarW the starW to set
     */
    public static void setStarW(Fans aStarW) {
        starW = aStarW;
    }

    /**
     * @return the starT
     */
    public static Fans getStarT() {
        return starT;
    }

    /**
     * @param aStarT the starT to set
     */
    public static void setStarT(Fans aStarT) {
        starT = aStarT;
    }

    /**
     * @return the ganadores
     */
    public static List getGanadores() {
        return ganadores;
    }

    /**
     * @param aGanadores the ganadores to set
     */
    public static void setGanadores(List aGanadores) {
        ganadores = aGanadores;
    }
    
    
}
