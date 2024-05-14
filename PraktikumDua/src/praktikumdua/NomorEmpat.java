package praktikumdua;

import java.util.Scanner;

public class NomorEmpat {
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu (){
        double r=0, t=0;
        boolean cek =false;
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("DAFTAR MENU \n1. Input nilai radius dan tinggi\n2. Hitung Luas dan Keliling Lingkaran"
                    + "\n3. Hitung Volume dan Luas Permukaan Tabung  \n4. Hitung Volume dan Luas Permukaan Kerucut\n5. Keluar");
            System.out.print("Pilih menu (1/2/3/4/5): ");
            int menu = input.nextInt();
            switch(menu){
                case 1:
                    System.out.print("Input radius: ");
                    r = input.nextDouble();
                    System.out.print("Input tinggi: ");
                    t = input.nextDouble();
                    cek = true;
                    break;
                case 2:
                    if(cek ==true){
                        double luasLing = luasLingkaran(r);
                        double kelLing = kelilingLingkaran(r);
                        System.out.println("Luas: "+luasLing);
                        System.out.println("Keliling: "+kelLing);
                    }else{
                        String hasil = ulang();
                        System.out.println(hasil);
                    }
                    break;
                case 3:
                    if(cek ==true){
                        double volumeTabung = volTabung(r, t);
                        double luasTabung = luasTabung(r, t);
                        System.out.println("Volume: "+volumeTabung);
                        System.out.println("luas Permukaan: "+luasTabung);
                    }else{
                        String hasil = ulang();
                        System.out.println(hasil);
                    }
                    break;
                case 4:
                    if(cek ==true){
                        double volumeKerucut = volKerucut(r, t);
                        double luasKerucut = luasKerucut(r, t);
                        System.out.println("Volume: "+volumeKerucut);
                        System.out.println("luas Permukaan: "+luasKerucut);
                    }else{
                        String hasil = ulang();
                        System.out.println(hasil);
                    }
                    break;
                default:
                    
            }
            if(menu==5){
                System.out.println("Terimakasih telah menggunakan menu ini");
                break;
            }
        }
    }
    
    public static Double luasLingkaran(double r){
        double hasil = 3.14 * r * r;
        return hasil;
    }
    public static Double kelilingLingkaran(double r){
        double hasil = 2 * 3.14 * r;
        return hasil;
    }
    public static Double volTabung(double r, double t){
        double hasil = 3.14 * r*r*t;
        return hasil;
    }
    public static Double luasTabung(double r, double t){
        double hasil = 2* 3.14*r*(r+t);
        return hasil;
    }
    public static Double volKerucut(double r, double t){
        double hasil = (3.14*r*r*t)/3;
        return hasil;
    }
    public static Double luasKerucut(double r, double t){
        double s = Math.sqrt((r*r)+(t*t));
        double hasil = (3.14*r*s)+(3.14*r*r);
        return hasil;
    }
    public static String ulang() {
        return "Masukan radius dan tinggi terlebih dulu";
    }
    
}

