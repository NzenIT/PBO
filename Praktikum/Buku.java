    public class Buku {
        String judul;
        String pengarang;
        int tahunTerbit;
        int jumlahHalaman;
        boolean tersedia;

        void tampilData() {
            System.out.println("Judul      : " + judul);
            System.out.println("Pengarang  : " + pengarang);
            System.out.println("Jumlah Halaman: " + jumlahHalaman);
            System.out.println("Tersedia: " + tersedia);
            System.out.println(" ");
        }
        public static void main(String[] args) {
            Buku buku1 = new Buku();
            Buku buku2 = new Buku();
            Buku buku3 = new Buku();
            Buku buku4 = new Buku();
            Buku buku5 = new Buku();

            buku1.judul = "Pemrograman Java";
            buku1.pengarang = "John Doe";
            buku1.tahunTerbit = 2020;
            buku1.jumlahHalaman = 350;
            buku1.tersedia = true;

            buku2.judul = "Struktur Data";
            buku2.pengarang = "Jane Smith";
            buku2.tahunTerbit = 2019;
            buku2.jumlahHalaman = 400;
            buku2.tersedia = false;

            buku3.judul = "Algoritma dan Pemrograman";
            buku3.pengarang = "Alice Johnson";
            buku3.tahunTerbit = 2021;
            buku3.jumlahHalaman = 300;
            buku3.tersedia = true;

            buku4.judul = "Basis Data";
            buku4.pengarang = "Bob Brown";
            buku4.tahunTerbit = 2018;
            buku4.jumlahHalaman = 250;
            buku4.tersedia = true;

            buku5.judul = "Jaringan Komputer";
            buku5.pengarang = "Charlie Davis";
            buku5.tahunTerbit = 2022;
            buku5.jumlahHalaman = 450;
            buku5.tersedia = false;

            anggota anggota1 = new anggota();
            anggota1.nama = "Rizky";
            anggota anggota2 = new anggota();
            anggota2.nama = "Kaka";
            anggota anggota3 = new anggota();
            anggota3.nama = "Farid";
            anggota anggota4 = new anggota();
            anggota4.nama = "Tenyong";
            anggota anggota5 = new anggota();
            anggota5.nama = "Dandy";

            buku1.tampilData();
            buku2.tampilData();
            buku3.tampilData();
            buku4.tampilData();
            buku5.tampilData();

        // Anggota 1 meminjam lebih dari satu buku
        anggota1.pinjamBuku(buku1);
        anggota1.pinjamBuku(buku2);

        // Anggota 2 mencoba meminjam buku yang sudah dipinjam anggota 1
        anggota2.pinjamBuku(buku1);
          
        }
    }