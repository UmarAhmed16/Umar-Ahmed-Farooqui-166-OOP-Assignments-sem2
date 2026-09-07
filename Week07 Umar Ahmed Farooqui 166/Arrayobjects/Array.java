import java.util.Arrays;

public class Array implements Cloneable{
    private int value;
    private Point[] points;

    public Array(){
        points = new Point[6];
        for(int i =0;i < points.length;i++){
            points[i]= new Point(i+1,i+1);
        }
        value=10;
    }
    public void SetElement(int index, Point newPoints){

          points[index]=newPoints;
    }
    public void increment(){
        value+=1;
    }

    @Override 
    public Object clone() throws CloneNotSupportedException{

        Array copy = (Array) super.clone();
        copy.points = new Point[points.length];
        for (int i =0 ; i< points.length;i++){
        copy.points[i]= new Point(points[i].getx(),points[i].gety());
        }
        return copy;
    }

    @Override 
    public String toString(){
        return  Arrays.toString(points) + "Current Value: " + value;
    }
}