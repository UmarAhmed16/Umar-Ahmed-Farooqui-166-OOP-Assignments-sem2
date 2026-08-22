import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        int choice = getMenuchoice();
        while ( choice !=3){
            switch (choice) {
                case 1:
                    System.out.println("Enter the lentgh: ");
                    rectangle.SetLength(sc.nextDouble());

                    
                    break;
            
                case 2 :
                    System.out.println("Enter the Width: ");
                    rectangle.setWidth(sc.nextDouble());
                    break;
            }
            System.out.println(rectangle.toString());
            choice = getMenuchoice();
        }

    }



private static int getMenuchoice(){
    Scanner sc = new Scanner(System.in);


  System.out.println("1. Set Length");
  System.out.println("2. Set Width");
  System.out.println("3. Exit");
  System.out.println("Enter your option: ");





    return sc.nextInt();
  }

}