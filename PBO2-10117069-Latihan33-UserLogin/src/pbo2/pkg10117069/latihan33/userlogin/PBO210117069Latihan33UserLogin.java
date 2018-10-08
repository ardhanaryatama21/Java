/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       User Login
     */
package pbo2.pkg10117069.latihan33.userlogin;

import java.util.Scanner;

public class PBO210117069Latihan33UserLogin {

    private static String usName;
    private static String passWord;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);

        System.out.print("Masukkan Username = ");
        usName = scn.next();

        System.out.print("Masukkan Password = ");
        passWord = scn.next();

        User cek = new User();
        cek.pengecekkanLogin(usName, passWord);
    }
    
}
