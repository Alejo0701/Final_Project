package Data.Person;

import java.text.DecimalFormat;

public class Teacher extends Person {

    private String type;
    private int baseSalary;
    private int yearsOfExperience;
    private int activeHoursPerWeek;

    public Teacher(String name, String type, int baseSalary, int yearsOfExperience, int activeHoursPerWeek) {
        super(name);
        this.type = type;
        this.baseSalary = baseSalary;
        this.yearsOfExperience = yearsOfExperience;
        this.activeHoursPerWeek = activeHoursPerWeek;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getActiveHoursPerWeek() {
        return activeHoursPerWeek;
    }

    public void setActiveHoursPerWeek(int activeHoursPerWeek) {
        this.activeHoursPerWeek = activeHoursPerWeek;
    }

    public int getSalaryCalculated() {
        int salary;
        if (this.type.equals("Full Time")) {
            salary = (int) (this.baseSalary * (this.yearsOfExperience * 1.10));
        } else {
            salary = this.baseSalary * this.activeHoursPerWeek;
        }
        return salary;
    }

    public String teacherInfo() {
        DecimalFormat df = new DecimalFormat("###,###,###");
        String str = "";
        str += "Name: " + this.getName() + "\n";
        str += "ID: " + this.getId() + "\n";
        str += "Type: " + this.getType() + "\n";
        str += "Base salary: $" + df.format(this.getBaseSalary()) + "\n";
        str += "Total salary: $" + df.format(this.getSalaryCalculated()) + "\n";
        str += "Years of experience: " + this.getYearsOfExperience() + " years \n";
        str += "Active hours per week: " + this.getActiveHoursPerWeek() + " hours \n";
        return str;
    }

}