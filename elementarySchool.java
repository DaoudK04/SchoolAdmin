public class elementarySchool extends District {
    
    private String schoolName;

    public elementarySchool(String d, String s){
        super(d);
        schoolName = s;
    }


    String getSchoolName(){
        return schoolName;
    }

    String toString(){
        return super.getDistrict() + " " + schoolName;
    }

}
