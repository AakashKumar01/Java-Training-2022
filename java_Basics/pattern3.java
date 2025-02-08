//to print hollow rectangle
//****** 
//*    *
//*    *
//******
public class pattern3 {
    public static void main(String[] args) {
        int row=4;
        int col=5;
        for(int i=0;i<=4;i++) {
            for(int j=0;j<=5;j++) {
                if(i==0||j==0||i==row||j==col||i==j) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}