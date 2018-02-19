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
import java.util.ArrayList;
import observer.CJSObserver;
import observer.ObservableElement;
import singleton.InformationTable;

/**
 *
 * @author erick
 */
public class PageElementFactoryStyle1 implements PageElementFactory{

    @Override
    public ArrayList<Tag> createTags() {
        InformationTable tablax = InformationTable.getInstance();
        /*ObservableElement button1 = new ObservableElement();
        ObservableElement button2 = new ObservableElement();
        CJSObserver observer1 = new CJSObserver(button1);
        CJSObserver observer2 = new CJSObserver(button2);*/
        
        
        
        //Tag tags[] = {new Button(), new Input(), new Table()};
        //Aquí creo que debería recorrer la tabla de simbolos para saber que tantas etiquetas tendrá una página
        return tablax.getInformationTable();
    }
    
}
