public class Main {
    public static void main (String[] args){
        Point p1 = new Point(50,60);
        Point p2 = new Point(4,6);
        Point p3 = new Point(10,32);

        Point result = p1.subtract(p3);
        Point result2 = p3.subtract(p2);
        System.out.println("Subtraction 1: " + p1 + "-" + p3 + "=" +result);
        System.out.println("Subtraction 2:" + p3 + "-" + p2 + "=" +result2);
    }
    
}
