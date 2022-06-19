# Laporan JOBSHEET 12 Double Linked Lists

## Percobaan 1
```java
public class Node{
    int data;
    Node prev, next;

    Node(Node prev, int data, Node next){
        this.prev=prev;
        this.data=data;
        this.next=next;
    }
}

public class DoubleLinkedList{
    Node head;
    int size;

    public DoubleLinkedList(){
        head = null;
        size = 0;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(int item){
        if (isEmpty()){
            head = new Node(null, item, null);
        }else{
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void addLast(int item){
        if (isEmpty()){
            addFirst(item);
        }else{
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            Node newNode = new Node(current, item, null);
            current.next = newNode;
            size++;
        }
    }
    public void add(int item, int index) throws Exception{
        if (isEmpty()){
            addFirst(item);
        }else if(index < 0 || index > size){
            throw new Exception ("Nilai indeks di luar batas");
        }else{
            Node current = head;
            int i = 0;
            while(i<index){
                current = current.next;
                i++;
            }if (current.prev == null){
                Node newNode = new Node(null, item, current);
                current.prev = newNode;
                head = newNode;
            }else{
            Node newNode = new Node (current.prev, item, current);
            newNode.prev = current.prev;
            newNode.prev = current;
            current.prev = newNode;
            current.prev = newNode;
            }
        }size++;
    }
    public int size(){
        return size;
    }
    public void clear(){
        head = null;
        size = 0;
    }
    public void print(){
        if (isEmpty()){
            Node tmp = head;
            while (tmp != null){
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        }else{
            System.out.println("Linked List Kosong");
        }
    }
}

public class DoubleLinkedListMain{
    public static void main(String[] args) throws Exception{
    DoubleLinkedList dll = new DoubleLinkedList();
    dll.print();
    System.out.println("Size : " +dll.size());
    System.out.println("=================================");
    dll.addFirst(3);
    dll.addLast(4);
    dll.addFirst(7);
    dll.print();
    System.out.println("Size : " + dll.size());
    System.out.println("=================================");
    dll.add(40,1);
    dll.print();
    System.out.println("Size : " + dll.size());
    System.out.println("=================================");
    dll.clear();
    dll.print();
    System.out.println("Size : " + dll.size());
    }
}
```
Hasil Run
<img src = "hsl1.jpg">

Pertanyaan Percobaan 1

1. Jelaskan perbedaan antara single linked list dengan double linked lists!
Single linked linked list hanya mengetahui next tanpa mengetahui previous
2. Perhatikan class Node, didalamnya terdapat atribut next dan prev. Untuk apakah atribut 
tersebut?
Atribut next untuk menunjuk node berikutnya dan previous untuk menunjuk node 
sebelumnya
3. Perhatikan konstruktor pada class DoubleLinkedLists. Apa kegunaan inisialisasi atribut head 
dan size seperti pada gambar berikut ini?
Untuk menunjukkan bahwa size masih 0 dan juga head = null atau tidak menunjuk kemana 
pun
4. Pada method addFirst(), kenapa dalam pembuatan object dari konstruktor class Node prev 
dianggap sama dengan null?
Karena menambahkan data paling depan jadi tidak ada data sebelumnya maka di isi null
5. Perhatikan pada method addFirst(). Apakah arti statement head.prev = newNode ?
Agar mengisi data di head sebelumnya menjadi newNode
6. Perhatikan isi method addLast(), apa arti dari pembuatan object Node dengan mengisikan 
parameter prev dengan current, dan next dengan null?
Current merupakan node sebelumnya dan terkahir di kasih null karena sudah tidak ada data 
lagi setelahnya

## Percobaan 2
```java
public void removeFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus !");
        }else if(size ==1){
            removeLats();
        }else{
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    public void removeLats() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus !");
        }else if (head.next==null){
            head = null;
            size--;
            return;
        }
        Node current = head;
        while(current.next.next != null){
            current = current.next;
        }
        current.next = null;
        size--;
    }
    public void remove(int index) throws Exception{
        if (isEmpty()|| index >= size){
            throw new Exception("Nilai indeks di luar batas");
        }else if (index == 0){
            removeFirst();
        }else{
            Node current = head;
            int i =0;
            while (i < index){
                current = current.next;
                i++;
            }
            if(current.next == null){
                current.prev.next = null;
            }else if(current.prev == null){
                current = current.next;
                current.prev = null;
                head = current;
            }else{
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    dll.addLast(50);
    dll.addLast(40);
    dll.addLast(10);
    dll.addLast(20);
    dll.print();
    System.out.println("Size : " + dll.size());
    System.out.println("=================================");
    dll.removeFirst();
    dll.print();
    System.out.println("Size : " + dll.size());
    System.out.println("=================================");
    dll.removeLats();
    dll.print();
    System.out.println("Size : " + dll.size());
    System.out.println("=================================");
    dll.remove(1);
    dll.print();
    System.out.println("Size : " + dll.size());
```
Hasil Run

<img src = "hsl2.jpg">

Pertanyaan Percobaan 2
1. Apakah maksud statement berikut pada method removeFirst()?
untuk mengubah head ke next yaitu ke node selanjutnya terus setelah 
itu head.prev maka head sebelumnya yaitu head yang lama di delete
2. Bagaimana cara mendeteksi posisi data ada pada bagian akhir pada method removeLast()?
mencari pointer next = null
3. Jelaskan alasan potongan kode program di bawah ini tidak cocok untuk perintah remove!
Karena menyimpan data head jadi lebih baik di removefirst
4. Jelaskan fungsi kode program berikut ini pada fungsi remove!
pointer next pada current/node sebelumnya akan menunjuk ke current/node selanjutnya, 
dan pointer prev pada current/node selanjutnya akan menunjuk ke current/node 
sebelumnya

## Percobaan 3
```java
  public int getFirst() throws Exception{
        if (isEmpty()){
            throw new Exception("Linked List kosong");
        }
        return head.data;
    }
    public int getLast() throws Exception{
        if(isEmpty()){
            throw new Exception("Lingked List Kosong");
        }
        Node tmp = head;
        while (tmp.next != null){
            tmp = tmp.next;
        }
        return tmp.data;
    }
    public int get(int index) throws Exception{
        if (isEmpty()|| index >= size){
            throw new Exception("nilai indeks di luar batas.");
        }
        Node tmp = head;
        for (int i = 0; i<index; i++){
            tmp = tmp.next;
        }
        return tmp.data;
    }

        dll.print();
    System.out.println("Size : " + dll.size());
    System.out.println("=================================");
    dll.addFirst(3);
    dll.addLast(4);
    dll.addFirst(7);
    dll.print();
    System.out.println("Size : " + dll.size());
    System.out.println("=================================");
    dll.add(40,1);
    dll.print();
    System.out.println("Size : " + dll.size());
    System.out.println("=================================");
    System.out.println("Data awal pada Linked Lists adalah: " + dll.getFirst());
    System.out.println("Data akhir pada Linked List adalah: " + dll.getLast());
    System.out.println("Data indeks ke-1 pada Linked List adalah: " + dll.get(1));
```

Hasil Run

<img src = "hsl3.jpg">

Pertanyaan Percobaan 3

1. Jelaskan method size() pada class DoubleLinkedLists!
Untuk memanggil size atau untuk mengetahui banyaknya node
2. Jelaskan cara mengatur indeks pada double linked lists supaya dapat dimulai dari indeks 
ke1!
Dengan cara menginisialisasi perulangan index dari 1
3. Jelaskan perbedaan karakteristik fungsi Add pada Double Linked Lists dan Single Linked 
Lists!
4. Jelaskan perbedaan logika dari kedua kode program di bawah ini!
A) jika size == 0 maka true is empty jika tidak ya false
B) mengecek apakah head == null