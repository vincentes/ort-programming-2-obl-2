/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavi.ort.edu.uy.ui;

import java.awt.event.KeyEvent;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.UIManager;

import mavi.ort.edu.uy.models.FumigationSystem;

/**
 *
 * @author Vicente Bermúdez, Matías Sallé
 */
public class PilotFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public static FumigationSystem fumigation;

    public PilotFrame() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception ignored) {
            System.out.println("'Windows look and feel' no se pudo cargar exitosamente");
        }
        setResizable(false);
        initComponents();

        // Data init
        fumigation = FumigationSystem.getInstance();
        pilotsList.setListData(fumigation.getPilotsAsStringArray());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cancelBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ciTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        addressTxt = new javax.swing.JTextField();
        createBtn1 = new javax.swing.JButton();
        yearsOfExperienceTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        pilotsList = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cancelBtn.setText("Cancelar");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setText("Alta de Piloto");

        jLabel1.setText("Nombre");

        nameTxt.setToolTipText("Introduce el nombre del piloto");
        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });
        nameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameTxtKeyTyped(evt);
            }
        });

        jLabel2.setText("Cédula(sin espacios ni guíones)");

        ciTxt.setToolTipText("Introduce la cédula del piloto");
        ciTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciTxtActionPerformed(evt);
            }
        });
        ciTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ciTxtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ciTxtKeyTyped(evt);
            }
        });

        jLabel3.setText("Dirección");

        jLabel5.setText("Años de experiencia");

        addressTxt.setToolTipText("Introduce la dirección del piloto");

        createBtn1.setText("Crear");
        createBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtn1ActionPerformed(evt);
            }
        });

        yearsOfExperienceTxt.setToolTipText("Introduce los años de experiencia del piloto");
        yearsOfExperienceTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearsOfExperienceTxtActionPerformed(evt);
            }
        });
        yearsOfExperienceTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                yearsOfExperienceTxtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                yearsOfExperienceTxtKeyTyped(evt);
            }
        });

        pilotsList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(pilotsList);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setText("Pilotos existentes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(createBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(yearsOfExperienceTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                        .addGap(69, 69, 69))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(addressTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                .addComponent(nameTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ciTxt, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(97, 97, 97))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ciTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(yearsOfExperienceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn)
                    .addComponent(createBtn1))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        nameTxt.getAccessibleContext().setAccessibleName("");
        ciTxt.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.setVisible(false);
        new InitialFrame().setVisible(true);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void createBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtn1ActionPerformed
        // TODO add your handling code here:
        String ci = ciTxt.getText();
        if (ci.isEmpty()) {
            showMessageDialog(this, "Debe de ingresar una cédula no vacía");
            return;
        }
        String name = nameTxt.getText();
        if (name.isEmpty()) {
            showMessageDialog(this, "Debe de ingresar un nombre no vacío");
            return;
        }
        String address = addressTxt.getText();
        if (address.isEmpty()) {
            showMessageDialog(this, "Debe de ingresar una dirección no vacía");
            return;
        }
        String yearsOfExperience = yearsOfExperienceTxt.getText();
        if (yearsOfExperience.isEmpty()) {
            showMessageDialog(this, "Debe de ingresar un valor en años de experiencia diferente a vacío");
            return;
        }
        if (Integer.parseInt(yearsOfExperience) > 60 || Integer.parseInt(yearsOfExperience) < 0) {
            showMessageDialog(null, "Debe de ingresar una cantidad de años de experiencia válidos");
            yearsOfExperienceTxt.setText("");
        } else if (!fumigation.isValidCi(ci)) {
            showMessageDialog(null, "Debe de ingresar una cédula válida");
        } else {
            if (!fumigation.doesPilotExist(ci)) {
                fumigation.addPilot(name, ci, address, Integer.parseInt(yearsOfExperience));
                nameTxt.setText("");
                ciTxt.setText("");
                addressTxt.setText("");
                yearsOfExperienceTxt.setText("");
                showMessageDialog(this, "Piloto creado exitosamente");
                pilotsList.setListData(fumigation.getPilotsAsStringArray());
            } else {
                showMessageDialog(this, "El piloto con cédula " + ci + " ya ha sido ingresado");
                ciTxt.setText("");
            }
        }

    }//GEN-LAST:event_createBtn1ActionPerformed

    private void ciTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ciTxtKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_ciTxtKeyPressed

    private void ciTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ciTxtKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
            showMessageDialog(null, "Solo el ingreso de números es permitido");
        }

    }//GEN-LAST:event_ciTxtKeyTyped

    private void ciTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ciTxtActionPerformed

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtActionPerformed

    private void nameTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTxtKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isLetter(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_SPACE)) {
            evt.consume();
            showMessageDialog(null, "Solo el ingreso de letras es permitido");
        }
    }//GEN-LAST:event_nameTxtKeyTyped

    private void yearsOfExperienceTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearsOfExperienceTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearsOfExperienceTxtActionPerformed

    private void yearsOfExperienceTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yearsOfExperienceTxtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearsOfExperienceTxtKeyPressed

    private void yearsOfExperienceTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yearsOfExperienceTxtKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
            showMessageDialog(null, "Solo el ingreso de números es permitido");
        }
    }//GEN-LAST:event_yearsOfExperienceTxtKeyTyped

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
            java.util.logging.Logger.getLogger(PilotFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilotFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilotFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilotFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilotFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTxt;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTextField ciTxt;
    private javax.swing.JButton createBtn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JList<String> pilotsList;
    private javax.swing.JTextField yearsOfExperienceTxt;
    // End of variables declaration//GEN-END:variables
}
