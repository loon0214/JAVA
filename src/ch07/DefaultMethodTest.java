package ch07;

public class DefaultMethodTest {

	public static void main(String[] args) {
		Child4 c = new Child4();
		c.method1();
		c.method2();
		MyInterface1.staticMethod();
		MyInterface2.staticMethod();
	}
}

class Child4 extends Parent4 implements MyInterface1, MyInterface2{
	public void method1() {
		System.out.println("method1() in Child"); // overriding
	}
}

class Parent4{
	public void method2() {
		System.out.println("method2() in Parent");
	}
}

interface MyInterface1{
	default void method1() {
		System.out.println("method1() in MyInterface1");
	}
	
	default void method2() {
		System.out.println("method2() in MyInterface1");
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface1");
	}
}

interface MyInterface2{
	default void method1() {
		System.out.println("method1() in MyInterface2");
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface2");
	}
}