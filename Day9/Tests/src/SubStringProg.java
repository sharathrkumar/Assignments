class SubstringProg {
    static String subStr(String s1)
    {
        int len = s1.length();
        if(s1.substring(0,2).equals(s1.substring(len-2,len)))
        {
            return (s1.substring(2,len));
        }
        else
            return (s1);
    }
    public static void main(String args[]) {
        String s1 = "hihellohi";
        System.out.println(subStr(s1));
    }
}