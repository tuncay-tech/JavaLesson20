public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        String dogSound = dog.getSound();
        Cat cat = new Cat();
        String catSound = cat.getSound();
        Bird bird = new Bird();
        String birdSound = bird.getSound();
        System.out.println("dogSound: " + dogSound);
        System.out.println("catSound: " + catSound);
        System.out.println("birdSound: " + birdSound);
    }
    }

