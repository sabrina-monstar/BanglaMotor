package Package1;

public class Engine2 {

	private int Valve=2;
	private int Spark=3;
	private int Plug=4;
	
	
	
//private_encapsulation	
public int getValve() {
	return Valve;
}

public int getSpark() {
	return Spark;
}

public int getPlug() {
	return Plug;
}


public static void main(String[] args) {
	
	Engine2 obj1= new Engine2();
	System.out.println("Valve= " + obj1.getValve());
	
	Engine2 obj2 = new Engine2();
	System.out.println("Spark= "+ obj2.getSpark());
	
	Engine2 obj3 = new Engine2();
	System.out.println("Plug= " + obj3.getPlug());
	
	Engine3 obj4 = new Engine3();
	System.out.println("Crank= "+ obj4.getCrank());
	
	Engine3 obj5= new Engine3();
	System.out.println("Combustion_Chamber= " + obj5.getCombustionChamber());	
	
}

	
}
