package praktikumtujuh;

import java.util.Scanner;

public class nomorEmpat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Panjang Array: ");
        int panjang = input.nextInt();
        int[] arrFibo = new int[panjang];
        arrFibo = buatArrayFibonaci(arrFibo);
        for (int i = 0; i < arrFibo.length; i++) {
            if(i==(arrFibo.length-1)){
                System.out.print(arrFibo[i]);
            }else{
                System.out.print(arrFibo[i] + ", ");
            }
        }
        System.out.println("");
    }
    public static int[] buatArrayFibonaci(int[] arrFibo) {
        for (int i = 0; i < arrFibo.length; i++) {
            arrFibo[i] = cetakFibo(i);
        }
        return arrFibo;
    }
    public static int cetakFibo(int n) {
        if (n == 0) {
            return 0;
        }else if(n<=2){
            return 1;
        }
        else {
            return cetakFibo(n - 1) + cetakFibo(n - 2);
        }
    }
}
