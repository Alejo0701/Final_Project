package Data.Course;

import Data.Person.Student;
import Data.Person.Teacher;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private String classRoom;
    private Teacher teacher;
    private ArrayList<Student> courseStudents = new ArrayList<Student>();

    public Course(String courseName, String classRoom, Teacher teacher, ArrayList<Student> courseStudents) {
        this.courseName = courseName;
        this.classRoom = classRoom;
        this.teacher = teacher;
        this.courseStudents = courseStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getCourseStudents() {
        return courseStudents;
    }

    public void setCourseStudents(ArrayList<Student> courseStudents) {
        this.courseStudents = courseStudents;
    }

    public String setCourseStudent(Student student){
        if(!courseStudents.contains(student)){
            courseStudents.add(student);
            return "Student added to course: " + courseName;
        }
        else{
            return "Student already in course";
        }
    }




}
