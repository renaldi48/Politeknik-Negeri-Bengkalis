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
class Programmer extends Pegawai {
	private int bonus;
	public Programmer(String nama, int gaji, int bonus){
		super(nama, gaji);
		this.bonus = bonus;
	}
	public int infoGaji(){
		return gaji;
	}
	public int infoBonus(){
		return bonus;
	}
}