package Section;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scan = new Scanner(System.in);
        int sum=0,count=0;
    	while(scan.hasNextInt()) {
        	sum=sum+scan.nextInt();
        	count++;
        }
        System.out.printf("SUM = %d AVG = %d",sum,Math.round((double)sum/count));
    }
}