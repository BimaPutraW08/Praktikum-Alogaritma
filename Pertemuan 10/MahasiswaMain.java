/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

import java.util.Scanner;
/**
 *
 * @author adesta
 */
public class MahasiswaMain {
     public static void menu(){
        System.out.println("Pilih menu : ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Antrian paling belakang");
        System.out.println("5. Cek Semua antrian");
        System.out.println("6. Cek posisi antrian berdasarkan NIM");
        System.out.println("7. Tampilkan data antrian Mahasiswa");
        System.out.println("8. Keluar dari program");
        System.out.println("----------------------");
    }
    
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jumlah = sc.nextInt();
        Mahasiswa antri = new Mahasiswa(jumlah);
        String ulang;
        do{
            menu();
            int pilih = sc.nextInt();
            sc.nextLine();
            switch(pilih){
                case 1:
                    System.out.print("NIM Mahasiswa : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama : ");
                    String nama= sc.nextLine();
                    System.out.print("Absen : ");
                    int absen = sc.nextInt();
                    System.out.print("IPK : ");
                    double ipk = sc.nextDouble();
                    Mahasiswa ms = new Mahasiswa(nim, nama, absen, ipk);
                    sc.nextLine();
                    antri.Enqueue(ms);
                    break;
                case 2:
                    Mahasiswa data = antri.Dequeue();
                    if(!"".equals(data.nim) && !"".equals(data.nama) && !"".equals(data.absen)
                             && data.ipk != 0){
                        System.out.println("Antrian yang keluar : " + data.nim + " " + 
                                data.nama + " " + data.absen + " " + data.ipk);
                        break;
                    }
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.peekRear();
                    break;
                case 5:
                    antri.print();
                    break;
                case 6:
                    System.out.print("Masukkan NIM Mahasiswa yang dicari : ");
                    String a = sc.nextLine();
                    antri.peekPosition(a);
                    break;
                case 7:
                    System.out.print("Masukkan data Mahasiswa yang ingin ditampilkan : ");
                    int b = sc.nextInt();
                    antri.printMahasiswa(b);
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Maaf, anda salah memasukkan menu pilihan");
            }
            System.out.println("Apakah ingin kembali ke menu utama ? [Y/T]");
            ulang = sc.next();
        }while(ulang.equalsIgnoreCase("Y"));
    }
}
