/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementations;

import abstractfactory.Browser;
import abstractfactory.BrowserType1;
import abstractfactory.Page;
import decorator.Button;
import decorator.Color;
import decorator.Format;
import decorator.Input;
import decorator.Table;
import decorator.Tag;

/**
 *
 * @author erick
 */
public class AyD24DesignPatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Browser chrome = new  BrowserType1();
        
        Page page = chrome.cargarPage("PageType1");
        System.out.println("User1 ordered a " + page + "\n");

    }

}
