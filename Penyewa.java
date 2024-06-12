package model;

public class Penyewa extends Akun {
    private String idPenyewa;
    private String jenisKelamin;
    private String noTelp;

    public String getIdPenyewa() {
        return idPenyewa;
    }

    public Penyewa setIdPenyewa(String idPenyewa) {
        this.idPenyewa = idPenyewa;
        return this;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public Penyewa setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
        return this;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public Penyewa setNoTelp(String noTelp) {
        this.noTelp = noTelp;
        return this;
    }

}
