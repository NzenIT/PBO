/* 
class Mahasiswa {
    String nim;
    String nama;
    String jurusan;
    String Jkel;

    Mahasiswa(String nim, String nama, String jurusan, String Jkel) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.Jkel = Jkel;
    }

    void tampilData() {
        System.out.println("NIM      : " + nim);
        System.out.println("Nama     : " + nama);
        System.out.println("Jurusan  : " + jurusan);
        System.out.println("Jenis Kelamin : " + Jkel);
    }
}

public class Try1 {
    public static void main(String[] args) {

        Mahasiswa mhs1 = new Mahasiswa(
                "240101001",
                "Nayaka",
                "Sistem Informasi",
                "Laki-laki");
                input.nextLine();

        Mahasiswa mhs2 = new Mahasiswa(
                "240101002",
                "Aksa",
                "Teknik Informatika",
                "Laki-laki");
        Mahasiswa mhs3 = new Mahasiswa(
                "240101003",
                "Farrel",
                "Kedokteran",
                "Laki-laki");
        Mahasiswa mhs4 = new Mahasiswa(
                "240101004",
                "Raka",
                "Teknik Lingkungan",
                "Laki-laki");
        Mahasiswa mhs5 = new Mahasiswa(
                "240101005",
                "Shomad",
                "Teknik Mengaji",
                "Laki-laki");
    
        mhs1.tampilData();
        mhs2.tampilData();
        mhs3.tampilData();
        mhs4.tampilData();
        mhs5.tampilData();
    }
}
 */

/* 
class Mobil {
    String merk;
    String warna;
    int tahun;
    

    void tampilData() {
        System.out.println("Merk      : " + merk);
        System.out.println("Warna     : " + warna);
        System.out.println("Tahun     : " + tahun);
        System.out.println(" ");
    }
}
public class Try1 {
    public static void main(String[] args) {

        Mobil mobil1 = new Mobil();
        Mobil mobil2 = new Mobil();
        Mobil mobil3 = new Mobil();
        Mobil mobil4 = new Mobil();
        Mobil mobil5 = new Mobil();

        mobil1.merk = "Toyota";
        mobil1.warna = "Hitam";
        mobil1.tahun = 2020;

        mobil2.merk = "Honda";
        mobil2.warna = "Putih";
        mobil2.tahun = 2021;

        mobil3.merk = "Suzuki";
        mobil3.warna = "Merah";
        mobil3.tahun = 2019;

        mobil4.merk = "Daihatsu";
        mobil4.warna = "Biru";
        mobil4.tahun = 2022;

        mobil5.merk = "Mitsubishi";
        mobil5.warna = "Silver";
        mobil5.tahun = 2023;

        mobil1.tampilData();
        mobil2.tampilData();
        mobil3.tampilData();
        mobil4.tampilData();
        mobil5.tampilData();
    }
}
*/
/* 
class Kalkulator {

    int nilaiA;
    int nilaiB;

    int hasilTambah;
    int hasilKurang;
    int hasilKali;
    double hasilBagi;

    void hitung() {
        hasilTambah = nilaiA + nilaiB;
        hasilKurang = nilaiA - nilaiB;
        hasilKali = nilaiA * nilaiB;
        hasilBagi = (double) nilaiA / nilaiB;
    }

    void tampilHasil() {
        System.out.println("Nilai A      : " + nilaiA);
        System.out.println("Nilai B      : " + nilaiB);
        System.out.println("Hasil Tambah : " + hasilTambah);
        System.out.println("Hasil Kurang : " + hasilKurang);
        System.out.println("Hasil Kali   : " + hasilKali);
        System.out.println("Hasil Bagi   : " + hasilBagi);
    }
}

public class Try1 {
    public static void main(String[] args) {

        Kalkulator k1 = new Kalkulator();

        k1.nilaiA = 20;
        k1.nilaiB = 5;

        k1.hitung();
        k1.tampilHasil();
    }
}
    */

class HargaMakanan {
    String namaMakanan;
    double hargaAwal;
    double hargaAkhir;
    double diskon;

    void tampilData() {
        System.out.println("Nama Makanan : " + namaMakanan);
        System.out.println("Harga Awal   : " + hargaAwal);
        System.out.println("Harga Akhir  : " + hargaAkhir);
        System.out.println("Diskon         : " + (double) diskon);
        System.out.println(" ");
    }
    public static void main(String[] args) {
        
        HargaMakanan makanan1 = new HargaMakanan();
        HargaMakanan makanan2 = new HargaMakanan();
        HargaMakanan makanan3 = new HargaMakanan();
    

        makanan1.namaMakanan = "Nasi Goreng";
        makanan1.hargaAwal = 20000;
        makanan1.diskon = 10/100.0;
        makanan1.hargaAkhir = makanan1.hargaAwal - (makanan1.hargaAwal * makanan1.diskon);

        makanan2.namaMakanan = "Sate Ayam";
        makanan2.hargaAwal = 25000;
        makanan2.diskon = 30/100.0;
        makanan2.hargaAkhir = makanan2.hargaAwal - (makanan2.hargaAwal * makanan2.diskon);

        makanan3.namaMakanan = "Bakso";
        makanan3.hargaAwal = 15000;
        makanan3.diskon = 50/100.0;
        makanan3.hargaAkhir = makanan3.hargaAwal - (makanan3.hargaAwal * makanan3.diskon);

        makanan1.tampilData();
        makanan2.tampilData();
        makanan3.tampilData();
       
    }
}