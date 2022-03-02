public class Barang2Main {
    public static void main(String[] args) {
        Barang2 b2 = new Barang2();
        b2.nama = "Parfum";
        b2.jumlah = 7;
        b2.hargaSatuan = 15000;
        int total = b2.hitungHargaTotal(7);
        double diskon = b2.hitungDiskon(total);
        double bayar = b2.hitungHargaBayar(diskon, total);
        b2.tampilBarang();
        System.out.println("Total Harga : "+total);
        System.out.println("Diskon : "+diskon);
        System.out.println("Harga 7 Pcs : " +bayar);
    }
}