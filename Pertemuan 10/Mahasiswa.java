/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author adesta
 */
public class Mahasiswa {
    String nim;
    String nama;
    int absen;
    double ipk;
    
    Mahasiswa(String nim, String nama, int absen, double ipk){
        this.nim = nim;
        this.nama = nama;
        this.absen = absen;
        this.ipk = ipk;
    }
    
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    
    Mahasiswa(){
        
    }
    
    public Mahasiswa(int n){
        max = n;
        data = new Mahasiswa[max];
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
    
    public void Enqueue(Mahasiswa dt){
        if(IsFull()){
            System.out.println("Antrian sudah penuh");
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
    
    public Mahasiswa Dequeue(){
        Mahasiswa dt = new Mahasiswa();
        if(IsEmpty()){
            System.out.println("Antrian masih kosong");
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
    
    public void print(){
        if(IsEmpty()){
            System.out.println("Antrian masih kosong");
        }else{
            int i = front;
            while(i != rear){
                System.out.print(data[i].nim + " " + data[i].nama + " " + 
                        data[i].absen + " " + data[i].ipk);
                i = (i+1) % max;
            }
            System.out.println(data[i].nim + " " + data[i].nama + " " + 
                        data[i].absen + " " + data[i].ipk);
            System.out.println("Jumlah Mahasiswa = " + size);
        }
    }
    
    public void peek(){
        if(!IsEmpty()){
            System.out.println("Antrian terdepan : " + data[front].nim + " " + 
                    data[front].nama + " " + data[front].absen + " " + data[front].ipk);
        }else{
            System.out.println("Antrian masih kosong");
        }
    }
    
    public void peekRear(){
        if (!IsEmpty()) {
            System.out.println("Antrian paling belakang : " + data[rear].nim + " " + data[rear].nama + " "
            + data[rear].absen + " " + data[rear].ipk );
        }else{ 
            System.out.println("Antrian masih kosong");
        }

    }
    
    public void peekPosition(String nim){
        if(IsEmpty()){
            System.out.println("Antrian kosong");
        }else{
            for(int i=0; i<data.length; i++){
                if(nim.equalsIgnoreCase(data[i].nim)){
                    System.out.println(data[i].nim + " " + data[i].nama + " " + 
                        data[i].absen + " " + data[i].ipk);
                    break;
                }
            }
        }
    }
    
    public void printMahasiswa(int m){
        if(IsEmpty()){
            System.out.println("Antrian masih kosong");
        }else{
            int counter = 0;
            int i = front;
            while(i != rear){
                if(i==m){
                    System.out.println("Antrian indeks ke-" + i + " yaitu " + data[i].nim 
                    + " " + data[i].nama + " " + data[i].absen + " " + data[i].ipk);
                    counter++;
                }
                i=(i+1)%max;
            }
            if(counter !=1){
                System.out.println("Antrian indeks ke-" + i + " yaitu " + data[i].nim 
                    + " " + data[i].nama + " " + data[i].absen + " " + data[i].ipk);
            }
        }
    }
}
