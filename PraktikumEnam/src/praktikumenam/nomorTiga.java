package praktikumenam;

import java.util.Scanner;

public class nomorTiga {
    public static void main(String[] args) {
        int max = -999999;
        int min = 999999;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan baris matriks: ");
        int baris = input.nextInt();
        System.out.print("Masukan kolom matriks: ");
        int kolom = input.nextInt();
        int[][] matriks = new int [baris][kolom];
        System.out.println("Masukan elemen array");
        for(int i=0;i<baris;i++){
            for(int j=0; j<kolom; j++){
                System.out.print("Masukan Nilai baris "+(i+1)+" kolom "+(j+1)+" : ");
                int masukan = input.nextInt();
                matriks[i][j] = masukan;
                if(masukan>max){
                    max = masukan;
                }
                if(masukan<min){
                    min = masukan;
                }
            }
        }
        System.out.println("Nilai maksimum : "+max);
        System.out.println("Nilai minimum  : "+min);
    }
}
