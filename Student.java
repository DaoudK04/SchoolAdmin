public class Student extends School {
    
    private String name;
    
    public Student(District d, String s, String n){
        super(d.getDistrict(),s);
        this.name = n;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String n){
        this.name = n;
    }


    @Override
    public String toString(){
        return super.toString() + " " + name;
    }
}
