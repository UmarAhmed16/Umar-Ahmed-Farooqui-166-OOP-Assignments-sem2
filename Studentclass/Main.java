public class Main {

    public static void main (String[] args){

        Address home = new Address("Gulshan" , "sindh", "Karachi" , 75300);
        Date dob = new Date (07 , "october" , 2007);

        Student s1 = new Student();
        Student s2 = new Student("UA-456", "UMAR AHMED", home , dob);
        System.out.println(s1);
        System.out.println(s2);
    }
    
}
