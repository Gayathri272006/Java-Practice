public class W {
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=10;j++){
              if(i==5&&j==3||i==3&&j==2||i==3&&j==4||
                i==1&&j==1||i==1&&j==5||i==3&&j==6||
                i==5&&j==7||i==3&&j==8||i==1&&j==9){
                System.out.print("* ");
              }else{
                System.out.print("  ");
              }
            }
            System.out.println();
        }
    }
}
