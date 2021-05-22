package oop_1705_UserZoomCall;

public class User {

//	Kreirati klasu Korisnik koja ima:
//		ime i prezime 
//		tip licence (basic/pro/premium)
	
	private String fullName;
	private String licenceType;
	
//	konstruktore
	
	public User(String fullName, String licenceType) {
		this.fullName = fullName;
		this.licenceType = "basic";
	}
	
//	gettere i settere za sve atribute, sem za tip licence koja ne moze da se menja
	
	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public String getLicenceType() {
		return licenceType;
	}
	


//		metodu pretplati se koja postavlja licencu u zavisnosi od uplacene sume:
//		ako je uplata 100, postavlja licencu na “pro”
//		ako je uplata 150, postavlja licencu na “premium”
//		Metoda kao parametar prima vrednost uplate $100 ili $150

	
	public void subscription(int sum) {
		
		if (sum == 100) {
			this.licenceType = "pro";
			System.out.println(this.licenceType);
		} else if (sum == 150) {
			this.licenceType = "premium";
			System.out.println(this.licenceType);
		} else {
			System.out.println(this.licenceType);
		}
	}
	
	
//		metodu ponisti pretplatu koja postavlja licencu na basic
	
	public void cancelSubscription() {
		System.out.println(this.licenceType.equals("basic"));
	}
	
//		metodu koja vraca maksimalnu duzinu trajanja video poziva u zavisnosti od licence
//		ako je basic, vraca 40min
//		ako je pro, vraca 240min
//		ako je  premium, vraca 1440min
	
	public double maxTime() {
		double maxTime = 0;
				
		if (this.licenceType.equals("basic")) {
			maxTime = 40;
//			System.out.println("Maksimalno trajanje poziva je " + maxTime + "min.");
		} else if (this.licenceType.equals("pro")) {
			maxTime = 240;
//			System.out.println("Maksimalno trajanje poziva je " + maxTime + "min.");
		} else if (this.licenceType.equals("premium")) {
			maxTime = 1440;
//			System.out.println("Maksimalno trajanje poziva je " + maxTime + "min.");
		}
		
		return maxTime;
		}	
	
//		metodu za stampu koja stampa u formatu:
//		ime i prezime

	public void print() {
		System.out.println(this.fullName);
		}
	
	
	
}
