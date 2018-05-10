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
public class Manajer extends Pegawai {
	public int tunjangan;
	public Manajer(String nama){
		super(nama);
	}
	public Manajer(String nama, int tunjangan){
		super(nama);
		this.tunjangan = tunjangan;
	}
	public int getTunjangan(){
		return tunjangan;
	}
}