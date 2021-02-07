package ch07;

class Child extends Parent {
	int x =200;
	
	void method() {
		System.out.println("Child Method");
		System.out.println("x= " + x);
		System.out.println("this.x= " + this.x);
		System.out.println("super.x= " + super.x);
	}
}
 