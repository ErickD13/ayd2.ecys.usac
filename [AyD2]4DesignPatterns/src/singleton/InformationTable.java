/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import com.sun.jmx.snmp.Enumerated;
import decorator.Button;
import decorator.Color;
import decorator.Format;
import decorator.Input;
import decorator.Table;
import decorator.Tag;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;
import observer.ClicObserver;
import observer.ObservableElement;
import observer.ReadyObserver;
import observer.UpdatedObserver;

/**
 *
 * @author erick
 */
public class InformationTable {

    /**
     * @return the informationTable
     */
    public ArrayList<Tag> getInformationTable() {
        return informationTable;
    }

    /**
     * @param informationTable the informationTable to set
     */
    public void setInformationTable(ArrayList<Tag> informationTable) {
        this.informationTable = informationTable;
    }

    private static InformationTable uniqueInstance;
    private ArrayList<Tag> informationTable;
    ObservableElement cjsObserver1 = new ObservableElement();
    UpdatedObserver updatedEvent1 = new UpdatedObserver(cjsObserver1);
    ReadyObserver readyEvent1 = new ReadyObserver(cjsObserver1);

    public InformationTable() {
        informationTable = new ArrayList<>();
    }

    public static InformationTable getInstance() {
        if (uniqueInstance == null) {
            System.out.println("Creating unique instance of Information Table");
            uniqueInstance = new InformationTable();
        }
        System.out.println("Returning instance of Information Table");
        return uniqueInstance;
    }

    public void DrawTag(Tag tag) {
        int i = informationTable.indexOf(tag);
        System.out.println("Tag: "+informationTable.get(i).type()+" Properties: "+informationTable.get(i).getDescription());
        readyEvent1.update("listo", tag.type(), tag.getDescription());
    }

    public Tag Update(Tag tag, String propiedad, String valor) {
        int i = informationTable.indexOf(tag);
        if (propiedad.equalsIgnoreCase("color")){
            tag = new Color(tag, valor);
        }else if(propiedad.equalsIgnoreCase("format")){
            tag = new Format(tag, valor);
        }
        informationTable.set(i, tag);
        updatedEvent1.update("modificado", tag.type(), tag.getDescription());
        return tag;
    }

    public void add(Tag tag) {
        informationTable.add(tag);
        readyEvent1.update("listo", tag.type(), tag.getDescription());
    }
    
    public void DrawPage(){
        for (Tag tag : informationTable) {
            System.out.println("Tag: "+tag.type()+" Properties: "+tag.getDescription());
        }
        readyEvent1.update("listo", "Documento", "Page 1");
    }
}
