public class elementarySchool extends District {
    
    private String schoolName;

    public elementarySchool(String d, String s){
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
