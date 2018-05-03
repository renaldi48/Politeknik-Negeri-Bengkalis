/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sekolah;

/**
 *
 * @author PC-RPL-04
 */
public class TestSekolah {
    public static void main (String args[]){
        Kelas kelas = new Kelas(0,"A");
        kelas.setMhs(new Mahasiswa(04,"Renaldi"));
        System.out.println("Nama : "+kelas.getMahasiswa().getNama());
        System.out.println("NRP : "+kelas.getMahasiswa().getNrp());
    }
}
