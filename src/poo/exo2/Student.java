package poo.exo2;

public class Student implements Operator<Student>{
    int     id;
    String  name;

    @Override
    public int compareTo(Student s) {
        return id - s.id;
    }
}
