public class BarangMain{
	public static void main (String [] args){
		Barang b3 = new Barang();
		b3.namaBarang = "Cosair 2 GB";
		b3.jenisBarang = "DDR";
		b3.hargaSatuan = 250000;
		b3.stok = 10;
		b3.tambahStok(1);
		b3.kurangiStok(3);
		b3.tampilBarang();
		int hargaTotal = b3.hitungHargaTotal(4);
		System.out.println("Harga 4 buah = "+hargaTotal);
        Barang b4 = new Barang("Logitech","Wireless Mouse",25, 150000);
        b4.tampilBarang();
	}
	
}