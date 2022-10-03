package Package2;

import Package1.BanglaMotor;

public class Main {

public static void main (String[] args) {
		
		BanglaMotor motor = new BanglaMotor();
		
		System.out.println("Valve: " + motor.getValve());
		System.out.println("Spark: " + motor.getSpark());
		System.out.println("Plug:  " + motor.getPlug());
		
	}

}
