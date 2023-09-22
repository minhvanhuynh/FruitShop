/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controller.ManagerFruitShop;
import view.Menu;

/**
 *
 * @author This PC
 */
public class Main {
    public static void main(String[] args) {
        String title= "FRUIT SHOP SYSTEM";
        String[] s= new String[] {"Create Fruit", "View order", "Shopping(for buyer)", "Exit"};
        Menu<String> menu= new ManagerFruitShop(title, s);
        menu.run();
    }
}
