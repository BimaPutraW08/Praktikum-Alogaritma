//package PraktekMinggu5;
import java.util.Scanner;
public class MainTiket{
    public static void main(String [] args){
        TiketService listTiket = new TiketService();
        
        Tiket tk1 = new Tiket("Garuda",700000,"Jakarta","Kalimantan");
        Tiket tk2 = new Tiket("Lion air",650000,"Sumatera","Kalimantan");
        Tiket tk3 = new Tiket("Citilink",900000,"Riau", "Pali");
        Tiket tk4 = new Tiket("Sriwijaya Air",870000, "Bali", "Aceh");
        Tiket tk5 = new Tiket("Batik Air",300000, "Surabaya", "Bali");

        listTiket.tambah(tk1);
        listTiket.tambah(tk2);
        listTiket.tambah(tk3);
        listTiket.tambah(tk4);
        listTiket.tambah(tk5);

        System.out.println("Data Tiket Pesawat sebelum sorting = ");
        listTiket.tampilAll();

        System.out.println("Data Tiket Pesawat Sorting BubbleSort");
        listTiket.bubbleSort();
        listTiket.tampilAll();

        System.out.println("Data Tiket Pesawat Sorting SelectionSort");
        listTiket.selectionSort();       
        listTiket.tampilAll();
    }
}