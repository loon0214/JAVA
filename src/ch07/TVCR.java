package ch07;

public class TVCR extends Tv {
	VCR vcr = new VCR();
	int counter = vcr.counter;
	
	void play() {vcr.play();}
	void stop() {vcr.stop();}
	void rew() {vcr.rew();}
	void ff() {vcr.ff();}
	}