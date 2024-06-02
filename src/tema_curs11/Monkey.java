package tema_curs11;

public class Monkey extends Primate implements BasicNeeds{

    @Override
    void walk() {
        System.out.println("Can walk");
    }

    @Override
    void run() {
        System.out.println("Can run");
    }

    @Override
    public void sleep() {
        System.out.println("I need to sleep!");
    }

    @Override
    public String eat() {
        return "mostly herbivore";
    }

    @Override
    void speak() {
        System.out.println("Cannot speak");
    }

    @Override
    public void drink() {
        System.out.println("Can drink water");
    }
}
