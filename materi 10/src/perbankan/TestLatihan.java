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
import perbankan.*;

public class TestLatihan {
	public static void main(String args[]){
		System.out.println("Renaldi 6103161098");
		PenyimpananUang tabungan = new PenyimpananUang(5000, 8.5/100);
		System.out.println("Uang yang ditabung: 5000");
		System.out.println("Tingkat bunga sekarang: 8.5%");
		System.out.println("Total uang sekarang: "+tabungan.cekUang());
	}
}