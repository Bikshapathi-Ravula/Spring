package collections;

import java.util.Scanner;

public class Demo implements Runnable {

	synchronized void d(Scanner s) {
	//	while (true)
			System.out.println("*****************");
	}

	public static void main(String[] args) throws Exception {

		new Demo().run();
	}

	@Override
	public void run() {
		Scanner s = new Scanner(System.in);
		new Demo().d(s);
	}
}
