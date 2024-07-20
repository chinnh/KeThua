package BaiTap.DemoStudent;

import java.util.ArrayList;

public class StudentManager {
    private Student[] listStudent;
    private int size;

    public StudentManager() {
        size = 0;
        this.listStudent = new Student[100];
    }

    public double getAvgStudentInClass() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += listStudent[i].getAverage();
        }
        return sum / size;
    }

    public double getMaxAvg() {
        if (size == 0) {
            return 0;
        }
        double max = listStudent[0].getAverage();
        for (int i = 1; i < size; i++) {
            if (listStudent[i].getAverage() > max) {
                max = listStudent[i].getAverage();
            }
        }
        return max;
    }

    public void add(Student student) {
        this.listStudent[size] = student;
        this.size++;
    }

    public int findById(int id) {
        for (int i = 0; i < size; i++) {
            if (listStudent[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void remove(int id) {
        int index = findById(id);
        for (int i = index; i < size; i++) {
            listStudent[i] = listStudent[i + 1];
        }
        size--;
    }

    public void edit(int id, Student newStudent) {
        int index = findById(id);
        this.listStudent[index] = newStudent;

    }

    public Student findStudentById(int id) {
        for (Student student : this.listStudent) {
            if (student != null && student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public ArrayList<Student> getStudentByName(String name) {
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (listStudent[i].getName().toLowerCase().contains(name.toLowerCase())) {
                students.add(listStudent[i]);
            }
        }
        return students;
    }

    public Student[] getListStudent() {
        return this.listStudent;
    }

    public int getSize() {
        return size;
    }
}
