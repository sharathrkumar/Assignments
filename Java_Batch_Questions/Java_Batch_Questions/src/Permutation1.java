class PerformPermutation
{
    String string;
    String ans;

    void permutate(String string, String ans)
    {
        int len = string.length();
        this.string = string;
        this.ans = ans;
        if(len == 0)
        {
            System.out.println(ans+" ");
        }
        else{
            for(int i =0;i<len;i++)
            {
                char ch = string.charAt(i);
                String left_substr = string.substring(0, i);
                String right_substr = string.substring(i + 1);
                String rest = left_substr + right_substr;
                permutate(rest, ans + ch);
            }
        }

    }
}
public class Permutation1 {
    public static void main(String[] args) {
        PerformPermutation p1 = new PerformPermutation();
        p1.permutate("abc","");

    }
}
