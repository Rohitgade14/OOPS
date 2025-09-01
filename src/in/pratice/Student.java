package in.pratice;

public class Student {
	
	private  int id=1;
	private String name="kiran";
	
	public static void main(String[] args) {
		Student student = new Student();
		
		System.out.println(student);
		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	

}
