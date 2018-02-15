/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

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
public class PageElementFactoryStyle1 implements PageElementFactory{

    @Override
    public Tag[] createTags() {
        Tag tags[] = new Tag[4];
        
        tags[0] = new Button();
     
        tags[1] = new Button();
        tags[1] = new Color(tags[1], "red");
        tags[1] = new Format(tags[1], "bold");
        
        tags[2] = new Input();
        tags[2] = new Color(tags[2], "green");
        tags[2] = new Format(tags[2], "italic");
        
        tags[3] = new Table();
        tags[3] = new Color(tags[3], "blue");
        tags[3] = new Format(tags[3], "underline");
        
        //Tag tags[] = {new Button(), new Input(), new Table()};
        //Aquí creo que debería recorrer la tabla de simbolos para saber que tantas etiquetas tendrá una página
        return tags;
    }
    
}
