package tema_curs11;

public class Human extends Primate implements BasicNeeds{

    @Override
    public void walk() {
    System.out.println("Can walk!");

}
    @Override
    public void run() {
        System.out.println("Can run");
    }

    @Override
    public String eat() {
    return "Omnivore";
    }

    @Override
    public void speak() {
        System.out.println("I can speak!");
    }

    @Override
    public void sleep() {
        System.out.println("I need to sleep!");
    }

    @Override
    public void drink() {
        System.out.println("I can drink water");
    }
}
