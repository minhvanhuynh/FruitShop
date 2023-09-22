/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
import java.util.Hashtable;
import view.Validation;

/**
 *
 * @author This PC
 */
public class FruitList {
    private ArrayList<Fruit> list;    
    private Hashtable<String, ArrayList<Order>> ht;
    private Validation validation;
    
    public FruitList(){
        this.list= new ArrayList<>();        
        this.ht= new Hashtable<>();
        this.validation= new Validation();
    }
    
    public void createFruit(){
        while(true){
            System.out.println("Enter ID Fruit: ");
            int id= validation.checkInputIntLimit(1, 100);
            if(validation.checkIdExist(list, id)){
                continue;
            }
            System.out.println("Enter Fruit Name: ");
            String name= validation.checkInputString();
            System.out.println("Enter Price Fruit: ");
            double price= validation.checkInputDouble();
            System.out.println("Enter Quantity Fruit: ");
            int quantity= validation.checkInputIntLimit(1, 100);
            System.out.println("Enter Origin Fruit: ");
            String origin= validation.checkInputString();
            Fruit fruit= new Fruit(id, name, price, quantity, origin);
            list.add(fruit);
            System.out.println("Do you want to continue (Y/N)? Choose Y to continue, N to return main screen");
            if(!validation.checkInputYesNo()){
                return;
            }
        }
    }
    
    public void viewOrders(){
        if(ht.isEmpty()){
            System.err.println("No Order!");
        }
        for(String name: ht.keySet()){
            int total=0;
            System.out.println("Custumer: "+name);
            System.out.println(" Product |  Quantity  |  Price  |  Amount");
            ArrayList<Order> array_o= ht.get(name);
            for (int i = 0; i < array_o.size(); i++) {
                System.out.println((i+1)+"."+array_o.get(i).hienthi());
                total+=array_o.get(i).getAmount();
            }
            System.out.println("Total: "+total);
        }
    }
    
    public void shopping(){
        if(list.isEmpty()){
            System.err.println("List is empty!");
            return;
        }
        ArrayList<Order> list_o= new ArrayList<>();
        while(true){
            displayList();
            System.out.println("Enter your select about Fruit: ");
            int choice= validation.checkInputIntLimit(1, list.size());
            Fruit fruit= list.get(choice-1);
            System.out.println("You selected: "+fruit.getName());
            System.out.println("Please input quantity: ");
            int quantity= validation.checkInputIntLimit(1, fruit.getQuantity());        
            list_o.add(new Order(fruit.getName(), quantity, fruit.getPrice(), (quantity * fruit.getPrice())));
            fruit.setQuantity(fruit.getQuantity()-quantity);
            if(fruit.getQuantity()==0){
                list.remove(fruit);
            }
            System.out.println("Do you want to order now (Y/N)? Choose Y to continue, N to return main screen");
                if(!validation.checkInputYesNo()){
                    double total=0;
                    System.out.println("Product | Quantity | Price | Amount");
                    for (Order order : list_o) {
                        System.out.println(order);
                        total+=order.getAmount();
                    }
                    System.out.println("Total: "+total);
                    System.out.println("Input your name: ");
                    String name= validation.checkInputString();
                    ht.put(name, list_o);
                    return;
                }
        }
    
    }    
                    
    public void displayList(){
        System.out.println("| ++ Item++ | ++Fruit Name++ | ++Origin++ | ++Price++ | ++Quantity++ |");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("      "+(i+1)+list.get(i));
        }
    }
}
