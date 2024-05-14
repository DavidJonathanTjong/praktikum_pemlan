package praktikumtujuh;

import java.util.Scanner;

public class nomorTiga {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("A: ");
            int num = input.nextInt();
            String nilai = Integer.toString(num);
            urutkanAngka(nilai);
            System.out.println("");
        } catch (Exception e) {
            System.out.println("Masukan angka saja");
        }
    }
 
    public static void urutkanAngka(String num) {
        String[] simpan = num.split("");
        cetakAngka(simpan, simpan.length - 1);
    }

    public static void cetakAngka(String[] angka, int nilaiMax) {
        if (nilaiMax >= 0) {
            String hasil = angka[nilaiMax];
            System.out.print(hasil);
            cetakAngka(angka, nilaiMax - 1);
        }
    }
}