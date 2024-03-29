package bukuFiksi;
import buku.Buku;
    
public class bukuFiksi extends Buku{
    private String genre;
    private int jumlahHalaman;
    private double harga;

    public bukuFiksi(String judul, String penulis, String tahunTerbit, String genre, int jumlahHalaman, double harga) {
        super(judul, penulis, tahunTerbit);
        this.genre = genre;
        this.jumlahHalaman = jumlahHalaman;
        this.harga = harga;
    }

    public String getGenre() {
        return genre;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public double getHarga() {
        return harga;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    public void view() {
        System.out.println("Genre buku : " + getGenre());
        System.out.println("Harga buku : " + getHarga());
        System.out.println("Jumlah Halaman : " + getJumlahHalaman());
    }
}

