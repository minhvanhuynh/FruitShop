/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author This PC
 */
public class Order {
    private String nameProduct;
    private int quantity;
    private double price;
    private double amount;
    
    public Order(){}
    
    public Order(String nameProduct, int quantity, double price, double amount){
        this.nameProduct= nameProduct;
        this.quantity= quantity;
        this.price= price;
        this.amount= amount;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format("%s %8s %10s %8s", this.nameProduct, this.quantity, this.price, this.amount);
    }
    
    public String hienthi() {
        return String.format("%s %8s %12s %10s", this.nameProduct, this.quantity, this.price, this.amount);
    }
    
    
   
}
