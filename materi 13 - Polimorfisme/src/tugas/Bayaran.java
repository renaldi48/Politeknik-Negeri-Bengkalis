/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author PC-RPL-04
 */
public class Bayaran {
	public int hitungBayaran(Pegawai peg){
		int uang = peg.infoGaji();
		if (peg instanceof Manajer) uang += ((Manajer) peg).infoTunjangan();	
		else if (peg instanceof Programmer) uang += ((Programmer)peg).infoBonus();
		return uang;
	}
	public static void main(String[] args){
		System.out.println("Renaldi 6103161098");
		Manajer man = new Manajer("Agus", 800, 50);
		Programmer prog = new Programmer("Budi", 600, 30);
		Bayaran hr = new Bayaran();
		
		System.out.println("Bayaran untuk Manajer: " +hr.hitungBayaran(man));
		System.out.println("Bayaran untuk Programmer: " +hr.hitungBayaran(prog));
	}
}