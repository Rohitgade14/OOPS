package in.oops.polymorphism.methodOverloading;

public class Case2 {
	
	void show(Object a) {
		System.out.println(a+" hii1");
	}
	
	void show(String a) {
		System.out.println(a+" hii222");  // 1 class goes to String class as child class also and bydefualt in method argumnets is string 
	}
	
	public static void main(String[] args) {
		Case2 case2 = new  Case2();
		//case2.show('a');  // call goes to object class automatic promation happen here call goes to object class
		case2.show("rohit"); // default string is there
		//case2.show( new StringBuffer("patil"));
		//test1.show(null); complile time error show ambugity 
	}

}
