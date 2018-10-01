/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Ejaan Nama
 */
package pbo2.pkg10117069.latihan25.ejaannama;

import java.util.Scanner;

public class PBO210117069Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama;
        int panjangNama;
        char huruf;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        nama = scan.next();
        panjangNama = nama.length();
        System.out.println("Ejaan untuk " + "\"" + nama + "\" adalah : ");
        
        for (int i = 0; i < panjangNama; i++){
        System.out.println("Huruf ke-" + (i+1) + " : " + nama.charAt(i));
        }
    }
    
}
