package org.phone;

public class internalstorage {
	public void processorName() {
		System.out.println("andriod");
	}

	public void ramSize() {
		System.out.println("28gb");
	}

	public static void main(String[] args) {
		exteranalstorage c = new exteranalstorage();

		c.size();
		internalstorage b = new internalstorage();

		b.processorName();
		b.ramSize();

	}

}
