// Nama : Muhammad Mirza Faiz Rabbani
// NIM : 24060122140127

class Titik {
    //deklarasi atribut
    double absis;
    double ordinat;
    static int counterTitik;
    double C;
    double B;

    //deklarasi konstruktor
    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    Titik(double C, double B){
        absis = C;
        ordinat = B;
        counterTitik++;
    }

    //deklarasi metode
    void setAbsis(double a){
        absis = a;
    }

    void setOrdinat(double o){
        ordinat = o;
    }

    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    int getCounterTitik(){
        return counterTitik;
    }
}