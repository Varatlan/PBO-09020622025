/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author RIGISEFA
 */
public class Singa {
    public static void main(String[] args) {
    Darat Singa = new Darat("Singa");
    Singa.setNama("Singa");
    Singa.setBernapas("Paru paru");
    Singa.setMakanan("Daging");
    Singa.setHabitat("Darat");
    System.out.println("Nama makhluk hidup " + Singa.getNama());
    System.out.println("alat pernapasan " + Singa.getBernapas());
    System.out.println("memakan " + Singa.getMakanan());
    System.out.println("Tinggal di " + Singa.getHabitat());
    System.out.println(Singa.berkembang());
    }
}
