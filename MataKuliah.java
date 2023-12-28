package MOD15COTS.geceeebangg;

import java.util.ArrayList;

public class MataKuliah {
    // atribut
    private String namaMK;
    private String namaDosen;
    private ArrayList<Kuis> listKuis;

    // contructor
    public MataKuliah(String namaMK, String namaDosen) {
        this.namaMK = namaMK;
        this.namaDosen = namaDosen;
        this.listKuis = new ArrayList<>();
    }


    public void setNamaMK(String namaMK) {
        this.namaMK = namaMK;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    public void setKuis(ArrayList<Kuis> daftarKuis) {
        this.listKuis = daftarKuis;
    }



    public String getNamaMK() {
        return namaMK;
    }

    public String getNamaDosen() {
        return namaDosen;
    }

    public void PrintNamaMahasiswaDanNilaiRataRata() {
        for (int i = 0; i < listKuis.size(); i++) {
            Kuis kuis = listKuis.get(i);
            System.out.println(kuis.getNamaMahasiswa() + " " + kuis.hitungRata());
        }
    }

}
