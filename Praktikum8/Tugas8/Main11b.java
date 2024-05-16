/*Nama      : Muhammad Mirza Faiz Rabbani */
/*NIM       : 24060122140127 */
/*Tanggal   : 16 Mei 2024 */

class Kupu {
    void gerak() {
    }
}

class Ulat extends Kupu {
    void gerak() {
        System.out.println("Ulat Merayap");
    }
}

class Kepompong extends Kupu {
    void gerak() {
        System.out.println("Kepompong Diam");
    }
}

class KupuDewasa extends Kupu {
    void gerak() {
        System.out.println("Kupu Terbang");
    }
}

class Data<T> {
    private T isi;

    T getIsi() {
        return this.isi;
    }

    void setIsi(T x) {
        this.isi = x;
    }
}

public class Main11b {
    public static void main(String[] args) {
        /*Kamus lokal */
        Ulat K;
        Data<Kupu> anu;

        /*Algoritma */
        K = new Ulat();
        anu = new Data<>();

        anu.setIsi(K);
        anu.getIsi().gerak();

        anu.setIsi(new Kepompong());
        anu.getIsi().gerak();

        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak();
    }
}

