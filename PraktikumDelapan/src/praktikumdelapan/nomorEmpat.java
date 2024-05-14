package praktikumdelapan;

import java.util.Scanner;

public class nomorEmpat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan: ");
        String kata = input.nextLine();
        System.out.println("Masukan angka/huruf yang dicari: ");
        String cari = input.nextLine();
        String[] kataBaru = kata.split(" ");
        try {
            for (int i = 0; i < kataBaru.length; i++) {
                String ambil = kataBaru[i];
                kataBaru[i] = ambil.toUpperCase();
            }
        } catch (Exception e) {

        }
        for (int i = 0; i < kataBaru.length; i++) {
            for (int j = i + 1; j < kataBaru.length; j++) {
                if (kataBaru[i].charAt(0) > kataBaru[j].charAt(0)) {
                    String hasil = kataBaru[j];
                    kataBaru[j] = kataBaru[i];
                    kataBaru[i] = hasil;
                }
            }
        }
        System.out.println("Huruf setelah disorting :");
        for (String i : kataBaru) {
            System.out.print(i + " ");
        }
        System.out.println("");

        if (cari.matches("[a-z]")) {
            System.out.println(cari + " tidak ditemukan dalam array");
        } else {
            boolean cek = false;
            int i = 0;
            for (i = 0; i < kataBaru.length; i++) {
                if (cari.equals(kataBaru[i])) {
                    cek = true;
                    break;
                }
            }
            if (cek == true) {
                System.out.println(cari + " ditemukan pada indeks " + i + " dalam array");
            } else {
                System.out.println(cari + " tidak ditemukan dalam array");
            }
        }

    }
}