package java15;
class CTest extends Thread{
	private String id;
	public CTest(String str){
		id = str;
	}
	public void run() {
		for (int i=1;i<=5;i++) {
			try {
				Thread.sleep((int)(1000*Math.random()));     //休息時長
			} 
			catch (InterruptedException e) {
			}
			System.out.println(id+" "+i);
		}
	}
}
public class Class09 {
	public static void main(String args[]) {
		CTest T1=new CTest("Thread 1 is running");
		CTest T2=new CTest("Thread 2 is running");
		Thread t1 = new Thread(T1);
		Thread t2 = new Thread(T2);
		t1.start();
		t2.start();
	}
}
