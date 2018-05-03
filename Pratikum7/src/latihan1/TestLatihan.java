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
public class TestLatihan {
    public static void main(String Args[]){
        Tabungan tabungan = new Tabungan(5000);
        System.out.println("Saldo awal : "+ tabungan.saldo);
        tabungan.ambilUang(2300);
        System.out.println("Jumlah uang yang diambil : 2300");
        System.out.println("Saldo sekarangaz                                                                                                                                                    F : " + tabungan.saldo);
    }
            
}
