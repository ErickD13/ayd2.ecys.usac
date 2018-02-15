/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author erick
 */
public class BrowserType1 extends Browser {

    @Override
    protected Page createPage(String item) {
        Page page = null;
        PageElementFactory ingredientFactory
                = new PageElementFactoryStyle1();

        if (item.equals("PageType1")) {

            page = new PageType1(ingredientFactory);
            page.setRuta("Page style 1, type 1");

        }
        return page;
    }

}
