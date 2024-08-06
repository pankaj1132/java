public class nopofdigit {
    public static void main(String[] args) {
        int i =999;
        int count=0;

        do {
            
                i=i/10;
                count++;
            }while(i!=0);
            System.out.println(count);

        }
        
    }

