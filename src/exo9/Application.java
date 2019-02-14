package exo9;

import java.util.ArrayList;
import java.util.Objects;

public class Application {

    ArrayList<ArrayList<Mark>> marks;

    public Application(ArrayList<ArrayList<Mark>> marks) {
        this.marks = marks;
    }

    public void print() {
        for (int i = 0; i < marks.size(); i++) {
            System.out.println("Etudiant" + i + ":");
            for (int n = 0; n < marks.get(i).size(); n++) {
                System.out.println(marks.get(i).get(n).getValue());
            }
        }
    }

     public float average(int position) {
        float   average = 0;
        float   add = 0;
        int     div = 0;
        for (int i = 0; i < marks.get(position).size(); i++) {
            add += marks.get(position).get(i).getValue();
            div += 1;
        }
        average = add / div;
        return average;
    }

    public void add(int position, String subject, float value) {
        Mark mark = new Mark(value, subject);
        marks.get(position).add(mark);
    }

    public int compute() {
        int nbr = 0;
        for (int i = 0; i < marks.size(); i++) {
            int tmp = 0;
            for (int n = 0; n < marks.get(i).size(); n++) {
                tmp += 1;
            }
            if (tmp > nbr)
                nbr = tmp;
        }
        return nbr;
    }

    public float [] avgs() {
        float[] result = new float[marks.size()];
        for (int i = 0; i < marks.size(); i++) {
            result[i] = average(i);
        }
        return result;
    }

    @Override
    public String toString() {
        return "Application{" +
                "marks=" + marks +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Application that = (Application) o;
        return Objects.equals(marks, that.marks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marks);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
