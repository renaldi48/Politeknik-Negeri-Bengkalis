/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perbankan;

/**
 *
 * @author PC-RPL-04
 */
public class Nasabah {
    public String namaAwal;
    public String namaAkhir;
    public Tabungan tabungan;
    
    public Nasabah(String namaAwal, String namaAkhir){
        this.namaAwal = namaAwal;
        this.namaAkhir = namaAkhir;
    }
    
    public String getNamaAwal(){
        return namaAwal;
    }
    
    public String getNamaAkhir(){
        return namaAkhir;
    }
    public Tabungan getTabungan(){
        return tabungan;
    }
    public void setTabungan(Tabungan tabungan){
        this.tabungan = tabungan;
    }
}