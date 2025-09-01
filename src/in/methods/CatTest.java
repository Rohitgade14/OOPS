package in.methods;

public class CatTest {
	
	public static void main(String[] args) {
		Cat a = new Cat();
		a.name="bob";
		Cat cat = makeNameCap(a);
		System.out.println(cat.name);
		System.out.println(a.name);
		
	}
	
	private static Cat makeNameCap(Cat cat) {
		 cat.name=cat.name.toUpperCase();
		 return cat;
	}

}
