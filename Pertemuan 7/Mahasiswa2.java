public class Mahasiswa2 {

	int nim, umur ;
	String nama ;
	double ipk ;

	Mahasiswa2(int ni, String n, int u, double i) {
		nim = ni ;
		nama = n ;
		umur = u ;
		ipk = i ;
	}
	void tampil() {
		System.out.println("NIM\t : " + nim) ;
		System.out.println("Nama\t : " + nama) ;
		System.out.println("Umur\t : " + umur) ;
		System.out.println("IPK\t : " + ipk) ;
	}
}