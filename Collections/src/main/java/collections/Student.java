package collections;

public class Student {

    private int id;

    public int getId(){
        return this.id;
    }

    public Student(int id){
        this.id = id;
    }


    public boolean equals(Object o){
        Student s = (Student)o;
        if(this.id==s.id)
            return true;
        else
            return  false;
    }
}
