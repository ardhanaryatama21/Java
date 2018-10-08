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

public class User {
    
    public String nama;
    Scanner scan = new Scanner(System.in);
    
    public void inputNama(){
        System.out.print("NAMA KAMU : ");
        nama = scan.next();
    }
}
