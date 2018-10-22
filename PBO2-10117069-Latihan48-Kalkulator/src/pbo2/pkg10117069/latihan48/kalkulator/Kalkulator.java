/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Kalkulator
 */
package pbo2.pkg10117069.latihan48.kalkulator;

public class Kalkulator {
    private double value1;
    private double value2;

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }
    
    public void setNameProject(){
        System.out.println("Project Calculator");
    }
    
    public void setNoteProject(String note){
        System.out.println("This project shown you how to manage method in java");
    }
    
    public double add(double val1, double val2){
    return value1+value2;
    }
    
    public double minus(double val1, double val2){
    return value1-value2;
    }
    
    public double multiplication(double val1, double val2){
    return value1*value2;
    }
    
    public double division(double val1, double val2){
    return value1/value2;
    }
}
