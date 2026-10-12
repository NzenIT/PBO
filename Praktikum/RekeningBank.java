public class RekeningBank {
    String namaPemilik;
    String nomorRekening;
    double saldo;

    void setor(double jumlah) {
        saldo += jumlah;
        System.out.println("Setoran sebesar " + jumlah + " berhasil. Saldo sekarang: " + saldo);
    }

    boolean tarik(double jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Penarikan sebesar " + jumlah + " berhasil. Saldo sekarang: " + saldo);
            return true;
        } else {
            System.out.println("Saldo tidak mencukupi untuk penarikan sebesar " + jumlah);
            return false;
        }
    }

    double cekSaldo() {
        System.out.println("Nasabah dengan nama " + namaPemilik + " memiliki saldo: " + saldo);
        System.out.println("Saldo saat ini: " + saldo);
        return saldo;
    }

    public static void main(String[] args) {
        RekeningBank rekening1 = new RekeningBank();
        rekening1.namaPemilik = "Budi";
        rekening1.nomorRekening = "1234567890";
        rekening1.saldo = 500000.0;

        rekening1.setor(200000);
        rekening1.cekSaldo();

        System.out.println("Status Penarikan 1: " + rekening1.tarik(300000));
        System.out.println("Status Penarikan 2: " + rekening1.tarik(600000));
        
        System.out.println("Saldo Akhir: Rp " + rekening1.cekSaldo());


    }
    
}
