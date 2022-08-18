package Section;

public class NumberOfDaysInMonth {
    
	public static boolean isLeapYear(int year){
        if(year<1 || year>9999)
            return false;
        if((year%4==0 && year%100!=0) || (year%400)==0)
            return true;
        return false;
    }

    // return the number of days in the month
    public static int getDaysInMonth(int month,int year){
        if(month<1 || month>12 || year<1 || year>9999)
            return -1;
        int num=0;
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                num=31;
                break;
            case 2:
                num=28;
                break;
            default:
                num=30;
        }
        if(isLeapYear(year)==true && month==2)
            return num+1;
        return num;
            
    }
}
