package praktikumdelapan;

import java.util.Scanner;

public class nomorTiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan angka-angka: ");
        String nil = input.nextLine();
        String[] data = nil.split(" ");
        int[] arr = new int[data.length];
        try {
            for (int i = 0; i < data.length; i++) {
                arr[i] = Integer.parseInt(data[i]);
            }
            System.out.println("Angka yang ingin dicari indeksnya: ");
            String cari = input.nextLine();
            int target = Integer.parseInt(cari);
            
            System.out.println("Angka sebelum di sort: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("");
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        int numI = arr[i];
                        int numJ = arr[j];
                        arr[i] = numJ;
                        arr[j] = numI;
                    }
                }
            }
            System.out.println("Angka sesudah di sort: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("");
            
            int tengah = 0;
            int batasAtas = 0;
            int batasBawah = arr.length - 1;
            boolean cek = false;
            while (batasAtas <= batasBawah && cek == false) {
                tengah = (batasAtas + batasBawah) / 2;
                if (arr[tengah] == target) {
                    cek = true;
                } else if (arr[tengah] < target) {
                    batasAtas = tengah + 1;
                } else {
                    batasBawah = tengah - 1;
                }
            }
            if (cek == true) {
                System.out.println("Angka " + target + " yang anda cari berada di indeks ke " + tengah);
            } else {
                System.out.println("Angka " + target + " tidak ditemukan");
            }

        } catch (Exception E) {
            System.out.println("ERROR!");
        }

    }
}
