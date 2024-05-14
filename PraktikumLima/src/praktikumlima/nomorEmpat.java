package praktikumlima;

import java.util.Scanner;
import java.util.Arrays;

public class nomorEmpat {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Panjang array: ");
        int size = input.nextInt();
        System.out.println(size + " bilangan fibbonaci :");
        int[] arr = new int[size];
        int x = 0;
        int y = 1;

        if(size == 1) {
            System.out.println("0");
        } else {
            arr[0] = 0;
            arr[1] = 1;
            for (int i = 2; i < arr.length; i++) {
                int masuk = x + y;
                arr[i] = masuk;
                x = y;
                y = masuk;
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}