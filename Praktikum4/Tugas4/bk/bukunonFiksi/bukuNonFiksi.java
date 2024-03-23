package bukunonFiksi;
import buku.Buku;

public class bukuNonFiksi extends Buku {
    private String subjek;
    private int jumlahHalaman;
    private double harga;

    public bukuNonFiksi(String judul, String penulis, String tahunTerbit, String subjek, int jumlahHalaman, double harga) {
        super(judul, penulis, tahunTerbit);
        this.subjek = subjek;
        this.jumlahHalaman = jumlahHalaman;
        this.harga = harga;
    }

    public String getSubjek() {
        return subjek;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public double getHarga() {
        return harga;
    }

    public void setSubjek(String subjek) {
        this.subjek = subjek;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    public void view() {
        System.out.println("Judul Buku: " + getJudul());
        System.out.println("Penulis: " + getPenulis());
        System.out.println("Tahun Terbit: " + getTahunTerbit());
        System.out.println("Subjek: " + getSubjek());
        System.out.println("Jumlah Halaman: " + getJumlahHalaman());
        System.out.println("Harga Buku: " + getHarga());
    }
}
