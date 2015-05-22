
public class Main {

	public static void main(String[] args){
		SDFThread th1 = new SDFThread();
		SDFThread th2 = new SDFThread();
		SDFThread th3 = new SDFThread();
		SDFThread th4 = new SDFThread();
		
		th1.setDate("01 10 1000");
		th2.setDate("10 12 1234");
		th3.setDate("03 03 1333");
		th4.setDate("24 04 1444");
		
		Thread t1 = new Thread(th1);
		Thread t2 = new Thread(th2);
		Thread t3 = new Thread(th3);
		Thread t4 = new Thread(th4);
		
		t1.run();
		t2.run();
		t3.run();
		t4.run();
	}
	
}
