package praktikumenam;

import java.util.Scanner;

public class nomorEmpat {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner masukan = new Scanner(System.in);
        System.out.print("Jumlah mahasiswa: ");
        int org = input.nextInt();
        System.out.println("");
        String[] nama = new String[org];
        int[] nilai = new int[3 * org];;
        int a = 0, b = 1, c = 2;
        double[] rerata = new double [org];

        for (int i = 0; i < org; i++) {
            System.out.print("Nama Mhs " + (i+1) + " : ");
            String namaMhs = masukan.nextLine();
            nama[i] = namaMhs;
            System.out.print("Nilai mata kuliah 1 : ");
            int nilaiMatkul1 = input.nextInt();
            nilai[a] = nilaiMatkul1;
            System.out.print("Nilai mata kuliah 2 : ");
            int nilaiMatkul2 = input.nextInt();
            nilai[b] = nilaiMatkul2;
            System.out.print("Nilai mata kuliah 3 : ");
            int nilaiMatkul3 = input.nextInt();
            nilai[c] = nilaiMatkul3;
            a+=3;
            b+=3;
            c+=3;
        }
        
        int x = 0, y = 1, z = 2;
        for(int i=0; i<rerata.length;i++){
            rerata[i] = (double)(nilai[x]+nilai[y]+nilai[z])/3;
            x+=3;
            y+=3;
            z+=3;
        }
        
        System.out.println("|Nama\t|Matkul1\t|Matkul2\t|Matkul3\t|Rata-rata");
        int k = 0, l = 1, m = 2;
        for (int i = 0; i < org; i++) {
            System.out.printf("|"+nama[i]+"\t|"+nilai[k]+"\t\t|"+nilai[l]+"\t\t|"
                    +nilai[m]+"\t\t|%.2f%n", rerata[i]);
            k+=3;
            l+=3;
            m+=3;
        }

    }
}
