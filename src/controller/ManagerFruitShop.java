/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Fruit;
import model.FruitList;
import view.Menu;

/**
 *
 * @author This PC
 */
public class ManagerFruitShop extends Menu<String>{

    private FruitList list= new FruitList();
    
    public ManagerFruitShop(String title, String[] s){
        super(title, s);
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                list.createFruit();
                list.displayList();
                break;
            case 2:
                list.viewOrders();
                break;
            case 3:
                list.shopping();
                break;
            case 4: 
                System.exit(0);               
        }
    }
    
}
