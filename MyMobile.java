package week1.day2;

public class MyMobile {
	
	int cost=1000;

	
 public  void makeCalls() {
	 System.out.println("Making a Call");
	}
 public  void sendMSG() {
	 System.out.println("Send message");
	}
 private void cost() {
	System.out.println(cost);
 }
	 public static void main(String[] args) {
			MyMobile mobobj = new MyMobile();
			mobobj.makeCalls();
			mobobj.sendMSG();
			mobobj.cost();
		} 
	 
}

