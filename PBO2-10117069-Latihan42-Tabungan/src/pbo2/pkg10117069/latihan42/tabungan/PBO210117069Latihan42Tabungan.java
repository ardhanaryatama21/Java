/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Tabungan
 */
package pbo2.pkg10117069.latihan42.tabungan;

import java.util.Scanner;

public class PBO210117069Latihan42Tabungan {

    public static void main(String[] args) {
        // TODO code application logic here
        int jumlah;
        Scanner input = new Scanner(System.in);
        
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan Saldo Awal : ");
        Tabungan tbn = new Tabungan(input.nextInt());
        System.out.print("Jumlah Uang Yang Diambil : ");
        jumlah = input.nextInt();
        System.out.println("Saldo Anda Sekarang : "+tbn.ambilUang(jumlah));
    }
    
}
