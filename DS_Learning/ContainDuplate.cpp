#include<bits/stdc++.h>
using namespace std;

class Solution
{
public:
    bool containsDuplicate(vector<int> &nums)
    {
        unordered_set<int> rec;
        for (auto &n : nums)
        {
            if (rec.find(n) != rec.end())
            {
                return true;
            }
            rec.insert(n);
        }
        return false;
    }
};

int main(){
    Solution sl;
    vector<int> a = {1, 2, 3, 5, 3, 9};
    // cout << sl.containsDuplicate(a) << ";";
    unordered_set <int> res = {1, 2, 4, 5};
    cout << *res.find(4) << "\t" << endl;
    // cout << *res.
    return 0;
}