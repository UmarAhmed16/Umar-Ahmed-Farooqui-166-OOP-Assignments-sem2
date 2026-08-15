public class Car {

    // --- Attributes ---
    private String brand;
    private int speed;
    private boolean engineOn;
    private int fuelLevel;       // 0 to 100
    private String gear;         // "P" (park), "D" (drive), "R" (reverse)
    private int odometer;        // total distance driven

    // ---------- Constructors ----------
    // A constructor runs the moment "new Car(...)" is called. Its job is to
    // build the object on the HEAP and fill in its fields. In Java, "default"
    // does NOT mean the object is null — every field below is deliberately
    // given a starting value, so the object is fully usable right away.

    // Default constructor null()
    public Car() {
        this.brand = "Unknown";
        this.speed = 0;
        this.engineOn = false;
        this.fuelLevel = 100;
        this.gear = "P";
        this.odometer = 0;
    }

    // Parameterized constructor ()
    public Car(String brand, int fuelLevel) {
        this.brand = brand;
        this.speed = 0;
        this.engineOn = false;
        this.fuelLevel = fuelLevel;
        this.gear = "P";
        this.odometer = 0;
    }

    // --- getters / setters ---

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    // --- Behaviours (functions) ---

    public void startEngine() {
        if (engineOn) {
            System.out.println(brand + ": Engine is already running.");
        } else if (fuelLevel <= 0) {
            System.out.println(brand + ": Cannot start engine, no fuel!");
        } else {
            engineOn = true;
            gear = "D";
            System.out.println(brand + ": Engine started.");
        }
    }

    // stopping the engine always resets speed to 0
    public void stopEngine() {
        engineOn = false;
        speed = 0;
        gear = "P";
        System.out.println(brand + ": Engine stopped. Speed reset to 0.");
    }

    // cannot drive with the engine off or with no fuel
    public void drive(int amount) {
        if (!engineOn) {
            System.out.println(brand + ": Cannot drive, engine is off.");
            return;
        }
        if (fuelLevel <= 0) {
            System.out.println(brand + ": Out of fuel, cannot drive.");
            return;
        }
        speed += amount;
        useFuel(amount / 5);
        System.out.println(brand + ": Driving. Speed = " + speed + " km/h.");
    }

    public void moveFast() {
        drive(30);
    }

    // speed can never become negative
    public void moveSlow() {
        if (!engineOn) {
            System.out.println(brand + ": Engine is off, nothing to slow down.");
            return;
        }
        speed -= 10;
        if (speed < 0) {
            speed = 0;
        }
        System.out.println(brand + ": Slowing down. Speed = " + speed + " km/h.");
    }

    public void moveLeft() {
        if (!engineOn) {
            System.out.println(brand + ": Cannot turn, engine is off.");
            return;
        }
        System.out.println(brand + ": Turning left.");
    }

    public void moveRight() {
        if (!engineOn) {
            System.out.println(brand + ": Cannot turn, engine is off.");
            return;
        }
        System.out.println(brand + ": Turning right.");
    }

    // Turbo mode 
    public void turboMode() {
        if (!engineOn) {
            System.out.println(brand + ": Cannot activate turbo, engine is off.");
            return;
        }
        if (fuelLevel < 15) {
            System.out.println(brand + ": Not enough fuel for turbo mode!");
            return;
        }
        speed += 60;
        useFuel(15);
        System.out.println(brand + ": TURBO MODE ACTIVATED! Speed = " + speed + " km/h.");
    }

    public void refuel(int amount) {
        fuelLevel += amount;
        if (fuelLevel > 100) {
            fuelLevel = 100;
        }
        System.out.println(brand + ": Refuelled. Fuel level = " + fuelLevel + "%.");
    }



    public void showStatus() {
        System.out.println("---- " + brand + " status ----");
        System.out.println("Engine: " + (engineOn ? "ON" : "OFF"));
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Gear: " + gear);
        System.out.println("Fuel: " + fuelLevel + "%");
        System.out.println("Odometer: " + odometer + " km");
        System.out.println("-----------------------------");
    }

    // Private helper: safely reduces fuel and never lets it go negative
    private void useFuel(int amount) {
        fuelLevel -= amount;
        if (fuelLevel < 0) {
            fuelLevel = 0;
        }
        odometer += 1;
    }
}
    
 