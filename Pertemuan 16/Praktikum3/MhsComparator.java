package Praktikum3;
import java.util.Comparator;       
 public class MhsComparator implements Comparator <Mahasiswa> {
    public int compare(Mahasiswa mhss , Mahasiswa mhsss){
        if(mhss.nim==mhsss.nim){
            return 0;
        }else {
            return -1;
        }
    }
        @Override
 public Comparator <Mahasiswa> reversed () {
        return Comparator.super.reversed();
        
    }
}
