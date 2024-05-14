package praktikumlima;

import java.util.Scanner;

public class nomorSatu {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Panjang Array: ");
        int size = input.nextInt();
        System.out.print("Kelipatan : ");
        int kelipatan = input.nextInt();
        int[] arr = new int[size];
        int total = 0;
        
        for(int i=0; i<arr.length; i++){
            arr[i] = (i+1)*kelipatan;
            total += arr[i]; 
            }
        
        for(int i=0; i<arr.length; i++){
            System.out.println("Kelipatan "+kelipatan+" ke-"+(i+1)+" : "+arr[i]);
        }
        
        System.out.println("Total isi Array: "+total);
    }
}