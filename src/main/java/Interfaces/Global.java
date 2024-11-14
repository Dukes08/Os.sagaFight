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
    private static String[] starWars = {"Darth Vader", "Anakin Skywalker", "Luke Skywalker", "Han Solo", "Obi-Wan Kenobi", "Yoda", "Princesa Leia", "Chewbacca", "Mando", "Boba Fett", "Qui-Gon Jinn", "Ahsoka Tano", "Darth Maul", "Mace Windu", "Emperador Palpatine", "Lando Calrissian", "General Grievous", "Poe Dameron", "Rey", "Kylo Ren"};
    private static int[] abilitySW = {18, 17, 16, 14, 17, 20, 13, 15, 14, 15, 16, 18, 17, 18, 20, 12, 15, 13, 15, 18};
    private static int[] strengthSW = {19, 18, 17, 13, 17, 16, 10, 19, 15, 17, 16, 15, 18, 17, 20, 11, 17, 12, 16, 17};
    private static int[] hpSW = {20, 18, 17, 14, 18, 15, 12, 19, 16, 17, 16, 15, 18, 17, 20, 13, 18, 14, 16, 17};
    private static int[] agilitySW = {14, 16, 17, 15, 16, 19, 12, 14, 16, 15, 16, 18, 17, 16, 15, 13, 15, 16, 17, 15};

    private static String[] starTrek = {"James Kirk", "Spock", "Jean-Luc Picard", "Leonard McCoy", "Khan Noonien Singh", "Odo", "Benjamin Sisko", "Q", "Worf", "Kira Nerys", "Sarek", "Elim Garak", "Dukat", "Montgomery Scott", "Miles O'Brien", "Kathryn Janeway", "Tasha Yar", "Gowron", "Charles Tucker", "William Riker"};
    private static int[] abilityST = {17, 19, 18, 14, 15, 17, 18, 20, 16, 15, 18, 15, 14, 16, 15, 17, 16, 15, 14, 16};
    private static int[] strengthST = {15, 14, 12, 10, 18, 16, 15, 20, 18, 14, 14, 12, 15, 13, 11, 14, 16, 17, 12, 15};
    private static int[] hpST = {16, 15, 14, 12, 18, 16, 15, 20, 17, 15, 14, 13, 16, 14, 13, 14, 15, 16, 13, 14};
    private static int[] agilityST = {14, 16, 13, 12, 15, 14, 16, 18, 15, 15, 13, 14, 13, 12, 13, 15, 16, 15, 13, 14};

    private static String[] objetos={"Strength","LightSaber","Gun","RayGun","SpecialSuit","MindPowers","AlienWings","DarkForceBlood","PurpleLightSaber","RedLightSaber"};
  
    private static Fans SW;
    private static Fans ST;
    
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
     * @return the abilitySW
     */
    public static int[] getAbilitySW() {
        return abilitySW;
    }

    /**
     * @param aAbilitySW the abilitySW to set
     */
    public static void setAbilitySW(int[] aAbilitySW) {
        abilitySW = aAbilitySW;
    }

    /**
     * @return the strengthSW
     */
    public static int[] getStrengthSW() {
        return strengthSW;
    }

    /**
     * @param aStrengthSW the strengthSW to set
     */
    public static void setStrengthSW(int[] aStrengthSW) {
        strengthSW = aStrengthSW;
    }

    /**
     * @return the hpSW
     */
    public static int[] getHpSW() {
        return hpSW;
    }

    /**
     * @param aHpSW the hpSW to set
     */
    public static void setHpSW(int[] aHpSW) {
        hpSW = aHpSW;
    }

    /**
     * @return the agilitySW
     */
    public static int[] getAgilitySW() {
        return agilitySW;
    }

    /**
     * @param aAgilitySW the agilitySW to set
     */
    public static void setAgilitySW(int[] aAgilitySW) {
        agilitySW = aAgilitySW;
    }

    /**
     * @return the starTrek
     */
    public static String[] getStarTrek() {
        return starTrek;
    }

    /**
     * @param aStarTrek the starTrek to set
     */
    public static void setStarTrek(String[] aStarTrek) {
        starTrek = aStarTrek;
    }

    /**
     * @return the abilityST
     */
    public static int[] getAbilityST() {
        return abilityST;
    }

    /**
     * @param aAbilityST the abilityST to set
     */
    public static void setAbilityST(int[] aAbilityST) {
        abilityST = aAbilityST;
    }

    /**
     * @return the strengthST
     */
    public static int[] getStrengthST() {
        return strengthST;
    }

    /**
     * @param aStrengthST the strengthST to set
     */
    public static void setStrengthST(int[] aStrengthST) {
        strengthST = aStrengthST;
    }

    /**
     * @return the hpST
     */
    public static int[] getHpST() {
        return hpST;
    }

    /**
     * @param aHpST the hpST to set
     */
    public static void setHpST(int[] aHpST) {
        hpST = aHpST;
    }

    /**
     * @return the agilityST
     */
    public static int[] getAgilityST() {
        return agilityST;
    }

    /**
     * @param aAgilityST the agilityST to set
     */
    public static void setAgilityST(int[] aAgilityST) {
        agilityST = aAgilityST;
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
     * @return the SW
     */
    public static Fans getSW() {
        return SW;
    }

    /**
     * @param aSW the SW to set
     */
    public static void setSW(Fans aSW) {
        SW = aSW;
    }

    /**
     * @return the ST
     */
    public static Fans getST() {
        return ST;
    }

    /**
     * @param aST the ST to set
     */
    public static void setST(Fans aST) {
        ST = aST;
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
