
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer pilih,n;
        do{
            System.out.println("==========================================");
            System.out.println("Menghitung Luas dan Keliling Bangun Datar");
            System.out.println("------------------------------------------");
            System.out.println("1. Persegi Panjang");
            System.out.println("2. Lingkaran");
            System.out.println("3. Segitiga");
            System.out.println("0. Keluar");
            System.out.println("==========================================");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            if(pilih==1){
                n=pilihan();
                luasPersegiPanjang(n);
            }else if(pilih==2){
                n=pilihan();
                luasLingkaran(n);
            }else if(pilih==3){
                n=pilihan();
                luasSegitiga(n);
            }
        }while(pilih!=0);
    }
    static int pilihan(){
        Scanner input = new Scanner(System.in);
        System.out.println("1. Luas ");
        System.out.println("2. Keliling");
        System.out.print("Pilih: ");
        Integer plh = input.nextInt();
        return plh;
    }
    static void luasPersegiPanjang(int n){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang: ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar  : ");
        double lebar = input.nextDouble();
        if(n==1){
            double luas = panjang*lebar;
            System.out.println("Luas persegi panjang: "+luas);
        }else{
            double keliling = (2*panjang)+(2*lebar);
            System.out.println("Keliling persegi panjang: "+keliling);
        }
    }
    static void luasLingkaran(int n){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari: ");
        double jari = input.nextDouble();
        if(n==1){
            double luas=3.14*jari*jari;
            System.out.println("Luas Lingkarang: "+luas);
        }else{
            double keliling=2*3.14*jari;
            System.out.println("Keliling Lingkaran: "+keliling);
        }
    }
    static void luasSegitiga(int n){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan alas   : ");
        double alas = input.nextDouble();
        System.out.print("Masukkan tinggi : ");
        double tinggi = input.nextDouble();
        if(n==1){
            double luas = alas*tinggi/2;
            System.out.println("Luas Segitiga: "+luas);
        }else{
            double sisi = sqrt((alas*alas)+(tinggi*tinggi));
            double keliling = alas+tinggi+sisi;
            System.out.println("Keliling Segitiga: "+keliling);
        }
    }

}
