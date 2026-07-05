import java.util.Scanner;
public class SumNodd {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the option: ");
        String opt=sc.nextLine();
        int N=12345;
        int sum=0;
        while(N>0){
            if(opt.equals("even")&&N%2==0){
                sum=sum+N%10;   
            }else if(opt.equals("odd")&&N%2!=0){
                sum=sum+N%10; 
            }

            N=N/10;
        }
        System.out.println(sum);
    }
}
