import java.util.Scanner;

public class penentuKelulusan{

    public static void main(String[] args) {
        Scanner objekscan = new Scanner(System.in);
        System.out.println("Pilih [1] mata kuliah umum [2] mata kuliah kejuruan");
        int menu  = objekscan.nextInt();
        objekscan.nextLine();
        if(menu==1){
            prosesKelulusan satu = new prosesKelulusan("mata kuliah umum");
            System.out.println("Masukkan nama anda : ");
            String nama = objekscan.nextLine();
            System.out.println("Masukkan nilai anda : ");
            int poin = objekscan.nextInt();
            objekscan.nextLine();
            satu.setNama(nama);
            satu.setHasil(poin);
            satu.cetak();
        } else if(menu==2){
            System.out.println("Masukkan nama anda : ");
            String nama = objekscan.nextLine();
            System.out.println("Masukkan nilai anda : ");
            int n = objekscan.nextInt();
            prosesKelulusan dua = new prosesKelulusan("Mata kulah kejuruan", n);
            dua.setNama(nama);
            dua.cetak();
        } else {
            System.out.println("Hanya masukkan menu 1 atau 2");
        }
    }
}