package shop;

import javax.swing.JOptionPane;

public class ShoppingCartInterface extends javax.swing.JFrame {
    
    private static int shoppingCartIndex;
    private static int totalMoney;

    static{
        shoppingCartIndex=0;
        totalMoney=0;
    }
    
    public static int getTotalMoney(){
        return totalMoney;
    }
    
    public static void setTotalMoney(int i){
        totalMoney=i;
    }
    
    public ShoppingCartInterface() {
        initComponents();
        reComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ShoppingCartLbl = new javax.swing.JLabel();
        goBackBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        shoppingCartTable = new javax.swing.JTable();
        totalMoneyLbl = new javax.swing.JLabel();
        removeProductBtn = new javax.swing.JButton();
        chooseRemoveTextF = new javax.swing.JTextField();
        buyBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("品翰的購物中心");
        setBounds(new java.awt.Rectangle(300, 300, 0, 0));

        ShoppingCartLbl.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        ShoppingCartLbl.setText("我的購物車 >> 目前金額");

        goBackBtn.setText("返回");
        goBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackBtnActionPerformed(evt);
            }
        });

        shoppingCartTable.setFont(new java.awt.Font("新細明體", 0, 14)); // NOI18N
        shoppingCartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
        jScrollPane1.setViewportView(shoppingCartTable);

        totalMoneyLbl.setBackground(new java.awt.Color(204, 255, 204));
        totalMoneyLbl.setText("0");
        totalMoneyLbl.setOpaque(true);

        removeProductBtn.setText("移除商品");
        removeProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeProductBtnActionPerformed(evt);
            }
        });

        buyBtn.setText("買單");
        buyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyBtnActionPerformed(evt);
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
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(removeProductBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chooseRemoveTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(goBackBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ShoppingCartLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalMoneyLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ShoppingCartLbl)
                    .addComponent(totalMoneyLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(buyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(goBackBtn)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(removeProductBtn)
                            .addComponent(chooseRemoveTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reComponents() {
        shoppingCartTable.setFont(new java.awt.Font("標楷體", 0, 16)); // NOI18N
        shoppingCartTable.setModel(new javax.swing.table.DefaultTableModel(
                Information.getfinalCart(), Information.getColumn()
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        shoppingCartTable.setAlignmentX(1.0F);
        shoppingCartTable.setAlignmentY(1.0F);
        jScrollPane1.setViewportView(shoppingCartTable);

        totalMoneyLbl.setBackground(new java.awt.Color(204, 255, 204));
        totalMoneyLbl.setText(Integer.toString(totalMoney));
        totalMoneyLbl.setOpaque(true);
    }

    private void goBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackBtnActionPerformed
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_goBackBtnActionPerformed

    private void removeProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeProductBtnActionPerformed
    
        while(true){
            
            try{
                boolean test =Information.getfinalCartElements( Integer.valueOf(chooseRemoveTextF.getText())-1, 0).isEmpty();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "尚無此商品!請確認編號是否正確", "系統提示", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (chooseRemoveTextF.getText().isEmpty() || Integer.valueOf(chooseRemoveTextF.getText()) > 10 || Integer.valueOf(chooseRemoveTextF.getText()) < 1 ) {
                JOptionPane.showMessageDialog(null, "尚無此商品!請確認編號是否正確", "系統提示", JOptionPane.ERROR_MESSAGE);
                return;
            }else{
                shoppingCartIndex--;
                totalMoney-=Integer.valueOf(Information.getfinalCartElements(Integer.valueOf(chooseRemoveTextF.getText())-1,2));
                totalMoneyLbl.setText(Integer.toString(totalMoney));
                Information.setfinalCartElements(null, Integer.valueOf(chooseRemoveTextF.getText())-1, 0);
                Information.setfinalCartElements(null, Integer.valueOf(chooseRemoveTextF.getText())-1, 1);
                Information.setfinalCartElements(null, Integer.valueOf(chooseRemoveTextF.getText())-1, 2);
                this.setVisible(false);
                new ShoppingCartInterface().setVisible(true);
                return;
            }
            
        }
        
    }//GEN-LAST:event_removeProductBtnActionPerformed

    private void buyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyBtnActionPerformed
       this.setVisible(false);
       new BuyInterface().setVisible(true);
    }//GEN-LAST:event_buyBtnActionPerformed
    
    
    public void joinCartTable(String name, int price ){
        shoppingCartIndex=0;
        while(true){
            if(shoppingCartIndex>9){
                JOptionPane.showMessageDialog(null, "購物車已被裝滿!請先去結帳或移除商品", "系統提示",JOptionPane.OK_OPTION);
                return;
            }
            if(Information.getfinalCartElements(shoppingCartIndex, 0) == null){            
                Information.setfinalCartElements(Integer.toString(shoppingCartIndex+1), shoppingCartIndex, 0);
                Information.setfinalCartElements(name, shoppingCartIndex, 1);
                Information.setfinalCartElements(Integer.toString(price), shoppingCartIndex, 2);
                totalMoney+=price;
                return;
            }else{
                shoppingCartIndex++;
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ShoppingCartLbl;
    private javax.swing.JButton buyBtn;
    private javax.swing.JTextField chooseRemoveTextF;
    private javax.swing.JButton goBackBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeProductBtn;
    private javax.swing.JTable shoppingCartTable;
    private javax.swing.JLabel totalMoneyLbl;
    // End of variables declaration//GEN-END:variables
}
