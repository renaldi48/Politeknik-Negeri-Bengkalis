/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan;

/**
 *
 * @author PC-RPL-04
 */
import java.awt.Point;
public class Segiempat {
    int x1 = 0;
    int y1 = 0;
    int x2 = 0;
    int y2 = 0;
    
    public void buatSegiempat (int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    public void buatSegiempat (Point topLeft, Point bottomRight){
        x1 = topLeft.x;
        y1 = topLeft.y;
        x2 = bottomRight.x;
        y2 = bottomRight.y;
    }
    
    public void buatSegiempat(Point topLeft, int w, int h){
        x1 = topLeft.x;
        y1 = topLeft.y;
        x2 = (x1 + w);
        y2 = (y1 + h);
    }
    
    void cetakSegiempat(){
        System.out.print("Segiempat : <" + x1 + ", " + y1);
        System.out.println(", " + x2 + ", " + y2 + ">");
    }
    
    public static void main(String[] argiments) {
        Segiempat rect = new Segiempat();
        System.out.println("Buat segiempat dengan koordinat (25,25) dan (20,50)");
        
        //Syntax untuk membuat segi empat
        rect.buatSegiempat(25, 25, 50, 50);
        //Syntax untuk menampilkan segi empat yang telah dideklarasikan
        rect.cetakSegiempat();
        //Syntax Spasi
        System.out.println();
        
        
        System.out.println("Buat segiempat dengan point (10,10) dan point (20,20) :");
        //Syntax untuk membuat segi empat baru, memakai Syntax New dengan format dibaawh ini
        rect.buatSegiempat(new Point(10,10), new Point(20,20));
        //Syntax untuk menampilkan segi empat yang telah dideklarasikan
        rect.cetakSegiempat();
        System.out.println();
        //Syntax Spasi
        
        
        System.out.print("buat segitempat dengan 1 point (10,10), koordinat (50,50)");
        //Sintax ke 3 untuk membuat segi empat baru dengan koordinat
        rect.buatSegiempat(new Point(10,10), 50, 50);
        //Saya menambahkan Syntax spasi ini agar agar tampilan lebih bagus
        System.out.println();
        //Syntax print atau menampilkan dari coding diatas.
        rect.cetakSegiempat();

    }
}
