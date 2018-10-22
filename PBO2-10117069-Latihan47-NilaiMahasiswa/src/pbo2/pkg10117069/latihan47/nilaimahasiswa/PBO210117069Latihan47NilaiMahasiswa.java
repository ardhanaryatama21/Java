/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Nilai Mahasiswa
 */

package pbo2.pkg10117069.latihan47.nilaimahasiswa;

public class PBO210117069Latihan47NilaiMahasiswa {

    public static void main(String[] args) {
        // TODO code application logic here
        Nilai nlmhs = new Nilai(75,45,34);
        System.out.println("QUIZ : "+ nlmhs.getQuiz());
        System.out.println("UTS : "+ nlmhs.getUTS());
        System.out.println("UAS : " + nlmhs.getUAS() + "\n");
        System.out.println("Nilai Akhir : " + nlmhs.NilaiAkhir() + "\n");
        System.out.println("Indeks : " + nlmhs.Index(nlmhs.NilaiAkhir()));
        System.out.println("Keterangan : " + nlmhs.Keterangan(nlmhs.Index(nlmhs.NilaiAkhir())) + "\n");
        
        Nilai nlmhs2 = new Nilai(60,80,75);
        System.out.println("QUIZ : "+ nlmhs2.getQuiz());
        System.out.println("UTS : "+ nlmhs2.getUTS());
        System.out.println("UAS : " + nlmhs2.getUAS() + "\n");
        System.out.println("Nilai Akhir : " + nlmhs2.NilaiAkhir() + "\n");
        System.out.println("Indeks : " + nlmhs2.Index(nlmhs2.NilaiAkhir()));
        System.out.println("Keterangan : " + nlmhs2.Keterangan(nlmhs2.Index(nlmhs2.NilaiAkhir())) + "\n");
        
        Nilai nlmhs3 = new Nilai(30,80,40);
        System.out.println("QUIZ : "+ nlmhs3.getQuiz());
        System.out.println("UTS : "+ nlmhs3.getUTS());
        System.out.println("UAS : " + nlmhs3.getUAS() + "\n");
        System.out.println("Nilai Akhir : " + nlmhs3.NilaiAkhir() + "\n");
        System.out.println("Indeks : " + nlmhs3.Index(nlmhs3.NilaiAkhir()));
        System.out.println("Keterangan : " + nlmhs3.Keterangan(nlmhs3.Index(nlmhs3.NilaiAkhir())) + "\n");
    }
    
}
