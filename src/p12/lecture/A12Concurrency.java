package p12.lecture;

public class A12Concurrency {
    // Thread가 값을 공유하지 않도록 조심하자... (되도록 따로 값을 줘라)
	static long sharValue = 0;

	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 100_0000; i++) {
					sharValue++;
				}

			}
		});
		t.start();
		for(int i = 0; i < 100_0000;i++) {
			sharValue++;
		}
		
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(sharValue);
	}

}
