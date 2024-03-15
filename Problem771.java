public class Problem771
{
    static int numJewelsInStones(String jewels, String stones)
    {
        int req = 0;
        for (char s : stones.toCharArray())
        {
            for (char j : jewels.toCharArray())
            {
                if (j == s)
                {
                    req++;
                }
            }
        }
        return req;
    }
    
    static void Main(String[] args) {
        System.out.println(numJewelsInStones("a", "Aaaa"));
    }
}