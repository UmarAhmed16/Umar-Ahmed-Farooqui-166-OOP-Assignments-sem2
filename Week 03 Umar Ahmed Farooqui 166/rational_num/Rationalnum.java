public class Rationalnum{

    private double numerator;
    private double denomenator;

    public Rationalnum(){
      this.numerator=1.0;
      this.denomenator=1.0;
    }

    public Rationalnum(double n , double d){
        this.numerator=n;
        this.denomenator=d;
    }

    public Rationalnum add(Rationalnum obj){
        return new Rationalnum(((this.numerator*obj.denomenator) + (obj.numerator*this.denomenator)),(this.denomenator*obj.denomenator));
    }

    public Rationalnum subtract(Rationalnum obj){

        return new Rationalnum(((this.numerator*obj.denomenator) - (obj.numerator*this.denomenator)),(this.denomenator*obj.denomenator));
    }

    public Rationalnum multiply(Rationalnum obj){
        return new Rationalnum((this.numerator*obj.numerator),(this.denomenator*obj.denomenator));

    }

    public Rationalnum divide (Rationalnum obj){
        if(obj.numerator==0){
            throw new ArithmeticException("Error : cannot divide by 0!");
        }
        return new Rationalnum((this.numerator*obj.denomenator),(this.denomenator*obj.numerator));
    }

    @Override
    public String toString(){
        return this.numerator +"/" + this.denomenator;

    }
}