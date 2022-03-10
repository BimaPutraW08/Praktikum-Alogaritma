import java.util.Scanner;
public class Bola{
    public int phi;
    public int jariJari;

    public Bola(int p, int r){
        phi = p;
        jariJari = r;
    }

    int hitungLuasBola(){
        return phi * jariJari * jariJari * 4;
    }

    int hitungVolumeBola(){
        return 4/3 * phi * jariJari * jariJari * jariJari;
    }

    public static void main(String[] args){
        Bola[] blArray = new Bola[1];

        blArray[0] = new Bola (22/7, 14);

    System.out.println( "Luas Bola : " + blArray[0].hitungLuasBola());
    System.out.println( "Volume Bola : " + blArray[0].hitungVolumeBola());
    }

}