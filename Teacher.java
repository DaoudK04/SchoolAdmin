import java.util.ArrayList;

public class Teacher extends School{
    private String name;
    private String subject;
    private ArrayList<Student> roster;

    public Teacher(String d, String s, String n, String sub){
        super(d, s);
        this.name = n;
        this.subject = sub;
        this.roster = new ArrayList<Student>();
    }

    public String getSubject(){
        return subject;
    }

    public void setSubject(String sub){
        this.subject = sub;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        this.name = n;
    }

    public void addTeacher(ArrayList<Teacher> z, Teacher n){
        z.add(n);
        System.out.println("Added teacher " + n.getName() + " to " + n.getSchoolName());
        //return z;
    }

    public void removeTeacher(ArrayList<Teacher> z, Teacher t){
        z.remove(t);
        System.out.println("Removed teacher " + t.getName() + " from " + super.getSchoolName());
        //return z;
    }

    public void clearStaff(ArrayList<Teacher> z){
        z.clear();
    }
    
    
    
    
    
        //Not Sure if needed or places right
        //the student declaration gives an error 
    public void createStudent(String n){
        Student student = new Student(super.getDistrict(), super.getSchoolName(), n);
        roster.add(student);
        System.out.println("Added student " + student.getName() + " to " + Teacher.this.getName() + "'s roster");
    }

    public void removeStudent(Student s){
        roster.remove(s);
    }

    public ArrayList<Student> getRoster(){
        return roster;
    }

    public void clearRoster(){
        roster.clear();
    }

    @Override
    public String toString(){
        return super.toString() + ": " + name + " Subject - " + subject;
    }
}
