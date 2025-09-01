package in.oops.encapsulation;

public class Student {

	
	//properties/filed/Instance Variable
	//Behavoior
	private int id;

	private String name;
	private int rollNo;
	
   public Student(){
		this.id=11;
		this.name="default";
		this.rollNo=114;
		System.out.println(name);
	}
	
	Student(int id,String name,int rollNo){
		this.id=id;
		this.name=name;
		this.rollNo=rollNo;
				
	}
	
     public void setId(int id) {
    	 this.id=id;
    	 
     }
     public int getId() {
    	 return id;
     }
 	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public void print() {
		
		System.out.println(id+":"+name+":"+rollNo);
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollNo=" + rollNo + "]";
	}
	public static void main(String[] args) {
		
		Student student = new Student(22,"kiran",555);
		System.out.println(student);
	
		Student student1 = new Student();
		System.err.println(student1.getId());
		//student.print();
		//student.setId(22);
		//student.print();
	
		
	   
		
		
	}
	
	
}
