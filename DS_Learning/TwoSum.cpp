#include <bits/stdc++.h>

using namespace std;

vector<int> twoSum(vector<int> &nums, int target)
{
    int size = nums.size();
    vector<int> rs;
    for (int i = 0; i < size; i++)
    {
        for (int j = i+1; j < size; j++)
        {
            if (nums[j] + nums[i] == target)
            {
                rs.push_back(i);
                rs.push_back(j);
            }
        }
    }
    return rs;
}

int main(){
    vector<int> a = {3, 2, 4};
    int target = 5, size = 5;
    // for (int i = 0; i < size; i++)
    // {
    //     for (int j = i; j < size; j++)
    //     {
    //         if (a[j] + a[i] == target)
    //         {
    //             cout << "[" << i << " , " << j << "]" << endl;
    //         }
    //     }
    // }

    vector<int> rs = twoSum(a, 6);
    for(auto n : rs){
        cout << n << "\t";
    }
    return 0;
}