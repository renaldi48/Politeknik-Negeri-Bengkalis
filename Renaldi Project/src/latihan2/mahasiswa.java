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
public class mahasiswa {
     public int Nrp;
    public String Nama;

    public mahasiswa(int i, String n) {
        Nrp = i;
        Nama = n;
    }

    public int getNrp() {
        return Nrp;
    }

    public String getNama() {
        return Nama;
    }
}
