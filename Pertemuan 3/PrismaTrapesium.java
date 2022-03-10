import java.util.Scanner;
public class PrismaTrapesium{
    public int sisiSejajarAtas;
    public int sisiSejajarBawah;
    public int sisiTdkSejajarKanan;
    public int sisiTdkSejajarKiri;
    public int tinggiTrapesium;
    public int tinggiPrisma;

    public PrismaTrapesium(int a, int b, int r, int l, int tt, int tp){
        sisiSejajarAtas = a;
        sisiSejajarBawah = b;
        sisiTdkSejajarKanan = r;
        sisiTdkSejajarKiri = l;
        tinggiTrapesium = tt;
        tinggiPrisma = tp;
    }
    int hitungLuasPrismaTrapesium(){
        return (sisiSejajarAtas + sisiSejajarBawah) * 1/2 * tinggiTrapesium * tinggiPrisma;
    }
    int hitungVolumePrismaTrapesium(){
        return ((sisiSejajarAtas + sisiSejajarBawah) * 1/2 * tinggiTrapesium * 2) + (sisiSejajarAtas * tinggiTrapesium) + (sisiSejajarBawah * tinggiTrapesium) + (sisiTdkSejajarKanan * tinggiTrapesium) + (sisiTdkSejajarKiri * tinggiTrapesium);
    }
    public static void main(String[] args){
        PrismaTrapesium[] blArray = new PrismaTrapesium[1];
        blArray[0] = new PrismaTrapesium(4 ,16 , 10, 10, 8, 20);
    System.out.println( "Luas Prisma Trapesium : " + blArray[0].hitungLuasPrismaTrapesium());
    System.out.println( "Volume Prisma Trapesium : " + blArray[0].hitungVolumePrismaTrapesium());
    }
}