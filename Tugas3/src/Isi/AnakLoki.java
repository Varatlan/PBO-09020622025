/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Isi;

/**
 *
 * @author RIGISEFA
 */
public class AnakLoki {
    private String banyakKaki;
    private String kekuatan;
    private String jenisKulit;
    private String tugas = " Adadeh ";
    /**
     * @return the banyakKaki
     */
    public String getBanyakKaki() {
        return banyakKaki;
    }
    /**
     * @param banyakKaki the banyakKaki to set
     */
    public void setBanyakKaki(String banyakKaki) {
        this.banyakKaki = banyakKaki;
    }
    /**
     * @return the kekuatan
     */
    public String getKekuatan() {
        return kekuatan;
    }
    /**
     * @param kekuatan the kekuatan to set
     */
    public void setKekuatan(String kekuatan) {
        this.kekuatan = kekuatan;
    }
    /**
     * @return the jenisKulit
     */
    public String getJenisKulit() {
        return jenisKulit;
    }
    /**
     * @return the tugas
     */
    public String getTugas() {
        return tugas;
    }
    /**
     * @param tugas the tugas to set
     */
    public void setTugas(String tugas) {
        this.tugas = tugas;
    }
    /**
     * @param jenisKulit the jenisKulit to set
     */
    public void setJenisKulit(String jenisKulit) {
        this.jenisKulit = jenisKulit;
    }
    public String tidur() {
        return "sedang tidur mimimimimi ";
    }
    public String tidur(String waktu) {
        return "sedang tidur mimimimimi " + "waktunya " + waktu;
    }
    public String tidur(int waktu) {
        return "sedang tidur mimimimimi " + "waktunya " + String.valueOf(waktu);
    }
    public String tidur(double waktu) {
        return "sedang tidur mimimimimi " + "waktunya " + String.valueOf(waktu);
    }
}
