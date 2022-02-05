package Data.University;

import Data.Course.Course;
import Data.Person.Student;
import Data.Person.Teacher;

import java.util.ArrayList;

public class University {

    private static ArrayList<Student> students = new ArrayList<Student>();
    public static ArrayList<Teacher> teachers = new ArrayList<Teacher>();
    private static ArrayList<Course> courses = new ArrayList<Course>();


    //add a teacher to the list
    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public String printExistingCourses() {
        String result = "";
        int i = 1;
        if (courses.size() == 0) {
            result = "There are no courses";
        }
        if (courses.size() > 0) {
            for (Course course : courses) {
                result+= i + " - " + course.getCourseName()+ " - " + courses.indexOf(course)+"\n";
                i++;
            }
        }
        return result;
    }

    public boolean createNewCourse(String courseName, String classRoom, Teacher teacher, ArrayList<Student> students) {
        Course course = new Course(courseName, classRoom, teacher, students);
        this.courses.add(course);
        return true;
    }



    public Teacher getTeacherbyID(int id) {
        for (Teacher t : teachers) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }

    public Student getStudentbyID(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    public Course getCoursebyName(String name) {
        for (Course c : courses) {
            if (c.getCourseName().equals(name)) {
                return c;
            }
        }
        return null;
    }



    public String getCourseNameByPosition(int position) {

        String strcourse = "Course not found";

        if (courses.size() == 0) {
            strcourse = "There are no courses";
        }

        if (position > courses.size()) {
            strcourse = "The course id is not valid";
        }
        if (position <= courses.size()) {
            position--;
            for (Course c : courses) {
                if (c.getCourseName().equals(courses.get(position).getCourseName())) {
                    strcourse = c.getCourseName();
                }
            }
        }
        return strcourse;
    }

    public String showCourseInfo(String courseName) {
        String strcourse = "";
        for (Course c : courses) {
            if (c.getCourseName().equals(courseName)) {
                strcourse += "Course Information: " + "\n";
                strcourse += "Course name: " + courseName + "\n";
                strcourse += "Class room: " + c.getClassRoom() + "\n";
                strcourse += "Teacher: " + c.getTeacher().getName() + "\n";
                strcourse += "Students: " + "\n";
                for (Student s : c.getCourseStudents()) {
                    strcourse += s.getName() + " - ID:" +s.getId() + "\n";
                }
            }
        }
        return strcourse;
    }

    public String enrollStudentInCourse(String courseName, Student student) {
        Course course = getCoursebyName(courseName);
        if (course != null) {
            return course.setCourseStudent(student);
        }
        else {
            return "Course not found";
        }
    }

    public String listAllCoursesFromStudent(Student student) {
        String strcourses = "";
        strcourses+="Student: "+student.getName() + "\n"+"Courses: \n";
        for (Course course : courses) {
            if (course.getCourseStudents().contains(student)) {
                strcourses += course.getCourseName() + "\n";
            }
        }
        return strcourses;
    }

    public int coursesSize() {
        return courses.size();
    }




}