class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = -1;
        assert(jariJari > 0): "jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}
// masih salah karena jika jari-jari minus ,keliling masih terhitung dan exception tidak tereksekusi