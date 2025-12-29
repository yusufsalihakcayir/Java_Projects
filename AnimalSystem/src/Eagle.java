public class Eagle extends Animal implements Flyable, Walkable{

    public Eagle(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + " is flying!");
    }

    @Override
    public void walk() {
        System.out.println(this.getName() + " is walking!");
    }
}
