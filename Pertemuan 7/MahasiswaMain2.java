import java.util.Scanner ;
public class MahasiswaMain2 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in) ;
		Scanner sl = new Scanner(System.in) ;

		System.out.println("_____________________________________________________") ;
		System.out.print("Masukkan Banyak Data Mahasiswa : ") ;
		int jumMhs = s.nextInt() ;
		PencarianMhs2 data = new PencarianMhs2(jumMhs) ;
		System.out.println("_____________________________________________________") ;

		System.out.println("_____________________________________________________") ;
		System.out.println("Masukkan Data Mahasiswa Secara Urut dari NIM Terkecil") ;
		for (int i = 0; i < jumMhs; i++) {
			System.out.println("_____________________________________________________") ;
			System.out.print("NIM\t : ") ;
			int nim = s.nextInt() ;
			System.out.print("Nama\t : ") ;
			String nama = sl.nextLine() ;
			System.out.print("Umur\t : ") ;
			int umur = s.nextInt() ;
			System.out.print("IPK\t : ") ;
			double ipk = s.nextDouble() ;

			Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk) ;
			data.tambah(m) ;
		}

		System.out.println("=====================================================") ;
		System.out.println("Data Keseluruhan Mahasiswa : ") ;
		data.tampil() ;

		System.out.println("=====================================================") ;
		System.out.println("_____________________________________________________") ;
		System.out.println("Pencarian Data : ") ;
		System.out.println("Masukkan NIM Mahasiswa yang Dicari : ") ;
		System.out.print("NIM : ") ;
		int cari = s.nextInt() ;
		System.out.println("=====================================================") ;
		System.out.println("Menggunakan Sequential Search") ;
		int posisi = data.findSeqSearch(cari) ;

		data.tampilPosisi(cari, posisi) ;
		data.tampilData(cari, posisi) ;

		System.out.println("=====================================================") ;
		System.out.println("Menggunakan Binary Search") ;
		posisi = data.findBinarySearch(cari, 0, jumMhs-1) ;

		data.tampilPosisi(cari, posisi) ;
		data.tampilData(cari, posisi) ;
	}
}