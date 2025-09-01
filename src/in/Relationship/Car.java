package in.Relationship;

class Enginee{
	
	String model="112";
	String chessNumber="ggt56";
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getChessNumber() {
		return chessNumber;
	}
	public void setChessNumber(String chessNumber) {
		this.chessNumber = chessNumber;
	}
	@Override
	public String toString() {
		return "Enginee [model=" + model + ", chessNumber=" + chessNumber + "]";
	}
	
	
}
public class Car {
	
	
	public static void main(String[] args) {
		Enginee enginee = new Enginee();
		System.out.println(enginee);
	}
	

}
