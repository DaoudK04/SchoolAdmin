public class Teacher extends School{
    public String name;

    public Teacher(String d, String s, String n){
        super(d, s);
        this.name = n;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        this.name = n;
    }
}
