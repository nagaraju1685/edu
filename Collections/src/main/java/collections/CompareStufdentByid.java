package collections;

import java.util.Comparator;

public class CompareStufdentByid implements Comparator<Student> {

    public int compare(Student o1, Student o2) {
        return o1.getId() - o2.getId();
    }


}
