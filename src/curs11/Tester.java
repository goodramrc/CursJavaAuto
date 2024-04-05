package curs11;

public class Tester implements Angajat {

    String name;
    String email;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setName() {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setEmail() {

    }



    @Override
    public String getEmail() {
        return null;
    }


    public void modificaSalariu() {
        //  salariu = 2500;
    }
}
