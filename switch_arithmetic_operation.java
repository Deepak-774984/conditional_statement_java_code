import java.util.Scanner;

public class switch_arithmetic_operation {
    public static void main(String[] args) {
    double num1=0,num2=0;
    Scanner sc=new Scanner(System.in);
    System.out.print("Eneter the 1st Number: ");
    if(sc.hasNextDouble()){
    num1=sc.nextDouble();
    }else{
        System.out.println("Invalid input! Please enter a numeric value.");
            return; // stop program
        }
    System.out.print("Eneter the 2nd Number: ");
    if(sc.hasNextDouble()){
    num2=sc.nextDouble();
    }else{
        System.out.println("Invalid input ! Please eneter a numeric value.");
    }
    System.out.println("Enter the operater(+,-,*,/,%)");
    char operater=sc.next().charAt(0);//next() is used for read the string and charAt(index:0) is used for read the 1st character of the string
    double result;
    switch (operater) {
        case '+':
        result=num1+num2;
        System.out.println("result=" +result);
            
            break;
        case '-':
        result=num1-num2;
        System.out.println("result=" +result);
            
            break;
        case '*':
        result=num1*num2;
        System.out.println("result=" +result);
            
            break;
        case '/':
        result=num1/num2;
        System.out.println("result=" +result);
            
            break;
        case '%':
        result=num1%num2;
        System.out.println("result=" +result);
            
            break;
    
        default:
        System.out.println("Inter a valid number! like +,-,*,/,%");
        }

    }
}
