package Section;
/*
If one of the parameters is less than 0, print text "Invalid Value".
If all numbers are equal print text "All numbers are equal"
If all numbers are different print text "All numbers are different".
Otherwise, print "Neither all are equal or different".
 */
public class IntEqualityPrinter {
	 public static void printEqual(int a,int b,int c){
	     if(a<0 || b<0 || c<0){
	         System.out.print("Invalid Value");
	     }
	     else if(a==b && b==c){
	         System.out.print("All numbers are equal");
	     }
	     else if(a!=b && b!=c && c!=a)
	         System.out.print("All numbers are different");
	     else
	        System.out.print("Neither all are equal or different");
	 }
	}
