public class mainMethod {
    public static void main(String[] args) {
        System.out.println("------School Administrative System------\n");

        //Create a default District
        District district = new District("MCPS");

        //Create default schools
        School elementary = new School(district, "Jennie Dean Elementary");
        School middle = new School(district, "Metz Middle School");
        School high = new School(district, "Osbourn High School");

        
    }   
}
