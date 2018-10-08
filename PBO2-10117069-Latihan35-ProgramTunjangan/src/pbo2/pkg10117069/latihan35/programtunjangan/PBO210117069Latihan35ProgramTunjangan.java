/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       tunjangan
 */
package pbo2.pkg10117069.latihan35.programtunjangan;

import java.util.Scanner;

public class PBO210117069Latihan35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Karyawan krw = new Karyawan();
        
        System.out.println("-------Program Tunjangan-------");
        System.out.print("Berapa gaji pokok anda perbulan ? : Rp. ");
        krw.gajiPokok = scan.nextDouble();
        System.out.print("Status Anda ? (Menikah/Belum) ?   : ");
        krw.status = scan.next();
        
        krw.tampilHasil(krw.status, krw.gajiPokok);
        System.out.println("Developed by : Muhammad Ardhan Aryatama");
    }
}
