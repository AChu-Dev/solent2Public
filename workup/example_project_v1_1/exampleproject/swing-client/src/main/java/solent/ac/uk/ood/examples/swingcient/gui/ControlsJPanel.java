/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solent.ac.uk.ood.examples.swingcient.gui;

/**
 *
 * @author cgallen
 */
public class ControlsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EntityListJPanel
     */
    public ControlsJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        entityFieldsJPanel1 = new solent.ac.uk.ood.examples.swingcient.gui.EntityFieldsJPanel();
        panel1 = new java.awt.Panel();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.X_AXIS));

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.X_AXIS));
        jPanel1.add(entityFieldsJPanel1);

        add(jPanel1);

        panel1.setMaximumSize(new java.awt.Dimension(102, 34));
        panel1.setLayout(new java.awt.GridLayout());

        button1.setActionCommand("findMatching");
        button1.setLabel("Find Matching");
        button1.setName("find"); // NOI18N
        panel1.add(button1);

        button2.setActionCommand("clearSearchButton");
        button2.setLabel("Clear Search");
        panel1.add(button2);

        add(panel1);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private solent.ac.uk.ood.examples.swingcient.gui.EntityFieldsJPanel entityFieldsJPanel1;
    private javax.swing.JPanel jPanel1;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}