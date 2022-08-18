package Section;

import java.util.ArrayList;
import java.util.List;

class A{
	public void display() {
		System.out.println("Hello");
	}
}

class B extends A{
	
	public void show() {
		System.out.println("Helasc");
	}
}

class GearBox{
	private int g;
	public GearBox(int n) {
		this.g=n;
		Gear r = new Gear();
		r.show();
	}
	
	class Gear{
//		public Gear() {
//			
//		}
		private Gear() {
			
		}	
		public void show() {
			System.out.println(GearBox.this.g);
		}
	} 
}

public class Playe {
	public static void main(String []args) {
		GearBox gb = new GearBox(10);
		GearBox.Gear y = gb.new Gear();
		y.show();
		
//		List<String> list = new ArrayList<>();
//		System.out.println("'Naveen'");
//		A a= new B();
//		a.display();
	}
}

































class Player {
    String name;
    String weapon;
    public String getName() {
		return name;
	}
    
    public String toString(){
        return "Player{name="+"'"
                +this.name+"'"+
                "hitPoints="+this.hitPoints+this.strength+this.weapon;
    }
	public void setName(String name) {
		this.name = name;
	}
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	public int getHitPoints() {
		return hitPoints;
	}
	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	int hitPoints;
    int strength;
}
