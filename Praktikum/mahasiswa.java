public class mahasiswa {
    private String nama;
    private String nim;
    private double ipk;

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public String cekKelulusan() {
        if (ipk >= 3.00) {
            return "Sangat Memuaskan";
        } else if(ipk >= 2.00 && ipk < 3.00) {
            return "Memuaskan";
        }
        return "Perlu Perbaikan";
    }

    public String setPredikat() {
        if (ipk >= 3.00) {
            return "A";
        } else if (ipk >= 2.00) {
            return "B";
        }
        return "C";
    }

    public String cekHasil() {
        if (ipk >= 3.00) {
            return "Lulus";
        } else if (ipk >= 2.00) {
            return "Mengulang";
        }
        return "Tidak Lulus";
    }

    //getter
    public String getNama() {
        return this.nama;
    }

    public String getNim() {
        return this.nim;
    }

    public double getIpk() {
        return this.ipk;
    }

    public static void main(String[] args) {
        mahasiswa mahasiswa1 = new mahasiswa();
        mahasiswa1.setNim("231001");
        mahasiswa1.setNama("Andi");
        mahasiswa1.setIpk(3.50);

        mahasiswa mahasiswa2 = new mahasiswa();
        mahasiswa2.setNim("231002");
        mahasiswa2.setNama("Budi");
        mahasiswa2.setIpk(2.50);
        
        mahasiswa mahasiswa3 = new mahasiswa();
        mahasiswa3.setNim("231003");
        mahasiswa3.setNama("Citra");
        mahasiswa3.setIpk(1.50);

        System.out.println(mahasiswa1.getNim() + " - " + mahasiswa1.getNama() + " - IPK: " + mahasiswa1.getIpk() + " - Predikat: " + mahasiswa1.setPredikat()
            + " - Kelulusan: " + mahasiswa1.cekKelulusan() + " - Hasil: " + mahasiswa1.cekHasil());
        System.out.println(mahasiswa2.getNim() + " - " + mahasiswa2.getNama() + " - IPK: " + mahasiswa2.getIpk() + " - Predikat: " + mahasiswa2.setPredikat()
            + " - Kelulusan: " + mahasiswa2.cekKelulusan() + " - Hasil: " + mahasiswa2.cekHasil());
        System.out.println(mahasiswa3.getNim() + " - " + mahasiswa3.getNama() + " - IPK: " + mahasiswa3.getIpk() + " - Predikat: " + mahasiswa3.setPredikat() 
            + " - Kelulusan: " + mahasiswa3.cekKelulusan() + " - Hasil: " + mahasiswa3.cekHasil());
    }
}
