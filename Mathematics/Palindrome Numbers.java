public class Palindrome {
    int result(int n){
        int temp = n;
        int rev = 0 ;
        while(temp > 0){
            int ld = temp%10;
            rev = (rev * 10) + ld;
            temp = temp/10;
        }
        return (rev);
    }
    public static void main(String[] args){
        Palindrome ans = new Palindrome();
        int TestNumber = 565;
        int c = ans.result(TestNumber);
        if(c == TestNumber){
            System.out.println("it is palindrome");
        }
        else{
            System.out.println("It is not Palindrome");
        }

    }
}
