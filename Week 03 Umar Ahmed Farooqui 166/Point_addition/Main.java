public class Main{
    public static void main(String[] args){

        Point P1 = new Point(6, 4);
        Point P2 = new Point(5,7);
        Point P3 = new Point(4,6);
        Point result = P1.add(P2);
        Point result2 = P2.add(P3);
        System.out.println("Addition 1 : " + P1 + "+" + P2 + "=" +result);
        System.out.println("Addition 2: " + P2 + "+" + P3 + "=" +result2);
        
    }
}