public class mobil {
//atribut
    String merk;
    String warna;
    int kecepatan;

    void jalankan(String merk, int kecepatan) {
        System.out.println("Mobil " + merk + " berwarna " + warna + " sedang berjalan dengan kecepatan " + kecepatan + " km/jam.");
    }

    void tambahKecepatan(int increment) {
        kecepatan += increment;
        System.out.println("Kecepatan mobil " + merk + " bertambah menjadi " + kecepatan + " km/jam.");
    }

    public static void main(String[] args) {
        mobil mobil1 = new mobil();
        mobil1.merk = "Toyota";
        mobil1.warna = "Merah";
        mobil1.kecepatan = 40;

        mobil1.jalankan(mobil1.merk, mobil1.kecepatan);
        mobil1.tambahKecepatan(20);
    }
}
