public class Point {
    private double x;
    private double y;
  

    public point(){
        this.x=0.0;
        this.y=0.0;
        
    }

    public point (double x, double y){
         this.x=x;
         this.y=y;
    }
    public double getx(){
        return x;
    }

    public double gety(){
        return y;
    }

    public void setx(double x){
        this.x=x;
    }
    public void sety(double y){
        this.y=y;
    }

   

    public double getDistance(point other){
        
        double distance = Math.sqrt(Math.pow(other.x-this.x, 2)+Math.pow(other.y-this.y, 2));

        return distance;
        
    }

    @Override
    public String toString(){
        return "Value of x: " + x + "\n Value of y: " + y ;
    }


    

    
}