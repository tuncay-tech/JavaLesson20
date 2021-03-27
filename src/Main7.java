public class Main7 {
    public static void main(String[] args) {
        Telefon xiaomi = new Telefon(3, 215, 64, 48);
        int bataryaOmru = xiaomi.getBataryaOmru();
        System.out.println("bataryaOmru: " + bataryaOmru);
        xiaomi.bataryaOmru(true);
        System.out.println("bataryaOmru: " + xiaomi.getBataryaOmru());
        int hafiza = xiaomi.getHafiza();
        System.out.println("hafiza: " + hafiza);
        xiaomi.hafizaArttir(8);
        System.out.println("xiaomi.getHafiza(): " + xiaomi.getHafiza());

    }
}
