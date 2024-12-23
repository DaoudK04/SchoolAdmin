import java.util.ArrayList;

public class School extends District {
    
    private String schoolName;
    private ArrayList<Teacher> staff;

    public School(String d, String s){
        super(d);
        this.schoolName = s;
        staff = new ArrayList<Teacher>();
    }


    public void setSchoolName(String s){
        this.schoolName = s;
    }
    
    public String getSchoolName(){
        return this.schoolName;
    }

    //Not sure if createTeacher is necessary same in Student.java
    public void createTeacher(String n, String sub){
        Teacher teacher =  new Teacher(super.getDistrict(), this.schoolName, n, sub);
        staff.add(teacher);
        System.out.println("Added teacher " + teacher.getName() + " to " + this.schoolName);
    }

    public void removeTeacher(Teacher t){
        staff.remove(t);
        System.out.println("Removed teacher " + t.getName() + " from " + this.schoolName);
    }

    @Override
    public String toString(){
         return super.getDistrict() + " " + this.schoolName;
    }

}
