package Section;

// true if there is a digit that appears in both numbers, such as 2 in 12 and 23
public class SharedDigit {
    public static boolean hasSharedDigit(int p,int q){
        if(p<10 || q<10 || p>99 || q>99)
            return false;
    
        int p_last = p%10;p/=10;
        int p_first = p%10;
        int q_last = q%10;q/=10;
        int q_first = q%10;
        
        if(p_last==q_first || p_last==q_last || p_first==q_first || p_first==q_last)
            return true;
        return false;
        
    }
}
