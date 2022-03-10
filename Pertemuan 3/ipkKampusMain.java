import java.util.Scanner;
public class ipkKampusMain{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ipkKampus[] ip = new ipkKampus[3];
        for (int i = 0; i < ip.length; i++){
            ip[i] = new ipkKampus();
        }
        for (int i = 0; i < ip.length; i++ ){
            System.out.println("\nMasukkan data mahasiswa ke-" + (i+1) + " :");
            System.out.print("Masukkan nama :");
            ip[i].namaMhs = input.nextLine();
            System.out.print("Masukkan nim :");
            ip[i].nim = input.nextInt();
            input.nextLine();
            System.out.print("Masukkan jenis kelamin :"); 
            ip[i].kelamin = input.nextLine();
            System.out.print("Masukkan IPK :");
            ip[i].ipk = input.nextDouble();
            input.nextLine();
        }
        System.out.println();
        for (int i = 0; i < ip.length; i++){
            System.out.println("\nData Mahasiswa ke - " + (i + 1) + " : ");
            System.out.println("Nama : " + ip[i].namaMhs);
            System.out.println("Nim : " + ip[i].nim);
            System.out.println("Jenis kelamin : " + ip[i].kelamin);
            System.out.println("Ipk : " + ip[i].ipk);
        }
    }
}