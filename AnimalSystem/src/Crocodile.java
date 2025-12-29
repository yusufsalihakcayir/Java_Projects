public class Crocodile extends Animal implements Swimmable, Walkable{

    public Crocodile(String name) {
        super(name);
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
