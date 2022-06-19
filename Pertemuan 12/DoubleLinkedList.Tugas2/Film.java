package DoubleLinkedList.Tugas2;

public class Film {
    NodeFilm head;
    int size;
    
    public Film(){
        head = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void addFirst(int idFilm, String judul, double rate){
        if(isEmpty()){
            head = new NodeFilm(null, idFilm, judul, rate, null);
        }else{
            NodeFilm newNode = new NodeFilm(null, idFilm, judul, rate, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
    public void addLast(int idFilm, String judul, double rate){
        if(isEmpty()){
            addFirst(idFilm, judul, rate);
        }else{
            NodeFilm current = head;
            while(current.next != null){
                current = current.next;
            }
            NodeFilm newNode = new NodeFilm(current, idFilm, judul, rate, null);
            current.next = newNode;
            size++;
        }
    }
    
    public void add(int idFilm, String judul, double rate, int index) throws Exception{
        if(isEmpty()){
            addFirst(idFilm, judul, rate);
        }else if(index < 0 || index > size){
            throw new Exception("Nilai indeks di luar batas");
        }else{
            NodeFilm current = head;
            int i = 0;
            while(i<index){
                current = current.next;
                i++;
            }if(current.prev == null){
                NodeFilm newNode = new NodeFilm(null, idFilm, judul, rate, current);
                current.prev = newNode;
                head = newNode;
            }else{
                NodeFilm newNode = new NodeFilm(current.prev, idFilm, judul, rate, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    
    public int size(){
        return size;
    }
     
    public void removeFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("Data Film masih kosong, tidak dapat dihapus!");
        }else if(size == 1){
            removeLast();
        }else{
            NodeFilm tmp = head;
            head = head.next;
            head.prev = null;
            size--;
            System.out.println("Data Film Berhasil dihapus");
            System.out.println("ID Film : " + tmp.idFilm);
            System.out.println("Judul Film : " + tmp.judul);
            System.out.println("Rate Film : " + tmp.rate);
        }
    }
    
    public void removeLast() throws Exception{
        if(isEmpty ()){
            throw new Exception("Data Film masih kosong, tidak dapat dihapus!");
        }else if(head.next == null){
            head = null;
            size--;
            return;
        }
        NodeFilm current = head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
        size--;
        System.out.println("Data Film Berhasil dihapus");
        System.out.println("ID Film : " + current.idFilm);
        System.out.println("Judul Film : " + current.judul);
        System.out.println("Rate Film : " + current.rate);
    }
    
    public void remove(int index) throws Exception{
        if(isEmpty() || index >= size){
            throw new Exception("Nilai indeks di luar batas");
        }else if(index == 0){
            removeFirst();
        }else{
            NodeFilm current = head;
            int i = 0;
            while (i < index){
                current = current.next;
                i++;
            }if(current.next == null){
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
            System.out.println("Data Film Berhasil dihapus");
            System.out.println("ID Film : " + current.idFilm);
            System.out.println("Judul Film : " + current.judul);
            System.out.println("Rate Film : " + current.rate);
        }
    }
    
    public void print(){
        if(!isEmpty()){
            NodeFilm tmp = head;
            while(tmp != null){
                System.out.println("ID Film : " + tmp.idFilm);
                System.out.println("Judul Film : " + tmp.judul);
                System.out.println("Rate Film : " + tmp.rate);
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil diisi");
        }else{
            System.out.println("Data Kosong");
        }
    }
    
    public void cari(int idFilm) throws Exception{
        NodeFilm tmp = head;
        while(tmp != null){
            if(idFilm == tmp.idFilm){
                System.out.println("ID Film : " + tmp.idFilm);
                System.out.println("Judul Film : " + tmp.judul);
                System.out.println("Rate Film : " + tmp.rate);
            }
            tmp = tmp.next;
        }
    }
    
    public void BubbleShort() throws Exception{
        if(isEmpty()){
            throw new Exception("Data Film Kosong");
        }else{
            NodeFilm current = null, index = null;
            double temp;
            String tmp;
            int temp1;
            for(current = head; current.next != null; current = current.next){
                for(index = current.next; index != null; index = index.next){
                    if(current.rate < index.rate){
                        temp = current.rate;
                        tmp = current.judul;
                        temp1 = current.idFilm;
                        current.rate = index.rate;
                        current.judul = index.judul;
                        current.idFilm = index.idFilm;
                        index.rate = temp;
                        index.judul = tmp;
                        index.idFilm = temp1;
                    }
                }
            }
        }
    }
}
