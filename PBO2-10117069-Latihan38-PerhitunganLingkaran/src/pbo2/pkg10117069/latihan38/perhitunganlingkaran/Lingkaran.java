/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       perhitungan lingkaran
 */
package pbo2.pkg10117069.latihan38.perhitunganlingkaran;

import java.util.Scanner;

public class Lingkaran {
    public double diameter;
    public double jarijari;
    Scanner scan = new Scanner(System.in);
    
    public void validasiInput(){
    String d;
    do {
        System.out.print("Masukkan nilai diameter lingkaran : ");
        d = scan.nextLine();
        System.out.println((!d.matches("[0-9]*")) ? "Nilai Diameter Tidak Sesuai" : " ");
    }while (!d.matches("[0-9]*"));
    diameter = Double.parseDouble(d);
    }
    public double hitungJariJari(double parDiameter){
    return parDiameter/2;
    }
    public double hitungLuas(double parJariJari){
    return Math.PI * parJariJari * parJariJari;
    }
    public double hitungKeliling(double parJariJari){
    return 2*Math.PI * parJariJari;
    }
    public void hasilPerhitungan(double parDiameter){
        System.out.println("-----Hasil Perhitungan-----");
        System.out.printf("Jari-jari Lingkaran %.2f cm %n", hitungJariJari(parDiameter));
        System.out.printf("Luas Lingkaran %.2f cm %n", hitungLuas(hitungJariJari(parDiameter)));
        System.out.printf("Keliling Lingkaran %.2f cm %n",hitungKeliling(hitungJariJari(parDiameter)));
    }
}
