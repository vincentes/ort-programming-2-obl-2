/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavi.ort.edu.uy.ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import mavi.ort.edu.uy.models.Fumigation;
import mavi.ort.edu.uy.models.FumigationCell;
import mavi.ort.edu.uy.models.FumigationSystem;
import mavi.ort.edu.uy.models.Product;
import static mavi.ort.edu.uy.ui.PilotFrame.fumigation;
import mavi.ort.edu.uy.utils.CollectionUtils;
import mavi.ort.edu.uy.utils.StringUtils;

/**
 *
 * @author Vicente Bermúdez, Matías Sallé
 */
public class QueryFrame extends javax.swing.JFrame {

    private FumigationCell[][] cells = new FumigationCell[15][50];
    private FumigationSystem fumigationSystem;
    private DefaultComboBoxModel productsListModel;
    private Product selectedProduct;
    private int selectedDay = -1;

    /**
     * Creates new form QueryFrame
     */
    public QueryFrame() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception ignored) {
            System.out.println("'Windows look and feel' no se pudo cargar exitosamente");
        }
        fumigationSystem = FumigationSystem.getInstance();
        List<Product> productsTmp = new ArrayList<Product>();
        productsTmp.add(null);
        productsTmp.addAll(fumigationSystem.getProducts());
        productsListModel = new DefaultComboBoxModel(productsTmp.toArray(Product[]::new));

        loadFumigations();
        setResizable(false);

        initComponents();
        JTableHeader tableHeader = table.getTableHeader();
        DefaultTableCellRenderer tableHeaderRenderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                    boolean isSelected, boolean hasFocus, int row, int column) {

                JLabel l = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                l.setBackground(Color.PINK);
                l.setSize(50, 50);
                l.setAlignmentX(JLabel.CENTER_ALIGNMENT);
                l.setFocusable(false);

                return l;
            }
        };
        tableHeaderRenderer.setHorizontalAlignment(JLabel.CENTER);
        tableHeader.setDefaultRenderer(tableHeaderRenderer);

        tableHeader.setResizingAllowed(false);
        tableHeader.setReorderingAllowed(false);

        String[] columns = new String[50];
        for (int i = 0; i < columns.length; i++) {
            columns[i] = String.valueOf(i + 1);
        }

        String[][] defaultRows = new String[15][50];
        for (int i = 0; i < defaultRows.length; i++) {
            String row[] = new String[defaultRows[i].length];
            for (int j = 0; j < defaultRows[i].length; j++) {
                defaultRows[i][j] = "0";
            }
        }

        table.setModel(new javax.swing.table.DefaultTableModel(
                defaultRows,
                columns
        ));

        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        // Center cells
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                    boolean isSelected, boolean hasFocus, int row, int column) {

                JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                label.setSize(50, 50);
                label.setFocusable(false);
                label.setForeground(Color.white);

                int quantity = cells[row][column].getQuantity();
                int brightnessGain = Math.round((255 / 25) * quantity);
                Color color = new Color(brightnessGain, 0, 0);
                label.setBackground(color);
                label.setText(String.valueOf(cells[row][column].getQuantity()));
                return label;
            }
        };
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        centerRenderer.setFocusable(false);
        for (int i = 0; i < columns.length; i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        table.setFocusable(false);
        table.setRowSelectionAllowed(false);
        table.setDefaultEditor(Object.class, null);

        productsList.setSelectedIndex(-1);
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
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        label1 = new java.awt.Label();
        productsList = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        dayField = new javax.swing.JTextField();
        filter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cancelBtn.setText("Cancelar");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jPanel2.setBackground(java.awt.Color.pink);
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setAlignmentX(Component.CENTER_ALIGNMENT);
        jPanel2.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.Y_AXIS));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("A");
        jLabel16.setAlignmentX(Component.CENTER_ALIGNMENT);
        jLabel16.setBorder(new CompoundBorder(null, new EmptyBorder(0,0,1,0)));
        jPanel2.add(jLabel16);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("B");
        jLabel2.setAlignmentX(Component.CENTER_ALIGNMENT);
        jLabel2.setBorder(new CompoundBorder(null, new EmptyBorder(0,0,1,0)));
        jPanel2.add(jLabel2);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("C");
        jLabel3.setAlignmentX(Component.CENTER_ALIGNMENT);
        jLabel3.setBorder(new CompoundBorder(null, new EmptyBorder(0,0,1,0)));
        jPanel2.add(jLabel3);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("D");
        jLabel4.setAlignmentX(Component.CENTER_ALIGNMENT);
        jLabel4.setBorder(new CompoundBorder(null, new EmptyBorder(0,0,1,0)));
        jPanel2.add(jLabel4);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("E");
        jLabel5.setAlignmentX(Component.CENTER_ALIGNMENT);
        jLabel5.setBorder(new CompoundBorder(null, new EmptyBorder(0,0,1,0)));
        jPanel2.add(jLabel5);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("F");
        jLabel6.setAlignmentX(Component.CENTER_ALIGNMENT);
        jLabel6.setBorder(new CompoundBorder(null, new EmptyBorder(0,0,1,0)));
        jPanel2.add(jLabel6);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("G");
        jLabel7.setAlignmentX(Component.CENTER_ALIGNMENT);
        jLabel7.setBorder(new CompoundBorder(null, new EmptyBorder(0,0,1,0)));
        jPanel2.add(jLabel7);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("H");
        jLabel8.setAlignmentX(Component.CENTER_ALIGNMENT);
        jLabel8.setBorder(new CompoundBorder(null, new EmptyBorder(0,0,1,0)));
        jPanel2.add(jLabel8);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("I");
        jLabel9.setAlignmentX(Component.CENTER_ALIGNMENT);
        jLabel9.setBorder(new CompoundBorder(null, new EmptyBorder(0,0,1,0)));
        jPanel2.add(jLabel9);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("J");
        jLabel10.setAlignmentX(Component.CENTER_ALIGNMENT);
        jLabel10.setBorder(new CompoundBorder(null, new EmptyBorder(0,0,1,0)));
        jPanel2.add(jLabel10);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("K");
        jLabel11.setAlignmentX(Component.CENTER_ALIGNMENT);
        jLabel11.setBorder(new CompoundBorder(null, new EmptyBorder(0,0,1,0)));
        jPanel2.add(jLabel11);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("L");
        jLabel12.setAlignmentX(Component.CENTER_ALIGNMENT);
        jLabel12.setBorder(new CompoundBorder(null, new EmptyBorder(0,0,1,0)));
        jPanel2.add(jLabel12);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("M");
        jLabel13.setAlignmentX(Component.CENTER_ALIGNMENT);
        jLabel13.setBorder(new CompoundBorder(null, new EmptyBorder(0,0,1,0)));
        jPanel2.add(jLabel13);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("N");
        jLabel14.setAlignmentX(Component.CENTER_ALIGNMENT);
        jLabel14.setBorder(new CompoundBorder(null, new EmptyBorder(0,0,1,0)));
        jPanel2.add(jLabel14);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("O");
        jLabel15.setAlignmentX(Component.CENTER_ALIGNMENT);
        jLabel15.setBorder(new CompoundBorder(null, new EmptyBorder(0,0,1,0)));
        jPanel2.add(jLabel15);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        label1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        label1.setText("Filtros");

        productsList.setModel(productsListModel);

        jLabel1.setText("Producto");

        jLabel17.setText("Día");

        dayField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dayFieldKeyTyped(evt);
            }
        });

        filter.setText("Filtrar");
        filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filter)
                    .addComponent(jLabel17)
                    .addComponent(jLabel1)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(productsList, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dayField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productsList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dayField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(filter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(cancelBtn)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new InitialFrame().setVisible(true);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void filterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterActionPerformed
        selectedProduct = (Product) productsList.getSelectedItem();
        String dayTxt = dayField.getText();
        if (dayTxt.isEmpty()) {
            selectedDay = -1;
        } else {
            selectedDay = Integer.parseInt(dayTxt);
        }

        loadFumigations();
    }//GEN-LAST:event_filterActionPerformed

    private void dayFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dayFieldKeyTyped
        // TODO add your handling code here:
          // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
            showMessageDialog(null, "Solo el ingreso de números es permitido");
        }
    }//GEN-LAST:event_dayFieldKeyTyped

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
            java.util.logging.Logger.getLogger(QueryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QueryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QueryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QueryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new QueryFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTextField dayField;
    private javax.swing.JButton filter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private javax.swing.JComboBox<String> productsList;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    private void loadFumigations() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                cells[i][j] = new FumigationCell();
            }
        }

        List<Fumigation> fumigations = fumigationSystem.getFumigations();
        for (Fumigation fumigation : fumigations) {
            Product product = fumigation.getProduct();
            if (selectedProduct != null && product.getId() != selectedProduct.getId()) {
                continue;
            }

            int fumigationDay = fumigation.getDay();
            if (selectedDay != -1 && selectedDay != fumigationDay) {
                continue;
            }

            int rowA = StringUtils.alphabeticPosition(fumigation.getRowA());
            int rowB = StringUtils.alphabeticPosition(fumigation.getRowB());
            int colA = fumigation.getColumnA();
            int colB = fumigation.getColumnB();
            int colDifference = fumigation.getColumnAbsDifference();
            int rowDifference = fumigation.getRowAbsDifference();
            int[] colsAffected = new int[colDifference + 1];
            int[] rowsAffected = new int[rowDifference + 1];

            colsAffected[0] = colA;
            if (fumigation.getColumnDifference() > 0) {
                for (int k = 0; k <= colDifference; k++) {
                    colsAffected[k] = colA + k;
                }
            } else if (fumigation.getColumnDifference() < 0) {
                for (int k = 0; k <= colDifference; k++) {
                    colsAffected[k] = colA - k;
                }
            }

            rowsAffected[0] = rowA;
            if (fumigation.getRowDifference() > 0) {
                for (int k = 0; k <= rowDifference; k++) {
                    rowsAffected[k] = rowA + k;
                }
            } else if (fumigation.getRowDifference() < 0) {
                for (int k = 0; k <= rowDifference; k++) {
                    rowsAffected[k] = rowA - k;
                }
            }

            for (int i = 0; i < cells.length; i++) {
                for (int j = 0; j < cells[i].length; j++) {
                    FumigationCell cell = cells[i][j];
                    boolean isRowAffected = CollectionUtils.contains(rowsAffected, i);
                    boolean isColAffected = CollectionUtils.contains(colsAffected, j);
                    if (isRowAffected && isColAffected) {
                        cell.quantity++;
                    }
                }
            }
        }

        if (table != null) {
            table.repaint();
        }
    }

}
