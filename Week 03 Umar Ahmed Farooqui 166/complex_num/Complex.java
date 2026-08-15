public class Complex{
    private double real;
    private double imaginary;

    public Complex(){
        this.real = 0.0;
        this.imaginary = 0.0;
    }

    public Complex (double r , double i){
        real =r;
        imaginary =i;
    }

    public Complex add (Complex obj){

        return new Complex (this.real + obj.real , this.imaginary + obj . imaginary );

    }

    public Complex subtract (Complex obj){
        return new Complex (this.real - obj.real , this.imaginary - obj.imaginary);
    }

    public Complex multiply (Complex obj){
        double a = this.real;
        double b = this.imaginary;
        double c = obj.real;
        double d =obj.imaginary;
        return new Complex(a * c - b * d, a * d + b * c);
    }

    public Complex divide (Complex obj){
        double a = this.real;
        double b = this.imaginary;
        double c = obj.real;
        double d =obj.imaginary;

        if(c==0 && d == 0){
           throw new ArithmeticException("Error : cannot divide by zero !");
        }
        double denominator = c * c + d * d;
        return new Complex(((a*c) + (b*d))/denominator , ((b*c) - (a*d))/denominator);
    }
   public Complex conjugate(){
     return new Complex(this.real , this.imaginary *-1);
   } 

   @Override
   public String toString(){
    return String.format("(%.2f , %.2fi)",real,imaginary) ;
   }
}