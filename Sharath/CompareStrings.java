class CompareStrings {  
  void compareStrings(String str1,String str2)
  {
    if (str1 == str2){
      System.out.println("Both the Strings contains Same Data");
    }
    else
    {
      System.out.println("Both the Strings contains different Data");
    }
  }
  public static void main(String args[]) { 
    String str1 = "Java";
    String str2 = "JavaC";
    Main str = new Main();
    str.compareStrings(str1,str2);
  } 
}