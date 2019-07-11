package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString {

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {

		String mixedString = "";

		for (int i = 0; i < s.length(); i++) {

			if (i % 2 != 0) {
				mixedString = mixedString + Character.toString(s.charAt(i)).toUpperCase();
			} else {
				mixedString = mixedString + Character.toString(s.charAt(i)).toLowerCase();
			}
		}

		return mixedString;
	}

}
