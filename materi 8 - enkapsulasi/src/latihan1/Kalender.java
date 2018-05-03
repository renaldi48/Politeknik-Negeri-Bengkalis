/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

/**
 *
 * @author PC-RPL-04
 */
public class Kalender {
    public int tanggal;
    public int bulan;
    public int tahun;
    
    public Kalender(int tanggal){
        this(tanggal,1,2000);
    }
    
    public Kalender(int bulan, int tahun){
        this(1,bulan,tahun);
    }
    
    public Kalender(int tanggal, int bulan, int tahun){
        this.tanggal=tanggal;
        this.bulan=bulan;
        this.tahun=tahun;
    }
    
    public void setBulan(int bulan){
        this.bulan=bulan;
    }
    
    public void setTahun(int tahun){
        this.tahun=tahun;
    }
    
    public void setTanggal(int tanggal){
        this.tanggal=tanggal;
    }
    
    public int getTanggal(){
        return tanggal;
    }
    
    public int getBulan(){
        return bulan;
    }
    
    public int getTahun(){
        return tahun;
    }
}
