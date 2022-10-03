package Package1;

public class BanglaMotor {
	
	  private int Valve;
	  private int Spark;
	  private int Plug;
	   
	  protected int Cylinder=2;
	  protected int Crank=3;
	  
	  public int Combustion_Chamber=100;
	  
	   
//private_encapsulation
	  
	  
	  public void setValve(int Valve) {
		  this.Valve= Valve;
		  
	  }
	  
	  public int getValve() {
			return Valve;
		}

	  
	  public void setSpark(int Spark) {
		  this.Spark= Spark;
		  
	  }
	  
	  public int getSpark() {
			return Spark;
		}

		
	  public void setPlug(int Plug) {
		  this.Plug= Plug;
		  
	  }
		
	  public int getPlug() {
			return Plug;
		}
	
		
	  
//protected_encapsulation
		
		public int getCylinder() {
			return  Cylinder;
		}
		
		public int getCrank() {
			return Crank;
		}
		

}
