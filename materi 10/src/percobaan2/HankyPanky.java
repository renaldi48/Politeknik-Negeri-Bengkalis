/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan2;

/**
 *
 * @author PC-RPL-04
 */
//ini subs class
public class HankyPanky extends HumptyDumpty{
    //ini overriding method
    public void myMethod(){
    System.out.println("anak dari HD");
    }
    
    public static void main(String args[]){
        //objek1
        HankyPanky hp = new HankyPanky();
        
        //objek2 menggunakan method myMethod
        HankyPanky.myMethod();
    }
}