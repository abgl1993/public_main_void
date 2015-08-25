package com.thread.mainApp;

class Data {
	private int value;

	public void getValue() {

		System.out.println(value);
	}

	public void setValue(int value) {
		this.value = value;
	}
}
class Runner implements Runnable {
	Data data;
	int counter = 0;
    private Thread secondT;
	public Runner() {
		data = new Data();
	}
    @Override
	public void run() {
		Thread currThread;
		// TODO Auto-generated method stub
		for (int counter = 0; counter < 10; counter++) {
			currThread = Thread.currentThread();
			System.out.println(currThread);
			if (currThread.getName().toString().equals("Producer")) {
				synchronized (data) {

					if (!secondT.isAlive()) {
						secondT.start();
					}
					data.notify();
					data.setValue(counter + 1);
					try {
						data.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			} else if (currThread.getName().equals("Consumer")) {
				synchronized (data) {
					data.notify();
					data.getValue();

					if (counter != 9) {
						try {

							data.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		}
	}
	public void setSecondThread(Thread secondThread) {
		// TODO Auto-generated method stub
		secondT = secondThread;
	}

}

public class mainApp {
       public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runner r = new Runner();
		Thread firstThread = new Thread(r, "Producer");
		Thread secondThread = new Thread(r, "Consumer");
		firstThread.start();
		r.setSecondThread(secondThread);
		// secondThread.start();
		System.out.println("The End");
  }
}
