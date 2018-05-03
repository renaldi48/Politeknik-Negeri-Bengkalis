/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author PC-RPL-04
 */
public class Katak {

    int umur;
    String nama;
    String gerak;

    public Katak(int umur, String nama) {
        this.umur = umur;
        this.nama = nama;
    }

    public String caraBergerak() {
        return gerak;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }
}
