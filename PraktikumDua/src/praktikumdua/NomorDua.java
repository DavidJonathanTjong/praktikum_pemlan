package praktikumdua;

import java.util.Scanner;

public class NomorDua {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilihan menu");
        System.out.println("1. Pertambahan");
        System.out.println("2. Pengurangan");
        System.out.print("Pilih: ");
        int pil = input.nextInt();
        if (pil == 1){
            System.out.print("input angka pertama: ");
            int a = input.nextInt();
            System.out.print("input angka kedua: ");
            int b = input.nextInt();
            int total1 = tambah(a,b);
            System.out.println("Hasil: "+total1);
        } else if (pil == 2) {
            System.out.print("input angka pertama: ");
            int c = input.nextInt();
            System.out.print("input angka kedua: ");          
            int d = input.nextInt();
            int total2 =kurang(c,d);
            System.out.println("Hasil: "+total2);
        } else {

        }
    }
    
    public static int tambah(int angka1, int angka2){
        int hasil = angka1 + angka2;
        return hasil;
    }
    
    public static int kurang(int angka1, int angka2){
        int hasil = angka1 - angka2;
        return hasil;
    }    
}
