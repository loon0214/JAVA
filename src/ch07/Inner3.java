package ch07;

public class Inner3 {
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner{
		int iiv = outerIv;
		int iiv2 = outerCv;
	}
	
	static class StaticInner{
//		static class 는 outer class's instance member에 접근할 수 없다.
//		int siv = outerIv;
		static int scv = outerCv;
	}
	
	void myMethod() {
		int lv = 0;
		final int LV = 0; 
		
		class LocalInner{
			int liv = outerIv;
			int liv2 = outerCv;
		// outer class's local variable은 final이 붙은 변수 (상수) 만 접근가능.
//			int liv3 = lv;
			int liv4 = LV;
		}
	}
}