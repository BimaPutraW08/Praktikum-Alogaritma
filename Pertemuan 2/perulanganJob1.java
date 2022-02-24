import java.util.Scanner;
public class perulanganJob1{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan Nim :");
		int nim =input.nextInt();
		System.out.println("=========================");
		int duaDigitTerakhir = nim-201234500;

		if (duaDigitTerakhir<10){
			 duaDigitTerakhir+=10;
		 }
		int n= duaDigitTerakhir;
		System.out.println("n : "+n);
		
		for (int i=1;i<=n;i++){
			if(i==1||i%7==1){
				System.out.print("Senin ");
			}else if(i%7==2){
				System.out.print("Selasa ");
			}else if(i%7==3){
				System.out.print("Rabu ");
			}else if(i%7==4){
				System.out.print("Kamis ");
			}else if(i%7==5){
				System.out.print("Jumat ");
			}else if(i%7==6){
				System.out.print("Sabtu ");
			}else if(i%7==7){
				System.out.print("Minggu ");
			}
		}
	}
}