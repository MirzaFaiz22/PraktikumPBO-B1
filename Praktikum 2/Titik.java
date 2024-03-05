// Nama : Muhammad Mirza Faiz Rabbani
// NIM : 24060122140127

class Titik {
    //deklarasi atribut
    private double absis;
    private double ordinat;
    private static int counterTitik;
    double C;
    double B;

    //deklarasi konstruktor
    public Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    public Titik(double C, double B){
        absis = C;
        ordinat = B;
        counterTitik++;
    }

    //deklarasi metode
    public void setAbsis(double a){
        absis = a;
    }

    public void setOrdinat(double o){
        ordinat = o;
    }

    public double getAbsis(){
        return absis;
    }

    public double getOrdinat(){
        return ordinat;
    }

    public int getCounterTitik(){
        return counterTitik;
    }
}   