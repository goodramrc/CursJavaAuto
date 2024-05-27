package tema_curs10;

public class Teacher {

    private String course;
    private int experienceYears;
    private String schedule;


    public Teacher(String course, int experienceYears, String schedule) {

        this.course = course;
        this.experienceYears = experienceYears;
        this.schedule = schedule;

    }

    public String getCourse() {
        return course;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public String getSchedule() {
        return schedule;
    }

}
