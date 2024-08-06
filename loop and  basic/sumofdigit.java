public class sumofdigit {
    public static void main (String []  arg){
        int i=123;
        int sum=0;
        do { 
            sum = sum + i%10;
            i = i/10;
            // if (i==0) {
            //     System.out.println(sum);
            //     break;
            // }

            
        } while (i>0);
        System.out.println(sum);
    
    }
    
}
