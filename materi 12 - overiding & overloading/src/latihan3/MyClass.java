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
class MyClass {
    void myMethod(int i){
        System.out.println("int version");
    }
    
    void myMethod(String s){
        System.out.println("String version");
    }
    
    public static void main (String args[]){
        MyClass obj = new MyClass();
        char ch = 'c';
        obj.myMethod(ch);
    }
}
