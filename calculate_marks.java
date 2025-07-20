import java.util.Scanner;

public class calculate_marks {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the marks :");
        int marks=sc.nextInt();
        if(marks>=90 && marks<=100){
            System.out.println(" Grade is :O");
        }
        else if(marks>=80 && marks<=90){
            System.out.println("Grade is :E");
        }
        else if(marks>=70 && marks<=80){
            System.out.println("Grade is :A");
        }
        else if(marks>=60 && marks<=70){
            System.out.println("Grade is :B");
        }
        else if(marks>=50 && marks<=60){
            System.out.println("Grade is :C");
        }
        else if(marks>=35 && marks<=50){
            System.out.println("Grade is :D");
        }
        else if(marks>=35 && marks<=50){
            System.out.println("Grade is :D");
        }else{
            System.out.println("grade is F");
        }


    }
}
