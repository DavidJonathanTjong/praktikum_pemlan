package praktikumdelapan;

import java.util.Scanner;

public class nomorDua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        String kata = input.nextLine();
        String kataBaru =kata.replaceAll("[\\s+]", ""); // regex s artinya karakter spasi
        int size = kataBaru.length();
        byte[] arr = kataBaru.getBytes();
        for (int i = 0; i <size ; i++) {
            for (int j = i+1; j < size; j++) {
                if(arr[i]>arr[j]){
                    byte punyaI = arr[i];
                    byte punyaJ = arr[j];
                    arr[i] = punyaJ;
                    arr[j] = punyaI;
                }
            }
        }
        System.out.print("Output: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print((char)arr[i]);;
        }
        System.out.println("");
    }
}