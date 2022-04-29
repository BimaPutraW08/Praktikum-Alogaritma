
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

/**
 *
 * @author adesta
 */
public class Queue {
    int[] data;
    int front;
    int rear;
    int size;
    int max;
    
    public Queue(int n){
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }
    
    public boolean IsEmpty(){
        if(size==0){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean IsFull(){
        if(size==max){
            return true;
        }else{
            return false;
        }
    }
    
    public void peek(){
        if(!IsEmpty()){
            System.out.println("Elemen terdepan : " + data[front]);
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    
    public void print(){
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
        }else{
            int i = front;
            while(i != rear){
                System.out.print(data[i] + " ");
                i = (i+1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }
    
    public void clear(){
        if(!IsEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    
    public void Enqueue(int dt){
        if(IsFull()){
            System.out.println("Queue sudah penuh");
        }else{
            if(IsEmpty()){
                front = rear = 0;
            }else{
                if(rear == max - 1){
                    rear = 0;
                }else{
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }
    
    public int Dequeue(){
        int dt = 0;
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
        }else{
            dt = data[front];
            size--;
            if(IsEmpty()){
                front = rear =-1;
            }else{
                if(front == max - 1){
                    front = 0;
                }else{
                    front++;
                }
            }
        }
        return dt;
    }
    
    //Tugas1
    public void peekPosition(int m){
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
        }else{
            int counter = 0;
            int i = front;
            while(i != rear){
                if(data[i] == m){
                    System.out.println("Nilai " + data[i] + " terletak pada indeks ke-" + i);
                    counter++;
                }
                i=(i+1)%max;
            }
            if(counter !=1){
                System.out.println("Nilai " + data[i] + " terletak pada indeks ke-" + i);
            }
        }
    }
    
    public void peekAt(int pos){
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
        }else{
            int counter = 0;
            int i = front;
            while(i != rear){
                if(i==pos){
                    System.out.println("Pada indeks ke-" + i + " terdapat nilai " + data[i]);
                    counter++;
                }
                i=(i+1)%max;
            }
            if(counter !=1){
                System.out.println("Pada indeks ke-" + i + " terdapat nilai " + data[i]);
            }
        }
    }
}
