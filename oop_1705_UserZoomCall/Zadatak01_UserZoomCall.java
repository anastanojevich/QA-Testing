package oop_1705_UserZoomCall;

public class Zadatak01_UserZoomCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		U glavnom programu kreirati objekte definisanih klasa i testirati rad definisanih funkcija 

		User h1 = new User("Nikola Dokmanovic", "premium");
		User g1 = new User ("Ana Stanojevic", "basic");
		
		ZoomCall zc1 = new ZoomCall ("dsa45eflkja", "helloworld", h1);
		
		h1.subscription(150);
		g1.subscription(100);
		zc1.setGuest(g1);
		zc1.startCall();
	}

}
