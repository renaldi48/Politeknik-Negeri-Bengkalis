/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

/**
 *
 * @author PC-RPL-04
 */
class Latihan4 {
	public static void Proses(Pegawai peg){
		if(peg instanceof Manajer){
			Manajer man = (Manajer) peg;
			System.out.println("Nama manajer: "+man.nama);
			System.out.println("Tunjangan: "+man.tunjangan);
		}
		else if(peg instanceof Kurir){
			Kurir kur = (Kurir) peg;
			System.out.println("Nama kurir: "+kur.nama);
			System.out.println("Gaji: "+kur.gaji);
		}
	}
	
	public static void main(String[] args){
		System.out.println("Renaldi 6103161098");
		Manajer peg1 = new Manajer("Putra RR",90000);
		Proses(peg1);
		Kurir peg2 = new Kurir("Iqbal",60000);
		Proses(peg2);
	}
}
