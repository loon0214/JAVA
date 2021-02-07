package ch06;

public class MemberCall {
		int iv = 10;
		static int cv = 20;
		
		int iv2 = cv;
//		static int cv2 = iv;	// error. class variable can't use instance variable.
		static int cv2 = new MemberCall().iv;	// 객체를 생성하면 사용가능.
		
		static void staticMethod1() {
			System.out.println(cv);
//			System.out.println(iv);		// error. class method can't use instance variable.
			MemberCall c = new MemberCall();
			System.out.println(c.iv); 	// 객체를 생성한 후에야 instance variable의 참조가능.
	}
		
		void instanceMethod1() {
			System.out.println(cv);
			System.out.println(iv); 	// instance method에서 instance variable을 바로 사용가능.
		}
		
		static void staticMethod2() {
			staticMethod1();
//			instanceMethod1();	// Error. class Method에 can't call stack the instance method.
			MemberCall c = new MemberCall();
			c.instanceMethod1(); // can call stack after create the instance.
		}
		
		void instanceMethod2() { // instance method 에서는 instance method and class method
		staticMethod1();		 // 모두 instance 생성없이 바로 call stack 가능.
		instanceMethod1();
	}
}
