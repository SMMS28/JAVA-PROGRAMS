import java.util.Scanner;
 class palindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string as an input to check whether it is palindrome or not");
        String input= sc.nextLine();
        if(isPalindrome(input))
        {
            System.out.println(input+" is a palindrome string");
        }
        else
        {
            System.out.println(input+" is not a palindrome string");
            sc.close();
        }
    }
 
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        
        while(left < right)
        {
            if(str.charAt(left) != str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    } 
}
