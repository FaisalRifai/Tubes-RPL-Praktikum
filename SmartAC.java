/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package smartac;
import java.awt.*;
import java.applet.*;
import java.util.Vector;
import java.util.Observer;
import java.util.Observable;



/**
 *
 * @author my pc
 */
public class SmartAC {
Termo termo;
Control ctrl;
Vector Q;

   public SmartAC() {
      termo = new Termo();
      termo.show();
      termo.pack();
      termo.resize(200,250);

      ctrl = new Control();
      ctrl.pack();
      ctrl.show();
      ctrl .resize(425,410);
      

      Q = new Vector(1,1);

   }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new SmartAC();
        // TODO code application logic here
    }
    
}
