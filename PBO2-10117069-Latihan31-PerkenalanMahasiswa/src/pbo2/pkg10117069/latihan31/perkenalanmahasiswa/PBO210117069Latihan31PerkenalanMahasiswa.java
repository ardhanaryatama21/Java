/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Perkenalan Mahasiswa
     */
package pbo2.pkg10117069.latihan31.perkenalanmahasiswa;

public class PBO210117069Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = "10110269";
        mhs1.nama = "Rizki Adam Kurniawan";
        mhs1.perkenalkanDiri(mhs1.nim,mhs1.nama);

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = "10110270";
        mhs2.nama = "Indra Tiola";
        mhs2.perkenalkanDiri(mhs2.nim,mhs2.nama);

        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = "10110271";
        mhs3.nama = "Robi Tanzil Ganefi";
        mhs3.perkenalkanDiri(mhs3.nim,mhs3.nama);

        Mahasiswa mhs4 = new Mahasiswa();
        mhs4.nim = "10110272";
        mhs4.nama = "Muhammad Nur Awaluddin";
        mhs4.perkenalkanDiri(mhs4.nim,mhs4.nama);
    }
    
}
