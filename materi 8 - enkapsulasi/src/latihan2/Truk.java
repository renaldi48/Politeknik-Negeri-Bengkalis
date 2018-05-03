/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author PC-RPL-04
 */
public class Truk {
    double muatan=0;
    double muatanmaks;
    
    public Truk (double beratmaks){
        muatanmaks=beratmaks;
    }
    
    public double getMuatan(){
        return muatan;
    }
    
    public double getMuatanMaks(){
        return muatanmaks;
    }
    
    public boolean tambahMuatan(double berat){
        muatan+=berat;
        if(muatan>muatanmaks){
            muatan-=berat;
            return false;
        }else
            return true;
    }
    
    public double newtsToKilo(double berat){
        berat=muatanmaks/9.8;
        return muatanmaks;
    }
    
    public double kiloToNewst(double berat){
        berat=muatan;
        muatan=berat*9.8;
        return muatan;
    }
}
