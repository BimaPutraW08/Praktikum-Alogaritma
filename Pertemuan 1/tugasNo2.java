import java.util.Scanner;
public class tugasNo2{
	
		
		
		static void rumusKecepatan(){
		Scanner input = new Scanner(System.in);
		System.out.println("Rumus Kecepatan");
		System.out.print("Masukkan s : ");
		double s = input.nextDouble();
		System.out.print("Masukkan t : ");
		double t = input.nextDouble();
		double v = s/t;
		System.out.print("v : "+v);
		}
		
		static void rumusJarak(){
		Scanner input = new Scanner(System.in);
		System.out.println("Rumus Jarak");
		System.out.print("Masukkan v : ");
		double v = input.nextDouble();
		System.out.print("Masukkan t : ");
		double t = input.nextDouble();
		double s = v*t;
		System.out.print("s : "+s);
		}
		
		static void rumusWaktu(){
		Scanner input = new Scanner(System.in);
		System.out.println("Rumus Waktu");
		System.out.print("Masukkan s : ");
		double s = input.nextDouble();
		System.out.print("Masukkan v : ");
		double v = input.nextDouble();
		double t = s/v;
		System.out.print("t : "+t);
		}
		public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("Silahkan Memillih menu");
		System.out.println("1. rumusKecepatan");
		System.out.println("2. rumusJarak");
		System.out.println("3. rumusWaktu");
	
		System.out.print("Masukkan angka pilihan : ");
		byte no = input.nextByte();
		if (no==1){
			rumusKecepatan();
		}else if(no==2){
			rumusJarak();
		}else if(no==3){
			rumusWaktu();
		}	
		}
}