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
public class Kendaraan{
	protected int jmlRoda;
	protected String warna;
	
	public void setJmlRoda(int roda){
		jmlRoda=roda;
	}
	public int getJmlRoda(){
		return jmlRoda;
	}
	public void setWarna(String warna){
		this.warna=warna;
	}
	public String getWarna(){
		return warna;
	}
}