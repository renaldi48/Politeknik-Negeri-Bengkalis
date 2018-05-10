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
class Manajer extends Pegawai {
	private int tunjangan;
	public Manajer(String nama, int gaji, int tunjangan){
		super(nama, gaji);
		this.tunjangan = tunjangan;
	}
	public int infoGaji(){
		return gaji;
	}
	public int infoTunjangan(){
		return tunjangan;
	}
}