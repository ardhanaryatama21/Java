/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Energi Kinetik
 */
package pbo2.pkg10117069.latihan50.energikinetik;

public class EnergiKinetik {
    private double energiKinetik1;
    private double energiKinetik2;
    private double massa;
    private double kecepatan;

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    public double energiKinetik1(double m, double k){
        energiKinetik1 = 0.5 * m * (k * k);
        return energiKinetik1;
    }
    
    public double energiKinetik2(double m){
        energiKinetik2 = 0.5 * m * 0;
        return energiKinetik2;
    }
    public double usaha(){
        return energiKinetik1-energiKinetik2;
    }
}
