package exercises.NewChapter3.school;

import java.util.ArrayList;

public class Course {

    // At least three fields
    // Name
    String name;
    // List of Students
    ArrayList<Student>students;
    // Worth number of credits
    int worthNumberOfCredits;
    public Course(String name, int worthNumberOfCredits){
        this.name = name;
        this.worthNumberOfCredits = worthNumberOfCredits;
    }

    @Override
    public String toString() {
        return this.name + " is worth" + this.worthNumberOfCredits + "number of credits.";
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj instanceof Course) == false) return false;
        Course myCourseObj = (Course) obj;
        if (myCourseObj.name.equals(this.name)){ return true;
        }
        else {
            return false;
        }
    }
}
