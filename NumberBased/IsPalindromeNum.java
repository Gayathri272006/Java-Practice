
public class IsPalindromeNum {
    public static void main(String[] args){
        int N=121;
        int original=N;
        int rev=0;
        while(N>0){
            rev=rev*10+N%10;
            N=N/10;
        }
        if(original==rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

    }
}
