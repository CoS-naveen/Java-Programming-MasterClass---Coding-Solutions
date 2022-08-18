package Section;

// which is equal to the sum of its factors
public class PerfectNumber {
    public static boolean isPerfectNumber(int n){
        if(n<1)
            return false;
        int result=0;
        for(int i=1;i<n;i++){
            if(n%i==0)
                result+=i;
        }
        return result==n?true:false;
    }
}