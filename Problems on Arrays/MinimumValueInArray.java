import java.util.Scanner;
class MinValue{
static int MinValueInArray(int [] arr){
   int min = arr[0];
    for(int i=0;i<arr.length;i++){
      if(arr[i]<min){
        min=arr[i];
      }
    }
    return min;
}
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the Value of N : ");
    int n = scan.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<arr.length;i++){
    System.out.println("Enter the Elements of an Array : ");
       arr[i] =scan.nextInt();
    }
    int res = MinValueInArray(arr);
    System.out.println("The Minimum Value in Array :" + res);
  }
}
