import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
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
		String k = in.next(), s = in.next();
		HashMap<Character,Integer> map = new HashMap<>();
		int count =1, ans = 0;
		for(char c: k.toCharArray())map.put(c, count++);
		int cur = map.get(s.charAt(0));
		for(int i =1; i< s.length();i++) {
			ans+=Math.abs((cur-map.get(s.charAt(i))));
			cur = map.get(s.charAt(i));
		}
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
