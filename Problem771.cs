namespace LeetCode;

public class Problem771
{
    static int NumJewelsInStones(string jewels, string stones)
    {
        int req = 0;
        foreach (var s in stones)
        {
            foreach (var j in jewels)
            {
                if (j == s)
                {
                    req++;
                }
            }
        }
        return req;
    }
    
    static void Main(string[] args) {
        Console.WriteLine(NumJewelsInStones("a", "Aaaa"));
    }
}