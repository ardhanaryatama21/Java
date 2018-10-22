/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Massa Jenis
 */
package pbo2.pkg10117069.latihan41.massajenis;

public class Kubus {
    private int sisi;
    private int massa;
    private int hitungVolume;
    private int hitungMassaJenis;
    
    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }
    
    public int hitungVolume(int parSisi){
        hitungVolume = sisi * sisi * sisi;
        return hitungVolume;
    }
    
    public int hitungMassaJenis(int parMassa,int volume){
        hitungMassaJenis = massa/hitungVolume;
        return hitungMassaJenis;
    }
}
