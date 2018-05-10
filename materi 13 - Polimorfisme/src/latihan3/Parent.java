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
class Parent{
      private void method1(){ 
            System.out.println("Parent's method1()"); 
      } 
      public void method2(){ 
            System.out.println("Parent's method2()"); 
            method1(); 
      } 
}