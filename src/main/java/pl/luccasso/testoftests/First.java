/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.luccasso.testoftests;

import com.google.inject.AbstractModule;

/**
 *
 * @author piko
 */
public class First {
    
    int kaszana;
    
    public First(){
        System.out.println("nicosc");
    }
    
    public First(String s){
        System.out.println(s);
    }
    
    public static void main(String[] args) {
       
        int i = 3;
        var f = new First();
    }
    
}
