package praktikumlima;

import java.util.Scanner;

public class nomorDua {

    public static void main(String[] args) {
        int max = 99999;
        Scanner input = new Scanner(System.in);
        System.out.print("Panjang Array: ");
        int size = input.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Array indeks ke-" + i + " : " + input.nextLine());
            int masukan = input.nextInt();
            arr[i] = masukan;
            if (arr[i] < max) {
                max = arr[i];
            }

        }
        for (int j = 0; j < arr.length; j++) {
            if (max == arr[j]) {
                System.out.println("Nilai mininum terdapat pada indeks ke-" + j + " dan bernilai " + arr[j]);
                break;
            }
        }

    }
}