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

    public Point add(Point obj){
        return new Point(this.x + obj.x , this.y + obj.y);
    }

    @Override
    public String toString(){
        return "(" + x + "," + y + ")";
    }


    
}