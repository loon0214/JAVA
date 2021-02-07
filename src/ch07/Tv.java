package ch07;

public class Tv {

		//	Tv's member variable
		String color;		// 색상 
		boolean power;		// on/off
		int channel;		// 채널 
		
		//	Tv's method
		void power()		{	power = !power;	}
		void channelUp()	{	++channel;	}
		void channelDown()	{	--channel;	}
	}