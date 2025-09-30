public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappy(2));
        System.out.println(isHappy(8));
        System.out.println(isHappy(68));
    }
    public static boolean isHappy(int n){
        while(n>9){ //loop until it becomes single digit number
            int sum=0;
            while (n>0){
                int digit = n%10;
                sum+=(digit*digit);
                System.out.println(sum);
                n/=10;
            }
            n=sum;
        }
        return n==1;
    }
}
