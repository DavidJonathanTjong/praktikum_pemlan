package praktikumlima;

import java.util.Scanner;

public class nomorTiga {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Menu");
        System.out.println("1. Tambah");
        System.out.println("2. Kurang");
        System.out.print("Pilih --> ");
        int pil = input.nextInt();
        System.out.print("Panjang Array : ");
        int size = input.nextInt();
        
        int[] arrA = new int[size];
        int[] arrB = new int[size];
        int[] hasil = new int[size];
        
        System.out.println("");
        for(int i=0; i<arrA.length;i++){
            System.out.print("Array A ke-"+(i+1)+" : ");
            int masukA = input.nextInt();
            arrA[i] = masukA;
        }
        
        System.out.println("");
        for(int i=0; i<arrB.length;i++){
            System.out.print("Array B ke-"+(i+1)+" : ");
            int masukB = input.nextInt();
            arrB[i] = masukB;
        }
        System.out.println("\nHasil: ");
        
        if(pil==1){
            for(int i=0; i<arrA.length;i++){
                hasil[i] = arrA[i]+arrB[i];
                System.out.println("Array A ke-"+(i+1)+" : "+hasil[i]);
            }
        }else if(pil==2){
            for(int i=0; i<arrA.length;i++){
                hasil[i] = arrA[i]-arrB[i];
                System.out.println("Array A ke-"+(i+1)+" : "+hasil[i]);
            }
        }else{
            System.out.println("Menu tidak tersedia");
        }
        
        
    }
}
