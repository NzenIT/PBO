import java.util.ArrayList;
public class anggota {
    String nama;
    ArrayList <String> daftarPinjaman = new ArrayList<>();

    void pinjamBuku(Buku buku) {
        if (buku.tersedia) {
            daftarPinjaman.add(buku.judul);
            buku.tersedia = false;
            System.out.println(nama + " berhasil meminjam buku: " + buku.judul);
        } else {
            System.out.println("Maaf, buku " + buku.judul + " sedang dipinjam oleh anggota lain.");
        }

    } 
    
}

