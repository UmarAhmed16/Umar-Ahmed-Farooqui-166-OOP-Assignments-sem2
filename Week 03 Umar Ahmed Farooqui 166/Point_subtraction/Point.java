public class Point{

    private double x;
    private double y;

    public Point (){
        this.x=0.0;
        this.y=0.0;
    }

    public Point (double x , double y){
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

    public Point subtract(Point obj){

    return (obj == null) ? new Point(0, 0) :  new Point((this.x - obj.x < 0) ? 0 : this.x - obj.x, (this.y - obj.y < 0) ? 0 : this.y - obj.y);

    }

    @Override
    public String toString(){
        return "(" + x + "," + y + ")";
    }


    
}