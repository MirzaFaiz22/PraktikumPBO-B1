import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        // Inisialisasi HashMap dengan kunci Integer dan nilai String
        Map<Integer, String> map = new HashMap<Integer, String>();
        // Menempatkan elemen kunci dan nilai
        map.put(1, "satu");
        map.put(2, "dua");
        // Mengambil elemen dengan kunci 1
        System.out.println(map.get(1));
        // Mengambil keseluruhan kunci sebagai objek collection Set
        Set<Integer> keySet = map.keySet();
        // Iterasi untuk mengambil keseluruhan nilai dari kunci
        // Tulis pada laporan Anda!
        // Petunjuk: Gunakan iterasi seperti program ArrayListTest
        for (Integer k : keySet) {
            System.out.println("Nilai dari kunci " + k + ": " + map.get(k));
        }
    }
}


