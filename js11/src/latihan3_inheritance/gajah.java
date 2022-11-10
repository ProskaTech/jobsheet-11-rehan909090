/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3_inheritance;

/**
 *
 * @author HP
 */
public class gajah extends hewan{
    //meng-overwrite method pada class hewan
    public static void testClassMethod(){
        System.out.println("The Ckass Method in Hewan");
    }
    
    public static void testInstanceMethod(){
        System.out.println("The Instance Method in Gajah");
    }
    
    public static void main(String args[]){
        gajah mygajah = new gajah();
        hewan myhewan = mygajah;
        hewan.testClassMethod();
        myhewan.testInstanceMethod();
    }
}
