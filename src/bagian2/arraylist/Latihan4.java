package bagian2.arraylist;

import java.util.ArrayList;

public class Latihan4 {
    public static void main(String[] args) {
        ArrayList<String> buah = new ArrayList<>();
        buah.add("Apel");
        buah.add("Mangga");
        buah.add("Jeruk");
        System.out.println("Awal    : " + buah);
        // [Apel, Mangga, Jeruk]

        buah.add(1, "Pisang"); // sisip di indeks 1
        System.out.println("Sisip   : " + buah);
        // [Apel, Pisang, Mangga, Jeruk]

        buah.set(0, "Anggur"); // ganti indeks 0
        System.out.println("Ganti   : " + buah);
        // [Anggur, Pisang, Mangga, Jeruk]

        buah.remove("Jeruk"); // hapus berdasarkan nilai
        System.out.println("Hapus   : " + buah);
        // [Anggur, Pisang, Mangga]

        System.out.println("Ada Apel?: " + buah.contains("Apel")); // false
        System.out.println("Jumlah  : " + buah.size()); // 3
    }
}