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
public interface PageElementFactory {
    public ArrayList<Tag> createTags();
    //public Tag[] updateTags();
    //public Tag[] clickTags();
}
