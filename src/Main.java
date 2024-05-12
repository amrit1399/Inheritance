
public class Main {

	public static void main(String[] args) {
	Square s= new Square("Square1");
	Rectangle r= new Rectangle("Rctangle1");
	s.calcArea(5);
	r.calcArea(2,5);
		System.out.println("name=  "+s.name + " area=  " +s.area);
		System.out.println("name=  "+r.name + " area=  " +r.area);	


	}

}
