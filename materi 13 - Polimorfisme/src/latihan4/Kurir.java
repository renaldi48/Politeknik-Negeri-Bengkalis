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
public class Kurir extends Pegawai {
	public int gaji;
	public Kurir(String nama){
		super(nama);
	}
	public Kurir(String nama, int gaji){
		super(nama);
		this.gaji = gaji;
	}
	public int getGaji(){
		return gaji;
	}
}