/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Run;

import Isi.AnakLoki;
import Isi.Serigala;
import Isi.Ratu;
import Isi.Ular;
/**
 *
 * @author RIGISEFA
 */
public class Lari {
    public static void main(String[] args) {
        Serigala Fenrir = new Serigala();
        System.out.println("Fenrir sang " + Fenrir.getTugas());
        System.out.println("Fenrir " + Fenrir.tidur(6.00));
        System.out.println("");
        System.out.println("");
        Ratu Hel = new Ratu();
        System.out.println("Hel sang " + Hel.getTugas());
        System.out.println("Hel " + Hel.tidur(00.00));
        System.out.println("");
        System.out.println("");
        Ular Jormungand = new Ular();
        System.out.println("Jormungand sang " + Jormungand.getTugas());
        System.out.println("Jormungand " + Jormungand.tidur(24.00));
        Jormungand.besar();
        Jormungand.ragnarok();
        Jormungand.berbahaya();
        System.out.println("");
        System.out.println("");
        AnakLoki o = new AnakLoki();
        System.out.println("o orang " + o.getTugas());
        System.out.println("o orang " + o.tidur());
    }
}
