package languageDetails;

public class StateDetails {	
	public void southIndia() {
		System.out.println("South India");
	}	
	public void northIndia() {
		System.out.println("North India");
	}
	public static void main(String[] args) {
		
		StateDetails s = new StateDetails();
		s.southIndia();
		s.northIndia();
		LanguageInfo l = new LanguageInfo();
		l.tamilLanguage();
		l.englishLanguage();
		l.hindiLanguage();		
		}

}
