/**
 * File: StringTokenizer.java
 * --------------------------
 * This is a re-implementation of the StringTokenizer class provided in java.util.
 * @author Brent Perry
 *
 */

public class StringTokenizer {

	public StringTokenizer(String str) {
		this.str = str;
		this.delims = " ";
		this.returnDelims = false;
		this.atToken = 0;
		this.lastToken = this.getLastToken();
	}
	
	public StringTokenizer(String str, String delims) {
		this.str = str;
		this.delims = delims;
		this.returnDelims = false;
		this.atToken = 0;
	}
	
	public StringTokenizer(String str, String delims, boolean returnDelims) {
		this.str = str;
		this.delims = delims;
		this.returnDelims = returnDelims;
		this.atToken = 0;
	}
	
	public boolean hasMoreTokens() {
		return (this.lastToken >= this.atToken && this.atToken > -1);
	}
	
	public String nextToken() {
		if (this.hasMoreTokens()) {
			String token = this.str.substring(atToken, getNextDelim(atToken));
			this.atToken = this.getNextTokenStart(this.getNextDelim(atToken));
			return token;
		} else {
			return null;
		}
		
		
		
	}
	
	private int getNextDelim(int start) {
		for (int i = start; i < this.str.length(); i++) {
			if (this.delims.contains("" + this.str.charAt(i))) return i;
		}
		return -1;
	}
	
	private int getNextTokenStart(int start) {
		for (int i = start; i < this.str.length(); i++) {
			if (!this.delims.contains("" + this.str.charAt(i))) return i;
		}
		return -1;
	}
	
	private int getLastToken() {
		for (int i = this.str.length() - 1; i >= 0; i--) {
			if ((!this.delims.contains("" + this.str.charAt(i))) && (this.delims.contains("" + this.str.charAt(i - 1)))) {
				return i;
			}
		}
		return -1;
	}
	
	private String str;
	private String delims;
	private boolean returnDelims;
	private int atToken;
	private int lastToken;
	
}
