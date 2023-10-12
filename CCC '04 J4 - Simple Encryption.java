import java.util.*;
import java.io.*;
public class CCC04j4SimpleEncryption { //CCC '04 J4 - Simple Encryption
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		String key = readLine();
		String message = readLine();
		String S = "";
		for (int i=0; i<message.length(); ++i) {
			if (message.charAt(i)>='A' && message.charAt(i) <= 'Z') {
				S += message.charAt(i);
			}
		}
		String encode = "";
		for (int i=0; i<S.length(); i++) {
			int mod = i%key.length();
			char cur = S.charAt(i);
			char curKey = key.charAt(mod);
			int shift = curKey -'A';
			cur += shift;
			if (cur>'Z')
				cur-=26;
			encode += cur;
		}
		System.out.println(encode);
	}
	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static int readInt() throws IOException {
		return Integer.parseInt(next());
	}
	static String readLine() throws IOException {
		return br.readLine().trim();
	}
}
