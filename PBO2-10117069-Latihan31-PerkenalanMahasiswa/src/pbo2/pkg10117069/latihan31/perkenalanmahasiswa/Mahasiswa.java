/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Perkenalan Mahasiswa
     */
package pbo2.pkg10117069.latihan31.perkenalanmahasiswa;

public class Mahasiswa {
    public String nim;
    public String nama;

    public void perkenalkanDiri(String parNim, String parNama) {
        System.out.println("Hallo Everyone");
        System.out.println("My NIM is " + parNim);
        System.out.println("My Name is " + parNama + "\n");
    }
}
