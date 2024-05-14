package praktikumtujuh;

import java.util.Scanner;

public class nomorDua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("A: ");
        int a = input.nextInt();
        System.out.print("B: ");
        int b = input.nextInt();
        int hasil = hasilFPB(a, b);
        if (hasil == -1) {
            System.out.println("Kedua bilangan tidak boleh 0");
        } else if (hasil == -2) {
            System.out.println("Kedua bilangan harus positif");
        } else {
            System.out.println("FPB dari " + a + " dan " + b + " adalah " + hasil);
        }
    }

    public static int hasilFPB(int angka1, int angka2) {
        if (angka1 == 0 && angka2 == 0) {
            return -1;
        } else if (angka1 < 0 && angka2 < 0) {
            return -2;
        } else if (angka1 == 0) {
            return angka2;
        } else if (angka2 == 0) {
            return angka1;
        } else if(angka1<0){
            angka1 = angka1*-1;
            return hasilFPB(angka2 % angka1, angka1);
        } else {
            return hasilFPB(angka2 % angka1, angka1);
        }
    }
}
