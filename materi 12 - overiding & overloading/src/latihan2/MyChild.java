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
public class MyChild extends MyParent{
    int z;
    
    MyChild (int x, int y, int z){
        super(x,y);
        this.z = z;
    }
    
    public int addMe(int x, int y, int z){
        return this.x + x + this.y + y + this.z + z;
    }
    
    public int addMe(MyChild myChi){
        return addMe(myChi.x, myChi.y, myChi.z);
    }
    
    public int addMe(int x, int y){
        return this.x + x + this.y + y;
    }
    
}
