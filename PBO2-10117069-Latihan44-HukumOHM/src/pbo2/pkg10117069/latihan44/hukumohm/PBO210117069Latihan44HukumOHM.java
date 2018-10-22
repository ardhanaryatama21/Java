/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Hukum OHM
 */
package pbo2.pkg10117069.latihan44.hukumohm;

public class PBO210117069Latihan44HukumOHM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Baterai btr = new Baterai();
        System.out.println("Kuat Arus : " + btr.getKuatArus() + " ampere");
        System.out.println("Hambatan : " + btr.getHambatan() + " ohm");
        System.out.println("Hasil Tegangan : " + btr.hitungTegangan() + " volt");
    }
    
}
