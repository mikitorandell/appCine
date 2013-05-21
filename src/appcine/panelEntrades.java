/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appcine;

import entitats.Pase;
import entitats.Pelicula;
import java.awt.Color;
import java.awt.Dimension;
import java.lang.reflect.Constructor;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import recursos.Colors;
import sales.DibuixSala;

/**
 *
 * @author torandell9
 */
public class panelEntrades extends javax.swing.JPanel {

    /**
     * Creates new form panelEntrades
     */
    public ArrayList<Pelicula> pelicules = new ArrayList<Pelicula>();
    private ArrayList<Pase> pases = new ArrayList<Pase>();
    private int idSeleccionat;
    private String dia;
    private HashMap<String, Integer> entrades;
    private pInicial pi;
    private Pase p;
    private String seient;

    public panelEntrades(pInicial pi) {
        System.out.println("Inici constructor 1");
        this.pi = pi;
        try {
            initComponents();
            recursosBD rBD = new recursosBD();
            rBD.selectPelicules(pelicules);
            this.omplirLlistatPelicules();

        } catch (SQLException ex) {
            Logger.getLogger(panelEntrades.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("FINAL CONSTRUCTOR 1");
    }

    public panelEntrades(pInicial pi, Pase p) {
        System.out.println("INICI constructor 2");
        this.pi = pi;
        try {
            initComponents();
            recursosBD rBD = new recursosBD();
            rBD.selectPelicules(pelicules);
            this.omplirLlistatPelicules(); //omplim el list de pelicules per si volen canviar
            this.etiqSala.setText(p.getSales().getNom());

        } catch (SQLException ex) {
            Logger.getLogger(panelEntrades.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("FINAL CONSTRUCTOR 2");
    }

    private void omplirLlistatPelicules() {

        System.out.println(this.pelicules.size());
        for (Pelicula p : this.pelicules) {
            this.llistatPelicules.addItem(p.getTitol());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogConfirm = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        labelTitol = new javax.swing.JLabel();
        labelDia = new javax.swing.JLabel();
        labelHora = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        labelSala = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        llistatPelicules = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        diasDisponibles = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        llistatHores = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        etiqSala = new javax.swing.JLabel();
        labelSelectPelicula = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contenedorSeients = new javax.swing.JPanel();

        dialogConfirm.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogConfirm.setAlwaysOnTop(true);
        dialogConfirm.setBounds(new java.awt.Rectangle(0, 22, 400, 270));
        dialogConfirm.setModal(true);

        jLabel6.setText("<html><b>Pelicula:</b></html>");

        jLabel7.setText("<html><b>Dia: </b></html>");

        jLabel8.setText("<html><b>Hora:</b></html>");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Confirmar compra");

        btnConfirmar.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmarMouseClicked(evt);
            }
        });
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        labelTitol.setText("jLabel5");

        labelDia.setText("jLabel5");

        labelHora.setText("jLabel5");

        jLabel10.setText("<html><b>Sala:</b></html>");

        labelSala.setText("jLabel10");

        org.jdesktop.layout.GroupLayout dialogConfirmLayout = new org.jdesktop.layout.GroupLayout(dialogConfirm.getContentPane());
        dialogConfirm.getContentPane().setLayout(dialogConfirmLayout);
        dialogConfirmLayout.setHorizontalGroup(
            dialogConfirmLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(dialogConfirmLayout.createSequentialGroup()
                .add(dialogConfirmLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(dialogConfirmLayout.createSequentialGroup()
                        .add(50, 50, 50)
                        .add(jLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 290, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(dialogConfirmLayout.createSequentialGroup()
                        .add(40, 40, 40)
                        .add(btnConfirmar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 146, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(4, 4, 4)
                        .add(btnCancelar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(dialogConfirmLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                        .add(dialogConfirmLayout.createSequentialGroup()
                            .add(39, 39, 39)
                            .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 55, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(18, 18, 18)
                            .add(labelHora, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 248, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(org.jdesktop.layout.GroupLayout.LEADING, dialogConfirmLayout.createSequentialGroup()
                            .add(40, 40, 40)
                            .add(jLabel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 52, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(labelSala, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 250, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, dialogConfirmLayout.createSequentialGroup()
                        .add(39, 39, 39)
                        .add(dialogConfirmLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, dialogConfirmLayout.createSequentialGroup()
                                .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(labelTitol, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 248, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, dialogConfirmLayout.createSequentialGroup()
                                .add(jLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 55, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(labelDia, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 248, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                .add(44, 44, 44))
        );
        dialogConfirmLayout.setVerticalGroup(
            dialogConfirmLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(dialogConfirmLayout.createSequentialGroup()
                .add(31, 31, 31)
                .add(dialogConfirmLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(labelTitol))
                .add(12, 12, 12)
                .add(dialogConfirmLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(labelDia))
                .add(12, 12, 12)
                .add(dialogConfirmLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(labelHora))
                .add(13, 13, 13)
                .add(dialogConfirmLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(labelSala))
                .add(34, 34, 34)
                .add(jLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(5, 5, 5)
                .add(dialogConfirmLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(btnConfirmar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnCancelar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        setBackground(Colors.colorFonsPrincipal);

        jLabel1.setText("<html><b>Pel·licula:</b></html>");

        llistatPelicules.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---Seleccionar una --" }));
        llistatPelicules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llistatPeliculesActionPerformed(evt);
            }
        });

        jLabel2.setText("<html><b>Dia:</b></html>");

        diasDisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diasDisponiblesActionPerformed(evt);
            }
        });

        jLabel3.setText("<html><b>Hora:</b></html>");

        llistatHores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llistatHoresActionPerformed(evt);
            }
        });

        jLabel4.setText("<html><b>Sala:</b></html>");

        labelSelectPelicula.setText("<html><b>Seleccioni el seient</b></html>");

        jScrollPane1.setBackground(new java.awt.Color(255, 204, 102));
        jScrollPane1.setOpaque(false);

        contenedorSeients.setBackground(new java.awt.Color(255, 255, 255));
        contenedorSeients.setOpaque(false);
        contenedorSeients.setLayout(null);
        jScrollPane1.setViewportView(contenedorSeients);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jScrollPane1))
                    .add(layout.createSequentialGroup()
                        .add(15, 15, 15)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(labelSelectPelicula, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 160, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(18, 18, 18)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(layout.createSequentialGroup()
                                        .add(6, 6, 6)
                                        .add(etiqSala, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 79, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(layout.createSequentialGroup()
                                        .add(llistatPelicules, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 194, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(18, 18, 18)
                                        .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(diasDisponibles, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 195, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(42, 42, 42)
                                        .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(llistatHores, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 178, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                        .add(0, 165, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(29, 29, 29)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(llistatPelicules, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(diasDisponibles, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(llistatHores, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jLabel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .add(etiqSala, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(labelSelectPelicula, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void borrarSeients() {
        this.contenedorSeients.removeAll();
        this.contenedorSeients.setVisible(false);
        this.contenedorSeients.setVisible(true);

    }
    private void llistatPeliculesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llistatPeliculesActionPerformed

        this.borrarSeients();
        this.etiqSala.setText("");
        this.diasDisponibles.removeAllItems();//buidam tota la llista

        this.diasDisponibles.addItem("--- Seleccionar dia ---");
        if (this.llistatPelicules.getSelectedIndex() > 0) {
            this.idSeleccionat = this.pelicules.get(this.llistatPelicules.getSelectedIndex() - 1).getId();
            recursosBD rBD = new recursosBD();

            for(Date dies : rBD.getDiasPelicula(idSeleccionat)){
                //System.out.print();
                this.diasDisponibles.addItem(dies.toString());
            }
           
        }

    }//GEN-LAST:event_llistatPeliculesActionPerformed

    private void diasDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diasDisponiblesActionPerformed

        this.borrarSeients();
        this.etiqSala.setText("");
        this.llistatHores.removeAllItems();
        this.llistatHores.addItem("---Selecciona una--");

        if (this.diasDisponibles.getSelectedIndex() > 0) {
            this.dia = (String) this.diasDisponibles.getSelectedItem();
            recursosBD rBD = new recursosBD();

            for(Time hora : rBD.getHoresPelicula(dia, this.idSeleccionat)){
                 this.llistatHores.addItem(hora.toString());
            }
           

        }
    }//GEN-LAST:event_diasDisponiblesActionPerformed

    private void llistatHoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llistatHoresActionPerformed

        recursosBD rBD = new recursosBD();
        if (this.llistatHores.getSelectedIndex() > 0) {
            this.p = rBD.getPase(this.idSeleccionat, this.dia, (String) this.llistatHores.getSelectedItem());
            this.etiqSala.setText(p.getSales().getNom());
            this.mostrarSala(p);

        }
    }//GEN-LAST:event_llistatHoresActionPerformed

    private void btnConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmarMouseClicked

        recursosBD rBD = new recursosBD();
        //String[] seients = this.seient.split("-");
        //Map<String, Object> params = new HashMap<String, Object>();
        try {
            rBD.insertarEntrada(this.p, seient);
            //  params.put("idEntrada", rBD.insertarEntrada(this.p, Integer.parseInt(seients[0]), Integer.parseInt(seients[1])));
        } catch (SQLException ex) {
            Logger.getLogger(panelEntrades.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.dialogConfirm.setVisible(false);
        JOptionPane.showMessageDialog(this, "Gràcies per comprar la teva entrada");

        this.dialogConfirm.dispose();
        this.mostrarSala(this.p);

    }//GEN-LAST:event_btnConfirmarMouseClicked

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        System.out.println("han cancel·lat");
        this.dialogConfirm.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarMouseClicked

    public void mostrarSala(Pase p) {
        this.borrarSeients();
        recursosBD rBD = new recursosBD();

        try {
            Class c = Class.forName("sales." + p.getSales().getTipusSala());
            Constructor constructor = c.getDeclaredConstructor(Integer.class);
            DibuixSala sala = (DibuixSala) constructor.newInstance(p.getIdPase());
            sala.setPanel(this);
            sala.setBounds(this.contenedorSeients.getBounds());
            this.contenedorSeients.add(sala);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
/**
    public void mostrarSala2(final int idPase) {
        this.borrarSeients();

        recursosBD rBD = new recursosBD();
     
        Sala s = rBD.getSalaByPase(idPase);

        int files = s.getFiles();
        int columnes = s.getButaques();
        this.entrades = rBD.getEntrades(idPase);
        this.labelSelectPelicula.setVisible(true);
        int itemsAmple = 10;
        int itemsAlt;
        int espaiat = 2;
        int ample = 25;
        int alt = ample;

        //calculam quin es l'inici per centrar els seient
        int tamEspais = espaiat * (columnes - 1);
        int ampladaTotesColumnes = tamEspais + (ample * columnes);

        float iniciX = (float) (this.contenedorSeients.getBounds().getWidth() / 2) - (ampladaTotesColumnes / 2);

        System.out.println("les butaques s'han de començar a dibuixar al punt" + iniciX + "(" + columnes + ")");
        int iniciY = 0;

        //pintam tots els botons 
        for (int i = 0; i < columnes; i++) {
            for (int b = 0; b < files; b++) {
                final String seient = b + "-" + i;
                java.awt.Color color = Color.GREEN;
                javax.swing.JButton etiq = new javax.swing.JButton();

                //Miram si esta ocupat o no
                if (entrades.containsKey(b + "-" + i)) {
                    color = Color.RED;
                }
                //donam 
                etiq.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        comprarEntrada(evt, seient, idPase);
                    }
                });
                int colX = (int) iniciX + (i * (ample + espaiat));
                int colY = iniciY + (b * (alt + espaiat));
                //
                etiq.setOpaque(true);
                etiq.setBorderPainted(false);
                etiq.setBackground(color);

                this.contenedorSeients.add(etiq);
                etiq.setBounds(colX, colY, ample, alt);

            }
        }

        this.contenedorSeients.setPreferredSize(
                new Dimension(
                (int) this.contenedorSeients.getPreferredSize().getWidth(),
                (files * (alt + espaiat))));
    }
    * */
    public void comprarEntrada(java.awt.event.MouseEvent evt, String seient, int idPase) {
        recursosBD rbd = new recursosBD();
        this.entrades = rbd.getEntrades(idPase);

        if (!this.entrades.containsKey(seient)) {
            this.seient = seient;
            //esta lliure
            this.labelTitol.setText((String) this.llistatPelicules.getSelectedItem());
            this.labelDia.setText((String) this.diasDisponibles.getSelectedItem());
            this.labelHora.setText((String) this.llistatHores.getSelectedItem());
            //this.labelSeient.setText(seient);
            this.labelSala.setText(this.etiqSala.getText());
            //Mostram el dialog que demana confirmació
            this.dialogConfirm.setLocationRelativeTo(null);
            this.dialogConfirm.setSize(400, 330);
            this.dialogConfirm.setVisible(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JPanel contenedorSeients;
    private javax.swing.JDialog dialogConfirm;
    private javax.swing.JComboBox diasDisponibles;
    private javax.swing.JLabel etiqSala;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDia;
    private javax.swing.JLabel labelHora;
    private javax.swing.JLabel labelSala;
    private javax.swing.JLabel labelSelectPelicula;
    private javax.swing.JLabel labelTitol;
    private javax.swing.JComboBox llistatHores;
    private javax.swing.JComboBox llistatPelicules;
    // End of variables declaration//GEN-END:variables
}
