package praktikumdua;

import java.util.Scanner;

public class NomorTiga {
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan kelipatan angka yang dicari: ");
        int angka = input.nextInt();
        System.out.print("Masukan rentang angka pertama: ");
        int angka1 = input.nextInt();
        System.out.print("Masukan rentang angka terakhir: ");
        int angka2 = input.nextInt();
        String kel =kelipatan(angka, angka1, angka2);
        System.out.println(kel);
        
        
    }
    public static String kelipatan(int nilai, int nilai1, int nilai2){
        String hasil = "";
        if (nilai1 <= nilai2) {
            for(int i=nilai1; i<=nilai2; i++){
                if(i%nilai ==0){
                    hasil += i+" ";
                }
            }
        }
        if(nilai1>nilai2){
            for(int i=nilai1; i>=nilai2; i--){
                if(i%nilai==0){
                    hasil += i+" ";
                }
            }
        }
        return hasil;
    }   
}

