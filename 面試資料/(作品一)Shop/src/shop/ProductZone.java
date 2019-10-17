package shop;

import javax.swing.JOptionPane;

public class ProductZone extends javax.swing.JFrame {

    public ProductZone() {
        initComponents();
        reComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        goBack = new javax.swing.JButton();
        joinCartBtn = new javax.swing.JButton();
        chooseGoodsTextF = new javax.swing.JTextField();
        sysMessageLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("品翰的購物中心");
        setBounds(new java.awt.Rectangle(300, 300, 0, 0));

        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ProductTable);

        goBack.setText("返回");
        goBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackActionPerformed(evt);
            }
        });

        joinCartBtn.setText("加入購物車");
        joinCartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinCartBtnActionPerformed(evt);
            }
        });

        sysMessageLbl.setForeground(new java.awt.Color(102, 102, 0));
        sysMessageLbl.setText("提示 : 填入商品編號");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(joinCartBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chooseGoodsTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(goBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sysMessageLbl))
                        .addGap(0, 47, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(sysMessageLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goBack)
                    .addComponent(joinCartBtn)
                    .addComponent(chooseGoodsTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reComponents() {
        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
                Information.getFoodGoods(), Information.getColumn()
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane1.setViewportView(ProductTable);
    }

    private void goBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackActionPerformed
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_goBackActionPerformed

    private void joinCartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinCartBtnActionPerformed

        String namber, name, price;
        if (Information.getloginStatus()) {   //是否有登入
            try {
                if (chooseGoodsTextF.getText().isEmpty() || Integer.valueOf(chooseGoodsTextF.getText()) > 9 || Integer.valueOf(chooseGoodsTextF.getText()) < 1) {
                    JOptionPane.showMessageDialog(null, "尚無此商品!請確認編號是否正確", "系統提示", JOptionPane.ERROR_MESSAGE);
                    return;
                } else {
                    name = (String) ProductTable.getValueAt(Integer.valueOf(chooseGoodsTextF.getText()) - 1, 1);
                    price = (String) ProductTable.getValueAt(Integer.valueOf(chooseGoodsTextF.getText()) - 1, 2);

                    new ShoppingCartInterface().joinCartTable(name, Integer.valueOf(price));
                    sysMessageLbl.setText("★'" + name + "'已成功加入購物車!");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "尚無此商品!請確認編號是否正確", "系統提示", JOptionPane.ERROR_MESSAGE);
                return;
            }

        } else {
            JOptionPane.showMessageDialog(null, "請先登入或註冊會員，謝謝!", "系統提示", JOptionPane.CLOSED_OPTION);
        }

    }//GEN-LAST:event_joinCartBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ProductTable;
    private javax.swing.JTextField chooseGoodsTextF;
    private javax.swing.JButton goBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton joinCartBtn;
    private javax.swing.JLabel sysMessageLbl;
    // End of variables declaration//GEN-END:variables
}
