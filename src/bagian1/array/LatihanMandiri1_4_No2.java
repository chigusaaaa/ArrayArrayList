package bagian1.array;

public class LatihanMandiri1_4_No2 {
    public static void main(String[] args) {
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};

        for (String h : hari) {
            if (h.length() > 5) {
                System.out.println(h);
            }
        }
        // Output: Selasa, Kamis (6 huruf masing-masing)
    }
}