public class middleSchool extends District {
    
    private String schoolName;

    public middleSchool(String d, String s){
        super(d);
        schoolName = s;
    }

    public String getSchoolName(){
        return schoolName;
    }

    public String toString(){
        return super.getDistrict() + " " + schoolName + " Middle School";
    }
    
}
