package tema_curs11;

public class PrimateTest {
    public static void main(String[] args) {

        Human human = new Human();
        Monkey monkey = new Monkey();

        human.walk();
        human.run();
        System.out.println(human.eat());
        human.speak();
        human.drink();
        human.sleep();

        System.out.println("-------------------");

        monkey.walk();
        monkey.run();
        System.out.println(monkey.eat());
        monkey.speak();
        monkey.drink();
        monkey.sleep();
    }
}
