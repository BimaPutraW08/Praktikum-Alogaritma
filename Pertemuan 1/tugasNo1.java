import java.util.Scanner;
public class tugasNo1{
		
		
		static void laundry(){
			Scanner input = new Scanner(System.in);
			System.out.print("Ingin Laundry Berapa Kg : ");
			int kg = input.nextInt();
			int tarif= 4500, totalTarif;
			if(kg>10){
				System.out.println("diatas 10kg Diskon 5% ");
				totalTarif = tarif*kg*95/100;
			}else{
				totalTarif = tarif*kg;
			}
			System.out.print("Total biaya : "+ totalTarif+"\n");
			}
		public static void main(String[]args){
		Scanner input = new Scanner(System.in);	
		laundry();
		laundry();
		laundry();
		laundry();
		}
		
		
}