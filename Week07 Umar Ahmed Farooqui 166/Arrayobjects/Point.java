import java.util.Objects;
public class Point {
    
    private double x;
    private double y;

    public Point(){
        this.x = 0.0;
        this.y = 0.0;
    }

    public Point(double x , double y){
        this.x = x;
        this.y = y;
    }

    public void setx(double x){
        this.x = x;
    }
    public void sety (double y){
        this.y=y;
    }
    public double getx(){
        return x;
    }
    public double gety(){
        return y;
    }

    public Point copy(){
        return new Point(this.x ,this.y);
    }
   @Override
   public String toString(){
    return "(" + x + "," + y + ")";
   }

   //equals override:
    @Override
    public boolean equals(Object obj){
        if (this==obj){
            return true;
        }
        if(obj==null){
            return false;
        }
        if(!(obj instanceof Point)){
            return false;

        }
        Point that = (Point) obj;

        return this.x==that.x && this.y == that.y;
 }

 //hashcode override bucket system:
 @Override
    public int hashCode(){
        return Objects.hash(x,y);
    }
    

}

