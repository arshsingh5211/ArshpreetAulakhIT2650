interface Nameable {
	public abstract String getName();
	public abstract void setName(String n);
}

abstract class Mammal {
	
	public Mammal() {
		this.generateHeat();
	}
	public void generateHeat() {
		System.out.println("Generating Heat");
	}
	
	abstract void makeNoise();
}

class Dog extends Mammal implements Nameable {
	private Head head;
	private String name;
	
	public Dog() {
		this.head = new Head();
	}
	
	public void makeNoise() {
		System.out.println("Bark");
	}
	
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class Head {
	private String size;

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
}

public class TestDog {

	public static void main(String[] args) {
		Dog fido = new Dog();
		
		fido.makeNoise();
		
		fido.setName("Fido");
		System.out.println("Name = " + fido.getName());
		
	}
}
