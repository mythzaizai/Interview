package shop;

import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
        reComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        memberCenterBtn = new javax.swing.JButton();
        shoppingCartBtn = new javax.swing.JButton();
        productBtn = new javax.swing.JButton();
        loginStatusLab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("品翰的購物中心");
        setBackground(new java.awt.Color(204, 255, 255));
        setBounds(new java.awt.Rectangle(300, 300, 0, 0));
        setName("frameHome"); // NOI18N
        setPreferredSize(new java.awt.Dimension(500, 355));
        setSize(new java.awt.Dimension(500, 355));

        jLabel1.setFont(new java.awt.Font("新細明體", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("★網站首頁★");

        memberCenterBtn.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        memberCenterBtn.setText("會員中心");
        memberCenterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberCenterBtnActionPerformed(evt);
            }
        });

        shoppingCartBtn.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        shoppingCartBtn.setText("購物車");
        shoppingCartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shoppingCartBtnActionPerformed(evt);
            }
        });

        productBtn.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        productBtn.setText("商品搜尋");
        productBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productBtnActionPerformed(evt);
            }
        });

        loginStatusLab.setBackground(new java.awt.Color(255, 204, 255));
        loginStatusLab.setText("尚未登入會員");
        loginStatusLab.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(productBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginStatusLab, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(memberCenterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(shoppingCartBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memberCenterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shoppingCartBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginStatusLab)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reComponents() {
        
        if (Information.getloginStatus()) {
            loginStatusLab.setBackground(new java.awt.Color(255, 204, 255));
            loginStatusLab.setText("~會員已登入~");
            loginStatusLab.setOpaque(true);
        }else{
            loginStatusLab.setBackground(new java.awt.Color(255, 204, 255));
            loginStatusLab.setText("尚未登入會員");
            loginStatusLab.setOpaque(true);
        }
    }

    private void productBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productBtnActionPerformed
        this.setVisible(false);
        new ProductZone().setVisible(true);
    }//GEN-LAST:event_productBtnActionPerformed

    private void memberCenterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberCenterBtnActionPerformed
        if (Information.getloginStatus()) {   //是否有登入
            this.setVisible(false);
            new MemberInterface().setVisible(true);
        } else {
            this.setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_memberCenterBtnActionPerformed

    private void shoppingCartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shoppingCartBtnActionPerformed
        if (Information.getloginStatus()) {   //是否有登入
            this.setVisible(false);
            new ShoppingCartInterface().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "請先登入或註冊會員，謝謝!", "系統提示", JOptionPane.CLOSED_OPTION);
        }
    }//GEN-LAST:event_shoppingCartBtnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel loginStatusLab;
    private javax.swing.JButton memberCenterBtn;
    private javax.swing.JButton productBtn;
    private javax.swing.JButton shoppingCartBtn;
    // End of variables declaration//GEN-END:variables

}
