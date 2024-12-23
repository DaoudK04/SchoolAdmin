public class Teacher extends School{

    public String name;
    public String subject;

    public Teacher(String d, String s, String n, String sub){
        super(d, s);
        name = n;
        subject = sub;
    }

}
