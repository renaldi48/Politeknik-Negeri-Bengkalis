/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package packageX.packageY;
//import packageX.SuperclassX;
        

/**
 *
 * @author PC-RPL-04
 */
//Filename: SubclassX.java
package packageX.packageY;


public class SubclassY extends SuperclassX {
	SuperclassX objX = new SubclassY();
	SubclassY objY = new SubclassY();
	
	void subclassMethodY(){
		objY.superclassMethodX();
		int i;
		i = objY.superclassVarX;
	}
}
