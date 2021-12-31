#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
typedef pair<int,int> pii;
typedef pair<ll,ll> pll;
typedef pair<string,string> pss;
#define F_OR(i, a, b, s) for (int i=(a); (s)>0?i<(b):i>(b); i+=(s))
#define F_OR1(e) F_OR(i, 0, e, 1)
#define F_OR2(i, e) F_OR(i, 0, e, 1)
#define F_OR3(i, b, e) F_OR(i, b, e, 1)
#define F_OR4(i, b, e, s) F_OR(i, b, e, s)
#define GET5(a, b, c, d, e, ...) e
#define F_ORC(...) GET5(__VA_ARGS__, F_OR4, F_OR3, F_OR2, F_OR1)
#define For(...) F_ORC(__VA_ARGS__)(__VA_ARGS__)
#define EACH(x, a) for (auto& x: a)
#define MAX(a,b) a=max(a,b)
#define MIN(a,b) a=min(a,b)
#define SQR(x) ((ll)(x)*(x))
#define pb push_back
#define vt vector
#define ALL(v) v.begin(), v.end()
#define SIZE(v) (int)v.size()
#define SORT(v) sort(ALL(V))


void solve(){
	int n;
	cin>>n;
	vt<int> a(n);
	For(n) cin>>a[i];
	auto p = [&](int x){
		vt<int> c = a;
		for(int i =n-1;i>=0;i--){
			if(c[i]<x) {return false;}
			int d = (c[i]-x)/3;
			MIN(d,a[i]/3);
			if(i>1){
				c[i-1] +=d;
				c[i-2] +=2*d;
			}
		}
		return true;
	};
	int l = 0, r = 1e9, ans = 1;
	while( l<=r){
		int m = l+ (r-l+1)/2;
		if(p(m)) {l = m+1; ans = m;}
		else r = m-1;
	}
	cout<<ans;

}
int main(){
	int t;
	cin>> t;
	while(t--){
		solve();cout<<"\n";
	}
}

