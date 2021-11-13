import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class ProjectOne {
	static FastScanner in;
	static PrintWriter out;
	public static void main(String[] args) {
		in = new FastScanner();
		out = new PrintWriter(System.out);
		int t = in.nextInt();
		while(t-- > 0) solve();
		out.println();
		out.close();
	}
	static void solve() {
		long l = in.nextLong();
		long j = in.nextLong();
		if(j%4==0) {out.println(l);return;}
		if(l%2!=0) {
			if(j%4==3) {out.println(l-(j+1));return;}
			if(j%4==2) {out.println(l-1);return;}
			if(j%4==1) {out.println((j+l));return;}
		}
		else {
			if(j%4==3) {out.println(l+(j+1));return;}
			if(j%4==2) {out.println(l+1);return;}
			if(j%4==1) {out.println((l-j));return;}
		}
	}
	static void Sort(int[] a) {
		ArrayList<Integer> ar = new ArrayList<>();
		for(Integer i : a)ar.add(i);
		Collections.sort(ar);
		for(int i = 0; i < ar.size();i++ ) a[i] = ar.get(i);
	}
	static class FastScanner{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");
		String next() {
			while(!st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				}catch(IOException e) {}
			}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}

}
