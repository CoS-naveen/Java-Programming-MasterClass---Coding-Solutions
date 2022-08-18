package Section;


public class BarkingDog {
	//Should wake up if dog barking at night
	 public static boolean shouldWakeUp(boolean barking,int hourOfDay){
	     if(hourOfDay<0 || hourOfDay>23)
	        return false;
	     if((hourOfDay<8 || hourOfDay>22)&&barking==true)
	        return true;
	     return false;        
	 }
	 
	    public static void main(String []args) {}
}