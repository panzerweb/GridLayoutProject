import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class Dogs extends javax.swing.JFrame {
    

    public Dogs() {
        initComponents();
        
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Breed = new javax.swing.JTextField();
        PetID = new javax.swing.JTextField();
        gender = new javax.swing.JTextField();
        Quantity = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jTextField7 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jTextField10 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jTextField13 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jTextField16 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel7.setBackground(new java.awt.Color(102, 102, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(800, 700));

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new java.awt.GridLayout(0, 1, 0, 35));

        Breed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BreedActionPerformed(evt);
            }
        });
        jPanel1.add(Breed);

        PetID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PetIDActionPerformed(evt);
            }
        });
        jPanel1.add(PetID);
        jPanel1.add(gender);
        jPanel1.add(Quantity);

        addButton.setBackground(new java.awt.Color(153, 255, 153));
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setLayout(new java.awt.GridLayout(0, 1, 0, 35));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pet Breed");
        jPanel2.add(jLabel2);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pet ID");
        jPanel2.add(jLabel3);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gender");
        jPanel2.add(jLabel4);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quantity");
        jPanel2.add(jLabel5);

        jLabel13.setFont(new java.awt.Font("Segoe Script", 1, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("DOG BREEDS");

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));
        jPanel3.setLayout(new java.awt.GridLayout(0, 1, 0, 25));

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/labrador-retriever.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);

        jButton2.setBackground(new java.awt.Color(153, 255, 153));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/french-bulldog.png"))); // NOI18N
        jPanel3.add(jButton2);

        jButton3.setBackground(new java.awt.Color(153, 255, 153));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/german-shepherd.png"))); // NOI18N
        jPanel3.add(jButton3);

        jButton4.setBackground(new java.awt.Color(153, 255, 153));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/husky.png"))); // NOI18N
        jPanel3.add(jButton4);

        jButton5.setBackground(new java.awt.Color(153, 255, 153));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/beagle.png"))); // NOI18N
        jPanel3.add(jButton5);

        jButton6.setBackground(new java.awt.Color(153, 255, 153));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chihuahua.png"))); // NOI18N
        jPanel3.add(jButton6);

        jPanel4.setBackground(new java.awt.Color(102, 102, 255));
        jPanel4.setLayout(new java.awt.GridLayout(0, 1, 0, 5));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField1.setText("LABRADOR");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField1);

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField2.setText("Pet ID : 55894");
        jPanel4.add(jTextField2);

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField3.setText("Price  :  ₱ 6000");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField3);

        jPanel5.setBackground(new java.awt.Color(102, 102, 255));
        jPanel5.setLayout(new java.awt.GridLayout(0, 1, 0, 5));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField4.setText("BULLDOG");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField4);

        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField5.setText("Pet ID : 78005");
        jPanel5.add(jTextField5);

        jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField6.setText("Price  :  ₱ 8000");
        jPanel5.add(jTextField6);

        jPanel6.setBackground(new java.awt.Color(102, 102, 255));
        jPanel6.setLayout(new java.awt.GridLayout(0, 1, 0, 5));

        jTextField7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField7.setText("Name : GERMAN SHEPHERD");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField7);

        jTextField9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField9.setText("Pet ID : 31548");
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField9);

        jTextField8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField8.setText("Price  :  ₱ 15,000");
        jPanel6.add(jTextField8);

        jPanel8.setBackground(new java.awt.Color(102, 102, 255));
        jPanel8.setLayout(new java.awt.GridLayout(0, 1, 0, 5));

        jTextField10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField10.setText("HUSKY");
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jPanel8.add(jTextField10);

        jTextField12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField12.setText("Pet ID : 86594");
        jPanel8.add(jTextField12);

        jTextField11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField11.setText("Price  :  ₱ 20,000");
        jPanel8.add(jTextField11);

        jPanel9.setBackground(new java.awt.Color(102, 102, 255));
        jPanel9.setLayout(new java.awt.GridLayout(0, 1, 0, 5));

        jTextField13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField13.setText("BEAGLE");
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jPanel9.add(jTextField13);

        jTextField15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField15.setText("Pet ID : 45663");
        jPanel9.add(jTextField15);

        jTextField14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField14.setText("Price  :  ₱ 10,000");
        jPanel9.add(jTextField14);

        jPanel10.setBackground(new java.awt.Color(102, 102, 255));
        jPanel10.setLayout(new java.awt.GridLayout(0, 1, 0, 5));

        jTextField16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField16.setText("CHIHUAHUA");
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        jPanel10.add(jTextField16);

        jTextField18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField18.setText("Pet ID : 79895");
        jPanel10.add(jTextField18);

        jTextField17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField17.setText("Price  :  ₱ 15,000");
        jPanel10.add(jTextField17);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(181, 181, 181))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(13, 13, 13)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setBounds(0, 0, 818, 747);
    }// </editor-fold>//GEN-END:initComponents

    //Add button method, it performs all operations to the table
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
            String breedInput = Breed.getText(); // Get the text input of Breed
            String genderInput = gender.getText(); //Get the text input of Gender
            int quantityInput = 0; // initialize qty to 0
            int idInput = 0; // Initialize id set to 0
//====================================================================================================================================
//====================================================================================================================================
//====================================================================================================================================
//====================================================================================================================================

            // Condition to check if the fields are empty or if there are empty fields
            if (breedInput.isEmpty() && PetID.getText().isEmpty()  && gender.getText().isEmpty() && genderInput.isEmpty() && Quantity.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "FILL ALL THE DETAILS!");
                return;
            }else if (breedInput.isEmpty() && PetID.getText().isEmpty()  && !gender.getText().isEmpty() && !genderInput.isEmpty() && !Quantity.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "SELECT BREED!");
                return;
            }
            else if (!breedInput.isEmpty() && PetID.getText().isEmpty() && !gender.getText().isEmpty() && !genderInput.isEmpty() && !Quantity.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "INPUT ID!");
                return;
            }else if (!breedInput.isEmpty() && !PetID.getText().isEmpty() && gender.getText().isEmpty() && genderInput.isEmpty() && !Quantity.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "SELECT GENDER!");
                return;
            }else if (!breedInput.isEmpty() && !PetID.getText().isEmpty() && !gender.getText().isEmpty() && !genderInput.isEmpty() && Quantity.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "INPUT QUANTITY!");
                return;
            }
//====================================================================================================================================
//====================================================================================================================================
//====================================================================================================================================
//====================================================================================================================================


                try {
                    idInput = Integer.parseInt(PetID.getText()); // Parse the String of text field to Integer
                    quantityInput = Integer.parseInt(Quantity.getText()); // Parse the String of text field to Integer
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Invalid ID or Quantity!");
                    return; // Exit the method if ID or Quantity format is invalid
                }
//====================================================================================================================================
//====================================================================================================================================
//====================================================================================================================================
//====================================================================================================================================
                
            // Validate breed input and match both id and breed
            // Also validate gender
            // Predefined prices
            String[] dogBreeds = {"Labrador", "Bulldog", "German Shepherd", "Husky", "Beagle", "Chihuahua"};
            String[] genders = {"Male", "Female"};
            double[] prices = {6000d, 8000d, 15000d, 20000d, 10000d, 15000d}; // Prices array

            boolean validBreed = false; // Set Default if Breed is valid to false
//====================================================================================================================================
//====================================================================================================================================
//====================================================================================================================================
//====================================================================================================================================
            
            for (int i = 0; i < dogBreeds.length; i++) { // Iterate through all the arrays
                if (breedInput.equalsIgnoreCase(dogBreeds[i])) { // Match the text field to the indexes of the array
                    validBreed = true;
                      
                    int[] petIDs = {55894, 78005, 31548, 86594, 45663, 79895};
                    
                    // Validate ID input corresponding to the breed index     
                    if (idInput == petIDs[i]) {
                        // For each price is multiplied by quantity
                        double sum = prices[i] * quantityInput;

                        boolean genderValid = false; // Default of gender boolean is false
                        // Iterate through the genders and match
                        for (String gender : genders) {
                            if (genderInput.equalsIgnoreCase(gender)) {
                                genderValid = true;
                                break;
                            }
                        }
                        // If there is a valid gender input, add data to the table
                        if (genderValid) {
                            PetShopGrid.AddRowToDogs(new Object[]{
                                breedInput, idInput, genderInput, quantityInput, sum
                            });
                        } else {
                            JOptionPane.showMessageDialog(this, "Invalid gender. Please enter 'Male' or 'Female'.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Invalid ID for selected breed.");
                    }
                    break;
                }
            }
//====================================================================================================================================
//====================================================================================================================================
//====================================================================================================================================
//====================================================================================================================================
            
            // If breed is not found, show error message
            if (!validBreed ) {
                JOptionPane.showMessageDialog(this, "Please select a valid breed.");
            }

    }//GEN-LAST:event_addButtonActionPerformed

    private void BreedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BreedActionPerformed
        
    }//GEN-LAST:event_BreedActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void PetIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PetIDActionPerformed

    }//GEN-LAST:event_PetIDActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    public static void   main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dogs().setVisible(true);
            }
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Breed;
    private javax.swing.JTextField PetID;
    private javax.swing.JTextField Quantity;
    private javax.swing.JButton addButton;
    private javax.swing.JTextField gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

}
