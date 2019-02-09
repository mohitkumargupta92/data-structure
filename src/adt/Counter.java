package adt;

public class Counter {

	private String name;
	private int value = 0;

	public Counter(String name) {

		this.name = name;
	}

	public void increment() {
		value++;
	}

	public int getCurrentValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Counter [name=" + name + ", value=" + value + "]";
	}

}
