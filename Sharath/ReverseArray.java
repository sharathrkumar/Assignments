class ReverseArray {  
  void reverseArray(int []arr)
  {
    int n = arr.length;
    for (int i = n-1;i>=0;i--)
    {
      System.out.println(arr[i]);
    }
  }
  public static void main(String args[]) { 
    Main a = new Main();
    int []arr= new int[]{12,23,34,2};
    a.reverseArray(arr);
  } 
}
