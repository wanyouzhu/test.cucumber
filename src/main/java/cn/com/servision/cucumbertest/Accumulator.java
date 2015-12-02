package cn.com.servision.cucumbertest;

public class Accumulator {
	private int runningAccumulation;

	public void enter(int number) {
		this.runningAccumulation += number;
	}

	public int accumulation() {
		return runningAccumulation;
	}
}
