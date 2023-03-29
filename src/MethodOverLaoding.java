
public class MethodOverLaoding {

	public void car() {
		System.out.println("Welcome to the CarDekho app");

	}

	public void car(int a) {
		System.out.println("BMW");
	}
	public void car(int a ,int b) {
		System.out.println("Mercidiaz Benz");
	}
	public void car(String s) {
		System.out.println("Audi Q7");
		
	}
	public void car(double c) {
		System.out.println("Maruti 800");
	}
	public static void main(String[] args) {
		MethodOverLaoding c1=new MethodOverLaoding();
		c1.car(0);
		c1.car(0.5);
		c1.car("car");
		c1.car();
	}
}
