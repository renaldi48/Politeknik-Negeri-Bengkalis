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
 public class TestKalender {
    public static String getTime(Kalender kal) {
        String tmp;
        tmp=kal.getTanggal() + "-" +
            kal.getBulan() + "-" +
            kal.getTahun();
            return tmp;
    }

    public static void main(String args[]) {
        Kalender kal=new Kalender(8);
        System.out.println("Waktu awal : " + getTime(kal));
        
        kal.setTanggal(9);
        System.out.println("1 hari setelah waktu awal : " + getTime(kal));
        
        kal=new Kalender(6,2003);
        System.out.println("Waktu berubah : " + getTime(kal));
        
        kal.setBulan(7);
        System.out.println("1 bulan setelah itu : " + getTime(kal));
        
        kal=new Kalender(20,10,2004);
        System.out.println("Waktu berubah : " + getTime(kal));
        
        kal.setTahun(2005);
        System.out.println("1 tahun setelah itu : " + getTime(kal));
    }
} 