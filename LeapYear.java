package Section;

public class LeapYear {

	//leap year if it is divisible by 4 but not by 100, or it is divisible by 400
    public static boolean isLeapYear(int year){
        if(year<1 || year>9999)
            return false;
        if((year%4==0 && year%100!=0) || (year%400)==0)
            return true;
        return false;
    }
    
	public static void main(String[] args) {
		System.out.println(isLeapYear(2000));

	}

}
