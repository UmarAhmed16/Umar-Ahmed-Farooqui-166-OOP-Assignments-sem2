public class Main { 
    public static void main(String[] args) { 
        try { 
            Rationalnum f1 = new Rationalnum(); 
            Rationalnum r1 = new Rationalnum(2, 3); 
            Rationalnum r2 = new Rationalnum(4, 5); 
            Rationalnum r4 = new Rationalnum(0, 1); // Valid fraction equal to 0

    
            Rationalnum sum = r1.add(r2); 
            Rationalnum difference = r1.subtract(r2); 
            Rationalnum product = r1.multiply(r2); 
            Rationalnum quotient = r1.divide(r2); 

    
            System.out.println("Rational Number 1: " + r1); 
            System.out.println("Rational Number 2: " + r2); 
            System.out.println("Sum: " + sum); 
            System.out.println("Difference: " + difference); 
            System.out.println("Product: " + product); 
            System.out.println("Quotient: " + quotient); 

        
            System.out.println("\nAttempting dangerous division by zero");
            Rationalnum quotientByZero = r1.divide(r4); 
            System.out.println("This print won't run because the line above crashes!");

        } catch (ArithmeticException e) { 
            System.out.println("Caught an error: " + e.getMessage()); 
            System.out.println("The program will now continue safely."); 
        } 
    } 
}
