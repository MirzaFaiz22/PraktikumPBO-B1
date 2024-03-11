package Tugas2;

class Segitiga {
    private double alas;
    private double tinggi;

    public Segitiga(double a, double t) {
        alas = a;
        tinggi = t;
    }

    public void setAlas(double a){
        alas = a;
    }

    public void setTinggi(double t){
        tinggi = t;
    }

    public double getAlas() {
        return alas;
    }

    public double getTinggiSegitiga() {
        return tinggi;
    }

    public double hitungLuas() {
        return (alas * tinggi) / 2;
    }
}
