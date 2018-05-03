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
public class PenyimpananUang extends Tabungan{
    private double tingkatBunga;
    
    public PenyimpananUang(int saldo, double tingkatBunga){
        super(saldo);
        this.tingkatBunga=tingkatBunga;
    }
    
    public double getTingkatBunga(){
        return tingkatBunga;
    }
    
    public void setTingkatBunga(double tingkatBunga){
        this.tingkatBunga=tingkatBunga;
    }
    
    public double cekUang(){
        tingkatBunga=saldo*tingkatBunga+saldo+tingkatBunga;
        return tingkatBunga;
    }
}
