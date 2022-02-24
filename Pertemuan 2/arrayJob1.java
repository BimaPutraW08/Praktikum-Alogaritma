import java.util.Scanner;
public class arrayJob1{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		String[]namaToko = {"RoyalGarden 1","RoyalGarden 2","RoyalGarden 3","RoyalGarden 4"};
		String[]bunga = {"Aglonema","Keladi","Alocasia","Mawar"};
		int hargaAglonema=75000,hargaKeladi=50000,hargaAlocasia=60000,hargaMawar=10000;
		int [][]stockBunga = {
			{10,5,15,7},
			{6,11,9,12},
			{2,10,10,5},
			{5,7,12,9}
		};
	
		System.out.println("Stock bunga diseluruh cabang : ");
		System.out.println("===============================");
		int stokBuAglonema=0, stokBuKeladi=0, stokBuAlocasia=0, stokBuMawar=0;
		for(int i=0;i<stockBunga.length;i++){
			stokBuAglonema+=stockBunga[i][0];
		}for(int i=0;i<stockBunga.length;i++){
			stokBuKeladi+=stockBunga[i][1];
		}for(int i=0;i<stockBunga.length;i++){
			stokBuAlocasia+=stockBunga[i][2];
		}for(int i=0;i<stockBunga.length;i++){
			stokBuMawar+=stockBunga[i][3];
		}
		
		int harTotAglonema=stokBuAglonema*hargaAglonema;
		int harTotKeladi=stokBuKeladi*hargaKeladi;
		int harTotAlocasia=stokBuAlocasia*hargaAglonema;
		int harTotMawar=stokBuMawar*hargaMawar;
		int harSel= harTotAglonema+harTotKeladi+harTotAlocasia+harTotMawar;
		
		int stockBungaCabang =0;
		    for (int i = 0; i < stockBunga.length; i++){
				for (int j = 0; j < stockBunga.length; j++){
					stockBungaCabang = stockBungaCabang + stockBunga[i][j];
				}
			}
		System.out.println("stock Aglonema & harga total : "+stokBuAglonema+" = "+harTotAglonema);
		System.out.println("stock Keladi & harga total : "+stokBuKeladi+" = "+harTotKeladi);
		System.out.println("stock Alocasia & harga total : "+stokBuAlocasia+" = "+harTotAlocasia);
		System.out.println("stock Mawar & harga total : "+stokBuMawar+" = "+harTotMawar);
		System.out.println("stock Mawar & harga total : "+stokBuMawar+" = "+harTotMawar);
		System.out.println("Stock Total & harga Seluruhnya : "+stockBungaCabang+" = "+harSel);
	
		System.out.println("Pendapatan setelah kesediaan barang berkurang : ");
		System.out.println("===============================");
		int [][]stockBungaSetKur = {
			{9,3,15,2},
			{6,11,9,12},
			{2,10,10,5},
			{5,7,12,9}
		};
		int bungaAgloMati= hargaAglonema*1;
		int bungaKelaMati=hargaKeladi*2;
		int bungaAloMati=hargaAlocasia*0;
		int bungaMawMati=hargaMawar*5;
		int totalMati=bungaAgloMati+bungaKelaMati+bungaAloMati+bungaMawMati;
		
		System.out.println("mati pada cabang RoyalGarden 1. Dengan rincian Aglonema -1, Keladi -2, Alocasia -0, Mawar -5.");
		System.out.println("Bunga Aglonema Royalgarden1 yang mati & harga total : "+bungaAgloMati);
		System.out.println("Bunga keladi Royalgarden1 yang mati & harga total : "+bungaKelaMati);
		System.out.println("Bunga Alocasia Royalgarden1 yang mati & harga total : "+bungaAloMati);
		System.out.println("Bunga Mawar Royalgarden1 yang mati & harga total : "+bungaMawMati);
		System.out.println("toal Bunga Royalgarden1 yang mati & harga total : "+totalMati);
		int untung=harSel-totalMati;
		
		
		System.out.println("Total keuntungan : "+ untung);
	}
}