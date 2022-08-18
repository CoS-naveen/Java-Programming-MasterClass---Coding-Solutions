package Section;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if(number<0)
            return -1;
        int result=0,digit;
        while(number>0){
            digit=number%10;
            if(digit%2==0)
                result+=(digit);
            number=number/10;
        }
        return result;
    }
    public static void main(String []args) {}
}
