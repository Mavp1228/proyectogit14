/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio15;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtvalor1 = new javax.swing.JTextField();
        cmdcalcular = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmdborrar = new javax.swing.JButton();
        txtresultado1 = new javax.swing.JTextField();
        txtresultado2 = new javax.swing.JTextField();
        txtresultado3 = new javax.swing.JTextField();

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("PRESTAMO Y CUOTAS DEL BANCO");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 14, 210, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("ESCRIBA EL DINERO DEL PRESTAMO: ");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 64, 220, 30));

        txtvalor1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtvalor1KeyTyped(evt);
            }
        });
        jPanel3.add(txtvalor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 190, 30));

        cmdcalcular.setText("CALCULAR");
        cmdcalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcalcularActionPerformed(evt);
            }
        });
        jPanel3.add(cmdcalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 353, 120, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("EL MONTO DE UNA CUOTA ESPECIAL ES DE : ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 134, 250, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("EL MONTO DE UNA CUOTA ORIDINARIA ES DE : ");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 194, 260, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("EL MONTO TOTAL A PAGAR ES DE :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 254, 240, 40));

        cmdborrar.setText("BORRAR");
        cmdborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdborrarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdborrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 110, 40));

        txtresultado1.setEditable(false);
        jPanel3.add(txtresultado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 170, 30));

        txtresultado2.setEditable(false);
        jPanel3.add(txtresultado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 170, 30));

        txtresultado3.setEditable(false);
        jPanel3.add(txtresultado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 200, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 490, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdcalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcalcularActionPerformed
        double valor1, i, suma, ce, co;

        if (txtvalor1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese el monto del prestamo", "Error", JOptionPane.ERROR_MESSAGE);
            txtvalor1.requestFocusInWindow();
            txtvalor1.selectAll();
        } else {

            valor1 = Double.parseDouble(txtvalor1.getText());

            if (valor1 == 0) {
                JOptionPane.showMessageDialog(this, "Por favor ingrese un monto diferente de 0", "Error", JOptionPane.ERROR_MESSAGE);
                txtvalor1.requestFocusInWindow();
                txtvalor1.selectAll();
            } else {

                i = valor1 * 0.24;

                suma = valor1 + i;

                ce = (suma / 2) / 4;

                co = (suma / 2) / 20;

                txtresultado1.setText(String.valueOf(ce));
                txtresultado2.setText(String.valueOf(co));
                txtresultado3.setText(String.valueOf(suma));

            }
        }
    }//GEN-LAST:event_cmdcalcularActionPerformed

    private void cmdborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdborrarActionPerformed
        txtvalor1.setText("");
        txtresultado1.setText("");
        txtresultado2.setText("");
        txtresultado3.setText("");

        txtvalor1.requestFocusInWindow();


    }//GEN-LAST:event_cmdborrarActionPerformed

    private void txtvalor1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtvalor1KeyTyped
       char c = evt.getKeyChar();
       if(!Character.isDigit(c)){
           getToolkit().beep();
           evt.consume();
       }
        
        
    }//GEN-LAST:event_txtvalor1KeyTyped

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdborrar;
    private javax.swing.JButton cmdcalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtresultado1;
    private javax.swing.JTextField txtresultado2;
    private javax.swing.JTextField txtresultado3;
    private javax.swing.JTextField txtvalor1;
    // End of variables declaration//GEN-END:variables
}
