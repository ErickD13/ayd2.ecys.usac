/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author erick
 */
public class Table extends Tag {
    
    public Table(){
        this.description = "";
    }

    @Override
    public String type() {
        return "Table";
    }
    
}
