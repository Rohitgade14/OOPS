package in.oops.modifiers;

public class Student   {
	private int id;
	private String name="rohit";
      private int age;
      
      public  int count=0;
      public Student() {
    	  count++;
    	  
      }
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
      
}
