/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author PC-RPL-04
 */
public class Truk1 {

    public double muatan;
    public double muatanmaks;

    public Truk1(double beratmaks) {
        muatanmaks = beratmaks;
    }

    public double getMuatan() {
        return muatan;
    }

    public double getMuatanMaks() {
        return muatanmaks;
    }

    public void tambahMuatan(double berat) {
        muatan += berat;
        if (muatan > muatanmaks) {
            muatan -= berat;
        }
    }
}
