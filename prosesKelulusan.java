public class prosesKelulusan{
    private String kode;
    private String nama;
    private Integer hasil;


    public void setHasil (int hasil){
        this.hasil = hasil;
    }

    public int dapatHasil(){
        return hasil;
    }
     
    public void setNama(String nama) {
        this.nama = nama;
    }


    prosesKelulusan(String nm){
        kode = nm;
        hasil = 0;
    }

    prosesKelulusan(String nm, int nilai){
        kode = nm;
        hasil = nilai;
    }

    String prosesPerhitungan(){
        String huruf;
        if (hasil <= 10 && hasil >= 9){
            huruf = "A";
        } else if (hasil <= 8 && hasil >= 7){
            huruf = "B";
        } else if (hasil <= 6 && hasil >= 5){
            huruf = "C";
        } else if (hasil <= 4 && hasil >= 0){
            huruf = "D";
        } else {
            huruf = "unknown";
        }
        return huruf;
    }

    void cetak(){
        if (hasil <= 10){
            System.out.println("Selamat "+nama+" anda dinyatakan lulus "+kode+" dengan hasil "+prosesPerhitungan()+" poin");
        } else if (hasil < 7){
            System.out.println("Maaf "+nama+" anda dinyatakan tidak lulus "+kode+" dengan hasil "+prosesPerhitungan()+" poin");
        } else {
            System.out.println("Hanya masukkan niali 0-10");
        }
    }
}