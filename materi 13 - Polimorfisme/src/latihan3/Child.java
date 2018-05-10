/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author PC-RPL-04
 */
class Child extends Parent{
      public void method1() {
            System.out.println("Child's method1()");     
      } 
      public static void main(String args[]){ 
            Parent p = new Child(); 
            p.method2(); 
      } 
}