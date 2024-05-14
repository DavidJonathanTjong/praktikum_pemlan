package praktikumdelapan;

import java.util.Scanner;

public class nomorSatu {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukan jumlah data: ");
        int jum = input.nextInt();
        int[] arr = new int[jum];
        for(int i=0; i<arr.length; i++){
            System.out.print("Masukan angka ke-"+(i+1)+": ");
            arr[i] = input.nextInt();
        }
        int x = arr.length/2;
        for(int i=0; i<x; i++){
            int max = arr[i];
            int posisi = i;
            for(int j= i+1; j<x; j++){
                if(arr[j]>max){
                    max = arr[j];
                    posisi = j;
                }
            }
            if(i != posisi){
                int nil = arr[i];
                arr[i] = arr[posisi];
                arr[posisi] = nil;
            }
        }
        
        for(int i=x; i<arr.length; i++){
            int min = arr[i];
            int posisi = i;
            for(int j= i+1; j<arr.length; j++){
                if(arr[j]<min){
                    min = arr[j];
                    posisi = j;
                }
            }
            if(i != posisi){
                int nil = arr[i];
                arr[i] = arr[posisi];
                arr[posisi] = nil;
            }
        }
        System.out.print("Hasil Pengurutan : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}