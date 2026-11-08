import java.util.Scanner;

abstract class AlokasiDana {
    String namaKategori;

    public AlokasiDana(String namaKategori) {
        this.namaKategori = namaKategori;
    }

    public abstract double hitung(double gaji);
    public String getNamaKategori() {
        return namaKategori;
    }    
    
}

class KebutuhanPokok extends AlokasiDana {
    public KebutuhanPokok() {
        super("Kebutuhan Pokok Bulanan");
    }

    @Override 
    public double hitung(double gaji) {
        return gaji  * 0.5;
    }
}

class Investasi extends AlokasiDana {
    public Investasi() {
        super("Investasi");
    }

    @Override 
    public double hitung(double gaji) {
        return gaji  * 0.2;
    }
}

class DanaDarurat extends AlokasiDana {
    public DanaDarurat() {
        super("Dana Darurat");
    }

    @Override 
    public double hitung(double gaji) {
        return gaji  * 0.15;
    }
}

class KirimOrtu extends AlokasiDana {
    public KirimOrtu() {
        super("Kirim Orang Tua");
    }

    @Override 
    public double hitung(double gaji) {
        return gaji  * 0.1;
    }
}

class Hiburan extends AlokasiDana {
    public Hiburan() {
        super("Hiburan");
    }

    @Override 
    public double hitung(double gaji) {
        return gaji  * 0.05;
    }
}

public class PlanLife {
    public  static  void main(String[] args) {

        Scanner input  = new Scanner(System.in);

        System.out.println("Masukkan total biaya bulanan anda (Rp):");
        double gaji = input.nextDouble();

        System.out.println("\n---  RINCIAN ALOKASI DANA ----");

    AlokasiDana[] daftarAlokasi ={
        new KebutuhanPokok(),
        new Investasi(),
        new DanaDarurat(),
        new  KirimOrtu(),
        new Hiburan()
    };

    for (AlokasiDana  item :daftarAlokasi) {
        System.out.println(item.getNamaKategori() + ": Rp " + item.hitung(gaji));
    }
    input.close();
    }
}