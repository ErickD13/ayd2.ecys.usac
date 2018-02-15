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
public class Format extends PropertiesDecorator {

    Tag tag;
    String propiedad;

    public Format(Tag tag, String propiedad) {
        this.tag = tag;
        this.propiedad = propiedad;
    }

    @Override
    public String type() {
        return tag.type();
    }

    @Override
    
    public String getDescription() {
        return tag.getDescription() + ", " + this.propiedad;
    }
}

