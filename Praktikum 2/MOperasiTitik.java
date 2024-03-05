public class MOperasiTitik {
    public static void main(String[] args){
        Titik t = new Titik(4,4);
        OperasiTitik o = new OperasiTitik();

        System.out.println("Titik (" + t.getAbsis() + "," + t.getOrdinat() + ")");

        o.refleksiX(t);        
        System.out.println("titik setelah refleksiX Titik (" + t.getAbsis() + "," + t.getOrdinat() + ")");
        o.refleksiY(t);
        System.out.println("titik setelah refleksiX Titik (" + t.getAbsis() + "," + t.getOrdinat() + ")");
        
    }
}
