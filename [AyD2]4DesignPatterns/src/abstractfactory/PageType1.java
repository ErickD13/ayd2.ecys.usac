/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import java.util.ArrayList;

/**
 *
 * @author erick
 */
public class PageType1 extends Page {

    PageElementFactory elementFactory;

    public PageType1(PageElementFactory elementFactory) {
        this.elementFactory = elementFactory;
    }

    @Override
    void prepare() {
        //tags = new ArrayList<>();
        System.out.println("Preparing " + path);
        tags = this.elementFactory.createTags();
    }

}
