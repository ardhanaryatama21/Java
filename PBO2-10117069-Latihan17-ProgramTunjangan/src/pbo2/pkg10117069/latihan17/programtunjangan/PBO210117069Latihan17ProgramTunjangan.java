/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan Program tunjangan
 */
package pbo2.pkg10117069.latihan17.programtunjangan;

import java.util.Scanner;

public class PBO210117069Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gajiPokok;
        double tunjangan;
        String status;
        double totalGaji;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("-------Program Tunjangan-------");
        System.out.print("Berapa gaji pokok anda perbulan ? : Rp. ");
        gajiPokok = scan.nextDouble();
        System.out.print("Status Anda ? (Menikah/Belum) ?   : ");
        status = scan.next();
        
        System.out.println("-------Hasil Perhitungan Gaji-------");
        System.out.println("Gaji Pokok/t/t: "+ gajiPokok);
        
        //tunjangan
        tunjangan = (status.equals("Menikah"))?0.35 * gajiPokok:0;
  
        System.out.println("Tunjangan : Rp. "+ tunjangan);
        //totalgaji
        totalGaji = gajiPokok + tunjangan;
        System.out.println("Total gaji : Rp. "+ totalGaji);
        System.out.println("Developed By : Muhammad Ardhan Aryatama");
    }
    
}
