/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

/**
 *
 * @author PC-RPL-04
 */
public class Over extends Base {
    public static void main(String argv[]){
        Over o = new Over();
        int iBase=0;
        o.amethod(iBase);
    }
    public void amethod(int iOver){
        System.out.println("Over.amethod");
    }
}
