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
public abstract class Tag {
    String description;
    /*String size = "Unknown size";
    String color = "Unknown color";*/
    
    /**
     * @return the description
     */
    public String getDescription() {
        return this.description;
    }
    
    public abstract String type();
}
