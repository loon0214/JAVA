package ch08;

public class Exception9 {

	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의로 발생시킴.");
			throw e; // 예외를 발생시킴.
//			throw new Exception("고의로 발생시킴.");
		} catch(Exception e)	{
			System.out.println("Error msg: " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료됨.");
	}
}
