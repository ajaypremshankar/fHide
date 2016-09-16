/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fHide;
import java.awt.*;

import java.applet.Applet;

/**
 *
 * @author AJAY-PREM
 */
public class app extends Applet {
Image img;
    
    public void init() {
        // TODO start asynchronous download of heavy resources
   img=getImage(getDocumentBase(),"C:\\a.jpg");
    }

    // TODO overwrite start(), stop() and destroy() methods
public void paint (Graphics g){
g.drawImage(img, 10, 10, this);

}
}
