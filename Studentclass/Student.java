public class Student {
    private String studentID;
    private String name;
    private Address homeinfo;
    private Date dob; // date of birth
   

    public Student(){
        this.studentID = "UNKNOWN";
        this.name = "UNKNOWN";
        this.homeinfo = new Address("UNKNOWN" , "unknown" ,"UNKNOWN" , 000000);
        this.dob = new Date(00 , "Unknown" , 0000);
        
    }

    public Student(String id , String name , Address homeinfo , Date dob){
        this.studentID = id;
        this.name = name;
        this.homeinfo = homeinfo;
        this.dob = dob;
       

    }
    @Override
    public String toString(){
        return "ID: " + ( studentID != null ? studentID : "Not assigned") + "\n" +
               "Name: " + (name != null ? name : "Not assigned") + "\n" +
               "Address: " + (homeinfo != null ? homeinfo : "Not assigned") + "\n" +
               "DOB: " + (dob != null ? dob : "Not assigned");
    }
    
}
