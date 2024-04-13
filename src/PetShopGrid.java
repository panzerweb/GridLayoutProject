
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;


public class PetShopGrid extends javax.swing.JFrame {

 
    
    public PetShopGrid() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        receipt = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jPanel10 = new javax.swing.JPanel();
        jToggleButton4 = new javax.swing.JToggleButton();
        jPanel11 = new javax.swing.JPanel();
        totalPriceField = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new java.awt.GridLayout(0, 1));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Petshop");
        jPanel1.add(jLabel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new java.awt.GridLayout(0, 3, 5, 5));

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-dog-32.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jButton2.setBackground(new java.awt.Color(153, 255, 153));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-cat-32.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        jButton3.setBackground(new java.awt.Color(153, 255, 153));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-bird-32.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);

        jButton4.setBackground(new java.awt.Color(153, 255, 153));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-fish-32.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);

        jButton5.setBackground(new java.awt.Color(153, 255, 153));
        jButton5.setForeground(new java.awt.Color(240, 240, 240));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-rabbit-32.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);

        jButton6.setBackground(new java.awt.Color(153, 255, 153));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-hamster-32.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);

        jPanel4.setBackground(new java.awt.Color(51, 255, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Pet Type");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.add(jLabel2);

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        receipt.setBackground(new java.awt.Color(240, 240, 240));
        receipt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        receipt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pet Breed", "Pet ID", "Gender", "Quantity", "Price"
            }
        ));
        jScrollPane1.setViewportView(receipt);

        jPanel6.add(jScrollPane1);

        jPanel3.setLayout(new java.awt.GridLayout(1, 1, 5, 5));

        jButton8.setBackground(new java.awt.Color(153, 153, 255));
        jButton8.setText("Info");
        jButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8);

        jPanel5.setLayout(new java.awt.GridLayout(0, 1));

        jLabel4.setText("Name :");
        jPanel5.add(jLabel4);

        jLabel5.setText("Phone No :");
        jPanel5.add(jLabel5);

        jLabel6.setText("Owner Pin # :");
        jPanel5.add(jLabel6);

        jPanel7.setBackground(new java.awt.Color(102, 102, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setLayout(new java.awt.GridLayout(0, 1));

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Buyer Information");
        jPanel7.add(jLabel3);

        jPanel8.setLayout(new java.awt.GridLayout(0, 1, 0, 5));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel8.add(jTextField1);
        jPanel8.add(jTextField2);
        jPanel8.add(jTextField3);

        jPanel9.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        jToggleButton1.setBackground(new java.awt.Color(255, 255, 153));
        jToggleButton1.setText("Save");
        jToggleButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel9.add(jToggleButton1);

        jToggleButton2.setBackground(new java.awt.Color(255, 51, 51));
        jToggleButton2.setText("Delete");
        jToggleButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.add(jToggleButton2);

        jPanel10.setLayout(new java.awt.GridLayout(1, 0));

        jToggleButton4.setBackground(new java.awt.Color(255, 255, 153));
        jToggleButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jToggleButton4.setText("Confirm");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel11.setLayout(new java.awt.GridLayout(1, 1));

        totalPriceField.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalPriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPriceFieldActionPerformed(evt);
            }
        });
        jPanel11.add(totalPriceField);

        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel12.setLayout(new java.awt.GridLayout(1, 0));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("Total :");
        jPanel12.add(jLabel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(212, 212, 212)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jToggleButton4)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(892, 598));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   Birds b = new Birds();
            b.setVisible(true);
            b.pack();
            b.setLocationRelativeTo(null);
            b.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setVisible(true);
            
    }//GEN-LAST:event_jButton3ActionPerformed
       public static void AddRowToBirds(Object[] dataRow){
        DefaultTableModel model = (DefaultTableModel)receipt.getModel();
        model.addRow(dataRow);
    }     
    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
      
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        infoUI info = new infoUI();
        info.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     Dogs d = new Dogs();
     d.setVisible(true);
     d.pack();
     d.setLocationRelativeTo(null);
     d.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     setVisible(true);
     
     //set Visible false to all animals
    }//GEN-LAST:event_jButton1ActionPerformed
   
    public static void AddRowToDogs(Object[] dataRow){
        DefaultTableModel model = (DefaultTableModel)receipt.getModel();
        model.addRow(dataRow);
    }
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         Cats c = new Cats();
            c.setVisible(true);
            c.pack();
            c.setLocationRelativeTo(null);
            c.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void AddRowToCats(Object[] dataRow){
        DefaultTableModel model = (DefaultTableModel)receipt.getModel();
        model.addRow(dataRow);
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    Fish f = new Fish();
            f.setVisible(true);
            f.pack();
            f.setLocationRelativeTo(null);
            f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setVisible(true);
            
    }//GEN-LAST:event_jButton4ActionPerformed
      public static void AddRowToFish(Object[] dataRow){
        DefaultTableModel model = (DefaultTableModel)receipt.getModel();
        model.addRow(dataRow);
      }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Rabbits r = new Rabbits();
            r.setVisible(true);
            r.pack();
            r.setLocationRelativeTo(null);
            r.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setVisible(true);
            

    }//GEN-LAST:event_jButton5ActionPerformed
      public static void AddRowToRabbits(Object[] dataRow){
        DefaultTableModel model = (DefaultTableModel)receipt.getModel();
        model.addRow(dataRow);
      }
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    Hamsters h = new Hamsters();
            h.setVisible(true);
            h.pack();
            h.setLocationRelativeTo(null);
            h.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setVisible(true);
            
    }//GEN-LAST:event_jButton6ActionPerformed

    private void totalPriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPriceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalPriceFieldActionPerformed
      public static void AddRowToHamsters(Object[] dataRow){
        DefaultTableModel model = (DefaultTableModel)receipt.getModel();
        model.addRow(dataRow);
      }
    public JTable getReceiptTable() {
        return receipt;
    }
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PetShopGrid().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton4;
    private static javax.swing.JTable receipt;
    private javax.swing.JTextField totalPriceField;
    // End of variables declaration//GEN-END:variables
}
