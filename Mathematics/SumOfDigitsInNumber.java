class Bank {
     int SumOfDigitsInNumber(int n){
        int sum =0;
        int digit;
        while(n>0){
            digit = n%10;
            sum = sum + digit;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Bank b = new Bank();
         int summaation = b.SumOfDigitsInNumber(45879);
        System.out.println("Total Sum of Digits in the number" + summaation);
       
    }
}
