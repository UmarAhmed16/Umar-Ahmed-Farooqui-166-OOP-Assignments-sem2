public class Calculator{
    //not passing any atributes because there is no
    //  number limit to any calculation
    
    public double add(double first,double second){
        return first+second;
    }
    public double add(double... numbers) {
        double total = 0;
        for (double number : numbers) {
            total += number;
        }
        return total;
    }

    public double subtract(double first,double second){
        return first-second;
    }
    public double multiply(double first,double second){
        return first*second;
    }
    public double divide(double first,double second){
        if(second==0){
            System.out.println("Error! cannot divide by 0");
        return 0;}
        return first/second;
    }
    public double modulus(double first,double second){
        if(second==0){
            System.out.println("Error cannot perform modulus by zero");
             return 0;
        }
       return first % second;

    }

    public double power(double first,double second){
        return Math.pow(first, second);
    }

     public double average(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("Error! cannot average zero numbers+");
            return 0;
        }
        double total = 0;
        for (double number : numbers) {
            total += number;
        }
        return total / numbers.length;
    }
 
    // NEW OPERATION 2: biggest number out of any amount of numbers
    public double maximum(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("Error! no numbers given");
            return 0;
        }
        double max = numbers[0];
        for (double number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;

    }
}