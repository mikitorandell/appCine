/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appcine;

import entitats.Pase;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import recursos.Colors;

/**
 *
 * @author torandell9
 */
public class panelHoraris extends javax.swing.JPanel {
    public pInicial pi;
    public ArrayList<Pase> pases = new ArrayList<Pase>();

    public panelHoraris(pInicial pi) {
        initComponents();
        this.pi = pi;

    }

    @Override
    public void setVisible(boolean aFlag) {
        if (aFlag) {
            this.carregarHorari();
        }
        super.setVisible(aFlag);
    }

    public void carregarHorari() {
        recursosBD rbd = new recursosBD();

        DefaultTableModel modelo = (DefaultTableModel) this.taulaHorari.getModel();

        DefaultTableModel modelo2 = new DefaultTableModel(new Object[][]{}, new String[]{"Dia", "Hora", "Pel·lícula", "3D", "Places lliures"});

        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(modelo2);

        this.taulaHorari.setModel(rbd.getPases(modelo2));

        this.taulaHorari.setRowSorter(sorter);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollTaula = new javax.swing.JScrollPane();
        taulaHorari = new javax.swing.JTable();

        setBackground(Colors.colorFonsPrincipal);

        taulaHorari.setBackground(Colors.colorFonsPelicules1);
        taulaHorari.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Dia", "Hora", "Pel·lícula", "3D", "Places lliures"
            }
        ));
        scrollTaula.setViewportView(taulaHorari);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(scrollTaula, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 993, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(scrollTaula, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane scrollTaula;
    private javax.swing.JTable taulaHorari;
    // End of variables declaration//GEN-END:variables
}