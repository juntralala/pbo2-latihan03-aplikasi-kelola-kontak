# Aplikasi Kelola Kontak
## Dependencies

Link sumber untuk [JDBC Driver SQLite](https://github.com/xerial/sqlite-jdbc). 

## My Bio
Nama : Muhammad Junaidi <br>
NPM  : 2210010097 <br>
Kelas: 5B TI REG BJB Pagi <br>

## Features Demo
### Aplikasi awal dibuka
![](images/first-opened.png)

### Simpan Data Kontak
1. Simpan Sukses
![](images/klik_simpan.png)

2. Simpan gagal, data nama kosong
![](images/klik_simpan_nama_kosong.png)

3. Simpan gagal, data telepon kosong
![](images/klik_simpan_no_telepon_kosong.png)

4. Simpan gagal, nomer telepon terlalu pendek
![](images/klik_simpan_no_telepon_terlalu_pendek.png)

5. Simpan gagal, nomer telepon terlalu panjang
![](images/klik_simpan_no_telepon_terlalu_panjang.png)

6. Simpan gagal, kategori belum dipilih
![](images/klik_simpan_kategori_belum_dipilih.png)

### Baris data kontak pada table diklik
![](images/baris_data_table_di_klik.png)

### Edit Data Kontak
![](images/klik_edit.png)

### Hapus Data Kontak
1. Konfirmasi apakah data kontak yakin untuk dihapus
![](images/klik_hapus_confirm.png)

2. Hapus data kontak dikonfirmasi
![](images/klik_hapus_sukses.png)

### Pencarian Kontak
1. Cari berdasarkan nama
![](images/cari_nama.png)

2. Cari berdasarkan nomer telepon
![](images/cari_telepon.png)

### Export ke CSV
1. Klik tombol Export, masukkan nama file dan pilih lokasi menyimpan file csv
![](images/export_csv.png)

2. Klik Save, maka akan file telah ter-export
![](images/export_csv_sucess.png)

3. Periksa file csv yang telah kita export
![](images/export_csv_file.png)

### Import data dari file CSV
1. Klik tombol Import, dan pilih file target
![](images/import_csv.png)

2. Klik open, maka file telah ter-import ke dalam database
![](images/import_csv_success.png)