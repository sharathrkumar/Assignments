class CompareStringIgnoreCase {  
  void compareStrings(String str1,String str2)
  {
    if (str1.equalsIgnoreCase(str2))
      System.out.println("SAME");
    else
      System.out.println("Different");
  }
  public static void main(String args[]) { 
    String str1 = "Java";
    String str2 = "JavAC";
    Main Str = new Main();
    Str.compareStrings(str1,str2);
  } 
}