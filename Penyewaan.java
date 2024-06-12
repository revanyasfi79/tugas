package model;
import java.time.LocalDate;
import java.util.ArrayList;

public class Penyewaan {
    private String IdPenyewaan;
    private Penyewa penyewa;
    private Owner owner;
    private int total;
    private LocalDate tanggal;
    private ArrayList<DetailKamar> detailKamars;

    public String getIdPenyewaan() {
        return this.IdPenyewaan;
    }

    public Penyewaan setIdPenyewaan(String IdPenyewaan) {
        this.IdPenyewaan = IdPenyewaan;
        return this;
    }

    public Penyewa getPenyewa() {
        return penyewa;
    }

    public Penyewaan setPenyewa(Penyewa penyewa) {
        this.penyewa = penyewa;
        return this;
    }

    public Owner getOwner() {
        return owner;
    }

    public Penyewaan setOwner(Owner owner) {
        this.owner = owner;
        return this;
    }

    public int getTotal() {
        return total;
    }

    public Penyewaan setTotal(int total) {
        this.total = total;
        return this;
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public Penyewaan setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
        return this;
    }

    public ArrayList<DetailKamar> getDetailKamars() {
        return detailKamars;
    }

    public Penyewaan setDetailKamars(ArrayList<DetailKamar> detailKamars) {
        this.detailKamars = detailKamars;
        return this;
    }

    



}
