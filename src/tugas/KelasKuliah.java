package tugas;

import java.util.ArrayList;

public class KelasKuliah {
    private ArrayList<Mahasiswa> daftar = new ArrayList<>();

    public void tambahMahasiswa(Mahasiswa m) {
        daftar.add(m);
    }

    public double hitungRataRata() {
        double total = 0;
        for (Mahasiswa m : daftar) {
            total += m.getNilai();
        }
        return daftar.isEmpty() ? 0 : total / daftar.size();
    }

    public int jumlahLulus() {
        int lulus = 0;
        for (Mahasiswa m : daftar) {
            if (m.lulus()) lulus++;
        }
        return lulus;
    }

    public void tampilkanSemua() {
        System.out.println("== Daftar Mahasiswa ==");
        for (Mahasiswa m : daftar) {
            System.out.println(m.info());
        }
        System.out.println("Total data: " + daftar.size());
    }
}