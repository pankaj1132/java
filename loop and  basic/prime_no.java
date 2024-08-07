
// write a java program to print all the prime number 1 to 100
public class prime_no {
    public static void main (String []  arg){
        for (int i = 1; i<=20; i++){
            int no_of_divisible=0;
            for (int j = 1; j<=i; j++){
                if (i%j==0){
                    no_of_divisible++;
                }
            }
            if (no_of_divisible==2){
                System.out.println(i);
            }
        }
    }
    
}
