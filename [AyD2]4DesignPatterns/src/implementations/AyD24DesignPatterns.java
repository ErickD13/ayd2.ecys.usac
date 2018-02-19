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
import singleton.InformationTable;

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
        Browser chrome = new BrowserType1();

        InformationTable tabla1 = InformationTable.getInstance();


        // will return the existing instance
        InformationTable tabla2 = InformationTable.getInstance();

        
        InformationTable tabla3 = InformationTable.getInstance();
        
        Tag tag1 = new Button(); 
        Tag tag2 = new Button();
        Tag tag3 = new Input();
        Tag tag4 = new Input();
        Tag tag5 = new Table();
        tag1  = new Color(tag1, "yellow");
        tag2  = new Color(tag2, "red");
        tag3  = new Color(tag3, "green");
        tag3  = new Format(tag3, "italic");
        tag4  = new Format(tag4, "bold");
        tag5  = new Color(tag5, "blue");
        tabla1.add(tag1);
        tabla1.add(tag2);
        tabla2.add(tag3);
        tabla2.add(tag4);
        tabla3.add(tag5);
        
        Page page = chrome.cargarPage("PageType1");//En blanco
        System.out.println("User1 ordered a " + page + "\n");
        
        System.out.println("Table 1");
        tabla1.DrawTag(tag5);
        
        tabla1.DrawPage();
        
        System.out.println("Table 1 updated");
        tabla1.Update(tag5, "format", "underline");
        
        tabla1.DrawPage();

    }

}
