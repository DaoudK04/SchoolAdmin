public class School extends District {
    
    private String schoolName;

    public School(String d, String s){
        super(d);
        this.schoolName = s;
    }


    public void setSchoolName(String s){
        this.schoolName = s;
    }
    
    public String getSchoolName(){
        return this.schoolName;
    }

    @Override
    public String toString(){
         return super.getDistrict() + " " + this.schoolName;
    }

}
