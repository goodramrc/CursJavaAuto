package curs15;

public class TestJsonProcessor {

    public static void main(String[] args) {

        JsonFileProcessor obj =  new JsonFileProcessor();

        obj.writeJsonFile();
        //obj.readJsonFile("email");

//        obj.readJsonFile2(null);

        obj.readJsonFile("name");
        obj.updateJsonFile("name", "Maria");
        obj.readJsonFile("name");

    }

}
