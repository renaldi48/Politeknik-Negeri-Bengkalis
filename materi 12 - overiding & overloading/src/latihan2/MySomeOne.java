/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author PC-RPL-04
 */
public class MySomeOne{
    public static void main(String args[]){
            MyChild myChi = new MyChild(10, 20, 30);
            MyParent myPar = new MyParent(10, 20);
            int x = myChi.addMe(10, 20, 30);
            int y = myChi.addMe(myChi);
            int z = myPar.addMe(myPar);
            System.out.println(x+y+z);
    }
}
