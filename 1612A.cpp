#include <bits/stdc++.h>
typedef long long ll;
using namespace std;
 
void solve(){
	int x,y;
	cin>>x>>y;
	if((x+y)&1) cout<<"-1 -1";
	else{
		printf("%d %d",x/2,(y+1)/2);
	}
}
 
int32_t main(){
	int t; 
	cin>>t;
	while(t--){
	      solve();
	      cout<<endl;
	}
}
