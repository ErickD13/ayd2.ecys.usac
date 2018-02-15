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
public abstract class Browser {

    protected abstract Page createPage(String item);

    public Page cargarPage(String type) {
        Page page = createPage(type);
        System.out.println("--- Creating a " + page.getRuta() + " ---");
        page.prepare();
        return page;
    }
}
