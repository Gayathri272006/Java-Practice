public class Sub2digitform {
    public static void main(String[] args){
        int n=6928;
        while(n>99){
            String s=String.valueOf(n);
            int ans=0;
            for(int i=0;i<s.length()-1;i++){
                int d1=s.charAt(i)-'0';
                int d2=s.charAt(i+1)-'0';
                ans=ans*10+Math.abs(d1-d2);
            }
            System.out.println(ans);
            n=ans;
        }
    }
}
