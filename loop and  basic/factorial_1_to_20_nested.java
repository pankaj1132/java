// Write a program to calculate the factorial of a number using nested loops.
public class factorial_1_to_20_nested {
    public static void main (String []  arg){
        for (int i = 1; i<=20; i++){
            int fact = 1;
            for (int j = 1; j<=i; j++){
                fact = fact * j;
            }
            System.out.println("Factorial of "+i+" is "+fact);
        }
    }
    
}
