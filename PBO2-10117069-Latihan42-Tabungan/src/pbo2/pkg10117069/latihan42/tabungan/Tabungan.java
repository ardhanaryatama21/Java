/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Tabungan
 */
package pbo2.pkg10117069.latihan42.tabungan;

public class Tabungan {
    private final int saldo;
    
    public Tabungan (int saldo){
    this.saldo = saldo;
    }
    
    public int ambilUang(int jumlah){
    return saldo - jumlah;
    }
}
