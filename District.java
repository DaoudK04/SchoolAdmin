public class District {

    private String district;
    
    public District(String d){
        this.district = d;
    }

    public String setDistrict(String d){
        return this.district = d;
    }

    public String getDistrict(){
        return this.district;
    }

    @Override
    public String toString(){
        return this.district;
    }
    
}