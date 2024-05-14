package praktikumdua;

import java.util.Scanner;

public class NomorSatu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan sisi: ");
        int s = input.nextInt();
        menu(s);
    }

    public static void menu(int sisi) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        boolean hasil = false;
        while (true) {
            System.out.println("1. Luas");
            System.out.println("2. Volume");
            System.out.print("Pilih: ");
            int pil = input.nextInt();
            if (pil == 1) {
                luas(sisi);
            } else if (pil == 2) {
                volum(sisi);
            } else {

            }

            while (true) {
                System.out.print("Apakah ingin piih menu lagi(y/n)?: ");
                String kondisi = input2.nextLine();
                if (kondisi.equalsIgnoreCase("y")) {
                    break;
                } else {
                    hasil = true;
                    break;
                }
            }
            if (hasil == true) {
                break;
            }

        }

    }

    public static void volum(int sisi) {
        int hasil = sisi * sisi * sisi;
        System.out.println("Volume: " + hasil);
    }

    public static void luas(int sisi) {
        int hasil = 6 * sisi * sisi;
        System.out.println("Luas: " + hasil);
    }
}
