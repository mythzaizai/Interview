package shop;

import jdk.nashorn.internal.codegen.CompilerConstants;

public class Information {

    private static boolean loginStatus = false;

    private static String memberAccount = "0000";   //預設
    private static String memberPassword = "0000";  //預設
    
    private static String[][] finalCart = {
        {null, null,null},
        {null, null,null},
        {null, null,null},
        {null, null,null},
        {null, null,null},
        {null, null,null},
        {null, null,null},
        {null, null,null},
        {null, null,null},
        {null, null,null}
    };

    private static String[][] foodgoods = {
        {"1", "蘋果","10"},
        {"2", "香蕉","5"},
        {"3", "菲力牛排","200"},
        {"4", "超肥薯餅","150"},
        {"5", "拉肚子奶茶","50"},
        {"6", "義大利麵","100"},
        {"7", "生到爆沙拉","80"},
        {"8", "豬奶","30"},
        {"9", "池上便當","110"},
        {null, null,null}
    };

    private static String[] column = {"編號","商品名稱","商品價錢"};
    
    public static String[][] getfinalCart(){
        return finalCart;
    }
    
    public static String getfinalCartElements(int i, int j){
        return finalCart[i][j];
    }
    
    public static void setfinalCartElements(String str,int i, int j){
        finalCart[i][j] = str;
    }
    
    public static String[][] getFoodGoods(){
        return foodgoods;
    }
    
    public static String[] getColumn(){
        return column;
    }

    public static void setloginStatus(boolean check) {
        loginStatus = check;
    }

    public static boolean getloginStatus() {
        return loginStatus;
    }

    public static void setMemberAccount(String account) {
        memberAccount = account;
    }

    public static String getMemberAccount() {
        return memberAccount;
    }

    public static void setMemberPassword(String password) {
        memberPassword = password;
    }

    public static String getMemberPassword() {
        return memberPassword;
    }

}
