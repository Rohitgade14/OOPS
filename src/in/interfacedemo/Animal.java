package in.interfacedemo;

public interface Animal {
	
	
	public abstract void eat();
	
	void sleep(); // by default  methods are public and abstract
	
	public static final  String db_Name="db1";; 
	  int maxAge=100;  // public static final
	  
	public  default void run(){
		  System.out.println("run method of interface");
	  }
	

}
 