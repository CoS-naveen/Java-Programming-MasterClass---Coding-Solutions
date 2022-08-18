package Section;

public class NumberPalindrome {
    public static boolean isPalindrome(int n){
        int reversed=0,org=n;
        //handling negatives 
        if(n<0){
            n-=2*n;
            org=n;
        }
        //reversing number
        while(n>0){
            reversed = (reversed*10)+n%10;
            n=n/10;
        }
        
        return reversed==org?true:false;
    }
}