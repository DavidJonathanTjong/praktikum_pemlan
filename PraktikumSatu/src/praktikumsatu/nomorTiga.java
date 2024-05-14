package praktikumsatu;

import java.util.Scanner;

public class nomorTiga {

    public static void main(String[] args) {
        int max = -9999;
        int min = 9999;
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        int a = 0;
        do {
            System.out.print("Input angka: ");
            int inputan = input.nextInt();
            if (inputan < min) {
                min = inputan;
            }
            if (inputan > max) {
                max = inputan;
            }
            System.out.print("Apakah ingin lanjut menginput? (ya/tidak): ");
            String kondisi = input2.nextLine();
            if (kondisi.equals("ya")) {
            } else if (kondisi.equals("tidak")) {
                break;
            } else {
                break;
            }
        } while (a == 0);
        System.out.println("nilai terkecil: " + min);
        System.out.println("nilai terbesar: " + max);
    }
}
