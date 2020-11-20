/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavi.ort.edu.uy.ui;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import static javax.swing.JOptionPane.showMessageDialog;
import mavi.ort.edu.uy.models.FumigationSystem;

import javax.swing.UIManager;
import mavi.ort.edu.uy.models.Fumigation;
import mavi.ort.edu.uy.models.Pilot;
import mavi.ort.edu.uy.models.Product;
import mavi.ort.edu.uy.models.Technic;
import mavi.ort.edu.uy.utils.StringUtils;

/**
 *
 * @author vicentebermudez
 */
public class FumigationRegistryFrame extends javax.swing.JFrame {

    FumigationSystem fumigation;

    /**
     * Creates new form MainWindow
     */
    public FumigationRegistryFrame() {
        fumigation = FumigationSystem.getInstance();
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception ignored) {
            System.out.println("'Windows look and feel' no se pudo cargar exitosamente");
        }
        setResizable(false);
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

        jLabel1 = new javax.swing.JLabel();
        pilotList = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        technicList = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        productList = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        dayTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        zoneTxt = new javax.swing.JTextField();
        registerBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setText("Registro de fumigación individual");

        pilotList.setModel(new DefaultComboBoxModel(fumigation.getPilotsList().toArray(Pilot[]::new)));

        jLabel2.setText("Piloto");

        technicList.setModel(new DefaultComboBoxModel(fumigation.getTechnics().toArray(Technic[]::new)));

        jLabel3.setText("Técnico");

        jLabel4.setText("Producto");

        productList.setModel(new DefaultComboBoxModel(fumigation.getProducts().toArray(Product[]::new)));

        jLabel5.setText("Zona");

        jLabel6.setText("Día");

        registerBtn.setText("Registrar");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancelar");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(productList, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(technicList, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(pilotList, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(dayTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pilotList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(technicList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dayTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerBtn)
                    .addComponent(cancelBtn))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new InitialFrame().setVisible(true);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        Pilot pilot = (Pilot) pilotList.getSelectedItem();
        Technic technic = (Technic) technicList.getSelectedItem();
        Product product = (Product) productList.getSelectedItem();
        if (pilot == null) {
            showMessageDialog(this, "Debe ingresar un piloto. Si no existen, debe registrar uno.");
            return;
        } else if (technic == null) {
            showMessageDialog(this, "Debe ingresar un técnico. Si no existen, debe registrar uno.");
            return;
        } else if (product == null) {
            showMessageDialog(this, "Debe ingresar un producto. Si no existen, debe registrar uno.");
            return;
        }

        String zone = zoneTxt.getText().toUpperCase();
        String dayStr = dayTxt.getText().trim();
        if (!StringUtils.isPositiveNumber(dayStr)) {
            showMessageDialog(this, "Debe de ingresar un día con números postivos, del 1 al 30.");
            return;
        }
        int day = Integer.parseInt(dayStr);
        if (!Fumigation.isValidZone(zone)) {
            showMessageDialog(this, "El formato de la zona debe ser <Fila A>-<Columna A>-<Fila B>-<Columna B>. \nFilas permitidas: A, B, ..., M, N, O\nColumnas permitidas: 1,2,...50");
            return;
        }

        fumigation.addFumigation(pilot, technic, product, day, zone);
        showMessageDialog(this, "Se ha registrado la fumigación exitosamente.");
    }//GEN-LAST:event_registerBtnActionPerformed

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
            java.util.logging.Logger.getLogger(FumigationRegistryFrame.class.getName()).log(java.util.logging.Level.SEVERE, ex.getMessage(), ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FumigationRegistryFrame.class.getName()).log(java.util.logging.Level.SEVERE, ex.getMessage(), ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FumigationRegistryFrame.class.getName()).log(java.util.logging.Level.SEVERE, ex.getMessage(), ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FumigationRegistryFrame.class.getName()).log(java.util.logging.Level.SEVERE, ex.getMessage(), ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FumigationRegistryFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTextField dayTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> pilotList;
    private javax.swing.JComboBox<String> productList;
    private javax.swing.JButton registerBtn;
    private javax.swing.JComboBox<String> technicList;
    private javax.swing.JTextField zoneTxt;
    // End of variables declaration//GEN-END:variables
}
