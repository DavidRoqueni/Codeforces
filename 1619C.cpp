#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
typedef pair<int,int> pii;
typedef pair<ll,ll> pll;
typedef pair<string,string> pss;
#define vt vector
#define pb push_back
#define all(c) (c).begin(), (c).end()
#define sz(x) (int)(x).size()

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

void solve(){
	ll a,s;
	cin>>a>>s;
	vt<int> b;
	while(s){
		int x = a%10;
		int y = s%10;
		if(x <= y) b.pb(y-x);
		else{
			s /=10;
			y += 10*(s%10);
			if(x < y && y >=10 && y<=19) b.pb(y-x);
			else{cout<<"-1";return;}
		}
		a/=10;
		s/=10;
	}
	if(a) cout<<-1;
	else{
		while(b.back() == 0) b.pop_back();
		reverse(all(b));
		EACH(i,b)cout<<i;
	}
}

int main(){
	int t = 1;
	cin>>t;
	while(t--){solve();cout<<"\n";}
}

