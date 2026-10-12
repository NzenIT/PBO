public class mahasigma {
   String nama;
   String nim;
   double ipk;
   int nilai;
   
     String cetakPredikat(int nilai) {
        if (nilai >= 80) {
            return "A";
        } else if(nilai >= 70 && nilai < 80) {
            return "B";
        }else {
            return "C";
        }
    }
        String cetakKelulusan(double ipk) {
       if (ipk >= 3.00) {
            return "Lulus";
        } else if(ipk >= 2.00 && ipk < 3.00) {
            return "Tidak Lulus";
        }else {
            return "DO";
        }
    }


     public String cekHasil() {
        if (ipk >= 3.00) {
            return "Sangat Memuaskan";
        } else if(ipk >= 2.00 && ipk < 3.00) {
            return "Kurang Memuaskan";
        } else {
            return "Moleho ae";
        }
       
    }
    public static void main(String[] args) {
        mahasigma mahasiswa1 = new mahasigma();
        mahasiswa1.nama = "Andi";
        mahasiswa1.nim = "231001";
        mahasiswa1.ipk = 3.50;
        mahasiswa1.nilai = 85;

        mahasigma mahasiswa2 = new mahasigma();
        mahasiswa2.nama = "Budi";
        mahasiswa2.nim = "231002";
        mahasiswa2.ipk = 2.50;
        mahasiswa2.nilai = 75;

        mahasigma mahasiswa3 = new mahasigma();
        mahasiswa3.nama = "Citra";
        mahasiswa3.nim = "231003";
        mahasiswa3.ipk = 1.50;
        mahasiswa3.nilai = 65;

        System.out.println(mahasiswa1.nim + " - " + mahasiswa1.nama
            + " - IPK: " + mahasiswa1.ipk + " - Predikat: " + mahasiswa1.cetakPredikat(mahasiswa1.nilai)
            + " - Kelulusan: " + mahasiswa1.cetakKelulusan(mahasiswa1.ipk) 
            + " - Hasil: " + mahasiswa1.cekHasil());
        
        System.out.println(mahasiswa2.nim + " - " + mahasiswa2.nama
            + " - IPK: " + mahasiswa2.ipk + " - Predikat: " + mahasiswa2.cetakPredikat(mahasiswa2.nilai)
            + " - Kelulusan: " + mahasiswa2.cetakKelulusan(mahasiswa2.ipk) 
            + " - Hasil: " + mahasiswa2.cekHasil());
        
        System.out.println(mahasiswa3.nim + " - " + mahasiswa3.nama
            + " - IPK: " + mahasiswa3.ipk + " - Predikat: " + mahasiswa3.cetakPredikat(mahasiswa3.nilai)
            + " - Kelulusan: " + mahasiswa3.cetakKelulusan(mahasiswa3.ipk) 
            + " - Hasil: " + mahasiswa3.cekHasil());
    }

}