public class CountNumbers {
    int CountNumber(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 10 > 0) {
                count = count + 1;
            }
            n = n / 10;  
        }
        return count;
    }

    public static void main(String[] args) {
        CountNumbers ans = new CountNumbers();
        int c = ans.CountNumber(123456);
        System.out.println(c);  // Output: 3
    }
}
