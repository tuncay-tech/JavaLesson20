public class Taksi implements AracHareketleri {

    private String marka;
    private int vites;
    private int hiz;
    public Taksi(String marka, int vites, int hiz) {
        this.marka = marka;
        this.vites = vites;
        this.hiz = hiz;
    }
    @Override
    public void viteseGec(int vites) {
        this.vites = vites;
    }
    @Override
    public void hizArttir(int hiz) {
        this.hiz += hiz;
    }
    @Override
    public void hizDusur(int hiz) {
        this.hiz -= hiz;
    }
    public String getMarka() {
        return marka;
    }
    public int getVites() {
        return vites;
    }
    public int getHiz() {
        return hiz;
    }
}
