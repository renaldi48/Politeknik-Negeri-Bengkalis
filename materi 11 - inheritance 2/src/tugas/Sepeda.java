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
public class Sepeda extends Kendaraan{
	protected int jmlSadel;
	protected int jmlGir;
	
	public void setJmlSadel(int jmlSadel){
		this.jmlSadel=jmlSadel;
	}
	public int getJmlSadel(){
		return jmlSadel;
	}
	public void setJmlGir(int jmlGir){
		this.jmlGir=jmlGir;
	}
	public int getJmlGir(){
		return jmlGir;
	}
}