import java.util.*;
import java.io.*;
public class CCC17s1SumGame { //CCC '17 S1 - Sum Game
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		int N = readInt();
		int[] s1 = new int[N];
		int[] s2 = new int[N];
		for (int i=0; i<N; ++i) {
			s1[i] = readInt();
		}
		for (int i=0; i<N; ++i) {
			s2[i] = readInt();
		}
		int[] sum1 = new int[N];
		sum1[0] = s1[0];
		int[] sum2 = new int[N];
		sum2[0] = s2[0];
		int K = (sum1[0]==sum2[0]) ? 1 : 0;
		
		for (int i=1; i<N; ++i) {
			sum1[i] = sum1[i-1] + s1[i];
			sum2[i] = sum2[i-1] + s2[i];
			if (sum1[i]==sum2[i]) {
				K = i+1;
			}
		}
		System.out.println(K);
	}
	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static int readInt() throws IOException {
		return Integer.parseInt(next());
	}
}
