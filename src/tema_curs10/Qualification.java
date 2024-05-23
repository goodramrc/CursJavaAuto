package tema_curs10;

import java.util.Scanner;

public class Qualification extends Teacher {


    public Qualification(String course, int experienceYears, String schedule) {
        super(course, experienceYears, schedule);
    }

    public void readVericationParameters(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the course you want to teach: ");
        String course = scanner.nextLine();


        System.out.println("What are the total years of experience with " + course + " ?");
        int experienceYears = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is your available schedule to teach ? ");
        String schedule = scanner.nextLine();

        scanner.close();

        setCourse(course);
        setExperienceYears(experienceYears);
        setSchedule(schedule);

    }

    public void verify() {
        readVericationParameters();

        if(getExperienceYears() >3 && getCourse().equals("Java") && getSchedule().equals("Afternoon")) {
            System.out.println("You qualify to teach at this school!");
        }else{
            System.out.println("You do not qualify!");
        }


    }
}
