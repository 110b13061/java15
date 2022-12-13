package java15;
class CTest extends Thread{                      //(a)
	private String id;
	public CTest(String str){
	 id=str;
	}
	public void run() {                          //(b)
		for(int i=1;i<=5;i++) {
			for(int j=0;j<100000000;j++) {
				System.out.println(id+" "+i);
			}
		}
	}
}
public class Class02 {
	public static void main(String[] args) {      //(c)
		CTest hi=new CTest("Hello");
		CTest bye=new CTest("Good bye");
		hi.run();
		bye.run();
	}
}

//(d)Hello無限循環
