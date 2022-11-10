/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan5_encapsulation;

/**
 *
 * @author HP
 */
public class UjiBus {
    public static void main(String args[]){
        //membuat objek busMini dari kelas bus
        bus busMini = new bus();
        
        //memasukkan nilai jumlah penumpang dan
        //penumpang maksimal ke dalam obkel busMini
        busMini.penumpang = 5;
        busMini.maxPenumpang = 15;
        
        //memanggil method cetak pada kelas bus
        busMini.cetak();
        
        //menambahkan jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang + 5;
        //memanggil method cetak pada kelas bus
        busMini.cetak();
        
        //mengurangi jumlah penumpang pada bus Mini
        busMini.penumpang = busMini.penumpang - 2;
        //memanggil method cetak pada kelas bus
        busMini.cetak();
        
        //menambahkan jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang +8;
        busMini.cetak();
    }
}
