public class Array_index{
  public static void main(String[] args){
    int[] arr;
    arr = new int[5];
    // arr[0] = 2;
    for(int i=0;i<5;i++)
    {
      if(i == 0)
      {
        arr[i] = 2;
      }
      else
      {
      arr[i] = 4 * i; 
      }
    }

    for(int j=0;j<5;j++)
    {
      System.out.printf("%d Index : %d\n", j, arr[j]);
    }

  }
}