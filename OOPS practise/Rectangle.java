public class Rectangle{
    
    private double Width;
    private double Length;

    //default null constructor
public Rectangle()
 {
    this.Length=1.0;
    this.Width=1.0;

 }

 // parameterized constructor
 public Rectangle(double w , double l){
    this.Length=l;
    this.Width=w;
 }

// setters with validations so no negative value is inputted
 public void SetLength(double length){
    this.Length= (length > 0 && length < 100 ? length : 1.0);
 }

 public void setWidth(double Width){
    this.Width = ( Width > 0 && Width < 100 ? Width : 1.0);
 }

// getters

 public double getLength(){
    return Length;
 }
 public double getWidth(){
    return Width;
 }

 // area of rectangle
 public double getArea(){
     
    return Length*Width;
 }

 // perimeter of rectangle
 public double getPerimeter(){
    return 2*(Length+Width);
 }
// checks if length and widt are equal
 public boolean isSquared(){
    return this.Length==this.Width;
 }

 // checks if two trinagles are equal even if they are rotated example 5x2 to 2x5 rectangle 
 public boolean equals(Rectangle obj){
    return (this.Length==obj.Length && this.Width==obj.Width) || (this.Length==obj.Width && this.Width==obj.Length);

 }
 
public String toString()
 {
 return String.format( "%s: %f\n%s: %f\n%s: %f\n%s: %f", "Length", Length, "Width", Width,
 "Perimeter", getPerimeter(), "Area", getArea() , "is squared ?", isSquared() );
 } // end method

}