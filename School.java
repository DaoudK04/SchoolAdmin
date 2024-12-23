public class School extends District {
    
    private String schoolName;

    public School(String d, String s){
        super(d);
        schoolName = s;
    }


    public String getSchoolName(){
        return schoolName;
    }

    @Override
    public String toString(){
         return super.getDistrict() + " " + schoolName;
    }

}
