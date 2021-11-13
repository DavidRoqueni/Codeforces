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
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i =0 ; i< n ; i++) {
			a[i] = in.nextInt();
		}
		Sort(a);
		int ans = a[0];
		for(int i =0; i < n-1; i++) ans = Math.max(ans, a[i+1]-a[i]);
		out.println(ans);
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
