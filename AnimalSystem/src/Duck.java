public class Duck extends Animal implements Flyable, Swimmable, Walkable{

    public Duck(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + " is flying!");
    }

    @Override
    public void swim() {
        System.out.println(this.getName() + " is swimming!");
    }

    @Override
    public void walk() {
        System.out.println(this.getName() + " is walking!");
    }
}
