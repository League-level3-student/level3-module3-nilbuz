package _00_Text_Funkifier;

public class RepeatedString extends SpecialString {

	public RepeatedString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		// TODO Auto-generated method stub

		String repeatedText = "";

		for (int i = 0; i < s.length(); i++) {
			repeatedText = repeatedText + s.charAt(i) + s.charAt(i) + s.charAt(i);
		}

		return repeatedText;
	}

}
