public class CheckAscending {
    public static void main(String[] args){
        int input=4576;
        int prev=input%10;
        input=input/10;
        boolean flag=true;
        while(input>0){
            int d=input%10;
            if(d>=prev){
                flag=false;
                break;
            }
            prev=d;
            input=input/10;

        }
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        }   
    }

