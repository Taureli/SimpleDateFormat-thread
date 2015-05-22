import java.text.ParseException;
import java.util.Date;


public class SDFThread implements Runnable{

	private String myDate;
	
	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread() + " " + (Date)SDF.testDate.parse(myDate));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setDate(String date){
		myDate = date;
	}

}
