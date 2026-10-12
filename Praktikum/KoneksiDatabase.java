/*public class KoneksiDatabase implements AutoCloseable {
    private String dbName;

    // Constructor (Inisialisasi resource)
    public KoneksiDatabase(String dbName) {
        this.dbName = dbName;
        System.out.println("[CONSTRUCTOR] Terhubung ke database: " + dbName);
    }

    public void query(String sql) {
        System.out.println("[EXECUTE] Menjalankan SQL: " + sql);
    }

    // Method pengganti Destructor (Pembersihan Resource)
    @Override
    public void close() {
        System.out.println("[DESTRUCTOR/CLOSE] Koneksi ke " + dbName + " telah ditutup.");
    }

    public static void main(String[] args) {
        // Try-with-resources: Otomatis memanggil close() saat blok try selesai
        try (KoneksiDatabase db = new KoneksiDatabase("db_tokoonline")) {
            db.query("SELECT * FROM produk");
        } // Method close() dipanggil otomatis di sini
        
        System.out.println("Program Selesai.");
    }
}
*/