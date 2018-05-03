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
public class TestPercobaan {
    public static void main(String args[]){
        Mahasiswa2 student1 = new Mahasiswa2();
        Mahasiswa2 student2 = new Mahasiswa2("Renaldi");
        Mahasiswa2 student3 = new Mahasiswa2(610316,"Renaldi");
        
        System.out.println("\nStudent 1");
        System.out.println("NIM : "+student1.getNrp());
        System.out.println("Nama : "+student1.getNama());
        
        System.out.println("\nStudent 2");
        System.out.println("NIM : "+student2.getNrp());
        System.out.println("Nama : "+student2.getNama());
        
        System.out.println("\nStudent 3");
        System.out.println("NIM : "+student3.getNrp());
        System.out.println("Nama : "+student3.getNama());
    }
}
