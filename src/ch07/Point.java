package ch07;

class Point {
	int x =10;
	int y =20;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}

//		this(0, 0);
//	}
	
	String getXY() {
		return "("+x+", "+y+")"; // x와 y의 값을 문자열로 변환.
	}
}
//	
//	String getLocation() {
//		return "x :" + x + ", y :" + y;
//	}
//}