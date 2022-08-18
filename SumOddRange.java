package Section;

public class SumOddRange {
    public static boolean isOdd(int num){
        if(num<0)
            return false;
        else if(num%2!=0)
            return true;
        return false;
    }
    //summing odds in given range
    public static int sumOdd(int start,int end){
        int result=0;
        if(start>0 && end>0 && start<=end){
            for(int i=start;i<=end;i++){
                if(isOdd(i)){
                    result+=i;
                }   
        }
            return result;
        }
        return -1;
    }
 
}