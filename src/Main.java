
public class Main {
	public static void main(String[] args) {
		
		//define a new thread to print out
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					System.out.println("aaaa");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		while(true) {
			System.out.println("bbbb");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
