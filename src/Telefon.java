public class Telefon implements TelInterface, Ortak{
    private int bataryaOmru;
    private int fiyati;
    private int hafiza;
    private int kameraCozunurluk;
    public Telefon(int bataryaOmru, int fiyati, int hafiza, int kameraCozunurluk) {
        this.bataryaOmru = bataryaOmru;
        this.fiyati = fiyati;
        this.hafiza = hafiza;
        this.kameraCozunurluk = kameraCozunurluk;
    }
    @Override
    public void bataryaOmru(boolean suyaDustuMu) {
        if (suyaDustuMu) {
            this.bataryaOmru -= 1;
        }
    }
    @Override
    public void dovizFiyati(int kur) {
        this.fiyati = kur * 2;
    }
    @Override
    public void hafizaArttir(int hafizaGb) {
        this.hafiza += hafizaGb;
    }
    @Override
    public int kameraCozunurluk() {
        return 13;
    }
    public int getBataryaOmru() {
        return bataryaOmru;
    }
    public int getFiyati() {
        return fiyati;
    }
    public int getHafiza() {
        return hafiza;
    }
    public int getKameraCozunurluk() {
        return kameraCozunurluk;
    }
}
