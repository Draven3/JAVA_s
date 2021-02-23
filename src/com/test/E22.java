package com.test;
import java.util.Scanner;
//假设有以下商品以及对应单价：
//        商品编号     商品名称                       商品单价
//        C_101         HUAWEI Mate30 Pro      5000.00
//        C_102         XIAOMI 10 Pro               4699.00
//       编写一个命令行程序，实现以下功能：
//     1.创建一个类（Item），该类包含三个属性：ItemCode, ItemName, UnitPrice，分别用来描述商品编号、商品名称、商品单价，注意每个属性数据类型。
//     2.创建一个类（Order），类中包含一个方法（getOrderAmount），该方法包含两个参数（itemCode, itemCount）,这两个参数用于描述购买的商品和数量，
//     方法体中需要根据ItemCode取得对应商品的单价，在根据购买数量，计算该订单的总金额。
//     3. 在main函数中取得从命令行输入的商品编号和数量（用英文逗号隔开），之后调用Order类的getOrderAmount方法取得总价，并在命令行输出。
//      示例：
//      输入：C_101, 2
//      输出：10000.00

//计算订单金额
public class E22 {
    public static void main(String[] args) {

        Item item = new Item();
        String[] ItemCode = new String[]{"C_101", "C_102"};
        String[] ItemName = new String[]{" HUAWEI Mate30 Pro", "XIAOMI 10 Pro"};
        double[] UnitPrice = new double[]{5000.00, 4699.00};
        item.setItemCode(ItemCode);
        item.setItemName(ItemName);
        item.setUnitPrice(UnitPrice);


        Scanner sc = new Scanner(System.in);
        String temp = sc.next();
        String[] ss = temp.split(",");
        String serial = ss[0];
        int number = Integer.parseInt(ss[1]);

        double total = Order.getOrderAmount(serial, number,item);
        System.out.println(total);



    }
}

class Item {
    String[] ItemCode;
    String[] ItemName;
    double[] UnitPrice;

    public void setItemCode(String[] ItemCode) {
        this.ItemCode = ItemCode;
    }

    public void setItemName(String[] ItemName) {
        this.ItemName = ItemName;
    }

    public void setUnitPrice(double[] UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    public String[] getItemName() {
        System.out.println(ItemName);
        return ItemName;
    }

    public String[] getItemCode() {
        System.out.println(ItemCode);
        return ItemCode;
    }

    public double[] getUnitPrice() {
        System.out.println(UnitPrice);
        return UnitPrice;
    }


}


class Order extends Item  {

    public static double getOrderAmount(String serial, int number,Item item) {
        Item test = item;
        String[] ItemCode = test.ItemCode;
        String[] ItemName = test.ItemName;
        double[] UnitPrice = test.UnitPrice;
        double sum = 0;
        for (int i = 0; i < ItemCode.length; i++) {
            if (ItemCode[i].equals(serial)) {
                sum = number * UnitPrice[i];
            }
        }
        return sum;
    }

}
