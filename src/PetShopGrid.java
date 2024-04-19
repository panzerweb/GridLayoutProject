
import java.util.Date;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;


public class PetShopGrid extends javax.swing.JFrame {
    static HashMap<String, Object> hashStore = new HashMap<>();
    private final DefaultTableModel model;
    
    private Dogs dogsFrame;
    private Cats catsFrame;
    private Birds birdsFrame;
    private Fish fishFrame;
    private Rabbits rabbitsFrame;
    private Hamsters hamstersFrame;

 
    
    public PetShopGrid() {
        initComponents();
        
        model = (DefaultTableModel) receipt.getModel();
        receipt.setModel(model);
        model.addTableModelListener(new TableModelListener() {

            @Override
            public void tableChanged(TableModelEvent e) {
                if (e.getType() == TableModelEvent.DELETE) {
                    
                }
            }
        });
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
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
        pName = new javax.swing.JTextField();
        pContact = new javax.swing.JTextField();
        pPin = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        saveBtn = new javax.swing.JToggleButton();
        delBtn = new javax.swing.JToggleButton();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        totalPriceField = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        receiptArea = new javax.swing.JTextArea();
        jButton9 = new javax.swing.JButton();
        background = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        deleteRow = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        confirmBtn = new javax.swing.JToggleButton();
        jPanel14 = new javax.swing.JPanel();
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new java.awt.GridLayout(0, 1));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Kristen ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-dog-32.png"))); // NOI18N
        jLabel1.setText("Petshop");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 47));

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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 124));

        jPanel4.setBackground(new java.awt.Color(51, 255, 102));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Pet Type");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.add(jLabel2);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 104, 209, 49));

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
        receipt.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                receiptInputMethodTextChanged(evt);
            }
        });
        jScrollPane1.setViewportView(receipt);

        jPanel6.add(jScrollPane1);

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 104, 615, 312));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new java.awt.GridLayout(1, 1, 5, 5));

        jButton8.setBackground(new java.awt.Color(153, 153, 255));
        jButton8.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jButton8.setText("Manual | Policy & Terms");
        jButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 302, 209, 35));

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setLayout(new java.awt.GridLayout(0, 1));

        jLabel4.setText("Name :");
        jPanel5.add(jLabel4);

        jLabel5.setText("Phone No :");
        jPanel5.add(jLabel5);

        jLabel6.setText("Owner Pin # :");
        jPanel5.add(jLabel6);

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 408, -1, 76));

        jPanel7.setBackground(new java.awt.Color(102, 102, 255));
        jPanel7.setLayout(new java.awt.GridLayout(0, 1));

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Buyer Information");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.add(jLabel3);

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 209, 40));

        jPanel8.setBackground(new java.awt.Color(204, 204, 255));
        jPanel8.setLayout(new java.awt.GridLayout(0, 1, 0, 5));

        pName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pNameActionPerformed(evt);
            }
        });
        jPanel8.add(pName);
        jPanel8.add(pContact);
        jPanel8.add(pPin);

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 408, 108, -1));

        jPanel9.setBackground(new java.awt.Color(204, 204, 255));
        jPanel9.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        saveBtn.setBackground(new java.awt.Color(255, 255, 153));
        saveBtn.setText("Save");
        saveBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        jPanel9.add(saveBtn);

        delBtn.setText("Delete");
        delBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });
        jPanel9.add(delBtn);

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 497, 209, 41));

        jPanel10.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 526, -1, -1));

        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel11.setLayout(new java.awt.GridLayout(1, 1));

        totalPriceField.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalPriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPriceFieldActionPerformed(evt);
            }
        });
        jPanel11.add(totalPriceField);

        getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 426, 210, 31));

        jPanel15.setLayout(null);

        receiptArea.setEditable(false);
        receiptArea.setColumns(20);
        receiptArea.setRows(5);
        jScrollPane4.setViewportView(receiptArea);

        jPanel15.add(jScrollPane4);
        jScrollPane4.setBounds(0, 0, 260, 320);

        getContentPane().add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 100, 260, 320));

        jButton9.setText("Print Receipt");
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 430, 260, 30));

        background.setBackground(new java.awt.Color(204, 204, 255));

        jPanel13.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );

        jPanel12.setBackground(new java.awt.Color(204, 204, 255));
        jPanel12.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

        deleteRow.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteRow.setText("Delete Row");
        deleteRow.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRowActionPerformed(evt);
            }
        });
        jPanel12.add(deleteRow);

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(51, 51, 51));
        jButton7.setText("Calculate Total :");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton7);

        confirmBtn.setBackground(new java.awt.Color(255, 255, 153));
        confirmBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        confirmBtn.setText("Confirm");
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });
        jPanel12.add(confirmBtn);

        jPanel14.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("  ₱");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addContainerGap(880, Short.MAX_VALUE)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(239, 239, 239))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap(350, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(111, 111, 111))))
        );

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 590));

        setSize(new java.awt.Dimension(1175, 598));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pNameActionPerformed
        
    }//GEN-LAST:event_pNameActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        closePetFrames();
        
        birdsFrame = new Birds();
        birdsFrame.setVisible(true);
        birdsFrame.pack();
        birdsFrame.setLocationRelativeTo(null);
        birdsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setVisible(true);
            
    }//GEN-LAST:event_jButton3ActionPerformed
       public static void AddRowToBirds(Object[] dataRow){
        DefaultTableModel model = (DefaultTableModel)receipt.getModel();
        model.addRow(dataRow);
    }     
    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        String personName = pName.getText();
        long contactNumber = Long.parseLong(pContact.getText());
        String pin = pPin.getText();
        
        Date currentDate = new Date();

        //receiptPrint for the String Builder
        //receipt for Table
        //receiptArea for the textArea
        StringBuilder receiptPrint = new StringBuilder("***********************************************************************************\n" +
                "********************             PetShop System Receipt             ******************** \n" +
                "***********************************************************************************\n" +
                "\t                  Contact: 09090774336\n" +
                "\t              Davao del Norte State College\n" +               
                "\t              " + currentDate + "\n\n" +

                
                "Pet Name: " + personName + "\n" +
                "Contact Number: " + contactNumber + "\n" +
                "PIN: " + pin + "\n" +

                "***********************************************************************************\n"+
                 "Breed\tPetID\tGender\tQty\tPrice\n");

        
        for (int row = 0; row < receipt.getRowCount(); row++) {
            for (int col = 0; col < receipt.getColumnCount(); col++) {
                receiptPrint.append(receipt.getValueAt(row, col)).append("\t");
  
            }
            receiptPrint.append("\n");
        }
        receiptArea.setText(receiptPrint.toString());
    }//GEN-LAST:event_confirmBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        Long contacts = Long.parseLong(pContact.getText());
        int pin = Integer.parseInt(pPin.getText());
        
            hashStore.put("Buyer Name :", pName.getText());
            hashStore.put("Contact No :", contacts);
            hashStore.put("Pin :", pin);
            
            String name = (String)hashStore.get("Buyer Name :");
            long contact = (Long)hashStore.get("Contact No :");
            int pinned = (Integer)hashStore.get("Pin :");
            
            System.out.println(name);
            System.out.println(contact);
            System.out.println(pinned);
        
    }//GEN-LAST:event_saveBtnActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        infoUI info = new infoUI();
        info.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     closePetFrames();
        
     dogsFrame = new Dogs();
     dogsFrame.setVisible(true);
     dogsFrame.pack();
     dogsFrame.setLocationRelativeTo(null);
     dogsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     setVisible(true);
     
 
    }//GEN-LAST:event_jButton1ActionPerformed
   
    public static void AddRowToDogs(Object[] dataRow){
        DefaultTableModel model = (DefaultTableModel)receipt.getModel();
        model.addRow(dataRow);
    }
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        closePetFrames();
        
         catsFrame = new Cats();
            catsFrame.setVisible(true);
            catsFrame.pack();
            catsFrame.setLocationRelativeTo(null);
            catsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void AddRowToCats(Object[] dataRow){
        DefaultTableModel model = (DefaultTableModel)receipt.getModel();
        model.addRow(dataRow);
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        closePetFrames();
        
        fishFrame= new Fish();
        fishFrame.setVisible(true);
        fishFrame.pack();
        fishFrame.setLocationRelativeTo(null);
        fishFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setVisible(true);
            
    }//GEN-LAST:event_jButton4ActionPerformed
      public static void AddRowToFish(Object[] dataRow){
        DefaultTableModel model = (DefaultTableModel)receipt.getModel();
        model.addRow(dataRow);
      }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        closePetFrames();
        
        rabbitsFrame = new Rabbits();
        rabbitsFrame.setVisible(true);
        rabbitsFrame.pack();
        rabbitsFrame.setLocationRelativeTo(null);
        rabbitsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setVisible(true);
            

    }//GEN-LAST:event_jButton5ActionPerformed
      public static void AddRowToRabbits(Object[] dataRow){
        DefaultTableModel model = (DefaultTableModel)receipt.getModel();
        model.addRow(dataRow);
      }
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        closePetFrames();
        
        hamstersFrame = new Hamsters();
        hamstersFrame.setVisible(true);
        hamstersFrame.pack();
        hamstersFrame.setLocationRelativeTo(null);
        hamstersFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setVisible(true);
            
    }//GEN-LAST:event_jButton6ActionPerformed

    
    private void totalPriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPriceFieldActionPerformed

    }//GEN-LAST:event_totalPriceFieldActionPerformed

    private void receiptInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_receiptInputMethodTextChanged


    }//GEN-LAST:event_receiptInputMethodTextChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setLocation(740, 250);
    }//GEN-LAST:event_formWindowOpened

    //This is the calculate total button
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        double total = 0; // Initialize the total price to 0
        for (int i = 0; i < receipt.getRowCount(); i++) {
            // Loop through each row of the receipt table
            // Parse the value at column index 4 (presumably the "Price" column) as a Double
            double amount = (double) receipt.getValueAt(i, 4);
            // Add the parsed price to the total
            total += amount;
        }
        // Set the total price in the totalPriceField JTextField
        totalPriceField.setText(String.valueOf(total));
    }//GEN-LAST:event_jButton7ActionPerformed

    private void deleteRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRowActionPerformed
        DefaultTableModel model = (DefaultTableModel)receipt.getModel();
        if (receipt.getSelectedRowCount()== 1) {
            model.removeRow(receipt.getSelectedRow());

        }else{
            if (receipt.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Table is Empty");
            } else {
                JOptionPane.showMessageDialog(this, "Select Only One Row");
            }
        }
    }//GEN-LAST:event_deleteRowActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        pName.setText("");
        pContact.setText("");
        pPin.setText("");
    }//GEN-LAST:event_delBtnActionPerformed
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
    
    private void closePetFrames(){
        // Close Dogs frame if it exists
    if (dogsFrame != null) {
        dogsFrame.dispose();
        dogsFrame = null;
    }

    // Close Cats frame if it exists
    if (catsFrame != null) {
        catsFrame.dispose();
        catsFrame = null;
    }
    
    //And so on and so forth
    if (birdsFrame != null) {
        birdsFrame.dispose();
        birdsFrame = null;
    }
    if (fishFrame != null) {
        fishFrame.dispose();
        fishFrame = null;
    }
    if (rabbitsFrame != null) {
        rabbitsFrame.dispose();
        rabbitsFrame = null;
    }
    if (hamstersFrame != null) {
        hamstersFrame.dispose();
        hamstersFrame = null;
    }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JToggleButton confirmBtn;
    private javax.swing.JToggleButton delBtn;
    private javax.swing.JButton deleteRow;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField pContact;
    private javax.swing.JTextField pName;
    private javax.swing.JTextField pPin;
    private static javax.swing.JTable receipt;
    private javax.swing.JTextArea receiptArea;
    private javax.swing.JToggleButton saveBtn;
    private javax.swing.JTextField totalPriceField;
    // End of variables declaration//GEN-END:variables
}
