import java.util.Scanner;
public class Tabung{
    public int jariJari;
    public int tinggiTabung;
    public int phi;

    public Tabung(int r, int t, int p){
        jariJari = r;
        tinggiTabung = t;
        phi = p;
        
    }

    public int hitungVolumeTabung(){
        return phi * jariJari * jariJari * tinggiTabung;
    }

    public int hitungLuasTabung(){
        return (phi * jariJari * jariJari * 2) + ((phi * 2 * jariJari) *  tinggiTabung);
    }

public static void main(String[] args){
    Tabung[] blArray = new Tabung[1];

    blArray[0] = new Tabung (7,14, 22/7);

    System.out.println( "Luas Tabung : " + blArray[0].hitungLuasTabung());
    System.out.println( "Volume Tabung : " + blArray[0].hitungVolumeTabung());
}
}