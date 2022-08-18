package Section;

public class LastDigitChecker {

    public static boolean isValid(int n){
        if(n<10 || n>1000)
            return false;
        return true;
    }
    //true if at least two of the numbers share the same rightmost digit
    public static boolean hasSameLastDigit(int x,int y,int z){
        if(!isValid(x) || !isValid(y) || !isValid(z) )
            return false;
        if(x%10==y%10 || y%10==z%10 || z%10==x%10)
            return true;
        return false;
    
}
}