package buku;
    
public class Buku {
    private String judul, penulis, tahunTerbit;

    public Buku (String judul, String penulis, String tahunTerbit){
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    public String getJudul(){
        return judul;
    }

    public String getPenulis(){
        return penulis;
    }

    public String getTahunTerbit(){
        return tahunTerbit;
    }

    public void setJudul(String judul){
       this.judul = judul; 
    }

    public void setPenulis(String penulis){
        this.penulis = penulis;
    }

    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public void view() {
        System.out.println("Judul Buku: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
    }
}

