public class Main2 {
    public static void main(String[] args) {
        Taksi taksi1 = new Taksi("BMW", 4, 100);
        System.out.println("taksi1.getMarka(): " + taksi1.getMarka());
        System.out.println("taksi1.getVites(): " + taksi1.getVites());
        System.out.println("taksi1.getHiz(): " + taksi1.getHiz());
        taksi1.hizArttir(30);
        taksi1.viteseGec(5);
        System.out.println("taksi1.getVites(): " + taksi1.getVites());
        System.out.println("taksi1.getHiz(): " + taksi1.getHiz());
        taksi1.hizDusur(50);
        System.out.println("taksi1.getHiz(): " + taksi1.getHiz());
        taksi1.viteseGec(3);
        System.out.println("taksi1.getVites(): " + taksi1.getVites());


    }
}
