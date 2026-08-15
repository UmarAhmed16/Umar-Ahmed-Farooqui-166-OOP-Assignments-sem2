public class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(4, -5);
        Complex c3 = new Complex(); 

        System.out.println("Complex Number 1: " + c1);
        System.out.println("Complex Number 2: " + c2);
        System.out.println("Complex Number 3: " + c3);

        Complex sum = c1.add(c2);
        Complex difference = c1.subtract(c2);
        Complex product = c1.multiply(c2);
        Complex quotient = c1.divide(c2);
        Complex conjugate = c2.conjugate();

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println(conjugate);
    }
}