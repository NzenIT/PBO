    public class AkunBank {
    // 1. Attributes disembunyikan menggunakan 'private'
    private String nomorRekening;
    private String namaPemilik;
    private double saldo;

    // Constructor
    public AkunBank(String nomorRekening, String namaPemilik, double saldoAwal) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        // Validasi saldo awal
        if (saldoAwal >= 0) {
            this.saldo = saldoAwal;
        } else {
            this.saldo = 0;
            System.out.println("Saldo awal tidak boleh negatif! Set ke 0.");
        }
    }

    // 2. Getter Methods (Akses membaca data)
    public String getNomorRekening() {
        return nomorRekening;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public double getSaldo() {
        return saldo;
    }

    // 3. Setter / Operational Methods (Akses mengubah data dengan aturan)
    public void setorUang(double jumlah) {
        if (jumlah > 0) {
            this.saldo += jumlah;
            System.out.println("Berhasil setor Rp " + jumlah);
        } else {
            System.out.println("Jumlah setor harus lebih dari 0!");
        }
    }

    public void tarikUang(double jumlah) {
        if (jumlah > 0 && jumlah <= this.saldo) {
            this.saldo -= jumlah;
            System.out.println("Berhasil tarik Rp " + jumlah);
        } else {
            System.out.println("Penarikan gagal! Saldo tidak mencukupi atau jumlah salah.");
        }
    }



    public static void main(String[] args) {
        // Membuat objek AkunBank
        AkunBank akun1 = new AkunBank("1234567890", "Budi", 1000000);
        
        // Menampilkan informasi akun
        System.out.println("Nomor Rekening: " + akun1.getNomorRekening());
        System.out.println("Nama Pemilik: " + akun1.getNamaPemilik());
        System.out.println("Saldo Awal: Rp " + akun1.getSaldo());

        // Melakukan setoran
        akun1.setorUang(500000);
        System.out.println("Saldo Setelah Setoran: Rp " + akun1.getSaldo());

        // Melakukan penarikan
        akun1.tarikUang(300000);
        System.out.println("Saldo Setelah Penarikan: Rp " + akun1.getSaldo());

        // Mencoba penarikan yang gagal
        akun1.tarikUang(120000); // Saldo tidak mencukupi  
    }
}
