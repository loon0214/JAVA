package ch07;

public class InterfaceTest3 {

	public static void main(String[] args) {
		A3 a = new A3();
		a.methodA();
	}
}

interface I3{
	public abstract void methodB();
} 

class A3{
	void methodA() {
		I3 i = InstanceManager3.getInstance();
		i.methodB();
		System.out.println(i.toString()); // i 로 Object class의 method 호출가능.
	}
}


class B3 implements I3{
	public void methodB() {
		System.out.println("method B in B class");
	}	
	public String toString() { return "class B";}	
}


class InstanceManager3{
	public static I3 getInstance() {
		return new B3();
	}
}

