//Fajar Indarto - Kuis 1 Aplikasi Peminjaman Buku Perpustakaan Unila
package com.tutorial;

class Mahasiswa{
    String nama;
    int npm;
    String prodi;
    String alamat;
    String noHP;
    Buku perpus;

    //Method
    void pinjamBuku (Buku perpus){
        this.perpus = perpus;
    }

    //Constructor
    Mahasiswa(String nama, int npm, String prodi, String alamat, String noHP){
        this.nama = nama;
        this.npm = npm;
        this.prodi = prodi;
        this.alamat = alamat;
        this.noHP = noHP;
    }

    void detailMahasiswa (){
        System.out.println("Detail Mahasiswa");
        System.out.println("Nama                     : " + nama);
        System.out.println("NPM                      : " + npm);
        System.out.println("Program Studi            : " + prodi);
        System.out.println("Alamat                   : " + alamat);
        System.out.println("No Handphone             : " + noHP);
        perpus.detailBuku();
        perpus.statusBuku();
    }
}

class Buku{
    String namaBuku;
    String kodeBuku;
    String pengarang;
    String penerbit;
    String tanggal;
    String waktu;

    //Constructor
    Buku (String namaBuku, String kodeBuku, String pengarang, String penerbit, String tanggal, String waktu){
        this.namaBuku = namaBuku;
        this.kodeBuku = kodeBuku;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tanggal = tanggal;
        this.waktu = waktu;
    }

    //Method
    void detailBuku (){
        System.out.println("---------------------------------------");
        System.out.println("Detail Buku ");
        System.out.println("Judul Buku               : " + namaBuku);
        System.out.println("Kode Buku                : " + kodeBuku);
        System.out.println("Pengarang                : " + pengarang);
        System.out.println("Penerbit                 : " + penerbit);
    }
    void statusBuku (){
        System.out.println("---------------------------------------");
        System.out.println("Status Peminjaman Buku");
        System.out.println("Tanggal Pinjam           : " + tanggal);
        System.out.println("Tanggal Kembali          : " + waktu);
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
    }
}

public class Main {

    public static void main(String[] args) {
	Mahasiswa Wendy =new Mahasiswa("Wendy", 2015063114, "Teknologi Pesawat", "Jl Kangguru No. 90 Jakarta Raya", "081255886699");
    Buku Cinta = new Buku("Cinta Brontosaurus", "AC01", "Raditya Dika", "Gramedia", "01 Februari 2022", "08 Februari 2022");

    Wendy.pinjamBuku(Cinta);
    Wendy.detailMahasiswa();

    Mahasiswa Irene = new Mahasiswa("Irene", 2055079881,"Kedokteran Hewan", "Jl Korea Selatan No. 1 Bandung", "086988914444");
    Buku IPS = new Buku("Ilmu Pengetahuan Sosial Kelas 7", "IP09", "Iwan Setiawan", "Kemendikbud", "21 Agustus 2019", "28 Agustus 2019");

    Irene.pinjamBuku(IPS);
    Irene.detailMahasiswa();
    }
}
