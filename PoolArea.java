package Section;


class Rectangle {
    private double width;
    private double length;
    
    public Rectangle(double width,double length){
        this.width = width;
        this.length = length;
        if(width<0)
            this.width=0;
        if(length<0)
            this.length=0;
    }
    
    public double getWidth(){return width;}
    public double getLength(){return length;}
    public double getArea(){return width*length;}
    
}

class Cuboid extends Rectangle{
    private double height;
    public Cuboid(double width,double length,double height){
        super(width,length);
        if(height<0)
            this.height=0;
        else
            this.height = height;
    }
    
    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return getArea()*getHeight();
    }
    
    
}
public class PoolArea {
    public static void main(String []args) {
    	
    	Cuboid c = new Cuboid(10,11,3);
    	System.out.println(c.getVolume());
    }
}
