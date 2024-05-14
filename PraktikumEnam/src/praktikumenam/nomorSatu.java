package praktikumenam;

import java.util.Scanner;

public class nomorSatu {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Matrix : ");
        int n = input.nextInt();
        int[][] matriks = new int [n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("Baris "+(i+1)+" kolom "+(j+1)+": ");
                int masukan = input.nextInt();
                matriks[i][j] = masukan;
            }
        }
        System.out.println("Bentuk Matriks");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(matriks[i][j]+" ");
            }
            System.out.println("");
        }
        
        int[] simpanKanan = new int[n];
        int diagonalKanan = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j){
                    diagonalKanan += matriks[i][j];
                    simpanKanan[i] = matriks[i][j];
                }
            }
        }
        System.out.print("Diagonal ke kanan = ");
        for(int i=0; i<simpanKanan.length;i++){
            System.out.print(simpanKanan[i]+" ");
        }
        System.out.println("");
        
        int[] simpanKiri = new int[n];
        int diagonalKiri = 0;
        for(int i= 0; i<n; i++){
            diagonalKiri += matriks[i][n-1-i];
            simpanKiri[i] = matriks[i][n-1-i];
        }
        System.out.print("Diagonal ke kiri = ");
        for(int i=0; i<simpanKiri.length;i++){
            System.out.print(simpanKiri[i]+" ");
        }
        System.out.println("");
        System.out.println("Hasil penjumlahan diagonal ke kanan = "+diagonalKanan);
        System.out.println("Hasil penjumlahan diagonal ke kiri = "+diagonalKiri);
        System.out.println("Total = "+(diagonalKanan + diagonalKiri));
    }
}
