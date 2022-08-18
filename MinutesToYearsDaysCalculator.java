package Section;

public class MinutesToYearsDaysCalculator {
	
	//to calculate the years and days from the minutes
	//1 year = (60*24*365)
    public static void printYearsAndDays(long minutes){
        long min = minutes;
        if(minutes<0){
            System.out.print("Invalid Value");
        }
        else{
        long year = minutes/(60*24*365);
        minutes-=year*(60*24*365);
        long day = minutes/(60*24);
        System.out.printf("%d min = %d y and %d d",min,year,day);
        }
    }
    
    public static void main(String []args) {}
}
