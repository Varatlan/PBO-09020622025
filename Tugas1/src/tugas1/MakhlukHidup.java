/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;

/**
 *
 * @author RIGISEFA
 */
public class MakhlukHidup {
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getBernapas() {
        return bernapas;
    }
    public void setBernapas(String bernapas) {
        this.bernapas = bernapas;
    }
    public String getMakanan() {
        return makanan;
    }
    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }
    private String nama;
    private String bernapas;
    private String makanan;
    private String habitat;
    protected String berkembang(){
    return"saya berkembang";
    };
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
