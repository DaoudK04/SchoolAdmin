import java.util.ArrayList;
public class mainMethod {
    public static void main(String[] args) {
        System.out.println("------School Administrative System------\n");

        //Create a default District
        District district = new District("MCPS");

        //Create default schools
        School elementary = new School(district.getDistrict(), "Jennie Dean Elementary");
        School middle = new School(district.getDistrict(), "Metz Middle School");
        School high = new School(district.getDistrict(), "Osbourn High School");

        Teacher t1 = new Teacher(district.getDistrict(), elementary.getSchoolName(),"IDK" , "Math");
        //create an Arraylist of Teachers to hold other teachers
        ArrayList<Teacher>tRoster = new ArrayList<Teacher>();
        t1.addTeacher(tRoster,t1); 

        t1.createStudent("Fred");

        //sample test run
        System.out.println("School: " +  elementary.getDistrict() + " " + elementary.getSchoolName());
        System.out.println("Teacher: " + t1.getDistrict() + " " +  t1.getSchoolName() + " " + t1.getName() + " " + t1.getSubject());
        System.out.println("ArrayList Test: " + tRoster.get(0));
        System.out.println("STUDENT arraylist test: " + t1.getRoster());
        //OUTPUT:
        //Added teacher IDK to Jennie Dean Elementary
        //School: MCPS Jennie Dean Elementary
        //Teacher: MCPS Jennie Dean Elementary IDK Math
        //ArrayList Test: MCPS: IDK Subject - Math
        //Error incompatible types: String cannot be converted to District
        //Student student = new Student(this.getDistrict(), this.getSchoolName(), n);
        //                                              ^
        
        //t1.removeTeacher(tRoster, t1);

        //System.out.println("ArrayList Test: " + tRoster.get(0));

        
    }   
}
