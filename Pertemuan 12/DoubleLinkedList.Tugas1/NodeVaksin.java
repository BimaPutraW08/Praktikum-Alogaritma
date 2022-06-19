package DoubleLinkedList.Tugas1;

public class NodeVaksin {
    int nomorAntri;
    String nama;
    NodeVaksin prev, next;
    
    NodeVaksin(NodeVaksin prev, int data, String nama, NodeVaksin next){
        this.prev = prev;
        this.nomorAntri = nomorAntri;
        this.nama = nama;
        this.next = next;
    }
}