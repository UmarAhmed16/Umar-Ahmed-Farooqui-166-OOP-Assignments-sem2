public class Main{
    public static void main (String[] args) throws CloneNotSupportedException{
        Array v1 = new Array();
        Array v2 = (Array) v1.clone();
        System.out.println("v1: " +v1);
        System.out.println("v2 :" +v2);
        v2.increment();
        v1.increment();
        v1.SetElement(4, new Point(55,55));
        v2.SetElement(5, new Point(99,99) );

        System.out.println("v1 after increment :" +v1);
        System.out.println("v2 after increment :" +v2);
    }
}