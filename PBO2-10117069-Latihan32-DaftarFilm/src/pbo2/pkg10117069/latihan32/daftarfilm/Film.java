/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Daftar Film
     */
package pbo2.pkg10117069.latihan32.daftarfilm;

public class Film {
    
    public String filmName;
    public String filmGenre;
    public double filmRating;
    public int filmDuration;

    public void nowPlaying(String parJudul, String parGenre, double parRating, int parDuration){
        System.out.println("Judul Film  : "+parJudul);
        System.out.println("Genre Film  : "+parGenre);
        System.out.println("Rating Film : "+parRating);
        System.out.println("Duration Film : "+parDuration+" menit\n");
    }
}
