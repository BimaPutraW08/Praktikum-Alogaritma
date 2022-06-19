package Praktikum3;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class ListMahasiswa {
    List<Mahasiswa> mahasiswas = new ArrayList<>();
    public void tambah(Mahasiswa... mahasiswa){
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }
    public void hapus(int index){
        mahasiswas.remove(index);
    }
    public void update(int index, Mahasiswa mhs){
        mahasiswas.set(index, mhs);
    }
    public void tampil(){
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }
    //jawaban no 3
    void asc(){
        this.mahasiswas.sort((Mahasiswa m1,Mahasiswa m2 )
             ->m1.nama.compareTo(m2.nama));
    }     
     //methode asc untuk mengurutkan secara ascending
    void desc(){
        this.mahasiswas.sort((Mahasiswa m1,Mahasiswa m2 )
             ->m2.nama.compareTo(m1.nama));
    }     
    int linearSearch(String nim){
        for(int i = 0; i < mahasiswas.size(); i++){
            if(nim.equals(mahasiswas.get(i).nim)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();
        Mahasiswa m = new Mahasiswa("201234", "Noureen", "021xx1");
        Mahasiswa m1 = new Mahasiswa("201235", "Akhleema", "021xx2");
        Mahasiswa m2 = new Mahasiswa("201236", "Shannun", "021xx3");
//menambahkan objek mahasiswa
    lm.tambah(m, m1, m2);
//menampilkan list mahasiswa
    lm.tampil();
//update mahasiswa
    lm.update(lm.linearSearch("201235"), new Mahasiswa("201235","Akhleema Lela", "021xx2"));
    // jawaban no 2
    //Mahasiswa mhs=new Mahasiswa ("201235",null,null);
    //lm.update(Collections.binarySearch(lm.mahasiswas,mhs,new MhsComparator()),
        //new Mahasiswa("201235", "Akhleema Lela", "021xx2"));  
    System.out.println("");
    lm.tampil();
    System.out.println("-----------------------------------------------");
        
   // pertanyaan praktikum 3 nomor 3
       //mengurutkan secara ascending
        System.out.println("");
        System.out.println("Pengurutan Secara Ascending Berdasarkan Nama : ");    
        System.out.println("================================================");
        lm.asc();
        lm.tampil();
        System.out.println("------------------------------------------------");        
       //mengurutkan secara descending
        System.out.println("");
        System.out.println("Pengurutan Secara Descending Berdasarkan Nama : ");    
        System.out.println("================================================");
        lm.desc();
        lm.tampil();
        System.out.println("------------------------------------------------");
    }
}

