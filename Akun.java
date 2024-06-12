package model;

public class Akun {
    private String nama;
    private String email;
    private String alamat;

    //Set Methods
    public Akun setNama(String nama) {
        this.nama = nama;
        return this;
    }
    
    public Akun setEmail(String email) {
        this.email = email;
        return this;
    }
    
    public Akun setAlamat(String alamat) {
        this.alamat = alamat;
        return this;
    }
    
    //Get Methods
    public String getNama() {
        return nama;
    }
    
    public String getEmail() {
        return email;
    }

    public String getAlamat() {
        return alamat;
    }

}
