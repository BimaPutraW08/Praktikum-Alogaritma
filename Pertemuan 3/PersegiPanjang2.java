// ArrayObjects
// package minggu3
import java.util.Scanner;
public class PersegiPanjang2{
    public int panjang;
    public int lebar;
    public static void main(String [] args){
        PersegiPanjang[] ppArray = new PersegiPanjang[3];
        Scanner sc = new Scanner (System.in);
        for(int i=0; i<3; i++){
        ppArray[i] = new PersegiPanjang();
        System.out.println("persegi panjang ke-"+i);
        System.out.print("Masukkan panjang: ");
        ppArray[i].panjang = sc.nextInt();
        System.out.print("Masukkan lebar : ");
        ppArray[i].lebar = sc.nextInt();
        }
        for(int i=0; i<3; i++){
        System.out.println("Persegi Panjang ke-"+i);
        System.out.println("Panjang: "+ ppArray[i].panjang +", lebar: "+ppArray[i].lebar);
        }
    }
}