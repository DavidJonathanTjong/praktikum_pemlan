package praktikumenam;

import java.util.Scanner;

public class nomorDua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kolom: ");
        int n = input.nextInt();
        int[][] matriksA = new int [2][n]; 
        int[][] matriksB = new int [2][n]; 
        for (int i=0; i<2; i++){
            for(int j=0; j<n; j++){
                System.out.print("Matriks A baris "+(i+1)+" kolom "+(j+1)+" : ");
                int masukanA = input.nextInt();
                matriksA[i][j] = masukanA;
            }
        }
        System.out.println("");
        
        for (int i=0; i<2; i++){
            for(int j=0; j<n; j++){
                System.out.print("Matriks B baris "+(i+1)+" kolom "+(j+1)+" : ");
                int masukanB = input.nextInt();
                matriksB[i][j] = masukanB;
            }
        }
        System.out.println("");
        
        while(true){
            System.out.println("Menu");
            System.out.println("1. Operasi matriks");
            System.out.println("2. Lihat bentuk matriks");
            System.out.println("3. Exit");
            System.out.print("Pilih: ");
            int pil = input.nextInt();
            if(pil ==1){
                System.out.println("1. Penjumlahan\n2. Pengurangan");
                System.out.print("pilih: ");
                int pilmenu = input.nextInt();
                if(pilmenu == 1){
                    int[][] matriksBaru = new int [2][n];
                    System.out.println("Matriks A + Matriks B");
                    for(int i=0; i<2;i++){
                        for (int j=0; j<n; j++){
                            matriksBaru[i][j] = matriksA[i][j]+matriksB[i][j];
                        }
                    }
                    for(int i=0; i<2;i++){
                        System.out.print("|");
                        for (int j=0; j<n; j++){
                            System.out.print(matriksBaru[i][j]+" ");
                        }
                        System.out.println("|");
                    }
                    
                }else if(pilmenu == 2){
                    int[][] matriksBaru = new int [2][n];
                    System.out.println("Matriks A - Matriks B");
                    for(int i=0; i<2;i++){
                        for (int j=0; j<n; j++){
                            matriksBaru[i][j] = matriksA[i][j]-matriksB[i][j];
                        }
                    }
                    for(int i=0; i<2;i++){
                        System.out.print("|");
                        for (int j=0; j<n; j++){
                            System.out.print(matriksBaru[i][j]+" ");
                        }
                        System.out.println("|");
                    }
                }else{
                    System.out.println("menu tidak tersedia");
                }
            }else if(pil==2){
                System.out.println("\nBentuk Matriks A");
                for (int i=0; i<2; i++){
                    System.out.print("|");
                    for(int j=0; j<n; j++){
                        System.out.print(+matriksA[i][j]+" ");
                    }
                    System.out.println("|");
                }
                System.out.println("Bentuk Matriks B");
                for (int i=0; i<2; i++){
                    System.out.print("|");
                    for(int j=0; j<n; j++){
                        System.out.print(+matriksB[i][j]+" ");
                    }
                    System.out.println("|");
                }
                System.out.println("");
            }else{
                System.out.println("Terima Kasih");
                break;
            }
        }
    }
}
