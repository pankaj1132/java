public class perfect_number {
    public static void main (String []  arg){
    int num =4;
    int sum = 0;
    for (int i = 1; i<num; i++){
        if (num%i==0){
            sum = sum + i;
        }
    }
    if (sum == num){
    System.out.println("perfect number");
    }
    else {
        System.out.println("Not perfect number");
    }
}
}
