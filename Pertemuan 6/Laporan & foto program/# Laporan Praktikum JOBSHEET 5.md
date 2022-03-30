# Laporan Praktikum JOBSHEET 5 
## SORTING (BUBBLE, SELECTION, DAN INSERTION SORT)

oleh Bima Putra W - 2141720255
TI-1G_08

## 5.2 Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Bubble Sort
### Program
<img src = "pro1,1.jpg">
<img src = "pro1,2,1.jpg">
<img src = "pro1,2,2.jpg">
Main
<img src = "pro1,3.jpg">

### Veririkasi Hasil
<img src = "hsl1.jpg">

### 5.2.3 Pertanyaan 

1. Terdapat di method apakah proses bubble sort?
terdapat pada method bubbleSort() pada class DaftarMahasiswaBerprestasi

2. Terdapat di method apakah proses selection sort?
di method selectionSort(), dan untuk percobaan 5.2 diatas tidak ada method selectionsort.

3. Apakah yang dimaksud proses swap? Tuliskan potongan program untuk melakukan proses swap tersebut! 
proses swap adalah proses penukaran posisi nilai dari suatu index ke posisi index yang lain dengan model tertenu. Misalnya urutan nilai ipk yang paling besar ke yang paling kecil, maka akan diurutkan sesuai posisinya dengan cara membandingkan secara bertahap dan berulang.
contoh :
Mahasiswa tmp = listMhs[j];
listMhs[j] = listMhs[j-1];
listMhs[j-1] = tmp;

4. Di dalam method bubbleSort(), terdapat baris program seperti di bawah ini:Untuk apakah proses tersebut?
Digunakan untuk menyeleksi bilangan dan melakukan swapping sehingga nilai ipk akan diurutkan dari bilangan yang terbesar ke yang terkecil. Pada kondisi if itu apakah nilai ipk dari index (j) lebih besar dari nilai ipk indek (j-1). Jika benar nilai ipk indek (j) akan dimasukkan ke dalam variable baru. Dan pada index (j) akan diberikan nilai dari index (j-1). Terakhir itu pada index (j-1) akan diisi dengan nilai variable tmp. Proses tersebut adalah proses penukaran nilai dari index satu ke index lainnya

5. Perhatikan perulangan di dalam bubbleSort() di bawah ini:
a. Apakah perbedaan antara kegunaan perulangan i dan perulangan j? 
Perulangan i digunakan untuk menyeleksi baris dari setiap perulangan yang berlangsung saat melakukan proses bubbleSort. Perulangan j digunakan untuk menyeleksi perulangan pada proses swapping. Pada proses penukaran tempat (swap) setiap kali membandingkan bilangan satu dengan bilangan satunya lagi dan otomatis perulangannya akan berkurang 1.

b. Mengapa syarat dari perulangan i adalah i<listMhs.length-1 ?
karena nilai dari i dimulai dari 0, sehingga untuk memenuhi kondisi jumlah panjang array dari listMhs adalah 5. Jadi dimulai dari 0 dan batas perulangannya
listMhs.length-1 (berarti 4). Rumus perulangan untuk melakukan bubbleSort itu n-1.

c. Mengapa syarat dari perulangan j adalah j<listMhs.length-i ?
Karena jika i saja akan melakukan perulagan sebelumnya dan perulangan index tidak berulang kembali, perulangan j juga merupakan bagian dari perulangan i, banyak data pada proses yang akan dicek dan diswap akan selalu berkurang 1,
misalnya pada proses pertama, banyak data yang akan dihitung dan swap adalah sebanyak 5, pada proses kedua sebanyak 14, begitu seterusnya sampai 2 data saja.

d. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh? 
perulangan i akan berlangsung 49 kali. Tahapan bubble sort akan berlangsung sebanyak 1225 tahap

## 5.3 Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Selection Sort
### Program
<img src = "pro1,1.jpg">
<img src = "pro2,1.jpg">
<img src = "pro2,2.jpg">
Main
<img src = "pro2,3.jpg">

### Veririkasi Hasil
<img src = "hsl2.jpg">

3. Hasil sudah menunjukkan urutan sesuai ipk terbesar

### 5.2.3 Pertanyaan 

Di dalam method selection sort, terdapat baris program seperti di bawah ini:
Untuk apakah proses tersebut, jelaskan!
Proses tersebut digunakan untuk menyeleksi nilai ipk dari setiap index, jika nilai ipk dari index [j] lebih kecil dari nilai ipk index [idxMin] maka akan di pindahkan posisinya ke dalam variable idxMin dengan menukar posisi nilai ipk dari yang terkecil ke yang terbesar.

## 5.4 Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Insertion Sort

### Program
<img src = "pro1,1.jpg">
<img src = "pro3,1.jpg">
<img src = "pro3,2.jpg">

Main

<img src = "pro3,3.jpg">
<img src = "pro3,4.jpg">

### Veririkasi Hasil
<img src = "hsl3.jpg">

### 5.2.3 Pertanyaan 

Ubahlah fungsi pada InsertionSort sehingga fungsi ini dapat melaksanakan proses sorting dengan cara ascending atau decending, anda dapat melakukannya dengan menambahkan 
parameter pada pemanggilan fungsi insertionSort
Praktek 
<img src = "noAkhir1.jpg">
<img src = "noAkhir2.jpg">

### Praktek 
<img src = "proPrak1.jpg">
<img src = "proPrak2.jpg">
<img src = "proPrak3.jpg">
<img src = "proPrak4.jpg">

### Hasil
<img src = "praktek.jpg">