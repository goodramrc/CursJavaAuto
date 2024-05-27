package tema_curs10;

import java.util.Scanner;


public class Qualification extends Teacher {

    private static Scanner scanner = new Scanner(System.in);

    public Qualification() {
        super(readCourse(), readExperienceYears(), readSchedule());
    }

    private static String readCourse() {
        System.out.println("Enter the name of the course you want to teach: ");
        return scanner.nextLine();
    }

    private static int readExperienceYears() {
        System.out.println("What are the total years of experience with the course?");
        int experienceYears = scanner.nextInt();
        scanner.nextLine();
        return experienceYears;
    }

    private static String readSchedule() {
        System.out.println("What is your available schedule to teach?");
        return scanner.nextLine();
    }

    public void verify() {
        if (getExperienceYears() > 3 && getCourse().equalsIgnoreCase("Java") && getSchedule().equalsIgnoreCase("Afternoon")) {
            System.out.println("You qualify to teach at this school!");
        } else {
            System.out.println("You do not qualify!");
        }
    }
}