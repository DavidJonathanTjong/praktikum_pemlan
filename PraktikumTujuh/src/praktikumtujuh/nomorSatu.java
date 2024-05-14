package praktikumtujuh;

import java.util.Scanner;

public class nomorSatu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan angka : ");
        int num = input.nextInt();
        printGabungan(num, 0);
    }

    public static void printGabungan(int num, int spasi) {
        if (num <= 0) {
            
        } else {
            printSpasi(spasi);
            printBintang(num);
            System.out.println("");
            printGabungan(num-1, spasi+1);
        }
    }
    
    public static void printSpasi(int spasi){
        for(int i=0; i<spasi; i++){
          System.out.print(" ");  
        }
    }
    public static void printBintang(int num){
        if(num <=0){
            
        }else{
           for(int i=0; i<num; i++){
               System.out.print("*");
           } 
        }      
    }
}