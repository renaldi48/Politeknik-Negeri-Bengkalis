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
public class tabungan {

    public int saldo;

    public tabungan(int initsaldo) {
        saldo = initsaldo;
    }

    public void ambilUang(int jumlah) {
        saldo -= jumlah;
    }
}
