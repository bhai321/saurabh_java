import java.util.Scanner;
public class Main{
public static void main(String args[]){
int i=1, factorial = 1, number;
// Accepting input from user
System.out.println("Enter the number for which the factorial is required ?");
Scanner sc1 = new Scanner(System.in);
number = sc1.nextInt();
//Evaluation of factorial
while(i<=number){
factorial = factorial * i;
i++;
}
System.out.println("The factorial of a number is :: " + 
factorial);
}
}