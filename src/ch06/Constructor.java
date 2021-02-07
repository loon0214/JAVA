package ch06;

class Data1 {
	int value;
}

class Data2{
	int value;
	
	Data2(int x){ // 매개 변수가 있는 생성자.
		value = x;
	}
}

class Constructor{
	public static void main(String[] args) {
		Data1 d1 = new Data1();
//		Data2 d2 = new Data2(); // compile Error.
		Data2 d2 = new Data2(10); // Data2(int x) x = 10;
	}
}
