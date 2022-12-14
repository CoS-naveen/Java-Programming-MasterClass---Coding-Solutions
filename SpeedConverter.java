package Section;

public class SpeedConverter {
	
	//Converting kph to rounde value of long-mph
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<0)
            return -1;
        else
            return Math.round(kilometersPerHour/1.609);
    }
    
    //Printing Conversion
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour<0)
            System.out.println("Invalid Value");
        else
            System.out.println(kilometersPerHour +" "+"km/h "+"= "+toMilesPerHour(kilometersPerHour)+" mi/h");
    }
}