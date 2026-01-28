public class Reverse_Num {
    public static void main(String[] args) {
        int num = 654654;
        int reverse = 0;
        while (num != 0) {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num /= 10;
        }
        System.out.println("The reversed number of the given number is : " + reverse);
    }
}