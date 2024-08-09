

public class power_num {
    public static void power(int n , int m) {
        int power=1;
        for(int i =1; i<=m; i++){
            power = power * n;
        }
        System.out.println("Power of "+n+" is "+power);
        
    }
    public static void main (String []  arg){
    power(5,3);
    }
    
}
