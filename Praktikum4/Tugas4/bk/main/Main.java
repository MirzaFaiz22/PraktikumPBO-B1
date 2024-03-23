package main;
import buku.*;
import bukuFiksi.*;
import bukunonFiksi.*;

public class Main {
    public static void main(String[] args) {
        // Object buku
        Buku buku = new Buku("Laskar Pelangi", "Andrea Hirata", "2005");
        Buku bukuNovel = new Buku("Percy Jackson", "Rick Riordan", "2009");
        Buku bukuAkademik = new Buku("Buku Dasar-Dasar Teknik Informatika", "Novega Pratama Adiputra", "2020");
        Buku bukuNonFiksi = new Buku("Soekarno Sang Guru Bangsa", "Anom Whani Wicaksana", "2017");

        // Object bukuFiksi (Note: You can use this object as needed)
        bukuNovel novel = new bukuNovel(bukuNovel.getJudul(), bukuNovel.getPenulis(), bukuNovel.getTahunTerbit(), "Fantasy", 300, 3000000);

        // Buku NonFiksi (Note: You can use this object as needed)
        bukuNonFiksi autobiografi = new bukuNonFiksi(bukuNonFiksi.getJudul(), bukuNonFiksi.getPenulis(), bukuNonFiksi.getTahunTerbit(), "Biografi", 200, 50000);

        // Buku Akademik (Note: You can use this object as needed)
            bukuNovel akademik = new bukuNovel(bukuAkademik.getJudul(), bukuAkademik.getPenulis(), bukuAkademik.getTahunTerbit(), "Buku Referensi", 400, 86000);// Informasi semua buku
            System.out.println("--------------------  Informasi Buku : --------------------");
            buku.view();
            System.out.println();
            bukuNovel.view();
            System.out.println();
            bukuAkademik.view();
            System.out.println();

            System.out.println("---------------- Buku Fiksi : ----------------");
            System.out.println("Buku Novel :");
            bukuNovel.view();
            novel.view();
            System.out.println();

            System.out.println("--------------------  Buku Non Fiksi : --------------------");
            System.out.println("Buku Biografi :");
            autobiografi.view();
            System.out.println();
            System.out.println("Buku Akademik :");
            bukuAkademik.view();
            akademik.view();
    }
}

