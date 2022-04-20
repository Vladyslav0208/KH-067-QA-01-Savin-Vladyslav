import java.util.Scanner;
public class Calculator2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        double fnum,snum,ans ;
        char sign;

        System.out.print("Please Enter your first digit: ");

        fnum=input.nextDouble();

        System.out.print("Enter the second digit: ");
        snum=input.nextDouble();
		/*This receive input from user
		it receive the second number*/

        System.out.print("Enter the mathematical operator to be used: ");
        sign=input.next().charAt(0);
        switch(sign) {
            case '+': ans = fnum + snum;
                break;
            case '-': ans = fnum - snum;
                break;
            case '*': ans = fnum * snum;
                break;
            case '/': ans = fnum / snum;
                break;
            default:  System.out.printf("Error! Enter correct operator");
                return;
        }
        System.out.print("The result is given as follows:");
        System.out.printf(fnum + " " + sign + " " + snum + " = " + ans);
    }
}



