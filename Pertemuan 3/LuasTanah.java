import java.util.Scanner;
public class LuasTanah{
    public int panjang;
    public int lebar;
    public LuasTanah(int p, int l){
        panjang = p;
        lebar = l;
    }
    public int hitungLuasTanah(){
        return panjang * lebar;
    }
    public static void main(String[] args){
        int a = 3;
        LuasTanah[] blArray = new LuasTanah[a];

        blArray[0] = new LuasTanah(100, 40);
        blArray[1] = new LuasTanah(250, 100);
        blArray[2] = new LuasTanah(120, 100);
        
        System.out.println("Jumlah tanah : "+ a);
        for(int i = 0; i < 3; i++){
            
            int n = i+1;
            System.out.println("Luas Tanah ke-"+ n + " : " + blArray[i].hitungLuasTanah());
        }
    int terluas = 0, tanah = 0;
    for(int j = 0; j < 3; j++){
        int luas = blArray[j].hitungLuasTanah();
        if(luas>tanah){
            tanah = luas;
            terluas =j+1;
        }
    }
    System.out.println("Tanah Terluas : Tanah "+ terluas ); 
    
    }
}
