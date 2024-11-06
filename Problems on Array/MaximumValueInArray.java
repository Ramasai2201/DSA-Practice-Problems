import java.util.Scanner;
class MaxValue{
static int MaxValueInArray(int [] arr){
    int max = arr[0];
    for(int i=0;i<arr.length;i++){
      if(arr[i]>max){
        max=arr[i];
      }
    }
    return max;
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
    int res = MaxValueInArray(arr);
    System.out.println("The Maximum Value in Array :" + res);
  }
}
