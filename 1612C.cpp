#include <bits/stdc++.h>
typedef long long ll;
using namespace std;
 
ll get(int x){
	return (x*1ll*(x+1))/2;
}
 
void solve(){
	ll n, x;
	cin>>n>>x;
	ll l = 1, r = 2*n-1;
	ll res = 2*n-1;
	bool over = false;
	while(l<=r){
		int mid = (l+r)>>1;
		if(mid >=n){
			over = (get(n) + get(n-1) - get(2*n-1 -mid) >=x);
		}else{
			over = (get(mid) >=x);
		}
		if(over){
			res = mid;
			r = mid-1;
		}else{
			l =mid+1;
		}
	}
	cout<<res<<endl;
}
 
int32_t main(){
	int t; 
	cin>>t;
	while(t--){
	      solve();
	}
}
