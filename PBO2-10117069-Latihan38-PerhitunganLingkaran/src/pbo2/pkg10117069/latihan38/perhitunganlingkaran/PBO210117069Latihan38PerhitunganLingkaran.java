/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       perhitungan lingkaran
 */
package pbo2.pkg10117069.latihan38.perhitunganlingkaran;

public class PBO210117069Latihan38PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lingkaran lkrn = new Lingkaran();
        System.out.println("-----Perhitungan Lingkaran-----");
        lkrn.validasiInput();
        lkrn.hasilPerhitungan(lkrn.diameter);
    }
    
}
