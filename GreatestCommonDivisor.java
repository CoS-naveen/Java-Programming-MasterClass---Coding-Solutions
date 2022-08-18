package Section;

public class GreatestCommonDivisor {


    public static int getGreatestCommonDivisor(int first,int second){
        
        int largest=0;        
        if(first<10 || second<10)
            return -1;
  
        for(int i=1,j=1;i<first||j<second;i++,j++){
            if(first%i==0 && second%j==0){
                largest=i;
            }
        }
        
        return largest;
            
    }
}