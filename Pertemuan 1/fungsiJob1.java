import java.util.Scanner;
public class fungsiJob1{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int [][]stockBunga = {
			{10,5,15,7},
			{6,11,9,12},
			{2,10,10,5},
			{5,7,12,9}
		};
		 int aglonema = 0, keladi = 0, alocasia = 0, mawar = 0 ;
        int pendapatan ;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 0) {
                    aglonema += stockBunga[i][j] ;
                } else if (j == 1) {
                    keladi += stockBunga[i][j] ;
                } else if (j == 2) {
                    alocasia += stockBunga[i][j] ;
                } else {
                    mawar += stockBunga[i][j] ;
                }
			}
		}
		pendapatan = (10-1)*75000 + (5-2)*50000 + 1560000 + (7-5)*10000 ;
		System.out.println("A. Jumlah Stock Bunga Berdasarkan Jenis Bunga : ");
        System.out.println("Jumlah Stock Bunga Aglonema adalah " + aglonema) ;
        System.out.println("Jumlah Stock Bunga Keladi adalah " + keladi) ;
        System.out.println("Jumlah Stock Bunga Alocasia adalah " + alocasia) ;
        System.out.println("Jumlah Stock Bunga Mawar adalah " + mawar + "\n") ;
        System.out.println("B. Pendapatan RoyalGarden1 jika Semua Bunga Terjual Habis : ");
        System.out.println("Pendapatan RoyalGarden1 adalah Rp " + pendapatan) ;
	}
}