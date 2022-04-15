import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        double fnum,snum,ans ;
        char sign;

        System.out.print("Please Enter your first digit: ");

        fnum=input.nextInt();

        System.out.print("Enter the second digit: ");
        snum=input.nextInt();
		/*This receive input from user
		it receive the second number*/

        System.out.print("Enter the mathematical operator to be used: ");
        sign=input.next().charAt(0);
        if (sign == '+' )
        {
            ans=fnum + snum;
            System.out.println("Score result:" +fnum +" "+sign +" "+snum +"= "+" "+ ans );
        }
        else if(sign == '-')/* else if statement for minus sign*/
        {
            ans=fnum-snum;
            System.out.println("Score result:" +fnum +" "+sign +" "+snum +"= "+" "+ ans );
        }
        else if(sign == '/'){
            ans=fnum/snum;
            System.out.println("Score result:"+fnum +" "+sign +" "+snum +"= "+" "+ ans );
        }
        else if(sign == '*'){
            ans=fnum*snum;
            System.out.println("Score result:"+fnum +" "+sign +" "+snum +"= "+" "+ ans );
        }
        else


            System.out.println("Your Input is not correct,please check it for any error(s).");



    }



}