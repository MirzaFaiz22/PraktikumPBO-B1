package Tugas2;

public class MPrismaSegitiga {
    public static void main(String[] args) {
        Segitiga s = new Segitiga(3, 4);
        SegitigaPrisma ps = new SegitigaPrisma(s, 5);
        
        System.out.println("Luas permukaan prisma segitiga: " + ps.hitungLuasPermukaan());
        System.out.println("Volume prisma segitiga: " + ps.hitungVolume());
    }
}