package session9.homework.collegemanagementsystem;

public enum Courses {
    MATH("Math", "MWF 9:00 AM - 10:30 AM", "descriptionMath"),
    COMPUTER_SCIENCE("Computer Science", "TTH 1:00 PM - 2:30 PM", "descriptionComputerScience"),
    PHYSICS("Physics", "MWF 11:00 AM - 12:30 PM", "descriptionPhysics"),
    CHEMISTRY("Chemistry", "TTH 9:00 AM - 10:30 AM", "descriptionChemistry"),
    BIOLOGY("Biology", "MWF 2:00 PM - 3:30 PM", "descriptionBiology"),
    GEOGRAPHY("Geography", "TTH 11:00 AM - 12:30 PM", "descriptionGeography"),
    ENGLISH("English", "MWF 1:00 PM - 2:30 PM", "descriptionEnglish"),
    HISTORY("History", "TTH 2:00 PM - 3:30 PM", "descriptionHistory");

    private final String courseName;
    private final String schedule;
    private final String description;

    Courses(String courseName, String schedule, String description) {
        this.courseName = courseName;
        this.schedule = schedule;
        this.description = description;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getSchedule() {
        return schedule;
    }

    public String getDescription() {
        return description;
    }

    public void printCourses() {
        System.out.println(courseName + " " + schedule + " " + description);
    }
}