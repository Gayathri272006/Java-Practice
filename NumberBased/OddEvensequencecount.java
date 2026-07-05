public class OddEvensequencecount {
    public static void main(String[] args){
        int n=361589;
        String s=String.valueOf(n);
        String odd="";
        String even="";
        int oddcount=0;
        int evencount=0;
        for(int i=0;i<s.length();i++){
            int digit=s.charAt(i)-'0';
            if(digit%2==0){
                even+=digit;
                evencount++;
            }else{
                odd+=digit;
                oddcount++;
            }
        }
        System.out.println(odd+oddcount+even+evencount);
    }
}
