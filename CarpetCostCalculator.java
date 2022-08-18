package Section;

import java.util.Scanner;

interface Compute{
	int PAINT_COST = 50;
	int CARPET_COST = 80;
	int totalArea();
	int totalCost();
}

class Property implements Compute{
	private int length;
	private int width;
	private String type="Wall";
	public Property(int length,int width,String type) {
		this.length = length;
		this.width = width;
		this.type = type;
		if(length<=0 || width<=0) {
			this.length = 0;
			this.width = 0;
		}
	}
	@Override
	public int totalArea() {
		return this.length*this.width;
	}
	@Override
	public int totalCost() {
		if(type=="Wall") {
			return this.totalArea()*PAINT_COST;
		}
		else{
			return this.totalArea()*CARPET_COST;
		}
	}
}

public class CarpetCostCalculator {
    public static void main(String []args) {
    	Scanner scan = new Scanner(System.in);
    	int choice,l,w;
    	System.out.println("Enter type of cost to be computed: \n1.Wall \n2.Floor");
    	choice = scan.nextInt();
    	switch(choice) {
    		case 1:
    			int t_cost =0;
    			for(int i=1;i<4;i++) {
        			System.out.print("Enter Wall-"+i+" Length:");
        			l=scan.nextInt();
        			System.out.print("Enter Wall-"+i+" Width:");
        			w=scan.nextInt();
        			Compute Wall = new Property(l,w,"Wall");
        			t_cost+=Wall.totalArea();
        			System.out.println();
    			}
    			System.out.println("Total cost for painting 3 walls:"+t_cost);
    			break;
    		case 2:
    			System.out.print("Enter Floor Length:");
    			l=scan.nextInt();
    			System.out.print("Enter Floor Width:");
    			w=scan.nextInt();
    			Compute floor = new Property(l,w,"Floor");
    			floor.totalArea();
    			System.out.println("Total cost to carpet the floor:"+floor.totalCost());
    			break;
    		default:
    			System.out.println("Wrong Number Entered");
    	}
    	
    }
}
//class Floor {
//    private double width;
//    private double length;
//    
//    public Floor(double width,double length){
//        this.width = width;
//        this.length = length;
//        if(width<0)
//            this.width = 0;
//        if(length<0)
//            this.length =0;
//    }
//    
//    public double getArea(){
//        return width*length;
//    }
//}
//class Carpet {
//    private double cost;
//    
//    public Carpet(double cost){
//        if(cost<0)
//            this.cost=0;
//        else
//            this.cost = cost;
//    }
//    
//    public double getCost(){
//        return cost;
//    }
//}
//class Calculator {
//    private Floor floor;
//    private Carpet carpet;
//    
//    public Calculator(Floor floor,Carpet carpet){
//        this.floor = floor;
//        this.carpet = carpet;
//    }
//    public double getTotalCost(){
//        return floor.getArea()*carpet.getCost();
//    }
//}