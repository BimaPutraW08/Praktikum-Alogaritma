import java.util.Scanner;
public class pemilihanJob1{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int nilTugas, nilUts, nilUas;
		double nilAkhir;
		String nilHuruf;
		System.out.println("Program menghitung Nilai Akhir");
		System.out.println("=========================");
		System.out.print("Masukkan Nilai Tugas : ");
		nilTugas=input.nextInt();
		System.out.print("Masukkan Nilai UTS : ");
		nilUts=input.nextInt();
		System.out.print("Masukkan Nilai UAS : ");
		nilUas=input.nextInt();
		System.out.println("=========================");
		System.out.println("=========================");
		
		nilAkhir=((0.2*nilTugas)+(0.35*nilUts)+(0.45*nilUas));
		System.out.println("nilai akhir :"+nilAkhir);
		
		if(nilAkhir>80&&nilAkhir<=100){
			nilHuruf = "A";
			System.out.println("Nilai Huruf :"+ nilHuruf);	
		}else if(nilAkhir>73&&nilAkhir<=80){
			nilHuruf = "B";
			System.out.println("Nilai Huruf :"+ nilHuruf);
		}else if(nilAkhir>65&&nilAkhir<=73){
			nilHuruf = "B+";
			System.out.println("Nilai Huruf :"+ nilHuruf);
		}else if(nilAkhir>60&&nilAkhir<=65){
			nilHuruf = "C+";
			System.out.println("Nilai Huruf :"+ nilHuruf);
		}else if(nilAkhir>50&&nilAkhir<=60){
			nilHuruf = "C";
			System.out.println("Nilai Huruf :"+ nilHuruf);
		}else if(nilAkhir>39&&nilAkhir<=50){
			nilHuruf = "D";
			System.out.println("Nilai Huruf :"+ nilHuruf);
		}else if(nilAkhir<=39){
			nilHuruf = "E";
			System.out.println("Nilai Huruf :"+ nilHuruf);
		}
		System.out.println("=========================");
		if(nilAkhir>50&&nilAkhir<=100){
			System.out.println("SELAMAT LULUS");
		}else if(nilAkhir<=50){
			System.out.println("TIDAK LULUS");
		}	
	}
}