class Bank {
    int MulOfDigitsInNumber(int n){
        int mul =1;
        int digit;
        while(n>0){
            digit = n%10;
            mul = mul * digit;
            n = n/10;
        }
        return mul;
    }
    public static void main(String[] args) {
        Bank b = new Bank();
        int Multiplication = b.MulOfDigitsInNumber(4564);
        System.out.println("Multiplication of all the digits" + Multiplication );
    }
}
