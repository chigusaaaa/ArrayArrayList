public void kembalikanBuku(String judul) {
    for (Buku b : koleksi) {
        if (b.getJudul().equals(judul)) {
            b.setDipinjam(false);
            System.out.println(judul + " telah dikembalikan.");
            return;
        }
    }
    System.out.println("Buku " + judul + " tidak ditemukan.");
}