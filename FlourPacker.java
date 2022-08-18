package Section;
// the kilos of bigCount and smallCount must be at least equal to the value of goal. 
//The method should return true if it is possible to make a package with goal kilos of flour.
//bigCount-5kg each, small -1kg each
public class FlourPacker {
    public static boolean canPack(int bigCount,int smallCount,int goal){
        if(bigCount<0 || smallCount<0 || goal<0)
            return false;
        if(goal<5 && smallCount>=goal){
            return true;
        }
        if(goal>=5){
            int b5 = goal/5;
            int tot_5 = bigCount>=b5?b5:bigCount;
            goal=goal-(tot_5*5);
            if(smallCount>=goal)
                return true;
        }
        return false;
        
    }
}
