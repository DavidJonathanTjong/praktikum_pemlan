package praktikumsatu;

import java.util.Scanner;

public class nomorSatu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan angka pertama: ");
        int angka1 = input.nextInt();
        System.out.print("Masukan angka terakhir: ");
        int angka2 = input.nextInt();
        if (angka1 <= angka2) {
            while (true) {
                if (angka1 == 0) {
                    System.out.println(angka1 + " Nol");
                } else if (angka1 < 0 && angka1 % 2 == -1) {
                    System.out.println(angka1 + " Negatif Ganjil");
                } else if (angka1 < 0 && angka1 % 2 == 0) {
                    System.out.println(angka1 + " Negatif Genap");
                } else if (angka1 % 2 == 0) {
                    System.out.println(angka1 + " Genap");
                } else if (angka1 % 2 == 1) {
                    System.out.println(angka1 + " Ganjil");
                }
                if (angka1 == angka2) {
                    break;
                }
                angka1++;
            }
        }
        if (angka1 > angka2) {
            while (true) {
                if (angka1 == 0) {
                    System.out.println(angka1 + " Nol");
                } else if (angka1 < 0 && angka1 % 2 == -1) {
                    System.out.println(angka1 + " Negatif Ganjil");
                } else if (angka1 < 0 && angka1 % 2 == 0) {
                    System.out.println(angka1 + " Negatif Genap");
                } else if (angka1 % 2 == 0) {
                    System.out.println(angka1 + " Genap");
                } else if (angka1 % 2 == 1) {
                    System.out.println(angka1 + " Ganjil");
                }
                if (angka1 == angka2) {
                    break;
                }
                angka1--;
            }
        }
    }
}
