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
public class Taksi extends Mobil{
	protected int tarifAwal;
	protected int tarifPerKm;
	public void setTarifAwal(int tarifAwal){
		this.tarifAwal=tarifAwal;
	}
	public int getTarifAwal(){
		return tarifAwal;
	}
	public void setTarifPerKm(int tarifPerKm){
		this.tarifPerKm=tarifPerKm;
	}
	public int getTarifPerKm(){
		return tarifPerKm;
	}
	
}