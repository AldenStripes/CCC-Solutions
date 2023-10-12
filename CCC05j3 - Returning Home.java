import java.util.*;
import java.io.*;
public class CCC05j3ReturningHome { //CCC '05 J3 - Returning Home
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		LinkedList<String> list = new LinkedList<>();
		while (true) {
			String s = next();
			if (s.equals("SCHOOL")) {
				break;
			}
			list.push(s);
		}
		while (!list.isEmpty()) {
			if (list.pop().equals("R")) {
				if (list.isEmpty()) {
					System.out.println("Turn LEFT into your HOME.");
				}	else {
					System.out.println("Turn LEFT onto "+list.pop()+" street.");
				}
			}	else { 
				if (list.isEmpty()) {
					System.out.println("Turn RIGHT into your HOME.");
				}	else {
					System.out.println("Turn RIGHT onto "+list.pop()+" street.");
				}
			}
		}
	}
	static String next() throws IOException {
		while (st==null||!st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
}
