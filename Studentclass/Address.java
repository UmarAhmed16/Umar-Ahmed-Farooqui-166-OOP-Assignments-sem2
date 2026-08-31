public class Address{
    private String homeaddress;
    private String state;
    private String city;
    private int zipcode;

    public Address(){
        this.homeaddress = "UNKNOWN";
        this.state = "UNKNOWN";
        this.city = "UNKNOWN";
        this.zipcode = 00000;
    }
    public Address(String home , String state , String city , int zip){
        this.homeaddress = home;
        this.state = state;
        this.city = city;
        this.zipcode = zip;
    }
@Override
    public String toString(){
        return homeaddress + "," + state + "," + city + "," + zipcode;
    }


}