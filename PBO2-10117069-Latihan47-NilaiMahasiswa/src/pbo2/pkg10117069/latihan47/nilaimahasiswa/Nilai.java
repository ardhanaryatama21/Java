/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Nilai Mahasiswa
 */

package pbo2.pkg10117069.latihan47.nilaimahasiswa;

public class Nilai {
    private double quiz;
    private double UTS;
    private double UAS;
    private String indeks;
    private String keterangan;

    public Nilai(double quiz,double UTS, double UAS) {
        this.quiz= quiz;
        this.UTS = UTS;
        this.UAS = UAS;
    }

    public double getQuiz() {
        return quiz;
    }

    public double getUTS() {
        return UTS;
    }

    public double getUAS() {
        return UAS;
    }
    
    public double NilaiAkhir(){
    return (quiz*0.2)+(UTS*0.3)+(UAS*0.5);
    }
    
    public String Index(double parNilaiAkhir){
        if(parNilaiAkhir >= 80 && parNilaiAkhir <= 100){
        indeks = "A";
        }else if(parNilaiAkhir >= 68 && parNilaiAkhir < 80){
        indeks = "B";
        }else if(parNilaiAkhir >= 56 && parNilaiAkhir < 68){
        indeks = "C";
        }else if(parNilaiAkhir >= 45 && parNilaiAkhir < 56){
        indeks = "D";
        }else if(parNilaiAkhir >= 0 && parNilaiAkhir < 45){
        indeks = "E";
        }
        return indeks;
    }
    
    public String Keterangan(String parIndeks){
        if(parIndeks.equals("A")){
            keterangan = "Sangat Baik";
        }else if(parIndeks.equals("B")){
            keterangan = "Baik";
        }else if(parIndeks.equals("C")){
            keterangan = "Cukup";
        }else if(parIndeks.equals("D")){
            keterangan = "Kurang";
        }else if(parIndeks.equals("E")){
            keterangan = "Sangat Kurang";
        }
    return keterangan;
    }
    
}
