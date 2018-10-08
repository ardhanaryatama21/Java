/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Warna Kepribadian
     */
package pbo2.pkg10117069.latihan40.warnakepribadian;

import java.util.Scanner;

public class PBO210117069Latihan40WarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Warna wrn = new Warna();
        User use = new User();
        Scanner scan = new Scanner(System.in);
        
        wrn.menampilkanTemplate();
        wrn.pilihanWarnaFavorit();
        use.inputNama();
        
        System.out.println("\n====HASIL TEST KEPRIBADIAN " + use.nama.toUpperCase() + "====");
        wrn.tesKepribadian(wrn.namaWarna, use.nama);
        
    }
    
}
