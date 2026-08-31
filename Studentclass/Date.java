public class Date {
    private int day;
    private String month;
    private int year;

    public Date(){
        this.day = 0;
        this.month = "UNKNOWN";
        this.year = 0;
    }

    public Date(int d , String m , int y){
        this.day = d;
        this.month =m;
        this.year = y;

    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }


    
}
