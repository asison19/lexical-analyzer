package token;

public class Token {
	private String token; // Type of of token
	private String lexeme; // The lexeme

	public Token(String token, String lexeme) {
		this.token = token;
		this.lexeme = lexeme;
	}

	// Returns the type of the token
	public String getTokenType() {
		return token;
	}

	// Returns the lexeme of the token
	public String getLexeme() {
		return lexeme;
	}

	// Returns a string representation of the token
	public String toString() {
		return token + "\t" + lexeme;
	}
}