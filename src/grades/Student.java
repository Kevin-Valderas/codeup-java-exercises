package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Double> grades;

    public Student() {
        this.name = "";
        this.grades = new ArrayList<>();
    }

    public String getName(){
        return name;
    }
    public void addGrade(double grade){
        grades.add(grade);
    }
    public double getGradeAverage(){
        double average = 0;
        for (int i = 0; i <= grades.size(); i++){
            average += grades.get(i);
        }
        return average/grades.size();
    }

    public void main(String[] args){
        Student student1 = new Student();
        student1.name = "Tony Martinez";
        student1.addGrade(85);
        student1.addGrade(78);
        student1.addGrade(97);
    }
}
