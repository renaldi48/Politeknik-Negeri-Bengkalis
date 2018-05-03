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
public class Tabungan {
    int saldo;
    
    public Tabungan(int saldo){
        this.saldo = saldo;
    }
    
    public int getSaldo(){
        return saldo;
    }
    public int simpanUang(int jumlah){
        return saldo = saldo + jumlah;
    }
    public boolean ambilUang(int jumlah){
        if (saldo - jumlah < 0){
            return false;
        }else{
            saldo -= jumlah;
            return true;
        }
    }
}
