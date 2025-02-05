public class AlphabetConfig {
    boolean includeUppercase;
    boolean includeLowercase;
    boolean includeNumbers;
    boolean includeSymbols;

    public AlphabetConfig(boolean includeUppercase, boolean includeLowercase, boolean includeNumbers, boolean includeSymbols) {
        this.includeUppercase = includeUppercase;
        this.includeLowercase = includeLowercase;
        this.includeNumbers = includeNumbers;
        this.includeSymbols = includeSymbols;
    }
}
