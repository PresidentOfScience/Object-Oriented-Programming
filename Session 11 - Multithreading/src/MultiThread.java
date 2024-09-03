
public class MultiThread {
	public static void main(String[] args) {
		new MyThread("Masak Nasi");
		new MyThread("Menyapu");
		new MyThread("Masak Air");
		
		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}
		
		System.out.println("Main Thread Exiting");
	}
}

class MyThread implements Runnable {
	String name;
	Thread t;
	
	public MyThread(String threadname) {
		this.name = threadname;
		t = new Thread(this, name);
		System.out.println("New Thread: " + t + " ##");
		t.start();
	}
	
	public void run() {
		try {
			for(int i=6; i>0; i--) {
				System.out.println(this.name + " : " + i);
				Thread.sleep(1000);
			}
		}
		catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
		System.out.println(name + ": selesai");
	}
}