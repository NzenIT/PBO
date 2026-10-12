public class Main {
    public static void main(String[] args) {
        Karyawan karyawanDefault = new Karyawan("Belum diisi", "Belum diisi", 0.0);
        Karyawan karyawanLengkap1 = new Karyawan("Andi", "K01", 5000000.0);
        Karyawan karyawanLengkap2 = new Karyawan("Komang", "K02", 4000000.0);
        Karyawan karyawanLengkap3 = new Karyawan("budi", "K03", 4500000.0);
        Karyawan karyawanLengkap4 = new Karyawan("kaka", "K04", 7600000.0);
        Karyawan karyawanLengkap5 = new Karyawan("Araka", "K05",8900000.0);

        System.out.println("Karyawan dengan constructor tanpa parameter:");
        karyawanDefault.tampilkanInfo();

        System.out.println("\nKaryawan dengan constructor berparameter:");
        System.out.println(" ");
        karyawanLengkap1.tampilkanInfo();
        double bonus1 = 500000.0;
        System.out.println("Gaji total termasuk bonus: Rp" + karyawanLengkap1.hitungGajiTotal(bonus1));
        System.out.println(" ");
        karyawanLengkap2.tampilkanInfo();
        double bonus2 = 500000.0;
        System.out.println("Gaji total termasuk bonus: Rp" + karyawanLengkap2.hitungGajiTotal(bonus2));
        System.out.println(" ");
        karyawanLengkap3.tampilkanInfo();
        double bonus3 = 500000.0;
        System.out.println("Gaji total termasuk bonus: Rp" + karyawanLengkap3.hitungGajiTotal(bonus3));
        System.out.println(" ");
        karyawanLengkap4.tampilkanInfo();
        double bonus4 = 500000.0;
        System.out.println("Gaji total termasuk bonus: Rp" + karyawanLengkap4.hitungGajiTotal(bonus4));
        System.out.println(" ");
        karyawanLengkap5.tampilkanInfo();
        double bonus5 = 500000.0;
        System.out.println("Gaji total termasuk bonus: Rp" + karyawanLengkap5.hitungGajiTotal(bonus5));
    }
}