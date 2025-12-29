public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[3];

        animals[0] = new Duck("Donald");
        animals[1] = new Crocodile("Hank");
        animals[2] = new Eagle("Vlad");

        System.out.println("--- Hayvan Simülasyonu Başlıyor ---\n");

        for (Animal animal : animals) {

            System.out.println("Hayvan: " + animal.getName() + " (" + animal.getClass().getSimpleName() + ")");

            if (animal instanceof Walkable) {
                ((Walkable) animal).walk();
            }

            if (animal instanceof Swimmable) {
                ((Swimmable) animal).swim();
            }

            if (animal instanceof Flyable) {
                ((Flyable) animal).fly();
            }

            System.out.println("-------------------------");
        }
    }
}