package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiri2_5_No1 {
    public static void main(String[] args) {
        ArrayList<String> belanja = new ArrayList<>();
        belanja.add("Beras");
        belanja.add("Minyak");
        belanja.add("Gula");
        belanja.add("Telur");

        System.out.println("Sebelum: " + belanja);
        belanja.remove(1); 
        System.out.println("Sesudah: " + belanja);
        System.out.println("Jumlah : " + belanja.size());
    }
}
