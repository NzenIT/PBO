public class TUGAS1 {
	private String namaProduk;
	private double harga;
	private int stok;

	public void setNamaProduk(String namaProduk) {
		this.namaProduk = namaProduk;
	}

	public String getNamaProduk() {
		return namaProduk;
	}

	public void setHarga(double harga) {
		this.harga = harga;
	}

	public double getHarga() {
		return harga;
	}

	public void setStok(int stok) {
		this.stok = stok;
	}

	public int getStok() {
		return stok;
	}

	public double hitungNilaiStok() {
		return harga * stok;
	}

	public void tampilkanInfo() {
		System.out.println("Nama produk: " + getNamaProduk());
		System.out.println("Harga: Rp" + getHarga());
		System.out.println("Stok: " + getStok());
		System.out.println("Nilai seluruh stok: Rp" + hitungNilaiStok());
        System.out.println(" ");
	}

	public static void main(String[] args) {
		TUGAS1 produk1 = new TUGAS1();
		produk1.setNamaProduk("Buku Tulis");
		produk1.setHarga(5000);
		produk1.setStok(10);

		TUGAS1 produk2 = new TUGAS1();
		produk2.setNamaProduk("Pensil");
		produk2.setHarga(2000);
		produk2.setStok(15);

		TUGAS1 produk3 = new TUGAS1();
		produk3.setNamaProduk("Penghapus");
		produk3.setHarga(1000);
		produk3.setStok(20);

		produk1.tampilkanInfo();
		produk2.tampilkanInfo();
		produk3.tampilkanInfo();
	}
}
