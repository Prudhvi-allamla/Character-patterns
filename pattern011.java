// n=3

// A 
// BC
// DEF
   
//=======================================================================================
import java.util.Scanner;
public class pattern011{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input:");
        int n=sc.nextInt();
        char a='A';
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
            
                System.out.print(a);
                a++;
            }
            
            System.out.println(" ");

        }
        
            
        }
        
    }
