class CompareStrings {
    static String compareStrings(String str1, String str2)
    {
        if (str1 == str2){
            return ("Both the Strings contains Same Data");
        }
        else
        {
            return ("Both the Strings contains different Data");
        }
    }
    public static void main(String args[]) {
        String str1 = "Java";
        String str2 = "JavaC";
        System.out.println(compareStrings(str1,str2));
    }
}