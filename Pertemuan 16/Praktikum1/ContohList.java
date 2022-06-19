package Praktikum1;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
public class ContohList {
    public static void main(String[] args) {
    List l = new ArrayList();
    List<String> k = new ArrayList<>();
    List<Integer> r = new ArrayList<>();
    r.add(1);
    r.add(2);
    r.add(3);
    k.add("Cireng");
    System.out.printf("Elemen 0: %d Total Elemen: %d Elemen Terakhir: %s\n",
            r.get(0), r.size(), k.get(k.size() - 1));
    r.add(4);
    r.remove(0);
    System.out.printf("Elemen 0: %d Total Elemen: %d Elemen Terakhir: %s\n",
            r.get(0), r.size(), r.get(r.size() - 1));
    LinkedList<String> names = new LinkedList<>();
    names.add("Noureen");
    names.add("Akhleena");
    names.add("Shannum");
    names.add("Uwais");
    names.add("Al-Qarni");
    System.out.printf("Elemen 0: %s Total Elemen: %s Elemen Terakhir: %s\n",
                names.get(0), names.size(), names.get(names.size() - 1));
        names.set(0, "My kid");
        System.out.printf("Elemen 0: %s Total Elemen: %s Elemen Terakhir: %s\n",
                names.get(0), names.size(), names.get(names.size() - 1));
        System.out.println("Names: " + names.toString());
        
        //jawaban no 4
        names.push("Mei-mei");
        System.out.printf("Elemen 0: %s Total Elemen: %s Elemen Terakhir: %s\n",
                names.get(0), names.size(), names.get(names.size() - 1));
        System.out.println("Names: " + names.toString());
    }   
}

