#include<bits/stdc++.h>

using namespace std;

void insert(stack<int> & st, int tmp){
    if(st.empty() || st.top() >= tmp){
        st.push(tmp);
        return;
    }

    int val = st.top(); st.pop();

    insert(st, tmp);

    st.push(val);
}

void sort(stack<int> & st){
    if(st.size()==1) return ;

    int tmp = st.top(); st.pop();

    sort(st);

    insert(st, tmp);
}

int main(){
    stack<int> st;
    st.push(2);
    st.push(5);
    st.push(0);
    st.push(1);

    sort(st);
    int n = st.size();
    for(int i=0;i<n;i++){
        cout<<st.top()<<" ";
        st.pop();
    }

    return 0;
}
