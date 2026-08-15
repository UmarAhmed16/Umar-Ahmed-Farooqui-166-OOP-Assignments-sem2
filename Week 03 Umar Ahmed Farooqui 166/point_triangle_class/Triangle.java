public class Triangle{
    private Point p1;
    private Point p2;
    private Point p3;
    public static int count =0;
    public static int objectCount(){
        return count;
    }

    public Point getp1(){
        return p1;
    }

    public Point getp2(){
        return p2;
    }

    public Point getp3(){
        return p3;
    }

   
    public Triangle(){
        this.p1 =new Point();
        this.p2=new Point();
        this.p3 = new Point();
        count++;
    }

    

    public Triangle(Point a,Point b, Point c){
        this.p1 = a;
        this.p2 = b;
        this.p3 = c;
        count++;
    }

    public Triangle (Triangle t){
        this.p1 = t.getp1();
        this.p2=t.getp2();
        this.p3=t.getp3();
        count++;
    }

   

    
    
    public  double perimeter(){
        double result = p1.getDistance(p2)+ p2.getDistance(p3) + p1.getDistance(p3);
        return result;
    }
    
    public boolean isRightAngled(){
        double ab = p1.getDistance(p2);
        double bc = p2.getDistance(p3);
        double ac = p1.getDistance(p3);
        double longest, a ,b;
        if(ab> bc && ab > ac){
            longest=ab;
            a=bc;
            b=ac;

        }
        else if (bc> ab && bc>ac){
            longest=bc;
            a=ab;
            b=ac;
            
        }

        else {
            longest=ac;
            a=ab;
            b=bc;
        }

        return Math.abs(longest*longest - (a*a + b*b)) < 0.0001 ; 
     }

     public double area(){
        double s = perimeter()/2;
        double ab = p1.getDistance(p2);
        double bc = p2.getDistance(p3);
        double ac = p1.getDistance(p3);
        double area =Math.sqrt(s*(s-ab)*(s-bc)*(s-ac));
        return area;
     }
    

    @Override
    public String toString(){
       return "Point 1: " +p1+ "\n Point 2: " +p2+ "\n Point 3:" +p3+ "\nPerimeter:" +perimeter()+ "\n Is it right angled? " +isRightAngled() + 
       "\n p1-->p2 " +p1.getDistance(p2) + "\n p2-->p3 " +p2.getDistance(p3)+ "\n p1-->p3 " +p1.getDistance(p3);
      
    }

}