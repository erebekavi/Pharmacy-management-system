
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Billing extends javax.swing.JFrame {

   
    public Billing() {
        initComponents();
        selectmed();
        showdate();
        
        
    }
    public void showdate()
    {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy"); 
        datelb.setText(s.format(d));
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

        jPanel1 = new javax.swing.JPanel();
        Billingbt = new javax.swing.JButton();
        Billingpanel = new javax.swing.JPanel();
        billinglb = new javax.swing.JLabel();
        idlabel = new javax.swing.JLabel();
        mednamelabel = new javax.swing.JLabel();
        qtyLabel = new javax.swing.JLabel();
        idfield = new javax.swing.JTextField();
        medqtylb = new javax.swing.JTextField();
        mednamefield = new javax.swing.JTextField();
        ADDTOBILL = new javax.swing.JButton();
        PRINTbuttion = new javax.swing.JButton();
        exitlable = new javax.swing.JLabel();
        clearbutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        medicinetable = new javax.swing.JTable();
        managemedicinelabel1 = new javax.swing.JLabel();
        billlb = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        billtx = new javax.swing.JTextArea();
        datelb = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));

        Billingbt.setText("MEDICINE");
        Billingbt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BillingbtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Billingbt, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Billingbt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Billingpanel.setPreferredSize(new java.awt.Dimension(712, 390));

        billinglb.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        billinglb.setText("Billing");

        idlabel.setText("ID            ");

        mednamelabel.setText("MedName");

        qtyLabel.setText("Qty");

        idfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idfieldActionPerformed(evt);
            }
        });

        medqtylb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medqtylbActionPerformed(evt);
            }
        });

        ADDTOBILL.setText("ADD TO BILL");
        ADDTOBILL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ADDTOBILLMouseClicked(evt);
            }
        });
        ADDTOBILL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDTOBILLActionPerformed(evt);
            }
        });

        PRINTbuttion.setText("PRINT");
        PRINTbuttion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PRINTbuttionMouseClicked(evt);
            }
        });

        exitlable.setFont(new java.awt.Font("Cantarell", 3, 24)); // NOI18N
        exitlable.setForeground(new java.awt.Color(51, 51, 51));
        exitlable.setText("X ");
        exitlable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitlableMouseClicked(evt);
            }
        });

        clearbutton.setText("CLEAR");
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

        managemedicinelabel1.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        managemedicinelabel1.setText("Medicine List");

        billlb.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        billlb.setText("BILL");

        billtx.setColumns(20);
        billtx.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        billtx.setRows(5);
        billtx.setText("...........Pharmacy Medical Health..........");
        jScrollPane2.setViewportView(billtx);

        javax.swing.GroupLayout BillingpanelLayout = new javax.swing.GroupLayout(Billingpanel);
        Billingpanel.setLayout(BillingpanelLayout);
        BillingpanelLayout.setHorizontalGroup(
            BillingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillingpanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(BillingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(billinglb)
                    .addGroup(BillingpanelLayout.createSequentialGroup()
                        .addGroup(BillingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idlabel)
                            .addComponent(mednamelabel)
                            .addComponent(qtyLabel))
                        .addGap(34, 34, 34)
                        .addGroup(BillingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(medqtylb, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(BillingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(mednamefield, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addComponent(idfield))))
                    .addGroup(BillingpanelLayout.createSequentialGroup()
                        .addComponent(ADDTOBILL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(BillingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(managemedicinelabel1)
                    .addComponent(billlb)
                    .addGroup(BillingpanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PRINTbuttion, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BillingpanelLayout.createSequentialGroup()
                        .addComponent(datelb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exitlable)))
                .addGap(59, 59, 59))
        );
        BillingpanelLayout.setVerticalGroup(
            BillingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillingpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BillingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitlable)
                    .addComponent(datelb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(BillingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(billinglb)
                    .addComponent(managemedicinelabel1))
                .addGap(18, 18, 18)
                .addGroup(BillingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BillingpanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(BillingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idlabel)
                            .addComponent(idfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(BillingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mednamefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mednamelabel))
                        .addGap(18, 18, 18)
                        .addGroup(BillingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(qtyLabel)
                            .addComponent(medqtylb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(billlb)
                .addGroup(BillingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BillingpanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(BillingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(BillingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ADDTOBILL)
                                .addComponent(clearbutton))))
                    .addGroup(BillingpanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(PRINTbuttion)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Billingpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Billingpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void idfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idfieldActionPerformed

    private void ADDTOBILLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADDTOBILLMouseClicked

    }//GEN-LAST:event_ADDTOBILLMouseClicked

    

public void update(){
    
    
    try{
        int newqty;
        newqty = medqty - Integer.valueOf(medqtylb.getText()) ;
                
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PHARMACY","root","root");
        
        var updateQuery = "update MEDICINELIST set Qty="+newqty+""+" where ID = "+medi;
        Statement add = Con.createStatement();
        add.executeUpdate(updateQuery);
        
            }catch(SQLException e){
                e.printStackTrace();
            }selectmed();
}
int i =0,price,medi,oldqty,medqty;

    private void ADDTOBILLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDTOBILLActionPerformed
        if (mednamefield.getText().isEmpty() || medqtylb.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "information missing");
        }
        i++;
        update();
        if (i==1){
        billtx.setText(billtx.getText()+"..........Pharmacy Medical Health..........\n ID\tMEDICINE\tQTY\tPRICE\tTOTAL\n"+i+"\t"+mednamefield.getText()+"\t\t"+medqtylb.getText()
               +'\t'+price+'\t'+Integer.valueOf(medqtylb.getText())*price+'\n');
        }else{
        billtx.setText(billtx.getText()+i+"\t"+mednamefield.getText()+"\t\t"+medqtylb.getText()
               +'\t'+price+'\t'+Integer.valueOf(medqtylb.getText())*price+'\n');
            
        }
        
    }//GEN-LAST:event_ADDTOBILLActionPerformed

    private void PRINTbuttionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PRINTbuttionMouseClicked
        try{
            billtx.print();
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_PRINTbuttionMouseClicked

    private void clearbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearbuttonMouseClicked
        idfield.setText("");
        mednamefield.setText("");
        medqtylb.setText("");

    }//GEN-LAST:event_clearbuttonMouseClicked

    private void clearbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearbuttonActionPerformed

    private void medicinetableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicinetableMouseClicked
        DefaultTableModel model = (DefaultTableModel)medicinetable.getModel();
        int index = medicinetable.getSelectedRow();
        medi = Integer.valueOf(model.getValueAt(index, 0).toString());
        mednamefield.setText(model.getValueAt(index, 1).toString());
        price = Integer.valueOf(model.getValueAt(index, 2).toString());
        medqty = Integer.valueOf(model.getValueAt(index, 3).toString());
        
    }//GEN-LAST:event_medicinetableMouseClicked

    private void medqtylbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medqtylbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medqtylbActionPerformed

    private void exitlableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitlableMouseClicked
         System.exit(0);
    }//GEN-LAST:event_exitlableMouseClicked

    private void BillingbtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillingbtMouseClicked
        new medicine().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BillingbtMouseClicked

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
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDTOBILL;
    private javax.swing.JButton Billingbt;
    private javax.swing.JPanel Billingpanel;
    private javax.swing.JButton PRINTbuttion;
    private javax.swing.JLabel billinglb;
    private javax.swing.JLabel billlb;
    private javax.swing.JTextArea billtx;
    private javax.swing.JButton clearbutton;
    private javax.swing.JFormattedTextField datelb;
    private javax.swing.JLabel exitlable;
    private javax.swing.JTextField idfield;
    private javax.swing.JLabel idlabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel managemedicinelabel1;
    private javax.swing.JTable medicinetable;
    private javax.swing.JTextField mednamefield;
    private javax.swing.JLabel mednamelabel;
    private javax.swing.JTextField medqtylb;
    private javax.swing.JLabel qtyLabel;
    // End of variables declaration//GEN-END:variables

    private String format(Date d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
