import java.util.*;
import java.io.*;
public class CCC02s2 { //CCC '02 S2 - Fraction Action

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long d = sc.nextLong();
		long max = 0;
		if (n>d) {
			max = d;
		}	else if (n<d) {
			max = n;
		}	else {
			max = n;
		}
		
		for (long i=max; i>=1; --i) {
			if (n%i==0 && d%i==0) {
				n /= i;
				d /= i;
				break;
			}
		}
		
		if (d==1) {
			System.out.println(n);
			return;
		}	else if (n==0) {
			System.out.println(0);
			return;
		}	else if ((double)n/(double)d>1.0) {
			long mod = n%d;
			long leftNumber = (n-mod)/d;
			System.out.println(leftNumber+" "+mod+"/"+d);
			return;
		}
		System.out.println(n+"/"+d);
	}
	
}
