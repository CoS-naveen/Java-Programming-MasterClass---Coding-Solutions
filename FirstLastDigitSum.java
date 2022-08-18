package Section;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        int digit,first=0,last;
        last=number%10;
        if(number<0)
            return -1;
        //replacing values of first till found
        while(number>0){
            digit=number%10;
            first=digit;
            number/=10;
        }
        return first+last;
    }
}
