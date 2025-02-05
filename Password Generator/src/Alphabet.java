


public class Alphabet {
	
	public static final String UPPERCASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
	public static final String NUMBERS = "1234567890";
	public static final String SYMBOLS = "!@#$%^&*()-_=+\\/~?";
	
	private final StringBuilder pool;


	private void appendIfTrue(boolean condition, String characters) {
		if (condition) pool.append(characters);
	}

	public Alphabet(AlphabetConfig config) {
		pool = new StringBuilder();
		appendIfTrue(config.includeUppercase, UPPERCASE_LETTERS);
		appendIfTrue(config.includeLowercase, LOWERCASE_LETTERS);
		appendIfTrue(config.includeNumbers, NUMBERS);
		appendIfTrue(config.includeSymbols, SYMBOLS);
	}
	
	public String getAlphabet() {
		return pool.toString();
	}


}
