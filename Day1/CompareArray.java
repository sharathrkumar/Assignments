class CompareArray {  
  void compareArray(int[]arr1,int[]arr2){
    for(int i= 0;i<= arr1.length-1;i++){
      if(arr1[i] == arr2[i]){
        System.out.println(arr1[i]);
      }
    }
  }
  public static void main(String args[]) { 
    int []arr1 = new int[]{1,2,3,3};
    int []arr2 = new int[]{1,2,3,4};
    System.out.println("The Similar Onjects in the Both the Arrays are:");
    Main arr = new Main();
    arr.compareArray(arr1,arr2);
    
  } 
}