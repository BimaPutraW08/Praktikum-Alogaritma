package Praktikum2;
import java.util.Stack;
import java.util.Iterator;
import java.util.Comparator;
public class LoopCollection {
    public static void main(String[] args) {
        Stack<String> fruits = new Stack<>();
        fruits.push("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.push("Salak");
        for(String fruit : fruits){
            System.out.printf("%s ", fruit);
        }
        System.out.println("\n" + fruits.toString());
        while(!fruits.empty()){
            System.out.printf("%s ", fruits.pop());
        }
        fruits.push("Melon");
        //fruits.push("Durian");
        fruits.push("Strawberry");
        System.out.println("");
        for (Iterator<String> it = fruits.iterator(); it.hasNext();) {
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }
        System.out.println("");
        fruits.stream().forEach(e -> {
            System.out.printf("%s ", e);
        });
        System.out.println("");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.printf("%s ", fruits.get(i));   
        }
        //jawaban no 6
        fruits.push("Mango");
        fruits.push("Guava");
        fruits.push("Avocado");
        fruits.push("Jackfruit");
        fruits.push("Date Palm");
        fruits.push("Coconut");
        fruits.sort((String x,String y) -> x.compareTo (y) );
        System.out.println("\n========================================");
        System.out.println(" Output Setelah Dilakukan Sorting :");
        System.out.println("========================================");
        for (int i =0 ; i<fruits.size(); i++){
            System.out.printf("%s \n",fruits.get(i));
        } 
    }    
}
