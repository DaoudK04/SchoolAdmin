public class Teacher extends School{
    public String name;
    public String subject;

    public Teacher(String d, String s, String n, String sub){
        super(d, s);
        this.name = n;
        this.subject = sub;
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
}
