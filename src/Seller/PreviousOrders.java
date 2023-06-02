
package Seller;

import DatabaseConncection.DatabaseConnection;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PreviousOrders extends javax.swing.JFrame {
    /**
     * Creates new form NewJFrame
     */

    DatabaseConnection dc = new DatabaseConnection();

    Seller s = new Seller();
    Vector v;
    int x, y;

    public PreviousOrders() {
        initComponents();
        update_table();
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                onExit();
            }
        });

    }

    public void onExit() {
        int r = JOptionPane.showConfirmDialog(null, "Are you sure you want to sign out?", "Sign out",
                JOptionPane.YES_NO_OPTION);
        if (r == 0) {
            Users.user_login login = new Users.user_login();
            login.setVisible(true);
            this.dispose();
        }
    }
        
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        order_table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Refresh1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        p_name_txt = new javax.swing.JTextField();
        date_txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        id_txt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bill_txt = new javax.swing.JTextField();
        p_category_txt = new javax.swing.JTextField();
        Qu_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        totalbill = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        cancel = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        search_txt = new javax.swing.JTextField();

        jLabel8.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel8.setText("Bill :");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        order_table.setForeground(new java.awt.Color(0, 51, 204));
        order_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "OrderId", "Product name", "Product category", "Quantity", "Bill", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        order_table.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                order_tableAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        order_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                order_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(order_table);
        if (order_table.getColumnModel().getColumnCount() > 0) {
            order_table.getColumnModel().getColumn(0).setMaxWidth(73);
            order_table.getColumnModel().getColumn(1).setMaxWidth(75);
            order_table.getColumnModel().getColumn(4).setMaxWidth(73);
            order_table.getColumnModel().getColumn(5).setMaxWidth(75);
        }

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Vijaya", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Previous Orders");

        Refresh1.setFont(new java.awt.Font("Vijaya", 1, 24)); // NOI18N
        Refresh1.setText("Back");
        Refresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Refresh1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Refresh1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(17, 17, 17))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Refresh1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        p_name_txt.setEditable(false);
        p_name_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_name_txtActionPerformed(evt);
            }
        });

        date_txt.setEditable(false);
        date_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date_txtActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel6.setText("Product category :");

        jLabel5.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel5.setText("Quantity :");

        jLabel7.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel7.setText("Date :");

        jLabel9.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel9.setText("Order ID :");

        id_txt.setEditable(false);
        id_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_txtActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel10.setText("Bill :");

        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel3.setText("Product name :");

        bill_txt.setEditable(false);
        bill_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bill_txtActionPerformed(evt);
            }
        });

        p_category_txt.setEditable(false);

        Qu_txt.setEditable(false);
        Qu_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Qu_txtActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel2.setText("Order's Total Bill :");

        totalbill.setEditable(false);
        totalbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalbillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(p_category_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bill_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(date_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(totalbill))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(69, 69, 69)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(p_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Qu_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(id_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(213, 213, 213))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(id_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(p_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p_category_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Qu_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bill_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(date_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(totalbill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50))
        );

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        cancel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 51, 0));
        cancel.setText("Cancel Selected Transaction");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    cancelActionPerformed(evt);
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        jButton1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 0));
        jButton1.setText("Cancel the Whole Order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Vijaya", 1, 24)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Search");

        search_txt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        search_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_txtKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel))
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(update)
                .addGap(28, 28, 28))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void order_tableAncestorAdded(javax.swing.event.AncestorEvent evt) {// GEN-FIRST:event_order_tableAncestorAdded

    }// GEN-LAST:event_order_tableAncestorAdded

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {// GEN-FIRST:event_cancelActionPerformed
        s.deleteTransaction(id_txt.getText(), p_name_txt.getText(), Qu_txt.getText());
        update_table();
    }// GEN-LAST:event_cancelActionPerformed

    private void id_txtActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_id_txtActionPerformed

    }// GEN-LAST:event_id_txtActionPerformed

    private void order_tableMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_order_tableMouseClicked
        rowSelect();
    }// GEN-LAST:event_order_tableMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_updateActionPerformed
        update();
    }// GEN-LAST:event_updateActionPerformed

    private void Refresh1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Refresh1ActionPerformed
        new MakeOrder().setVisible(true);
        this.dispose();
    }// GEN-LAST:event_Refresh1ActionPerformed

    private void p_name_txtActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_p_name_txtActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_p_name_txtActionPerformed

    private void Qu_txtActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Qu_txtActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Qu_txtActionPerformed

    private void bill_txtActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bill_txtActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_bill_txtActionPerformed

    private void date_txtActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_date_txtActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_date_txtActionPerformed

    private void totalbillActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_totalbillActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_totalbillActionPerformed

    private void search_txtKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_search_txtKeyReleased
        search();
    }// GEN-LAST:event_search_txtKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        s.deleteOrder(id_txt.getText());
        update_table();
    }// GEN-LAST:event_jButton1ActionPerformed

    private void close17MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_close17MouseClicked
        this.dispose();
        new MakeOrder().setVisible(true);
    }// GEN-LAST:event_close17MouseClicked

    private void bar16MouseDragged(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_bar16MouseDragged
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        this.setLocation(xx - x, yy - y);
    }// GEN-LAST:event_bar16MouseDragged

    private void bar16MousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_bar16MousePressed
        x = evt.getX();
        y = evt.getY();
    }// GEN-LAST:event_bar16MousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PreviousOrders.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PreviousOrders.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PreviousOrders.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PreviousOrders.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PreviousOrders().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Qu_txt;
    private javax.swing.JButton Refresh1;
    private javax.swing.JTextField bill_txt;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField date_txt;
    private javax.swing.JTextField id_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable order_table;
    private javax.swing.JTextField p_category_txt;
    private javax.swing.JTextField p_name_txt;
    private javax.swing.JTextField search_txt;
    private javax.swing.JTextField totalbill;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

    private void search() {
        if (search_txt.getText().equals(""))
            update_table();
        else if (isInteger(search_txt.getText())) {
            s.search((DefaultTableModel) order_table.getModel(), Integer.parseInt(search_txt.getText()));
        } else {
            JOptionPane.showMessageDialog(null, "Only Positive Integers Values are Allowed", "Character Input",
                    JOptionPane.ERROR_MESSAGE);
            search_txt.setText(search_txt.getText().substring(0, search_txt.getText().length() - 1));
        }
    }

    private void update() {
        int qbefore = Integer.parseInt(Qu_txt.getText());
        double bill = Double.parseDouble(bill_txt.getText());
        int qafter;
        String qa = JOptionPane.showInputDialog(null, "Enter the New Quantity", "Edit Quantity",
                JOptionPane.QUESTION_MESSAGE);
        if (qa == null) {
        } else {
            qafter = Integer.parseInt(qa);
            double billdiff = s.updateQuantity(qbefore - qafter, p_name_txt.getText(), id_txt.getText());
            bill -= billdiff;
            if (bill > 0) {
                totalbill.setText(String.valueOf(Double.parseDouble(totalbill.getText()) - bill));
                Qu_txt.setText(String.valueOf(qafter));
                bill_txt.setText(String.valueOf(billdiff));
            } else if (bill < 0) {
                totalbill.setText(String.valueOf(Double.parseDouble(totalbill.getText()) + bill));
                Qu_txt.setText(String.valueOf(qafter));
                bill_txt.setText(String.valueOf(billdiff));
            }
            update_table();
        }
    }

    private void rowSelect() {
        DefaultTableModel model = (DefaultTableModel) order_table.getModel();
        int i = order_table.getSelectedRow();

        String t = s.getTotal(model.getValueAt(i, 1).toString());

        id_txt.setText(model.getValueAt(i, 1).toString());
        p_name_txt.setText(model.getValueAt(i, 2).toString());
        p_category_txt.setText(model.getValueAt(i, 3).toString());
        Qu_txt.setText(model.getValueAt(i, 4).toString());
        bill_txt.setText(model.getValueAt(i, 5).toString());
        date_txt.setText(model.getValueAt(i, 6).toString());
        totalbill.setText(t);
    }

    private boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    void update_table() {
        try {
            ResultSet Rs = dc.executeQuery("select * from orders");
            ResultSetMetaData RSMD = Rs.getMetaData();
            int Column_count = RSMD.getColumnCount();
            DefaultTableModel dft = (DefaultTableModel) order_table.getModel();
            dft.setRowCount(0);

            while (Rs.next()) {
                Vector v = new Vector();
                for (int i = 1; i <= Column_count; i++) {
                    v.add(Rs.getString("id"));
                    v.add(Rs.getString("order_id"));
                    v.add(Rs.getString("product_name"));
                    v.add(Rs.getString("product_category"));
                    v.add(Rs.getString("quantity"));
                    v.add(Rs.getString("bill"));
                    v.add(Rs.getString("date"));
                }
                dft.addRow(v);
            }
        } catch (Exception e) {
        }
    }
}
