/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Isi;

/**
 *
 * @author RIGISEFA
 */
public class Ular extends AnakLoki implements UlarMidgard, GigitEkor, Bertaring{
    @Override
    public void besar(){
      System.out.println("Saya Besar");  
    };
    @Override
    public void ragnarok(){
      System.out.println("Saya Gelut ama Thor");  
    };
   @Override
    public void berbahaya(){
      System.out.println("Saya Berbahaya");  
    };
    public void setTugas() {
        super.setTugas("Ular Midgard");
    }
    public Ular(){
        this.setTugas();
    }
}
