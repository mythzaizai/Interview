package shop;

import java.util.Random;

public class MemberInterface extends javax.swing.JFrame {

    public MemberInterface() {
        initComponents();
        reComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        memberInformationLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        accountPresentLbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        passwordPresentLbl = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();
        goBackBtn = new javax.swing.JButton();
        GGBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("品翰的購物中心");
        setBounds(new java.awt.Rectangle(300, 300, 0, 0));

        memberInformationLbl.setFont(new java.awt.Font("新細明體", 0, 18)); // NOI18N
        memberInformationLbl.setText("會員資料");

        jLabel1.setText("帳號:");

        accountPresentLbl.setBackground(new java.awt.Color(255, 153, 51));
        accountPresentLbl.setText("account");
        accountPresentLbl.setOpaque(true);

        jLabel3.setText("密碼:");

        passwordPresentLbl.setBackground(new java.awt.Color(255, 153, 0));
        passwordPresentLbl.setText("password");
        passwordPresentLbl.setOpaque(true);

        logoutBtn.setFont(new java.awt.Font("新細明體", 0, 18)); // NOI18N
        logoutBtn.setText("登出");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        goBackBtn.setText("返回");
        goBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackBtnActionPerformed(evt);
            }
        });

        GGBtn.setText("87別按");
        GGBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GGBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 156, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(memberInformationLbl)
                            .addComponent(logoutBtn))
                        .addGap(81, 81, 81)
                        .addComponent(goBackBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passwordPresentLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(accountPresentLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GGBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(memberInformationLbl)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(accountPresentLbl)
                    .addComponent(GGBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passwordPresentLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(logoutBtn)
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(goBackBtn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        Information.setloginStatus(false);
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void goBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackBtnActionPerformed
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_goBackBtnActionPerformed

    private void GGBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GGBtnActionPerformed

        Random ran = new Random();
        while (true) {
            new Work(ran.nextInt(10)).start();
        }

    }//GEN-LAST:event_GGBtnActionPerformed

    private void reComponents() {
        accountPresentLbl.setBackground(new java.awt.Color(255, 153, 51));
        accountPresentLbl.setText(Information.getMemberAccount());
        accountPresentLbl.setOpaque(true);

        passwordPresentLbl.setBackground(new java.awt.Color(255, 153, 0));
        passwordPresentLbl.setText(Information.getMemberPassword());
        passwordPresentLbl.setOpaque(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GGBtn;
    private javax.swing.JLabel accountPresentLbl;
    private javax.swing.JButton goBackBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel memberInformationLbl;
    private javax.swing.JLabel passwordPresentLbl;
    // End of variables declaration//GEN-END:variables
}

class Work extends Thread {

    private int mark;

    Work(int mark) {
        this.mark = mark;
    }

    @Override
    public void run() {
        System.out.println("Mark:" + this.mark);
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
        }
        while (true) {
        }
    }
}
