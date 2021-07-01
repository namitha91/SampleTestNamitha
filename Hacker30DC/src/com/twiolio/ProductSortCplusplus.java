package com.twiolio;

public class ProductSortCplusplus {

}
#include <bits/stdc++.h>

using namespace std;

string ltrim(const string &);
string rtrim(const string &);



/*
 * Complete the 'itemsSort' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY items as parameter.
 */

vector<int> itemsSort(vector<int> arr) {
std::unordered_map<int, int> frequencyMap;
    for (int val: arr) {
        ++frequencyMap[val];
    }

    using Val = std::pair<int, int>;
    std::vector<Val>  values(std::begin(frequencyMap), std::end(frequencyMap));
    std::sort(std::begin(values), std::end(values), [](Val const& lhs, Val const& rhs) {
            return (lhs.second < rhs.second) || (lhs.second == rhs.second && lhs.first < rhs.first);
          });

    std::vector<int> result;
    result.reserve(arr.size());
    for(auto const& val: values) {
        for(int loop = 0;loop < val.second; ++loop) {
            result.push_back(val.first);
        }
    }
    return result;
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string items_count_temp;
    getline(cin, items_count_temp);

    int items_count = stoi(ltrim(rtrim(items_count_temp)));

    vector<int> items(items_count);

    for (int i = 0; i < items_count; i++) {
        string items_item_temp;
        getline(cin, items_item_temp);

        int items_item = stoi(ltrim(rtrim(items_item_temp)));

        items[i] = items_item;
    }

    vector<int> result = itemsSort(items);

    for (int i = 0; i < result.size(); i++) {
        fout << result[i];

        if (i != result.size() - 1) {
            fout << "\n";
        }
    }

    fout << "\n";

    fout.close();

    return 0;
}

string ltrim(const string &str) {
    string s(str);

    s.erase(
        s.begin(),
        find_if(s.begin(), s.end(), not1(ptr_fun<int, int>(isspace)))
    );

    return s;
}

string rtrim(const string &str) {
    string s(str);

    s.erase(
        find_if(s.rbegin(), s.rend(), not1(ptr_fun<int, int>(isspace))).base(),
        s.end()
    );

    return s;
}
