public class PencarianMhs2 {

	int q ; 

	PencarianMhs2(int qMhs) {
		q = qMhs ;
	}

	Mahasiswa listMhs[] = new Mahasiswa[q] ;
	int idx ;

	void tambah(Mahasiswa m) {
		if (idx < listMhs.length){
			listMhs[idx] = m ;
			idx++ ;
		} else {
			System.out.println("Data Sudah Penuh!!!") ;
		}
	}
	void tampil() {
		for (Mahasiswa m : listMhs) {
			m.tampil() ;
			System.out.println("_____________________________________________________") ;
		}
	}
	public int findSeqSearch(int cari) {
		int posisi = -1 ;
		for (int j = 0; j < listMhs.length; j++) {
			if (listMhs[j].nim == cari) {
				posisi = j ;
				break ;
			}
		}
		return posisi ;
	}
	public int findBinarySearch(int cari, int left, int right) {
		int mid ;
		if (right >= left) {
			mid = (left + right) / 2 ;
			if (cari == listMhs[mid].nim) {
				return (mid) ;
			} else if (listMhs[mid].nim < cari) {
				return findBinarySearch(cari, left, mid-1) ;
			} else {
				return findBinarySearch(cari, mid+1, right) ;
			}
		}
		return -1 ;
	}
	public void tampilPosisi(int x, int pos) {
		if (pos != -1) {
			System.out.println("Data : " + x + " Ditemukan pada Indeks " + pos) ;
		} else {
			System.out.println("Data " + x + " Tidak Ditemukan") ;
		}
	}
	public void tampilData(int x, int pos) {
		if (pos != -1) {
			System.out.println("NIM\t : " + x) ;
			System.out.println("Nama\t : " + listMhs[pos].nama) ;
			System.out.println("Umur\t : " + listMhs[pos].umur) ;
			System.out.println("IPK\t : " + listMhs[pos].ipk) ;
		} else {
			System.out.println("Data " + x + " Tidak Ditemukan") ;
		}
		System.out.println("_____________________________________________________") ;
	}
}
