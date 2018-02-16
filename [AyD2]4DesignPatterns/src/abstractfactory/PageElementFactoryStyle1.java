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
import observer.CJSObserver;
import observer.ObservableElement;

/**
 *
 * @author erick
 */
public class PageElementFactoryStyle1 implements PageElementFactory{

    @Override
    public Tag[] createTags() {
        
        /*ObservableElement button1 = new ObservableElement();
        ObservableElement button2 = new ObservableElement();
        CJSObserver observer1 = new CJSObserver(button1);
        CJSObserver observer2 = new CJSObserver(button2);*/
        
        Tag tags[] = new Tag[4];
        
        tags[0] = new Button();
        //Listo
        //button1.eventDescription("listo", tags[0].type(), tags[0].getDescription());
     
        tags[1] = new Button();
        //Listo
        //button2.eventDescription("listo", tags[1].type(), tags[1].getDescription());
        
        tags[1] = new Color(tags[1], "red");
        //Modificado
        //button2.eventDescription("modificado", tags[1].type(), tags[1].getDescription());
        
        tags[1] = new Format(tags[1], "bold");
        //Modificado
        //button2.eventDescription("cliqueado", tags[1].type(), tags[1].getDescription());
        
        tags[2] = new Input();
        //Listo
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
