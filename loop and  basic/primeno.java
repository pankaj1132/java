public class primeno {
    public static void main (String []  arg){
        int n =89 ;
        int no_of_divisible=0;
        
        for (int i = 1; i<=n; i++){
            if (n%i==0){
                no_of_divisible++;
            }
        }
        if (no_of_divisible==2){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
