public class Barang2 {
    String nama;
    int hargaSatuan, jumlah;
    void tampilBarang() {
        System.out.println("Nama : " +nama);
        System.out.println("Jumlah : "+jumlah);
        System.out.println("Harga Satuan : " +hargaSatuan);
    }
    int hitungHargaTotal(int n) {
        int hargaTotal;
        hargaTotal = hargaSatuan*jumlah;
        return hargaTotal;
    }
    double hitungDiskon(double m) {
        double diskon = 0;
        if (m > 100000) {
            diskon = m*0.1;
        }else if(m >= 50000 && m <= 100000){
            diskon = m *0.05;
        }else{
            diskon = 0;
        }
        return diskon;
    }
    double hitungHargaBayar(double m, double n){
        double hargaBayar = 0;
        hargaBayar = n - m;
        return hargaBayar;
    }
}