package model;

public class Kamar {
    private String noKamar;
    private String jenisKamar;
    private int hargaKamar;
    private boolean isAvailable;

    //Set Method
    public Kamar setIdKamar(String noKamar) {
        this.noKamar = noKamar;
        return this;
    }

    public Kamar setJenisKamar(String jenisKamar) {
        this.jenisKamar = jenisKamar;
        return this;
    }

    public Kamar setHargaKamar(int hargaKamar) {
        this.hargaKamar = hargaKamar;
        return this;
    }

    public Kamar setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
        return this;
    }

    //Get Method
    public String getIdKamar() {
        return noKamar;
    }

    public String getJenisKamar() {
        return jenisKamar;
    }

    public int getHargaKamar() {
        return hargaKamar;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

}
