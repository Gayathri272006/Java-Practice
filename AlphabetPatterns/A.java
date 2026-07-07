

public class A {
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<n;i++){
            for (int j=0;j<10;j++){
                if((i==0&&j==5)||(i==1&&(j==4||j==6))||
                (i==2&&(j==3||j==4||j==5||j==6||j==7))||(i==3&&(j==2||j==8))||
                (i==4&&(j==1||j==9))){
                    System.out.print("*");
                }else{
            
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
