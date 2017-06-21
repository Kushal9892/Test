
public class MainTest {

	public static void main(String[] args) {
		//Dog d = new Dog();
		//Animal a = d;
		//a.noise();
		//a.eat();
		
		Animal a1 = new Animal();
		Dog d1 = (Dog)a1;
		d1.eat();
		d1.noise();
		
	}

}
