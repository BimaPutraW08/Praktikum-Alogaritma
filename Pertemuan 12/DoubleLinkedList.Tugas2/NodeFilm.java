package DoubleLinkedList.Tugas2;

public class NodeFilm {
    int idFilm;
    String judul;
    double rate;
    NodeFilm prev, next;
    
    NodeFilm(NodeFilm prev, int idFilm, String judul, double rate, NodeFilm next){
        this.prev = prev;
        this.idFilm = idFilm;
        this.judul = judul;
        this.rate = rate;
        this.next = next;
    }
}
