package shop;

import java.awt.Window;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {


    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        accountLable = new javax.swing.JLabel();
        passwordLable = new javax.swing.JLabel();
        accountTextF = new javax.swing.JTextField();
        titleLabel = new javax.swing.JLabel();
        passwordTextF = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        goBack = new javax.swing.JButton();
        registerBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("品翰的購物中心");
        setBounds(new java.awt.Rectangle(300, 300, 0, 0));
        setName("品翰的購物中心"); // NOI18N

        accountLable.setFont(new java.awt.Font("標楷體", 0, 24)); // NOI18N
        accountLable.setText("會員帳號");
        accountLable.setToolTipText("");

        passwordLable.setFont(new java.awt.Font("標楷體", 0, 24)); // NOI18N
        passwordLable.setText("會員密碼");

        titleLabel.setBackground(new java.awt.Color(51, 255, 255));
        titleLabel.setFont(new java.awt.Font("微軟正黑體 Light", 0, 36)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("~歡迎光臨~");
        titleLabel.setOpaque(true);

        loginBtn.setText("登入");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtn(evt);
            }
        });

        goBack.setText("返回");
        goBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackActionPerformed(evt);
            }
        });

        registerBtn.setText("註冊");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordLable)
                                    .addComponent(accountLable))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(accountTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(registerBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(goBack)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountLable)
                    .addComponent(accountTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLable)
                    .addComponent(passwordTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goBack)
                    .addComponent(registerBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtn

        String account, password;
        //final String PresetAccount = "abcde", PresetPassword = "12345";

        account = accountTextF.getText();
        password = passwordTextF.getText();

        if (account.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "請輸入帳密~");
        } else {
            if (Information.getMemberAccount().equals(account) && Information.getMemberPassword().equals(password)) {
                JOptionPane.showMessageDialog(null, "登入成功!");
                this.setVisible(false);
                Information.setloginStatus(true);
                new Home().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "帳號或密碼錯誤!", "系統提示", JOptionPane.ERROR_MESSAGE);
            }
        }


    }//GEN-LAST:event_loginBtn

    private void goBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackActionPerformed
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_goBackActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        this.setVisible(false);
        new RegisterInterface().setVisible(true);
    }//GEN-LAST:event_registerBtnActionPerformed

//    public static void main(String args[]) {
//
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Login().setVisible(true);
//            }
//        });
//        
////         loginWin = new Login();
////         loginWin.setVisible(LoginWinOpen);
//
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountLable;
    private javax.swing.JTextField accountTextF;
    private javax.swing.JButton goBack;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel passwordLable;
    private javax.swing.JPasswordField passwordTextF;
    private javax.swing.JButton registerBtn;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
