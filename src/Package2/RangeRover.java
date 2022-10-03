package Package2;

import Package1.BanglaMotor;

public class RangeRover extends BanglaMotor {
	
public static void main (String[] args) {
		
	    BanglaMotor obj1 = new BanglaMotor();
	    
	    obj1.setPlug(200);
	    obj1.setSpark(300);
	    obj1.setValve(400);
	    System.out.println("Plug: " + obj1.getPlug());
	    System.out.println("Spark: " + obj1.getSpark());
	    System.out.println("Valve: " + obj1.getValve());
	    System.out.println("Cylinder: " + obj1.getCylinder());
	    System.out.println("Crank: " +obj1.getCrank());
	    System.out.println("Combustion_Chamber:" + obj1.Combustion_Chamber);
	    
		
	}

}
