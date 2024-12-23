public class highSchool extends District{

    private String schoolName;

    public highSchool(String d, String s){
       super(d);
       schoolName = s;
    }

     public String getSchoolName(){
        return schoolName;
    }

    public String toString(){
            return super.getDistrict() + " " + schoolName + " High School";
        }

     

}
