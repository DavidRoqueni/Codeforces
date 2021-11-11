import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;


public class Bluered{
	static class Pair implements Comparable<Pair>{
			char ps;
			int pn;
			public Pair(char s, int n) {ps = s; pn=n;}
			@Override
			public int compareTo(Pair a) {
				if(a.ps-ps ==0) {
					return this.pn - a.pn;
				}else {
					return this.ps-a.ps;
				}
			}
	}
	static FastScanner in;
	static PrintWriter out;
	public static void main(String[] args) {
		in = new FastScanner();
		out = new PrintWriter(System.out);
		int t = in.nextInt();
		while(t-- >0) solve();
		out.println();
		out.close();
	}
	static void solve() {
		int n = in.nextInt();
		int[] a = new int[n];
		Pair[] pa = new Pair[n];
		while(n > 0) {
			a[a.length-n]=in.nextInt();
			n--;
		}
		String s = in.next();
		int count = 0;
		for(char c : s.toCharArray()) pa[count] = new Pair(c,a[count++]);
		Arrays.sort(pa);
		for(int i = 0; i < a.length; i++) {
			if(pa[i].ps == 'B' && pa[i].pn >= i+1) continue;
			else if(pa[i].ps == 'B') {out.println("NO");return;}
			if(pa[i].ps == 'R' && pa[i].pn <= i+1) continue;
			else if(pa[i].ps == 'R') {out.println("NO");return;}
		}
		out.println("Yes");
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
