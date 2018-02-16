/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author erick
 */
public class CJSObserver implements Observer, DisplayElement{

    private String event = "";
    private String type = "";  
    private String id = "";
    
    private ObservableElement element;

    public CJSObserver(ObservableElement element) {
        this.element = element;
        element.addObserver(this);
    }
    
    @Override
    public void update(String event, String type, String id) {
        if(!"".equals(event) && !"".equals(type) && !"".equals(id)){
            this.event = event;
            this.type = type;
            this.id = id;
            display(true);
        }else{
            display(false);
        }
    }

    @Override
    public void display(boolean flag) {
        if(flag){
            if(event.equalsIgnoreCase("listo")){
                System.out.println("Tipo: "+ type + " Id: " + id +". Listo");
            }else if(event.equalsIgnoreCase("modificado")){
                System.out.println("Tipo: "+ type + " Id: " + id +". Modificado");
            }else if(event.equalsIgnoreCase("cliqueado")){
                System.out.println("Tipo: "+ type + " Id: " + id +". Cliqueado");
            }
        }else{
            System.err.println("Unknow event");
        }
    }
    
}
