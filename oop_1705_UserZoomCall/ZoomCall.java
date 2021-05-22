package oop_1705_UserZoomCall;

public class ZoomCall {

//	Kreirati klasu ZoomCall koja ima: ...
//		link za poziv
//		password
//		korisnika koji je host
//		korisnika koji je guest
	
	private String link;
	private String password;
	private User host;
	private User guest;
	
	public ZoomCall(String link, String password, User host) {
		this.link = link;
		this.password = password;
		this.host = host;
//		this.guest = guest;
	}
	
	public User getHost() {
		return host;
	}
	
	public User getGuest() {
		return guest;
	}

	
//	gettere za sve atribute
//	setter samo za guest-a
	
	public String getLink() {
		return link;
	}

//	public void setLink(String link) {
//		this.link = link;
//	}

	public String getPassword() {
		return password;
	}

//	public void setPassword(String password) {
//		this.password = password;
//	}


//	public void setHost(User host) {
//		this.host = host;
//	}

	public void setGuest(User guest) {
		this.guest = guest;
	}
	
	 
//		metodu pokreni poziv koja stampa podatke u formatu:
//				Zoom Call: url
//				Password: password
//				Host: ime i prezime
//				Guest: ime i prezime
//				Maksimalno trajanje poziva je (broj minuta)min
//				
//				Maksimalno trajanje poziva se cita od korisnika koji je host!

	public void startCall() {
		
		System.out.println("Zoom Call: " + this.link);
		System.out.println("Password: " + this.password);
		System.out.println("Host: " + this.host.getFullName());
		System.out.println("Guest: " + this.guest.getFullName());
		System.out.println("Maksimalno trajanje poziva je: " 
		+ this.guest.maxTime() + "min");
	}

	
	
	
	
	
}
