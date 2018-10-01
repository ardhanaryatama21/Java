/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       perhitungan lingkaran
 */
package pbo2.pkg10117069.latihan22.perhitunganlingkaran;

import java.text.DecimalFormat;
import java.util.Scanner;


public class PBO210117069Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String d;
        double diameter;
        double jariJari;
        double luas;
        double keliling;
        
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".##");
       
        System.out.println("-------Perhitungan Lingkaran-------");
        
        do{
        System.out.print("Masukkan nilai diameter lingkaran : ");
        d = scan.nextLine();
        System.out.println((!d.matches("[0-9]*"))
                ? "Nilai Diameter Tidak Sesuai":"");
        
        } while(!d.matches("[0-9]*"));
        
        
        System.out.println("--------Hasil Perhitungan--------");
        diameter = Double.parseDouble(d);
        
        jariJari = diameter/2;
        System.out.printf("Jari-jari Lingkaran = %.0f cm %n", jariJari);
        luas = Math.PI*jariJari*jariJari;
        System.out.printf("Luas Lingkaran = %.2f cm %n", luas);
        keliling = 2*Math.PI*jariJari;
        System.out.printf("Keliling Lingkaran = %.2f cm %n", keliling);
    }
    
}
