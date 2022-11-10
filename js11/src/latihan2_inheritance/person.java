/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2_inheritance;

/**
 *
 * @author HP
 */
public class person {
    protected String name;
    protected int age;
    
    public person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public void info(){
        System.out.println("Nama : " + this.name);
        System.out.println("Usia : " + this.age);
    }
}
