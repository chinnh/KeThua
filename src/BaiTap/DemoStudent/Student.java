package BaiTap.DemoStudent;

import java.util.Arrays;

public class Student {
    private int id;
    private String name;
    private String gender;
    private double[] grade;

    private static int idIncrement = 1;

    public Student(String name, String gender, double[] grade) {
        this.id = idIncrement;
        this.name = name;
        this.gender = gender;
        this.grade = grade;
        idIncrement++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double[] getGrade() {
        return grade;
    }

    public void setGrade(double[] grade) {
        this.grade = grade;
    }

    public double getAverage() {
        double sum = 0;
        for (int i = 0; i < grade.length; i++) {
            sum += grade[i];
        }
        return sum / grade.length;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + ", gender='" + gender + '\'' + ", grade=" + Arrays.toString(grade) + '}';
    }

    public double getAverageGrade() {
        double sum = 0;
        for (double grade : grade) {
            sum += grade;
        }
        return sum / grade.length;
    }
}
