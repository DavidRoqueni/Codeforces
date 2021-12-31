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
#define each(x, a) for (auto& x: a)
#define MAX(a,b) a=max(a,b)
#define MIN(a,b) a=min(a,b)
#define SQR(x) ((ll)(x)*(x))
#define pb push_back
#define vt vector
#define all(v) v.begin(), v.end()
#define az(v) (int)v.size()


void solve(){
	int n, j;
	cin>>n>>j;
	vt<int> a(n);
	For(n) cin>>a[i];
	sort(all(a),greater<int>());
	auto p = [&](int x){
		ll c = j;
		c-=((x/2LL)*a[0]);
		c-=((x/2LL)*a[1]);
		if(x&1)c-=a[0];
		return c<=0;
	};
	int l =0, r = j;
	int ans = 0;
	int temp = j;
	while(l<=r){
		int m = l+ (r-l+1)/2;
		if(p(m)) {
			r=m-1;
			ans=m;
		}
		else{
			l =m+1;
		}
	}
	cout<<ans;
}
int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0), cout.tie(0);
	int t;
	cin>> t;
	while(t--){
		solve();cout<<"\n";
	}
}


