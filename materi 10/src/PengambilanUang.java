/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC-RPL-04
 */
public class PengambilanUang extends Tabungan {
	private int proteksi;
	public PengambilanUang(int saldo){
		super(saldo);
	}
	public PengambilanUang(int saldo, int proteksi){
		super(saldo);
		this.proteksi=proteksi;
	}
	public int getSaldo(){
		return saldo;
	}
	public boolean ambilUang(int jumlah){
		int temp=saldo;
		saldo-=jumlah;
		if(saldo<proteksi){
			saldo=temp;
			return false;
		}
		else return true;
	}
}