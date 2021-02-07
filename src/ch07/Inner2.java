package ch07;

public class Inner2 {
	class InstanceInner2{}
	static class StaticInner2{}
	
	// instance variable member간에는 서로 직접 접근이 가능하다.
	InstanceInner2 iv = new InstanceInner2();
	// static member 간에는 서로 직접 접근이 가능하다.
	static StaticInner2 cv = new StaticInner2();
	
	static void staticMethod() {
		// static member는 instance member에 직접 접근할 수 없다.
//		InstanceInner2 obj1 = new InstanceInner2();
		StaticInner2 obj2 = new StaticInner2();
		
		// 굳이 접근하려면 아래와 같이 객체를 생성해야 한다.
		// instance class는 outer class를 먼저 생성해야만 생성할 수 있다.
		Inner2 outer = new Inner2();
		InstanceInner2 obj = outer.new InstanceInner2();
	}
	
	void instanceMethod() {
		// instance method에서는 instance member와 static member 모두 접근 가능.
		InstanceInner2 obj1 = new InstanceInner2();
		StaticInner2 obj2 = new StaticInner2();
		// method 내에 지역적으로 선언된 내부 클래스는 외부에서 접근할 수 없다.
//		LocalInner2 lv = new LocalInner2();
	}

	void myMethod() {
		class LocalInner2{}
		LocalInner2 lv = new LocalInner2();
	}
}