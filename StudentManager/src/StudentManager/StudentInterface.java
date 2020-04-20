package StudentManager;


import java.util.ArrayList;

public interface StudentInterface {
    void addStudent(ArrayList<Student> list);
    void delStudent(ArrayList<Student> list);
    void outStudent(ArrayList<Student> list);
    void changeStudent(ArrayList<Student> list);
    void findStudent(ArrayList<Student> list);
}