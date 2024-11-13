/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;
import Classes.Administrator;
import Classes.Fans;
import Classes.AICPU;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;

/**
 *
 * @author andresrivas
 */
public class Interfaz extends javax.swing.JFrame {
    Fans st = new Fans("Star Trek");
    Fans sw = new Fans("Star Wars");
    AICPU ia = new AICPU();
    Administrator admin = new Administrator(ia);
    boolean iniciado = false;

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        Global.setSW(sw);
        Global.setST(st);
        this.setLocationRelativeTo(null); 
    }
    public static JLabel getIconSW() {
        return IconSW;
    }

    public static void setIconSW(JLabel IconSW) {
        Interfaz.IconSW = IconSW;
    }

    public static JLabel getIconST() {
        return IconST;
    }

    public static void setIconST(JLabel Character_Icon_Nick) {
        Interfaz.IconST = IconST;
    }

    
    
    public static JLabel getAbilitySW() {
        return AbilitySW;
    }

    public static JLabel getMarcadorSW() {
        return marcadorSW;
    }

    public static void setMarcadorSW(JLabel marcadorCartoon) {
        Interfaz.marcadorSW = marcadorCartoon;
    }

    public static JLabel getMarcadorST() {
        return marcadorST;
    }

    public static void setMarcadorST(JLabel marcadorNick) {
        Interfaz.marcadorST = marcadorNick;
    }
    
    

    public static void setAbilitySW(JLabel AbilitySW) {
        Interfaz.AbilitySW = AbilitySW;
    }

    public static JLabel getAbilityST() {
        return AbilityST;
    }

    public static void setAbilityST(JLabel AbilityST) {
        Interfaz.AbilityST = AbilityST;
    }

    public static JLabel getAgilitySW() {
        return AgilitySW;
    }

    public static void setAgilitySW(JLabel AgilitySW) {
        Interfaz.AgilitySW = AgilitySW;
    }

    public static JLabel getAgilityST() {
        return AgilityST;
    }

    public static void setAgilityST(JLabel AgilityST) {
        Interfaz.AgilityST = AgilityST;
    }

    public static JLabel getHPSW() {
        return HPSW;
    }

    public static void setHPSW(JLabel HPSW) {
        Interfaz.HPSW = HPSW;
    }

    public static JLabel getHPST() {
        return HPST;
    }

    public static void setHPST(JLabel HP_Nick) {
        Interfaz.HPST = HP_Nick;
    }

    public static JTextArea getListaGanadores() {
        return ListaGanadores;
    }

    public static void setListaGanadores(JTextArea ListaGanadores) {
        Interfaz.ListaGanadores = ListaGanadores;
    }

    public static JLabel getObjectSW() {
        return ObjectSW;
    }

    public static void setObjectSW(JLabel Object_) {
        Interfaz.ObjectSW = Object_;
    }

    public static JLabel getObjectST() {
        return ObjectST;
    }

    public static void setObjectST(JLabel Object_Nick) {
        Interfaz.ObjectST = Object_Nick;
    }

    public static JTextArea getPrioridad1SW() {
        return Prioridad1SW;
    }

    public static void setPrioridad1SW(JTextArea Prioridad1) {
        Interfaz.Prioridad1SW = Prioridad1;
    }

    public static JTextArea getPrioridad1ST() {
        return Prioridad1ST;
    }

    public static void setPrioridad1ST(JTextArea Prioridad1Nick) {
        Interfaz.Prioridad1ST = Prioridad1Nick;
    }

    public static JTextArea getPrioridad2SW() {
        return Prioridad2SW;
    }

    public static void setPrioridad2SW(JTextArea Prioridad2) {
        Interfaz.Prioridad2SW = Prioridad2;
    }

    public static JTextArea getPrioridad2ST() {
        return Prioridad2ST;
    }

    public static void setPrioridad2ST(JTextArea Prioridad2Nick) {
        Interfaz.Prioridad2ST = Prioridad2Nick;
    }

    public static JTextArea getPrioridad3SW() {
        return Prioridad3SW;
    }

    public static void setPrioridad3SW(JTextArea Prioridad3) {
        Interfaz.Prioridad3SW = Prioridad3;
    }

    public static JTextArea getPrioridad3ST() {
        return Prioridad3ST;
    }

    public static void setPrioridad3ST(JTextArea Prioridad3Nick) {
        Interfaz.Prioridad3ST = Prioridad3Nick;
    }

    public static JTextArea getRefuerzoSW() {
        return RefuerzoSW;
    }

    public static void setRefuerzoSW(JTextArea Refuerzo) {
        Interfaz.RefuerzoSW = Refuerzo;
    }

    public static JTextArea getRefuerzoST() {
        return RefuerzoST;
    }

    public static void setRefuerzoST(JTextArea RefuerzoNick) {
        Interfaz.RefuerzoST = RefuerzoNick;
    }

    public static JLabel getStrengthSW() {
        return StrengthSW;
    }

    public static void setStrengthSW(JLabel Strength_) {
        Interfaz.StrengthSW = Strength_;
    }

    public static JLabel getStrengthST() {
        return StrengthST;
    }

    public static void setStrengthST(JLabel Strength_Nick) {
        Interfaz.StrengthST = Strength_Nick;
    }

    public static JLabel getIA_State() {
        return IA_State;
    }

    public static void setIA_State(JLabel IA_State) {
        Interfaz.IA_State = IA_State;
    }

    public static JLabel getResultado_Combate() {
        return Resultado_Combate;
    }

    public static void setResultado_Combate(JLabel Resultado_Combate) {
        Interfaz.Resultado_Combate = Resultado_Combate;
    }

    public JSpinner getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(JSpinner Velocidad) {
        this.Velocidad = Velocidad;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NombreCartoon = new javax.swing.JLabel();
        marcadorSW = new javax.swing.JLabel();
        marcadorST = new javax.swing.JLabel();
        NombreNick = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Prioridad1ST = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        Prioridad2ST = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        Prioridad3ST = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        RefuerzoST = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        IconST = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        IconSW = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        Resultado_Combate1 = new javax.swing.JLabel();
        Resultado_Combate = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        ObjectSW = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        AbilitySW = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        StrengthSW = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        HPSW = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        AgilitySW = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaGanadores = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        ObjectST = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        AbilityST = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        StrengthST = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        HPST = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        AgilityST = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        Resultado_Combate2 = new javax.swing.JLabel();
        IA_State = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Velocidad = new javax.swing.JSpinner();
        Inicio = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Prioridad1SW = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        Prioridad2SW = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        Prioridad3SW = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        RefuerzoSW = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        NombreCartoon.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        NombreCartoon.setForeground(new java.awt.Color(255, 255, 255));
        NombreCartoon.setText("Star Wars");
        getContentPane().add(NombreCartoon);
        NombreCartoon.setBounds(240, 30, 118, 30);

        marcadorSW.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        marcadorSW.setForeground(new java.awt.Color(255, 255, 255));
        marcadorSW.setText("0");
        getContentPane().add(marcadorSW);
        marcadorSW.setBounds(460, 30, 16, 30);

        marcadorST.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        marcadorST.setForeground(new java.awt.Color(255, 255, 255));
        marcadorST.setText("0");
        getContentPane().add(marcadorST);
        marcadorST.setBounds(730, 30, 16, 30);

        NombreNick.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        NombreNick.setForeground(new java.awt.Color(255, 255, 255));
        NombreNick.setText("Star Trek");
        getContentPane().add(NombreNick);
        NombreNick.setBounds(790, 30, 114, 30);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0, 90));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Refuerzo");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Prioridad 3");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Prioridad 2");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Prioridad 1");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        Prioridad1ST.setEditable(false);
        Prioridad1ST.setColumns(20);
        Prioridad1ST.setRows(5);
        jScrollPane2.setViewportView(Prioridad1ST);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 190, 110));

        Prioridad2ST.setEditable(false);
        Prioridad2ST.setColumns(20);
        Prioridad2ST.setRows(5);
        jScrollPane3.setViewportView(Prioridad2ST);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 190, 110));

        Prioridad3ST.setEditable(false);
        Prioridad3ST.setColumns(20);
        Prioridad3ST.setRows(5);
        jScrollPane4.setViewportView(Prioridad3ST);

        jPanel5.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 190, 110));

        RefuerzoST.setEditable(false);
        RefuerzoST.setColumns(20);
        RefuerzoST.setRows(5);
        jScrollPane9.setViewportView(RefuerzoST);

        jPanel5.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 190, 110));

        getContentPane().add(jPanel5);
        jPanel5.setBounds(930, 20, 210, 590);

        IconST.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carta.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(IconST, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IconST, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(670, 80, 250, 330);

        IconSW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carta.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(IconSW, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IconSW, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(240, 80, 250, 330);

        jPanel12.setBackground(new java.awt.Color(0, 0, 0, 95));

        Resultado_Combate1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Resultado_Combate1.setForeground(new java.awt.Color(255, 255, 255));
        Resultado_Combate1.setText("Resultado:");

        Resultado_Combate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Resultado_Combate.setForeground(new java.awt.Color(255, 255, 255));
        Resultado_Combate.setText("Decidiendo...");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Resultado_Combate)
                    .addComponent(Resultado_Combate1))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Resultado_Combate1)
                .addGap(18, 18, 18)
                .addComponent(Resultado_Combate)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel12);
        jPanel12.setBounds(500, 70, 140, 90);

        jPanel9.setBackground(new java.awt.Color(0, 0, 0, 95));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Objeto:");

        ObjectSW.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ObjectSW.setForeground(new java.awt.Color(255, 255, 255));
        ObjectSW.setText("-");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Habilidad:");

        AbilitySW.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AbilitySW.setForeground(new java.awt.Color(255, 255, 255));
        AbilitySW.setText("-");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Fuerza:");

        StrengthSW.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        StrengthSW.setForeground(new java.awt.Color(255, 255, 255));
        StrengthSW.setText("-");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("HP:");

        HPSW.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        HPSW.setForeground(new java.awt.Color(255, 255, 255));
        HPSW.setText("-");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Agilidad:");

        AgilitySW.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AgilitySW.setForeground(new java.awt.Color(255, 255, 255));
        AgilitySW.setText("-");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AbilitySW)
                .addGap(0, 178, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(ObjectSW))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StrengthSW))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HPSW))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AgilitySW)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(ObjectSW))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(AbilitySW))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(StrengthSW))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(HPSW))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(AgilitySW))
                .addContainerGap())
        );

        getContentPane().add(jPanel9);
        jPanel9.setBounds(240, 440, 270, 110);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Ganadores");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(350, 560, 75, 17);

        ListaGanadores.setEditable(false);
        ListaGanadores.setColumns(20);
        ListaGanadores.setRows(5);
        jScrollPane1.setViewportView(ListaGanadores);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(260, 580, 240, 80);

        jPanel8.setBackground(new java.awt.Color(0, 0, 0, 95));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Objeto:");

        ObjectST.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ObjectST.setForeground(new java.awt.Color(255, 255, 255));
        ObjectST.setText("-");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Habilidad:");

        AbilityST.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AbilityST.setForeground(new java.awt.Color(255, 255, 255));
        AbilityST.setText("-");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Fuerza:");

        StrengthST.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        StrengthST.setForeground(new java.awt.Color(255, 255, 255));
        StrengthST.setText("-");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("HP:");

        HPST.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        HPST.setForeground(new java.awt.Color(255, 255, 255));
        HPST.setText("-");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Agilidad:");

        AgilityST.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AgilityST.setForeground(new java.awt.Color(255, 255, 255));
        AgilityST.setText("-");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ObjectST))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AbilityST))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StrengthST))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HPST))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AgilityST)))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(ObjectST))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(AbilityST))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(StrengthST))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(HPST))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(AgilityST))
                .addContainerGap())
        );

        getContentPane().add(jPanel8);
        jPanel8.setBounds(650, 430, 270, 110);

        jPanel13.setBackground(new java.awt.Color(0, 0, 0, 95));

        Resultado_Combate2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Resultado_Combate2.setForeground(new java.awt.Color(255, 255, 255));
        Resultado_Combate2.setText("Estado de la IA:");

        IA_State.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IA_State.setForeground(new java.awt.Color(255, 255, 255));
        IA_State.setText("Esperando...");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Resultado_Combate2)
                .addGap(18, 18, 18)
                .addComponent(IA_State)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Resultado_Combate2)
                    .addComponent(IA_State))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel13);
        jPanel13.setBounds(650, 550, 310, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Velocidad (s)");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(650, 600, 93, 17);

        Velocidad.setValue(1);
        Velocidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                VelocidadStateChanged(evt);
            }
        });
        getContentPane().add(Velocidad);
        Velocidad.setBounds(650, 620, 140, 23);

        Inicio.setText("Iniciar");
        Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioActionPerformed(evt);
            }
        });
        getContentPane().add(Inicio);
        Inicio.setBounds(800, 610, 160, 40);

        jPanel6.setBackground(new java.awt.Color(0, 0, 0, 90));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Refuerzo");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Prioridad 3");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Prioridad 2");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Prioridad 1");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        Prioridad1SW.setEditable(false);
        Prioridad1SW.setColumns(20);
        Prioridad1SW.setRows(5);
        jScrollPane5.setViewportView(Prioridad1SW);

        jPanel6.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 190, 110));

        Prioridad2SW.setEditable(false);
        Prioridad2SW.setColumns(20);
        Prioridad2SW.setRows(5);
        jScrollPane6.setViewportView(Prioridad2SW);

        jPanel6.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 190, 110));

        Prioridad3SW.setEditable(false);
        Prioridad3SW.setColumns(20);
        Prioridad3SW.setRows(5);
        jScrollPane7.setViewportView(Prioridad3SW);

        jPanel6.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 190, 110));

        RefuerzoSW.setEditable(false);
        RefuerzoSW.setColumns(20);
        RefuerzoSW.setRows(5);
        jScrollPane10.setViewportView(RefuerzoSW);

        jPanel6.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 190, 110));

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 20, 210, 590);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Clash.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1240, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VelocidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_VelocidadStateChanged
        // TODO add your handling code here:
        if(iniciado == true){
            if((int)this.Velocidad.getValue() <= 0){
                this.Velocidad.setValue(1);
                this.repaint();
            }else{
                //Aqui va a estar el codigo para que el tiempo cambie justo cuando el user lo cambie
                admin.ia.setWaitingTime(((int)this.Velocidad.getValue())*1000);
            }
        }else{
            this.Velocidad.setValue(1);
            this.repaint();
        }
    }//GEN-LAST:event_VelocidadStateChanged

    private void InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioActionPerformed
        // TODO add your handling code here:
        //se crean los personajes
        if(iniciado == false){
            iniciado = true;

            for (int i = 0; i < 20; i++) {
                int random=(int)(Math.random()*9);
                Global.getSW().createCharacter(Global.getStarWars()[i], Global.getObjetos()[random],admin.getIdCh());
                admin.setIdCh(admin.getIdCh()+1);
                random=(int)(Math.random()*9);
                Global.getST().createCharacter(Global.getStarTrek()[i], Global.getObjetos()[random],admin.getIdCh());
                admin.setIdCh(admin.getIdCh()+1);
            }
            getPrioridad1SW().setText(Global.getSW().getPrioridad1().show());
            getPrioridad2SW().setText(Global.getSW().getPrioridad2().show());
            getPrioridad3SW().setText(Global.getSW().getPrioridad3().show());
            getRefuerzoSW().setText(Global.getSW().getRefuerzo().show());

            getPrioridad1ST().setText(Global.getST().getPrioridad1().show());
            getPrioridad2ST().setText(Global.getST().getPrioridad2().show());
            getPrioridad3ST().setText(Global.getST().getPrioridad3().show());
            getRefuerzoST().setText(Global.getST().getRefuerzo().show());

            //            System.out.println("Prioridad 1 Cartoon");
            //            Global.get().getPrioridad1().imprimir();
            //
            //            System.out.println("Prioridad 2 Cartoon");
            //            Global.get().getPrioridad2().imprimir();
            //
            //            System.out.println("Prioridad 3 Cartoon");
            //            Global.get().getPrioridad3().imprimir();
            //
            //            System.out.println("Prioridad 1 Nick");
            //            Global.getNick().getPrioridad1().imprimir();
            //
            //            System.out.println("Prioridad 2 Nick");
            //            Global.getNick().getPrioridad2().imprimir();
            //
            //            System.out.println("Prioridad 3 Nick");
            //            Global.getNick().getPrioridad3().imprimir();

            this.Velocidad.setValue(10);
            admin.ia.setWaitingTime(((int)this.Velocidad.getValue())*1000);
            admin.start();
            //ia.start();
        }else{
            JOptionPane.showMessageDialog(null, "Ya la simulación empezó!");
        }

    }//GEN-LAST:event_InicioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel AbilityST;
    private static javax.swing.JLabel AbilitySW;
    private static javax.swing.JLabel AgilityST;
    private static javax.swing.JLabel AgilitySW;
    private static javax.swing.JLabel HPST;
    private static javax.swing.JLabel HPSW;
    private static javax.swing.JLabel IA_State;
    private static javax.swing.JLabel IconST;
    private static javax.swing.JLabel IconSW;
    private javax.swing.JButton Inicio;
    private static javax.swing.JTextArea ListaGanadores;
    private javax.swing.JLabel NombreCartoon;
    private javax.swing.JLabel NombreNick;
    private static javax.swing.JLabel ObjectST;
    private static javax.swing.JLabel ObjectSW;
    private static javax.swing.JTextArea Prioridad1ST;
    private static javax.swing.JTextArea Prioridad1SW;
    private static javax.swing.JTextArea Prioridad2ST;
    private static javax.swing.JTextArea Prioridad2SW;
    private static javax.swing.JTextArea Prioridad3ST;
    private static javax.swing.JTextArea Prioridad3SW;
    private static javax.swing.JTextArea RefuerzoST;
    private static javax.swing.JTextArea RefuerzoSW;
    private static javax.swing.JLabel Resultado_Combate;
    private javax.swing.JLabel Resultado_Combate1;
    private javax.swing.JLabel Resultado_Combate2;
    private static javax.swing.JLabel StrengthST;
    private static javax.swing.JLabel StrengthSW;
    private javax.swing.JSpinner Velocidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private static javax.swing.JLabel marcadorST;
    private static javax.swing.JLabel marcadorSW;
    // End of variables declaration//GEN-END:variables
}
