package GreddyGil;


import java.util.Scanner;

public class MethodMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Uang: ");
        int uang = scanner.nextInt();
        System.out.print("Masukkan Jumlah Koin: ");
        int nCoin = scanner.nextInt();
        int Coin[] = new int[nCoin];

        for (int i = 0; i<nCoin;i++){
            System.out.print("Koin Ke-" + (i+1) + " : ");
            Coin[i] = scanner.nextInt();
        }

        System.out.print("Masukkan Batas Iterasi : ");
        int batas = scanner.nextInt();
        int hasil[] = new int[batas];
        int jum[] = new int[batas];

        AlGreddy alGreddy = new AlGreddy();

        for (int i = 0; i<batas;i++){
            System.out.print(" Solusi Ke -" + (i+1) + " = {");
            alGreddy.Greedy(Coin, hasil,jum,uang,i);
        }
        alGreddy.maxMin(hasil,jum,uang);
    }

}
