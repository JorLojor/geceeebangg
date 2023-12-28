package MOD15COTS.geceeebangg;

import java.util.ArrayList;

public class Kuis implements Computable {
    private String namaKuis;
    private ArrayList<Double> listNilai;

    public Kuis(String namaKuis, String namaMahasiswa, String nimMahasiswa) {
        Asesment asesment = new Asesment(namaMahasiswa, nimMahasiswa);
        this.namaKuis = namaKuis;
        this.listNilai = new ArrayList<>();
    }

    public void addNilai(double nilai) {
        this.listNilai.add(nilai);
    }

    public String getNamaMahasiswa() {
        return Kuis.this.getNamaMahasiswa();
    }

    @Override
    public double hitungRata() {
        double total = 0;
        for (double nilai : listNilai) {
            total += nilai;
        }
        return total / listNilai.size();
    }

}
