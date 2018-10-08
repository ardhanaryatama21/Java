/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Target saldo tabungan
 */
package pbo2.pkg10117069.latihan36.targetsaldotabungan;

public class Tabungan {
    
    public int saldo;
    public int bunga;
    
    public double hitungBungaTabungan(int parSaldo, int parBunga){
    return parSaldo * parBunga / 100;
    }
    
    public void hitungLamaSaldoTarget(int parSaldo , int parSaldoTarget){
    int i = 1;
    
    while (parSaldo <= parSaldoTarget){
    hitungBungaTabungan(parSaldo,bunga);
    parSaldo += hitungBungaTabungan (parSaldo, bunga);
    
    String mataUang = String.format("Rp.%,3d", parSaldo).replaceAll(",",".");
        System.out.printf("Saldo dibulan ke-" + i + " " +"%s%n", mataUang);
        i++;
    }
    }
}
