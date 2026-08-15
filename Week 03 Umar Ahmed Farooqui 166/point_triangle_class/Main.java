public class Main {
    public static void main(String[] args) {

        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(new point(0.0, 0.0), new point(3.0, 0.0), new point(0.0, 4.0));
        Triangle t3 = new Triangle(t2);
        System.out.println(t1 + "\nArea: " + t1.area());
        System.out.println(t2 + "\nArea: " + t2.area());
        System.out.println(t3 + "\nArea: " + t3.area());
        System.out.println("Total triangles created: " + Triangle.objectCount());
    }
}