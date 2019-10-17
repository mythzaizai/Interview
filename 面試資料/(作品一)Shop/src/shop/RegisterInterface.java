
package shop;

import javax.swing.JOptionPane;

public class RegisterInterface extends javax.swing.JFrame {

    public RegisterInterface() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registerLbl = new javax.swing.JLabel();
        accountNLbl = new javax.swing.JLabel();
        setPasswordLbl = new javax.swing.JLabel();
        reSetPasswordLbl = new javax.swing.JLabel();
        accountTextF = new javax.swing.JTextField();
        passwordTextF = new javax.swing.JTextField();
        againPasswordTextF = new javax.swing.JTextField();
        registerBtn = new javax.swing.JButton();
        goBackBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("品翰的購物中心");
        setBounds(new java.awt.Rectangle(300, 300, 0, 0));

        registerLbl.setFont(new java.awt.Font("新細明體", 0, 36)); // NOI18N
        registerLbl.setText("帳戶註冊:");

        accountNLbl.setText("帳號名稱");

        setPasswordLbl.setText("密碼設置");

        reSetPasswordLbl.setText("確認密碼");

        againPasswordTextF.setForeground(new java.awt.Color(204, 204, 204));
        againPasswordTextF.setText("必須與設置時的相同");

        registerBtn.setText("註冊");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        goBackBtn.setText("返回");
        goBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(registerLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(accountNLbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(accountTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(setPasswordLbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(passwordTextF))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(reSetPasswordLbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(againPasswordTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(goBackBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(registerLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(accountNLbl)
                            .addComponent(accountTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(setPasswordLbl)
                            .addComponent(passwordTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reSetPasswordLbl)
                    .addComponent(againPasswordTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(goBackBtn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        String account = accountTextF.getText();
        String password = passwordTextF.getText();
        String rePassword = againPasswordTextF.getText();
        
        if(account.isEmpty() || password.isEmpty() || rePassword.isEmpty()){
            JOptionPane.showMessageDialog(null, "請輸入確實", "系統提示", JOptionPane.ERROR_MESSAGE);
        }else if(password.equals(rePassword) == false){
            JOptionPane.showMessageDialog(null, "再次確認密碼", "系統提示", JOptionPane.ERROR_MESSAGE);
        }else{
            Information.setMemberAccount(account);
            Information.setMemberPassword(password);
            JOptionPane.showMessageDialog(null, "註冊成功! 返回首頁~請重新登入");
            this.setVisible(false);
            new Home().setVisible(true);
        }
        
    }//GEN-LAST:event_registerBtnActionPerformed

    private void goBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackBtnActionPerformed
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_goBackBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountNLbl;
    private javax.swing.JTextField accountTextF;
    private javax.swing.JTextField againPasswordTextF;
    private javax.swing.JButton goBackBtn;
    private javax.swing.JTextField passwordTextF;
    private javax.swing.JLabel reSetPasswordLbl;
    private javax.swing.JButton registerBtn;
    private javax.swing.JLabel registerLbl;
    private javax.swing.JLabel setPasswordLbl;
    // End of variables declaration//GEN-END:variables
}
