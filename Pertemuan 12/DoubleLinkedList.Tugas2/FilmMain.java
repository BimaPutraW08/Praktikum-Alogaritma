package DoubleLinkedList.Tugas2;

import java.util.Scanner;

public class FilmMain {
    public static void menu(){
        System.out.println("======================");
        System.out.println("DATA FILM LAYAR LEBAR");
        System.out.println("======================");
        System.out.println("1. Tambah Data Awal");
        System.out.println("2. Tambah Data Akhir");
        System.out.println("3. Tambah Data Index Tertentu");
        System.out.println("4. Hapus Data pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari ID Film");
        System.out.println("9. Urut Data  Rating Film-DESC");
        System.out.println("10. Keluar");
        System.out.println("======================");
    }
    
    public static void main(String[] args) throws Exception{
        Scanner sc =new Scanner(System.in);
        Scanner sc1 =new Scanner(System.in);
        Film fm = new Film();
        int idFilm, index;
        String judul;
        double rate;
        String ulang;
        do{
            menu();
            System.out.println("Pilih Menu : ");
            int pilih = sc.nextInt();
            sc.nextLine();
            switch(pilih){
                case 1:
                    System.out.println("======================");
                    System.out.print("ID Film : ");
                    idFilm = sc.nextInt();
                    System.out.print("Judul Film : ");
                    judul = sc1.nextLine();
                    System.out.print("Rating Film : ");
                    rate = sc.nextDouble();
                    fm.addFirst(idFilm, judul, rate);
                    break;
                case 2:
                    System.out.println("======================");
                    System.out.print("ID Film : ");
                    idFilm = sc.nextInt();
                    System.out.print("Judul Film : ");
                    judul = sc1.nextLine();
                    System.out.print("Rating Film : ");
                    rate = sc.nextDouble();
                    fm.addLast(idFilm, judul, rate);
                    break;
                case 3:
                    System.out.println("======================");
                    System.out.println("Index : ");
                    index = sc.nextInt();
                    System.out.print("ID Film : ");
                    idFilm = sc.nextInt();
                    System.out.print("Judul Film : ");
                    judul = sc1.nextLine();
                    System.out.print("Rating Film : ");
                    rate = sc.nextDouble();
                    fm.add(idFilm, judul, rate, index);
                    break;
                case 4:
                    System.out.println("======================");
                    fm.removeFirst();
                    break;
                case 5:
                    System.out.println("======================");
                    fm.removeLast();
                    break;
                case 6:
                    System.out.println("======================");
                    System.out.println("Index : ");
                    index = sc.nextInt();
                    fm.remove(index);
                    break;
                case 7:
                    System.out.println("======================");
                    fm.print();
                    System.out.println("List Film : " + fm.size());
                    break;
                case 8:
                    System.out.println("======================");
                    System.out.print("ID Film : ");
                    idFilm = sc.nextInt();
                    fm.cari(idFilm);
                    break;
                case 9:
                    System.out.println("======================");
                    System.out.println("URUTAN RATING FILM SECARA DESC");
                    System.out.println("======================");
                    fm.BubbleShort();
                    fm.print();
                    break;
                case 10:
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
