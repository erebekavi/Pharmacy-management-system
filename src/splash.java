

public class splash extends javax.swing.JFrame {

    /**
     * Creates new form splash
     */
    public splash() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splashpanel = new javax.swing.JPanel();
        Header = new javax.swing.JLabel();
        loadingbar = new javax.swing.JProgressBar();
        logoimage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        splashpanel.setBackground(new java.awt.Color(255, 255, 255));

        Header.setBackground(new java.awt.Color(255, 255, 255));
        Header.setFont(new java.awt.Font("Cantarell", 3, 36)); // NOI18N
        Header.setForeground(new java.awt.Color(0, 153, 0));
        Header.setText("Pharmacy Management System");

        loadingbar.setForeground(new java.awt.Color(0, 153, 0));

        logoimage.setIcon(new javax.swing.ImageIcon("/home/kavi/project/Pharmacy.management.system/assert/Green Creative Pharmacy Concept Logo Design.png")); // NOI18N

        javax.swing.GroupLayout splashpanelLayout = new javax.swing.GroupLayout(splashpanel);
        splashpanel.setLayout(splashpanelLayout);
        splashpanelLayout.setHorizontalGroup(
            splashpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loadingbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, splashpanelLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(Header)
                .addGap(44, 44, 44))
            .addGroup(splashpanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(logoimage, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        splashpanelLayout.setVerticalGroup(
            splashpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splashpanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(Header)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoimage, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loadingbar, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splashpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splashpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        splash mysplash = new splash();
        mysplash.setVisible(true);
        
            try{
                for (int i=0; i<=100; i++ ){
                    Thread.sleep(10);
                    mysplash.loadingbar.setValue(i);
                
                }
                new Billing().setVisible(true);
                mysplash.dispose();
            }catch(Exception e)
            {
                
            }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Header;
    private javax.swing.JProgressBar loadingbar;
    private javax.swing.JLabel logoimage;
    private javax.swing.JPanel splashpanel;
    // End of variables declaration//GEN-END:variables
}
