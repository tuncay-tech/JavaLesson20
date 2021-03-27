import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main6 {
    public static void main(String[] args) {
        Four four = new Four();
        System.out.println(four.methodOne());
        One one = four;
        System.out.println(one.s);


    }
}
