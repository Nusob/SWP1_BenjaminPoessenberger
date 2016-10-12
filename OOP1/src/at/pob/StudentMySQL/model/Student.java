package at.pob.StudentMySQL.model;

/**
 * Created by bpoes on 11.10.2016.
 */
public class Student {
    private String name;
    private int mNr;

    public Student(String name, int mNr) {
        this.name = name;
        this.mNr = mNr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getmNr() {
        return mNr;
    }

    public void setmNr(int mNr) {
        this.mNr = mNr;
    }
}
