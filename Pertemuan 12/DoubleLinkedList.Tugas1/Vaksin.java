package DoubleLinkedList.Tugas1;

public class Vaksin {
    NodeVaksin head;
    int size;

    public Vaksin(){
     head = null;
     size = 0;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void addFirst(int antri, String nama){
        size++;
        if(isEmpty()){
            head = new NodeVaksin(null, antri, nama, null);
        }else{
            NodeVaksin current = head;
            while(current.next != null){
                current = current.next;
            }
            NodeVaksin temp = new NodeVaksin(current, antri, nama, null);
            current.next = temp;
        }
    }

    public void removeFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("Antrian Masih Kosong, Tidak dapat dihapus!");
        }else{
            NodeVaksin tmp = head;
            head = head.next;
            head.prev = null;
            size--;
            System.out.println(tmp.nama + " Selesai di Vaksinasi");
        }
    }
    
    public int size(){
        return size;
    }
    
    public void print(){
        if(!isEmpty()){
            System.out.println("------------------------");
            System.out.println("|No. Antri | Nama   |");
            NodeVaksin tmp = head;
            while(tmp != null){
                System.out.println("|" + tmp.nomorAntri + "\t|" + tmp.nama + "\t|");
                tmp = tmp.next;
                System.out.println();
            }
            System.out.println("------------------------");
        }else{
            System.out.println("Antrian kosong");
        }
    }
}
