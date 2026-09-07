import java.util.Arrays;
public class Array implements Cloneable{
    private int value;
    private int[] anArray;

    // array in constructor and initialization
    public Array(){
        anArray = new int[6];
        for(int i =0;i<anArray.length;i++){
            anArray[i]=i+2;
        }

        value=10;
    }

    public void SetElements(int index , int newValue){
        anArray[index]= newValue;

    }
    //increment method
    public void increment(){
       
        value+=1;
    }
    
    
    //clone this is shallow copy
    public Object clone() throws CloneNotSupportedException{
        Array copy = (Array) super.clone();
        copy.anArray=this.anArray.clone();
        return copy;

    }

    @Override
    public String toString(){
        return Arrays.toString(anArray) + " Current Value: "  + value;
        
    }
}