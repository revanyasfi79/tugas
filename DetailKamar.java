package model;

public class DetailKamar {
    private String idDetailKamar;
    private Penyewaan penyewaan;
    private Kamar Kamar;
    private int hargaJual;
    private int subTotal;

    public String getIdDetailKamar() {
        return this.idDetailKamar;
    }

    public void setIdDetailKamar(String idDetailKamar) {
        this.idDetailKamar = idDetailKamar;
    }

    public Penyewaan getPenyewaan() {
        return this.penyewaan;
    }

    public void setPenyewaan(Penyewaan penyewaan) {
        this.penyewaan = penyewaan;
    }

    public Kamar getKamar() {
        return this.Kamar;
    }

    public void setKamar(Kamar Kamar) {
        this.Kamar = Kamar;
    }

    public int getHargaJual() {
        return this.hargaJual;
    }

    public void setHargaJual(int hargaJual) {
        this.hargaJual = hargaJual;
    }
    

    public int getSubTotal() {
        return this.subTotal;
    }

    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }

}
