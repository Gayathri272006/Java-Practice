public class OddsequenceArrangement {
    public static void main(String[] args){
        int n=361589;
        String s=String.valueOf(n);
        String odd="";
        String even="";
        for(int i=0;i<s.length();i++){
            int digit=s.charAt(i)-'0';
            if(digit%2!=0){
                odd+=digit;
            }else{
                even+=digit;
            }
        }
        System.out.println(odd+even);

    }
}
