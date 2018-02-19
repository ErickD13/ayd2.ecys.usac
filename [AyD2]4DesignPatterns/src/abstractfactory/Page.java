/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import decorator.Tag;
import java.util.ArrayList;

/**
 *
 * @author erick
 */
public abstract class Page {

    String path;
    ArrayList<Tag> tags;

    abstract void prepare();

    /**
     * @return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path the path to set
     */
    public void setPath(String path) {
        this.path = path;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("---- " + this.path + " ----\n");

        if (tags != null) {
            /*for (int i = 0; i < tags.length; i++) {
                result.append(tags[i].type()+": "+tags[i].getDescription());
                if (i < tags.length - 1) {
                    result.append(". ");
                }
                result.append("\n");
            }*/
            for (Tag tag : tags) {
                result.append("Tag: " + tag.type()+" Properties: "+tag.getDescription());
            }
            result.append("\n");
        }
        return result.toString();

    }
}