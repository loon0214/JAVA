package ch09;

public class ExceptionApp {

	public static void main(String[] args) {
		System.out.println(1);
		int[] scores = {10,20,30};
		try {System.out.println(scores[3]);}
		catch(ArrayIndexOutOfBoundsException e) {System.out.println("wrong array number");}
		
		try {System.out.println(2/0);}
		catch(ArithmeticException e) {System.out.println("its wrong calculation.");}
		System.out.println(3);
	}
}
