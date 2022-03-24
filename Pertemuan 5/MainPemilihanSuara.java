import java.util.Scanner;
public class MainPemilihanSuara{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("============================================");
        System.out.println("Pemilihan Suara Memilih Ketua BEM Tahun 2020");
        System.out.println("============================================");
        PemilihanSuara ps = new PemilihanSuara();
        PemilihanSuara[] arr = new PemilihanSuara[ps.jumlahKandidat];
        for (int i = 0; i < ps.jumlahKandidat; i++){
            arr[i] = new PemilihanSuara();
            System.out.println("Nama Kandidat ke-"+ (i +1)+ " : ");
            arr[i].kandidat = sc.nextLine();
        }
        System.out.println("============================================");
        for (int i = 0; i < ps.jumlahKandidat; i++){
            System.out.println("Jumlah suara Kandidat ke-"+ (i+1) + " : ");
            arr[i].suara = sc.nextInt();
            ps.jumlahSuara += arr[i].suara;
        }
        System.out.println("============================================");
        int hasil = ps.Hitung(ps.jumlahSuara, arr[0].suara, arr[1].suara, arr[2].suara, arr[3].suara);
        if (hasil == 0){
            System.out.println("Masing- masing KAndidat memiliki mayortas yang hampir sama");
        }
        else{
            System.out.println("Ketua BEM yang terpilih adalah " + arr[hasil - 1]. kandidat);
        }
    }
}