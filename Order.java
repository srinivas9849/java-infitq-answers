package com.company;

public class Order {
    private int orderId;
    private String orderedFoods;
    private double totalPrice;
    private String status;
    static double charge=5;
    public Order(){
        this.status="Ordered";
    }

    public void setOrderId(int orderId){

        this.orderId = orderId;
    }

    public void setOrderedFoods(String orderedFoods) {
        this.orderedFoods = orderedFoods;
    }

    public String getOrderedFoods() {
        return orderedFoods;
    }

    public int getOrderId() {
        return orderId;
    }



    public void caluclateTotalPrice(int unitPrice){
        totalPrice=(int)((charge/100)*unitPrice)+unitPrice;

    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public static void setCharge(double charge) {
        Order.charge = charge;
    }

    public static double getCharge() {
        return charge;
    }

    public void orderDetails(){
        System.out.println("orderId:"+orderId);
        System.out.println("orderedFoods "+orderedFoods);

        System.out.println("totalPrice "+totalPrice);
        System.out.println("status :"+status);




    }
}
