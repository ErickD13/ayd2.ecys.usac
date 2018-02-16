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
    Tag tag1 = new Button(); 
    public static Tag tag2 = new Button();
    Tag tag3 = new Input();
    Tag tag4 = new Input();
    Tag tag5 = new Table();  

    private InformationTable() {
        informationTable = new ArrayList<>();
        tag1  = new Color(tag1, "yellow");
        tag2  = new Color(tag2, "red");
        tag3  = new Color(tag3, "blue");
        tag4  = new Color(tag4, "green");
        tag5  = new Color(tag5, "white");
        informationTable.add(tag1);
        informationTable.add(tag2);
        informationTable.add(tag3);
        informationTable.add(tag4);
        informationTable.add(tag5);
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

    }

    public Tag Update(Tag tag, String propiedad) {
        int i = getInformationTable().indexOf(tag);
        tag = new Color(tag, propiedad);
        getInformationTable().set(i, tag);
        cjsObserver1.eventDescription("modificado", tag.type(), tag.getDescription());
        return tag;
    }
}
