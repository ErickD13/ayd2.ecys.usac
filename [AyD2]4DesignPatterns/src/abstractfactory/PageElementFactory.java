/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import decorator.Tag;

/**
 *
 * @author erick
 */
public interface PageElementFactory {
    public Tag[] createTags();
}
