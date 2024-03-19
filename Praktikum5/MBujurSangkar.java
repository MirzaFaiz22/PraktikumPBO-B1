import java.util.Scanner;

class MBujurSangkar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.println("Masukkan sisi bujur sangkar : ");
        double sisi = scan.nextDouble();
        scan.close();
        System.out.println("Luas bujur sangkar dengan sisi "+sisi+" satuan adalah "+bs.hitungLuas(sisi));

        /*jika class BujurSangkar tidak membuat implementasi untuk method abstrak yang
        ada pada kelas BangunDatar, maka akan terjadinya kesalahan kompilasi yang
        memaksa user untuk memberikan implementasi yang sesuai*/
    }    
}
