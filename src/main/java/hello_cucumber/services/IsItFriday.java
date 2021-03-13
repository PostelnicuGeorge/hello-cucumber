package hello_cucumber.services;

public class IsItFriday {
	public static String isItFriday(String today) {
		return "Friday".equals(today) ? "TGIF" : "Nope";
	}

	public static String isItSpecial(String today) {
		return "my birthday".equals(today) ? "TGIYBD" :"Nope";
	}
}
