package Section;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes<0){
            System.out.println("Invalid Value");
        }
        else{
        	//1mb = 1024kb
        	
            int mb = kiloBytes/1024;
            int rmb = kiloBytes-(mb*1024);
            //int rmb = kiloBytes%1024;
            System.out.printf("%d KB = %d MB and %d KB",kiloBytes,mb,rmb);
        }
        
        
    }
    
    public static void main(String []args) {
    	printMegaBytesAndKiloBytes(2500);
    }
}
