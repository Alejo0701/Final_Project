package Data.Person;

public class Student extends Person {

    private String level;

    public Student(String name, String level) {
        super(name);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String showStudentInfo(){
        String studentInfo = "";
        studentInfo += "Student: " + getName() + "\n";
        studentInfo += "ID: " + getId() + "\n";
        studentInfo += "Level: " + getLevel() + "\n";
        return studentInfo;
    }


}