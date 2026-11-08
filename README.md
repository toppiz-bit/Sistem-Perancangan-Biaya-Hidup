# Sistem-Perancangan-Biaya-Hidup
Program ini dibuat untuk membantu merancang  rencana biaya hidup. Dibuat untuk memenuhi tugas mata kuliah Pemrograman Berorientasi Objek.
# Sistem Perancangan Biaya Hidup

Sistem Perancangan Biaya Hidup adalah program Java berbasis terminal yang membantu pengguna membagi anggaran bulanan ke dalam lima kategori. Program ini dibuat untuk memenuhi tugas mata kuliah **Pemrograman Berorientasi Objek (PBO)**.

## Pembagian Anggaran

Pengguna memasukkan satu nominal dalam rupiah. Program kemudian menghitung dan menampilkan jumlah dana untuk setiap kategori berdasarkan persentase berikut.

| Kategori | Persentase | Contoh dari Rp4.000.000 |
| --- | ---: | ---: |
| Kebutuhan Pokok Bulanan | 50% | Rp2.000.000 |
| Investasi | 20% | Rp800.000 |
| Dana Darurat | 15% | Rp600.000 |
| Kirim Orang Tua | 10% | Rp400.000 |
| Hiburan | 5% | Rp200.000 |
| **Total** | **100%** | **Rp4.000.000** |

## Penerapan Pemrograman Berorientasi Objek

Seluruh kelas program berada di dalam file `PlanLife.java`.

- **Abstraksi.** Kelas abstrak `AlokasiDana` mendefinisikan metode `hitung(double gaji)` yang wajib diimplementasikan oleh setiap kelas turunan.
- **Pewarisan.** Kelas `KebutuhanPokok`, `Investasi`, `DanaDarurat`, `KirimOrtu`, dan `Hiburan` mewarisi kelas `AlokasiDana`.
- **Polimorfisme.** Kelas utama `PlanLife` menyimpan objek dari kelima kategori dalam satu array `AlokasiDana[]`. Saat `hitung()` dipanggil dalam perulangan, Java menjalankan metode yang sesuai dengan kelas masing-masing objek.

## Cara Menjalankan Program

1. Pastikan **Java Development Kit (JDK)** sudah terpasang.
2. Buka folder proyek di VS Code, lalu buka **Terminal → New Terminal**. Pastikan terminal berada di folder yang berisi `PlanLife.java`.
3. Kompilasi dan jalankan program dengan perintah berikut.

   ```powershell
   javac PlanLife.java
   java PlanLife
   ```

4. Saat program meminta total biaya bulanan, masukkan angka tanpa simbol `Rp` atau pemisah ribuan, misalnya `4000000`, lalu tekan **Enter**. Rincian alokasi dana akan tampil di terminal.
