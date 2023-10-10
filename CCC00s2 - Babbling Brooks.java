import java.util.*;
import java.io.*;
public class CCC00s2BabblingBrooks { //CCC '00 S2 - Babbling Brooks
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		LinkedList<Double> streams = new LinkedList<>();
		int n = readInt();
		for (int i=0; i<n; ++i) {
			streams.add(readDouble());
		}
		while (true) {
			int action = readInt();
			if (action==77) {
				break;
			}	else if (action==99) {
				int i = readInt()-1;
				double percent = readDouble()/100;
				double curStream = streams.get(i);
				streams.set(i, curStream*percent);
				streams.add(i+1, curStream*(1-percent));
			}	else if (action==88) {
				int i = readInt()-1;
				streams.set(i, streams.get(i)+streams.get(i+1));
				streams.remove(i+1);
			}
		}
		for (double i: streams) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	static String next() throws IOException {
		while (st==null||!st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static int readInt() throws IOException {
		return Integer.parseInt(next());
	}
	static double readDouble() throws IOException {
		return Double.parseDouble(next());
	}
}
