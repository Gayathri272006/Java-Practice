public class Oddsequence {
    public static void main(String[] args){
        int n=361589;
        String s=String.valueOf(n);
        int sum=0;
        String odd="";
        String even="";
        for(int i=0;i<s.length();i++){
            int digit=s.charAt(i)-'0';
            if(digit %2!=0){
                sum=sum+digit;
                odd=odd+digit;
            }else{
                even=even+digit;
            }
        }
        System.out.println("Sum of odd digits= "+sum);
        System.out.println("Arrangement= "+odd+even);
    }
}
