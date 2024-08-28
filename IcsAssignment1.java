class Tester {
	public static void main(String[] args) {
    int number = 1331;
    if (isPalindrome(number)){
        System.out.println(number + "is a Palindrome");
        }else{
            System.out.println(number + "is not a Palindrome");
        }
    }
    public static boolean isPalindrome(int number){
        String original = String.valueOf(number);
        String reversed = new StringBuilder(original).reverse().toString();
        return original.equals(reversed);
    }
}

