package Section;


//Comparing if the number is same till 3 decimal places by multiplying by 1000.
public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces(double d1, double d2){
        return (int)(d1*1000)==(int)(d2*1000)?true:false;
    }
    
    public static void main(String []args) {}
}