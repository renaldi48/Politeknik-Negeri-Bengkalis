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
class Pegawai {
	protected String nama;
	protected int gaji;
	public Pegawai(String nama, int gaji){
		this.nama = nama;
		this.gaji = gaji;
	}
	public int infoGaji(){
		return gaji;
	}
}