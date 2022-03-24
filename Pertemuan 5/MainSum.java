import java.util.Scanner;
public class MainSum{
    public static void main(String[] args){ 
        Scanner sc = new Scanner (System.in);
        int el = 0;

        System.out.println("===============================================");
        System.out.println("Program Menghitung Keuntungan Tital (Satuan Juta. Misal 5.9)");
        
        System.out.print("Masukkan jumlah perusahaan : ");
        int jumlahPeru = sc.nextInt();
        for(int i = 0; 1 < jumlahPeru; i++){
            System.out.print("Masukkan jumlah bulan perusahaan ke-" + (i + 1) + " : ");
            int elm = sc.nextInt();
            el = elm;
        }

        Sum sm = new Sum(el, jumlahPeru);
        System.out.println("===============================================");
        
        for (int i = 0; i < jumlahPeru; i++){
            System.out.print("perusahaan ke-" + (i+1));
            for (int j = 0; j < el; j ++){
                System.out.println("Masukkan untung bulan ke-" + (i+1)+ " : ");
                sm.keuntungan[i]= sc.nextDouble();
            }   
        }
    for(int i = 0; i< jumlahPeru; i++){
        System.out.println("Perusahaan ke-" + (i+1));
        System.out.println("===============================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selama "+ sm.elemen[i] + " bulan adalan = " + sm.totalBF(sm.keuntungan));
        System.out.println("===============================================");
        System.out.println("Alogaritma Dicide Conquer");
        System.out.println("Total keuntungan perusahaan selama "+ sm.elemen[i] + " bulan adalah = " + sm.totalDC(sm.keuntungan, 0,sm.elemen[i] - 1));
    }
    }
}