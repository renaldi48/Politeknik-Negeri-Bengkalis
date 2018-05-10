/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan1;

/**
 *
 * @author PC-RPL-04
 */
public class Tes {
    public static void main(String args[]){
        //syntax untuk membuat tes baru
        Parent tes=new Child();
        
        //memanggil x dari tes yang dibuat
        System.out.println("Nilai x = " + tes.x);
        tes.Info();
    }
}
