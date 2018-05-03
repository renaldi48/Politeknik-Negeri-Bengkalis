/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC-RPL-04
 */
public class TestTugas{
	public static void main(String args[]){
		System.out.println("Renaldi 6103161098\n");
		PengambilanUang tabungan = new PengambilanUang(5000, 1000);
		System.out.println("Uang yang ditabung: 5000");
		System.out.println("Uang yang diproteksi: 1000");
		System.out.println("----------------------------");
		System.out.println("Uang yang akan diambil: 4500 " +tabungan.ambilUang(4500));
		System.out.println("Saldo sekarang: "+tabungan.getSaldo());
		System.out.println("----------------------------");
		System.out.println("Uang yang akan diambil: 2500 " +tabungan.ambilUang(2500));
		System.out.println("Saldo sekarang: "+tabungan.getSaldo());		
	}
}