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
public class Mahasiswa2 {

    int nrp;
    String nama;

    public Mahasiswa2(){
        this(0, "");
    
}
public Mahasiswa2(String nama) {
        this(0, nama);
    }

    public Mahasiswa2(int nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
    }
    public int getNrp(){
        return nrp;
    }
    
    public String getNama(){
        return nama;
    }
    
}
