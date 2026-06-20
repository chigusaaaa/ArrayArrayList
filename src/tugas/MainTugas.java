// Nama  : [ELDIMAS EKA ARISTA]
// NPM   : [2110010414]
package tugas;

public class MainTugas {
    public static void main(String[] args) {

        
        String[] mataKuliah = {"Pemrograman Berbasis Objek", "Basis Data", "Algoritma"};
        System.out.println("== Daftar Mata Kuliah ==");
        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }
        System.out.println();

        
        KelasKuliah kelas = new KelasKuliah();
        kelas.tambahMahasiswa(new Mahasiswa("Andi",  "2301001", 85.0));
        kelas.tambahMahasiswa(new Mahasiswa("Budi",  "2301002", 55.0));
        kelas.tambahMahasiswa(new Mahasiswa("Citra", "2301003", 72.0));
        kelas.tambahMahasiswa(new Mahasiswa("Deni",  "2301004", 90.0));
        kelas.tambahMahasiswa(new Mahasiswa("Eka",   "2301005", 48.0));

        kelas.tampilkanSemua();
        System.out.println();

        System.out.printf("Rata-rata nilai : %.2f%n", kelas.hitungRataRata());
        System.out.println("Jumlah lulus    : " + kelas.jumlahLulus());
        System.out.println();

        
        kelas.tambahMahasiswa(new Mahasiswa("Fani", "2301006", 68.0));
        System.out.println("Setelah tambah mahasiswa baru:");
        kelas.tampilkanSemua();
    }
}