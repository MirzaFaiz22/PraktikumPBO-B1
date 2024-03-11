package Tugas2;

class SegitigaPrisma {
    private Segitiga alas;
    private double tinggiPrisma;

    public SegitigaPrisma(Segitiga s, double tp) {
        alas = s;
        tinggiPrisma = tp;
    }

    public Segitiga getAlas() {
        return alas;
    }

    public double getTinggiPrisma(){
        return tinggiPrisma;
    }

    public double hitungLuasPermukaan() {
        return (2 * alas.hitungLuas()) + (alas.getAlas() * tinggiPrisma * 3);
    }

    public double hitungVolume() {
        return alas.hitungLuas() * tinggiPrisma;
    }
}
