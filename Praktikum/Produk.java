public class Produk {
    private String namaProduk;
    private double hargaProduk;
    private int stokProduk;

    // Setter: Menandai/Mengubah isi attribute dengan validasi
    public void setHarga(double harga) {
        if (harga < 0) {
            System.out.println("Harga tidak boleh negatif.");
        } else {
            this.hargaProduk = harga;
        }
    }

    public void setNamaProduk(String NamaProduk) {
        this.namaProduk = NamaProduk;
    }

    public void setStok(int stok) {
        if (stok >= 0) {
            this.stokProduk = stok;
        }
    }

    // Getter: Mengambil isi attribute
    public String getNamaProduk() {
        return this.namaProduk;
    }

    public double getHarga() {
        return this.hargaProduk;
    }

    public int getStok() {
        return this.stokProduk;
    }

    // Method operasional bisnis
    public void kurangiStok(int jumlah) {
        if (jumlah <= stokProduk) {
            stokProduk -= jumlah;
            System.out.println("Pembelian berhasil. Stok tersisa: " + stokProduk);
        } else {
            System.out.println("Stok tidak mencukupi!");
        }
    }

    public static void main(String[] args) {
        Produk laptop = new Produk();

        // Mengatur attribute lewat Setter
        laptop.setNamaProduk("Laptop Gaming");
        laptop.setHarga(1500000);
        laptop.setStok(5);

        // Mengambil attribute lewat Getter
        System.out.println("Produk: " + laptop.getNamaProduk());
        System.out.println("Harga: Rp " + laptop.getHarga());

        // Menjalankan aksi
        laptop.kurangiStok(2);
    }
}


