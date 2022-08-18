package Section;

public class TeenNumberChecker {

    public static boolean isTeen(int num){
        if((num>=13 && num<=19))
            return true;
        return false;
    }
	// return true if one of the parameters is in range 13-19
    public static boolean hasTeen(int a,int b,int c){
        if(isTeen(a)||isTeen(b)||isTeen(c))
            return true;
        return false;
    }
}