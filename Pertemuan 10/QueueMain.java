/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

import java.util.Scanner;
/**
 *
 * @author adesta
 */
public class QueueMain {
    public static void menu(){
        System.out.println("Masukkan operasi yang diinginkan : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        //Tugas1
        System.out.println("5. Cari posisi indeks");
        System.out.println("6. Tampilkan posisi indeks");
        System.out.println("7. Clear");
        //modifikasi
        System.out.println("8. Keluar program");
        System.out.println("----------------------");
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue : ");
        int n = sc.nextInt();
        Queue Q = new Queue(n);
        //int pilih;
        String ulang;
        do{
            menu();
            //pilih = sc.nextInt();
            int pilih = sc.nextInt();
            switch(pilih){
                case 1:
                    System.out.print("Masukkan data baru : ");
                    int dataMasuk = sc.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if(dataKeluar != 0){
                        System.out.println("Data yang dikeluarkan : " + dataKeluar);
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                //Tugas1
                case 5:
                    System.out.print("Masukkan data yang dicari : ");
                    int dataCari = sc.nextInt();
                    Q.peekPosition(dataCari);
                    break;
                case 6:
                    System.out.print("Masukkan data yang ditampilkan : ");
                    int dataTampil = sc.nextInt();
                    Q.peekPosition(dataTampil);
                    break;
                case 7:
                    Q.clear();
                    break;
                //modifikasi
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Maaf, anda salah memasukkan menu pilihan");
            }
            System.out.println("Apakah ingin kembali ke menu utama ? [Y/T]");
            ulang = sc.next();
        }//while(pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
        while(ulang.equalsIgnoreCase("Y"));
    }
}
