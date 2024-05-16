//bangun datar generic.java
//package Generic;

public class BangunDatarGeneric<T1 extends BangunDatar> {
    private T1 bangunDatar;

    public void set(T1 tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public T1 get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}

// Ketika T diubah dengan T1, ini tidak mempengaruhi codingannya ini hanya mengganti penamaan saja