import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
public class medicine extends javax.swing.JFrame {

    /**
     * Creates new form medicine
     */
    public medicine() {
        initComponents();
        selectmed();
    }

Connection Con = null;
Statement st;
ResultSet rs = null;


    public void selectmed(){
    try{
    Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PHARMACY","root","root");
    st = Con.createStatement();
    rs = st.executeQuery("select * from MEDICINELIST");
    medicinetable.setModel(DbUtils.resultSetToTableModel(rs));
    }catch(SQLException e){
    e.printStackTrace();
    }}
     

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        managemedicinepanel = new javax.swing.JPanel();
        managemedicinelabel = new javax.swing.JLabel();
        idlabel = new javax.swing.JLabel();
        mednamelabel = new javax.swing.JLabel();
        pricelabel = new javax.swing.JLabel();
        qtyLabel = new javax.swing.JLabel();
        expdatelabel = new javax.swing.JLabel();
        medid = new javax.swing.JTextField();
        medprice = new javax.swing.JTextField();
        medqty = new javax.swing.JTextField();
        mednamefield = new javax.swing.JTextField();
        expDateChooser = new com.toedter.calendar.JDateChooser();
        ADDButton = new javax.swing.JButton();
        UPDATEButton = new javax.swing.JButton();
        DELETEButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        medicinetable = new javax.swing.JTable();
        exitlable = new javax.swing.JLabel();
        clearbutton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        billinglabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        managemedicinelabel.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        managemedicinelabel.setText("Manage Medicine");

        idlabel.setText("ID            ");

        mednamelabel.setText("MedName");

        pricelabel.setText("Price");

        qtyLabel.setText("Qty");

        expdatelabel.setText("Expdate");

        medid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medidActionPerformed(evt);
            }
        });

        ADDButton.setText("ADD");
        ADDButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ADDButtonMouseClicked(evt);
            }
        });
        ADDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDButtonActionPerformed(evt);
            }
        });

        UPDATEButton.setText("UPDATE");
        UPDATEButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UPDATEButtonMouseClicked(evt);
            }
        });

        DELETEButton.setText("DELETE");
        DELETEButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEButtonActionPerformed(evt);
            }
        });

        medicinetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "MedName", "Price", "QTY", "Expdate"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        medicinetable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medicinetableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(medicinetable);

        exitlable.setFont(new java.awt.Font("Cantarell", 3, 24)); // NOI18N
        exitlable.setForeground(new java.awt.Color(255, 255, 255));
        exitlable.setText("X ");

        clearbutton.setText("clear");
        clearbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearbuttonMouseClicked(evt);
            }
        });
        clearbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout managemedicinepanelLayout = new javax.swing.GroupLayout(managemedicinepanel);
        managemedicinepanel.setLayout(managemedicinepanelLayout);
        managemedicinepanelLayout.setHorizontalGroup(
            managemedicinepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managemedicinepanelLayout.createSequentialGroup()
                .addGroup(managemedicinepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, managemedicinepanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(managemedicinepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(managemedicinepanelLayout.createSequentialGroup()
                                .addGroup(managemedicinepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idlabel)
                                    .addComponent(mednamelabel))
                                .addGap(34, 34, 34)
                                .addGroup(managemedicinepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(medprice, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(mednamefield)
                                    .addComponent(medid)))
                            .addGroup(managemedicinepanelLayout.createSequentialGroup()
                                .addGroup(managemedicinepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pricelabel)
                                    .addComponent(qtyLabel)
                                    .addComponent(expdatelabel))
                                .addGap(50, 50, 50)
                                .addGroup(managemedicinepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(expDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(medqty, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(managemedicinepanelLayout.createSequentialGroup()
                                .addGroup(managemedicinepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(DELETEButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ADDButton, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(managemedicinepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(UPDATEButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(clearbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(managemedicinepanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(managemedicinelabel)
                        .addGap(220, 220, 220)
                        .addComponent(exitlable)))
                .addContainerGap())
        );
        managemedicinepanelLayout.setVerticalGroup(
            managemedicinepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managemedicinepanelLayout.createSequentialGroup()
                .addGroup(managemedicinepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(managemedicinepanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(managemedicinelabel))
                    .addGroup(managemedicinepanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(exitlable)))
                .addGroup(managemedicinepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(managemedicinepanelLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(managemedicinepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idlabel)
                            .addComponent(medid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(managemedicinepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mednamelabel)
                            .addComponent(mednamefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(managemedicinepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pricelabel)
                            .addComponent(medprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(managemedicinepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(qtyLabel)
                            .addComponent(medqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(managemedicinepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(expdatelabel)
                            .addComponent(expDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(managemedicinepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ADDButton)
                            .addComponent(UPDATEButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(managemedicinepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DELETEButton)
                            .addComponent(clearbutton)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, managemedicinepanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));

        billinglabel.setFont(new java.awt.Font("C059", 1, 24)); // NOI18N
        billinglabel.setForeground(new java.awt.Color(255, 255, 255));
        billinglabel.setText("Billing");
        billinglabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billinglabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(billinglabel)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(billinglabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(managemedicinepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(managemedicinepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void medidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medidActionPerformed

    private void ADDButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADDButtonMouseClicked

    }//GEN-LAST:event_ADDButtonMouseClicked

    private void ADDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDButtonActionPerformed
        java.util.Date eDate = expDateChooser.getDate();
        Date myeDate = new java.sql.Date(eDate.getTime());
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PHARMACY","root","root");
            PreparedStatement  add = Con.prepareStatement("insert into MEDICINELIST values(?,?,?,?,?)");
            add.setInt(1, Integer.valueOf(medid.getText()));
            add.setString(2, mednamefield.getText());
            add.setInt(3, Integer.valueOf(medprice.getText()));
            add.setInt(4, Integer.parseInt(medqty.getText()));
            add.setDate(5, myeDate);
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "medcinine added successfully");
            Con.close();
            selectmed();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_ADDButtonActionPerformed

    private void DELETEButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEButtonActionPerformed
        if(medid.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter Medicine id to be deleted");
        }else{
            try{
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PHARMACY","root","root");
                String id = medid.getText();
                String Query = "delete from MEDICINELIST where id = "+ id;
                Statement add = Con.createStatement();
                add.executeUpdate(Query);
                selectmed();
                JOptionPane.showMessageDialog(this, "medcinine deleted successfully");
                        
            }catch(SQLException e){
                e.printStackTrace();
                
            }
                
        }
    }//GEN-LAST:event_DELETEButtonActionPerformed

    private void medicinetableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicinetableMouseClicked
        DefaultTableModel model = (DefaultTableModel)medicinetable.getModel();
        int index = medicinetable.getSelectedRow();
        medid.setText(model.getValueAt(index, 0).toString());
        mednamefield.setText(model.getValueAt(index, 1).toString());
        medprice.setText(model.getValueAt(index, 2).toString());
        medqty.setText(model.getValueAt(index, 3).toString());
    }//GEN-LAST:event_medicinetableMouseClicked

    private void UPDATEButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UPDATEButtonMouseClicked
        if(medid.getText().isEmpty() || mednamefield.getText().isEmpty() || medprice.getText().isEmpty() || medqty.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter Medicine details to update");
        }else{
            try{
                
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PHARMACY","root","root");
                String updateQuery = "update MEDICINELIST set MedName="+"'"+mednamefield.getText()+"'"+",Price="+medprice.getText()+",Qty="+medqty.getText()+" where ID = "+medid.getText();
                Statement add = Con.createStatement();
                add.executeUpdate(updateQuery);
                selectmed();
                JOptionPane.showMessageDialog(this, "medcinine updated successfully");
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_UPDATEButtonMouseClicked

    private void clearbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearbuttonActionPerformed

    private void clearbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearbuttonMouseClicked
        medid.setText("");
        mednamefield.setText("");
        medprice.setText("");
        medqty.setText("");
        
    }//GEN-LAST:event_clearbuttonMouseClicked

    private void billinglabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billinglabelMouseClicked
        new Billing().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_billinglabelMouseClicked

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
            java.util.logging.Logger.getLogger(medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new medicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDButton;
    private javax.swing.JButton DELETEButton;
    private javax.swing.JButton UPDATEButton;
    private javax.swing.JLabel billinglabel;
    private javax.swing.JButton clearbutton;
    private javax.swing.JLabel exitlable;
    private com.toedter.calendar.JDateChooser expDateChooser;
    private javax.swing.JLabel expdatelabel;
    private javax.swing.JLabel idlabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel managemedicinelabel;
    private javax.swing.JPanel managemedicinepanel;
    private javax.swing.JTable medicinetable;
    private javax.swing.JTextField medid;
    private javax.swing.JTextField mednamefield;
    private javax.swing.JLabel mednamelabel;
    private javax.swing.JTextField medprice;
    private javax.swing.JTextField medqty;
    private javax.swing.JLabel pricelabel;
    private javax.swing.JLabel qtyLabel;
    // End of variables declaration//GEN-END:variables
}
