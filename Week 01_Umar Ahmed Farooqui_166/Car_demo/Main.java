        /*   STACK vs HEAP — where these objects actually live
         * ---------------------------------------------------------------
         *
         *      STACK                                 HEAP
         *   (references only) 
         *        main()                                (actual objects)
         *  -------------------            -----------------------------
         * | ferrari : Car     |---------->| Car object #1               |
         * | (holds an address) |          | brand="Ferrari", fuel=100   |
         *  -------------------            -----------------------------
         *
         *  -------------------            -----------------------------
         * | audi : Car        |---------->| Car object #2               |
         * | (holds an address) |          | brand="Audi", fuel=80       |
         *  -------------------            -----------------------------
         *
         *  -------------------            -----------------------------
         * | parkedCar : Car   |---------->| Car object #3               |
         * | (holds an address) |          | brand="ParkedCar", fuel=50  |
         *  -------------------            -----------------------------   */

    public class Main{
    public static void main(String[] args){
        
        Car ferrari = new Car("Ferrari", 100);
 
        Car audi = new Car();
        audi.setBrand("Audi");
        audi.refuel(80); // start Audi at 80% fuel 
 
        System.out.println("===Testing the Ferrari===");
        ferrari.startEngine();
        ferrari.moveFast();
        ferrari.turboMode();
        ferrari.moveLeft();
        ferrari.showStatus();
 
        System.out.println("=== Testing the Audi ===");
        audi.startEngine();
        audi.drive(20);
        audi.moveRight();
        audi.showStatus();
 
        // Proof that the two objects are independent of each other.
        // ferrari and audi are two different references pointing to two
        // different objects on the heap, so a change through one reference
        // is invisible through the other.
        System.out.println("===Independence check ===");
        ferrari.moveSlow();
        System.out.println("Ferrari slowed down, but Audi's state is untouched:");
        audi.showStatus();
 
        // Testing if rules that have been applied work or not
        System.out.println("=== Rule test when engine is off ===");
        Car parkedCar = new Car("ParkedCar", 50);
        parkedCar.drive(10); // blocked: engine is off
        parkedCar.moveFast();    // blocked: engine is off
        parkedCar.stopEngine();  // engine already off, speed already 0
        parkedCar.showStatus();

    
    

   }
}