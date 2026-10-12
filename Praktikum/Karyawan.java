public class Karyawan {
	private String idKaryawan;
    public String nama;
	private double gajiPokok;

	public Karyawan() {
		this.nama = "Belum diisi";
		this.idKaryawan = "Belum diisi";
		this.gajiPokok = 0.0;
	}

	public Karyawan(String nama, String idKaryawan, double gajiPokok) {
		this.nama = nama;
		this.idKaryawan = idKaryawan;
		this.gajiPokok = gajiPokok;
	}

	public double hitungGajiTotal(double bonus) {
		return gajiPokok + bonus;
	}

	public void tampilkanInfo() {
		System.out.println("Nama: " + nama);
		System.out.println("ID Karyawan: " + idKaryawan);
		System.out.println("Gaji Pokok: Rp" + gajiPokok);
	}
    
}
