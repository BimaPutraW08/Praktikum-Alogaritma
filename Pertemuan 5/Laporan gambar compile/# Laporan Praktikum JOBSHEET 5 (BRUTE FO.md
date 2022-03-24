# Laporan Praktikum JOBSHEET 5 
## (BRUTE FORCE DAN DIVIDE CONQUER)

oleh Bima Putra W - 2141720255
TI-1G_08

## 4.2 Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer
### KODE PROGRAM

<img src = "pro1.jpg">
Main
<img src = "proMain1.jpg">

### HASIL
<img src = "hsl1.jpg">

### Pertanyaan 

1. Jelaskan mengenai base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial!
program berisi "jika nilai dari n sudah equals atau = 1, maka akan ke return 1. Jika tidak maka nilai variable n akan di- 1, dimana setiap perulangan yang di lakukan pada method akan dikalikan dengan nilai sebelumnya, kemudian program akan mereturn pada variable fakto 

2. Pada implementasi Algoritma Divide and Conquer Faktorial apakah lengkap terdiri dari 3 tahapan divide, conquer, combine? Jelaskan masing-masing bagiannya pada kode program!
- Divide = faktorialDC(n-1) pengurangan pada nilai n. 
- Conquer = n*.faktorialDC(n-1) penyelesaian dengan rekursif. 
- Combine = n*faktorialDC(n-1) pengombinasian dengan perkalian. 

3. Apakah memungkinkan perulangan pada method faktorialBF() dirubah selain menggunakan 
for?Buktikan!
mungkin saja diubah menggunakan while
Program
<img src = "proSoalNo3.jpg">
Hasil 
<img src = "hslSoalNo3.jpg">

4. Tambahkan pegecekan waktu eksekusi kedua jenis method tersebut!
Program
<img src = "proSoalNo4,1.jpg">
<img src = "proSoalNo4,2.jpg">
Hasil 
<img src = "hslSoalNo4.jpg">

5. Buktikan dengan inputan elemen yang di atas 20 angka, apakah ada perbedaan waktu eksekusi?
Hasil 
<img src = "hslSoalNo5,1.jpg">
<img src = "hslSoalNo5,2.jpg">
menghasilkan waktu yang berbeda

## 4.3 Menghitung Hasil Pangkat dengan Algoritma Brute Force dan Divide and Conquer

### KODE PROGRAM

<img src = "pro2.jpg">
Main
<img src = "proMain2.jpg">

### HASIL
<img src = "hsl2.jpg">

### Pertanyaan 
1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu PangkatBF() dan PangkatDC()!
method pangkatBF() menggunakan fungsi iterative (melakukan perulangan terhadap sekelompok intruksi dengan syarat tertentu dan berhenti ketika syarat tidak terpenuhi

method pangkatDC() menggunakan fungsi rekursif (terjadi akibat pengeksekusian suatu fungsi dimana fungsi tersebut memanggil dirinya sendiri)

2. Pada method PangkatDC() terdapat potongan program sebagai berikut:
Jelaskan arti potongan kode tersebut
berarti jika terdapat suatu bilangan ganjil maka variable n akan terbagi 2, dikalikan dengan method itu sendiri dan dikalikan lagi dengan variable a. Jika terdapat suatu bilangan genap maka program akan mereturn/nilai balik yang di dalamnya dilakukan pembagian terhadap variable n, kemudia variable n akan terbagi 2, dikalikan dengan method itu sendiri tapi  tidak dikalikan lagi dengan variable a

3. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!
Tahap combine sudah terjadi dan lebih tepatnya tahapan tersebut di lakukan pada class Pangkat yang terletak pada method pangkatDC dan berada di baris kode ke 20, seperti pada gambar di bawah ini : 
<img src = "proSoalNo3Kedua.jpg">

4. Modifikasi kode program tersebut, anggap proses pengisian atribut dilakukan dengan konstruktor.

Program
<img src = "proSoalNo4Kedua.jpg">
<img src = "proSoalNo4Kedua,2.jpg">
Hasil 
<img src = "hslSoalNo4Kedua.jpg">

5. Tambahkan menu agar salah satu method yang terpilih saja yang akan dijalankan!
Program
<img src = "proSoalNo5Kedua1.jpg">
<img src = "proSoalNo5Kedua12.jpg">
<img src = "proSoalNo5Kedua123.jpg">
hasil
<img src = "hslSoalNo5kedua1.jpg">
<img src = "hslSoalNo5kedua12.jpg">

## 4.4 Menghitung Sum Array dengan Algoritma Brute Force dan Divide and Conquer

### KODE PROGRAM

<img src = "pro3.jpg">
Main
<img src = "proMain3.jpg">

### HASIL
<img src = "hsl3.jpg">

### Pertanyaan 
1. Berikan ilustrasi perbedaan perhitungan keuntungan dengan method TotalBF() ataupun TotalDC()
method TotalBF() : kode program terkesan lebih ringkas dan sederhana, dan menjadikannya lebih mudah untuk di pahami kemudian menghasilkan algoritma yang standard untuk tugas 
tugas komputasi. 
method TotalDC() : kode program lebih panjang daripada kode program pada method TotalBF(),namun method ini memiliki keuntungan yang mana pada method ini memiliki efisiensi algoritma yang tinggi dan juga pada method ini memiliki sistemkerja parallel. 

2. Perhatikan output dari kedua jenis algoritma tersebut bisa jadi memiliki hasil berbeda di belakang koma. Bagaimana membatasi output di belakang koma agar menjadi standar untuk kedua jenis algoritma tersebut.
Dengan cara mengganti syntax println menjadi syntax printf dan juga teknik pembatasan karakter

System.out.print("%2f", "Total keuntungan selama" +sm.elemen +" bulan adalah : " + sm.totalBF(sm.keuntungan));

3. Mengapa terdapat formulasi return value berikut?Jelaskan!
Return value berguna untuk mengembalikan nilai dari variable lsum,variable rsum dan juga arr [mid] masing-masing dijumlahkan terlebih dahulu. 

4. Kenapa dibutuhkan variable mid pada method TotalDC()?
untuk menampung nilai dari perhitungan (1+r)/2 dimana akan digunakan untuk pengisian nilai pada parameter di method TotalDC()

5. Program perhitungan keuntungan suatu perusahaan ini hanya untuk satu perusahaan saja. Bagaimana cara menghitung sekaligus keuntungan beberapa bulan untuk beberapa perusahaan.(Setiap perusahaan bisa saja memiliki jumlah bulan berbeda-beda)? Buktikan dengan program!
<img src = "proAkhir.jpg">  
main
<img src = "proAkhir1.jpg">
<img src = "proAkhir12.jpg">

proAkhir12

### Latihan Praktikum

### KODE PROGRAM

<img src = "ProLaprak1.jpg">
<img src = "ProLaprak2.jpg">
Main
<img src = "ProLaprakMain.jpg">

### HASIL
<img src = "hslLaprak.jpg">