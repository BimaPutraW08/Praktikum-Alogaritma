package DoubleLinkedList.Tugas1;

import java.util.Scanner;
public class VaksinMain {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner (System.in);
        Vaksin vn = new Vaksin();
        int pilih;
        do{
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data PEnerima Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("+++++++++++++++++++++++++++++");
            pilih = sc.nextInt();
            switch(pilih){
                case 1:
                    System.out.println("+++++++++++++++++++++++++++++");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("+++++++++++++++++++++++++++++");
                    System.out.println("Nomor Antrian : ");
                    int noAntri = sc.nextInt();
                    System.out.println("Nama Penerima : ");
                    String nama = sc.next();
                    vn.addFirst(noAntri, nama);
                    System.out.println("+++++++++++++++++++++++++++++");
                    break;
                    
                case 2:
                    vn.removeFirst();
                    break;
                    
                case 3:
                    vn.print();
                    System.out.println("Sisa Antrian : " + vn.size());
                    break;
            }
        }
        while(pilih<4);
    }
}
