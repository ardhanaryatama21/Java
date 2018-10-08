/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       tunjangan
 */
package pbo2.pkg10117069.latihan35.programtunjangan;

public class Karyawan {
    public String status;
    public double gajiPokok;
    public double tunjangan;
    
    public double hitungTunjangan(String parStatus, double parGajiPokok){
    return tunjangan = (parStatus.equals("Menikah") ? 0.35 * parGajiPokok : 0);
    }
    public double hitungTotalGaji(double parGajiPokok, double parTunjangan){
    return tunjangan = parGajiPokok + parTunjangan;
    }
    
    public void tampilHasil(String parStatus, double parGajiPokok){
        System.out.println("-------Hasil Perhitungan Gaji-------");
        System.out.println("Gaji Pokok : " + gajiPokok);
        System.out.println("Tunjangan  : " + hitungTunjangan(parStatus,parGajiPokok));
        System.out.println("Total Gaji : " + hitungTotalGaji(parGajiPokok, tunjangan));
        
    }
}
