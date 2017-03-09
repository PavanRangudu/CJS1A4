
public class CJS1A4_ascii_codes {
	public static void main (String s[]) {
		char a = 65; // a = 'A'
		while (a < 91) {
			System.out.println(((int)a)+"-"+a); // type-casting to print ASCII code
			a++;
		}
	}
}
