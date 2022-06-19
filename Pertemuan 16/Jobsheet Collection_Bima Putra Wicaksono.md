# Collection
Bima Putra Wicaksono
1G_08_2141720255

16.2.	Kegiatan Praktikum 1
16.2.1.	Percobaan 1
Pada percobaan 1 ini akan dicontohkan penggunaan collection untuk menambahkan sebuah elemen, mengakses elemen, dan menghapus sebuah elemen.
1.	Buatlah sebuah class ContohList yang main methode berisi kode program seperti di bawah ini
<img src = "1.jpg">
2.	Tambahkan kode program untuk menggunakan collection dengan aturan penulisan kode program seperti berikut
<img src = "2.jpg">
16.2.2.	Verifikasi Hasil Percobaan
 <img src = "3.jpg">
16.2.3.	Pertanyaan Percobaan
1.	Perhatikan baris kode 25-36, mengapa semua jenis data bisa ditampung ke dalam sebuah Arraylist?
•	Karena dalam tipe data tersebut tidak ada kurung siku yang menyatakan tipe data apa yang bisa disimpan. Sehingga bisa menyimpan atau menampung semua jenisa data
2.	Modifikasi baris kode 25-36 seingga data yang ditampung hanya satu jenis atau spesifik tipe tertentu!
•	Class
<img src = "4.jpg">
3.	Ubah kode pada baris kode 38 menjadi seperti ini
<img src = "5.jpg">
•	Jawab
 <img src = "6.jpg">
4.	Tambahkan juga baris berikut ini, untuk memberikan perbedaan dari tampilan yang sebelumnya
 <img src = "7.jpg">
•	Class
 <img src = "8.jpg">
5.	Dari penambahan kode tersebut, silakan dijalankan dan apakah yang dapat Anda jelaskan!
•	Hasil Running
<img src = "9.jpg">
Pada tambahan kode program di atas terjadi penambahan data yaitu data Mei-mei
16.3.	Kegiatan Praktikum 2
16.3.1.	Tahapan Percobaan
Pada praktikum 2 ini akan dibuat beberapa method untuk menampilkan beberapa cara yang dapat dilakukan untuk mengambil/menampilkan elemen pada sebuah collection. Silakan ikutilah Langkah-langkah di bawah ini
1.	Buatlah class dengan nama LoopCollection serta tambahkan method main yang isinya adalah sebagai berikut
 <img src = "10.jpg">
2.	Tambahkan potongan kode berikut ini dari yang sebelumnya agar proses menampilkan elemen pada sebuah stack bervariasi.
 <img src = "11.jpg">
 
16.3.2.	Verifikasi Hasil Percobaan
<img src = "12.jpg">
16.3.3.	Pertanyaan Percobaan
1.	Apakah perbedaan fungsi push() dan add() pada objek fruits?
•	Jika push akan menggunakan sistem LIFO yaitu Last In First Out. Jika add tidak. Untuk fungsinya sama, yaitu sama-sama menambahkan objek, push dimiliki oleh class stack, sedangakan add ada pada interface / ada pada listnya
2.	Silakan hilangkan baris 43 dan 44, apakah yang akan terjadi? Mengapa bisa demikian?

•<img src = "13.jpg">
Ketika dilakukan run, maka yang terjadi adalah data melon dan durian tidak muncul di output karena kedua data tersebut tidak dimasukkan atau tidak berada di dalam stack
3.	Jelaskan fungsi dari baris 46-49?
•	Berfungsi menampilkan isi dari stack tersebut dengan melakukan looping / perulangan
4.	Silakan ganti baris kode 25, Stack menjadi List dan apakah yang terjadi? Mengapa bisa demikian?
 
•	Akan terjadi error pada kode program. Karena pada class tersebut menggunakan method yang ada di dalam collection Stack, bukan collection List
5.	Ganti elemen terakhir dari dari objek fruits menjadi “Strawberry”!
•	Class
<img src = "14.jpg">
•	Output
 <img src = "15.jpg">
6.	Tambahkan 3 buah seperti “Mango”,”guava”, dan “avocado” kemudian dilakukan sorting!
•	Class
<img src = "16.jpg">
•	Output
 <img src = "17.jpg">
 
16.4.	Kegiatan Praktikum 3
16.4.1.	Tahapan Percobaan
Pada praktikum 3 ini dilakukan uji coba untuk mengimplementasikan sebuah collection untuk menampung objek yang dibuat sesuai kebutuhan. Objek tersebut adalah sebuah objek mahasiswa dengan fungsi-fungsi umum seperti menambahkan, menghapus, mengubah, dan mencari.
1.	Buatlah sebuah class Mahasiswa dengan attribute, kontruktor, dan fungsi sebagai berikut
 <img src = "18.jpg">
2.	Selanjutnya, buatlah sebuah class ListMahasiswa yang memiliki attribute seperti di bawah ini
 <img src = "19.jpg">
3.	Method tambah(), hapus(), update(), dan tampil() secara berurut dibuat agar bisa melakukan operasi-operasi seperti yang telah disebutkan
<img src = "20.jpg"> 
4.	Untuk proses hapus, update membutuhkan fungsi pencarian terlebih dahulu yang potongan kode programnya adalah sebagai berikut
 <img src = "21.jpg">
 
5.	Pada class yang sama, tambahkan main method seperti potongan program berikut dan amati hasilnya!
 <img src = "22.jpg">
16.4.2.	Verifikasi Hasil Percobaan
<img src = "23.jpg">
16.4.3.	Pertanyaan Percobaan
1.	Pada fungsi tambah() yang menggunakan unlimited argument itu menggunakan konsep apa? Dan kelebihannya apa?
•	Menggunakan kelebihannya yaitu dapat mengambil argument tanpa batas tertentu dan memiliki parameter lebih dari satu
2.	Pada fungsi linearSearch() di atas, silakan diganti dengan fungsi binarySearch() dari collection!
•	Import collection
 <img src = "24.jpg">
 
•	Menambahkan class MhsComparator
<img src = "25.jpg">
•	Tambah kode program di ListMahasiswa
 <img src = "26.jpg">
3.	Tambahkan fungsi sorting baik secara ascending ataupun descending pada class tersebut!
•	Method asc dan desc pada class ListMahasiswa
 <img src = "27.jpg">
•	Pemanggilan methode asc dan desc pada ListMahasiswa
<img src = "28.jpg">
•	Output
<img src = "29.jpg"> 
