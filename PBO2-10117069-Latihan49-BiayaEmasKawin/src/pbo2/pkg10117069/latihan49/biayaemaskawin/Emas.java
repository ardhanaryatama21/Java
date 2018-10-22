/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Biaya Emas Kawin
 */
package pbo2.pkg10117069.latihan49.biayaemaskawin;

public class Emas {
    private int harga = 570000;
    private double berat;

    public Emas(double berat) {
        this.berat = berat;
    }

    public int getHarga() {
        return harga;
    }

    public double getBerat() {
        return berat;
    }
    
    public double hargaEmas(double parBerat, int parHarga){
        return berat*harga;
    }  
}
