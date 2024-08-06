class arthmetic {
    
    public static void main(String[] args) {
        
        int a = 5, b = 10;
        int choice = 2;
        switch ( choice ) {
            case 1  : System.out.println(a+b);
                
                break;
                case 2  : System.out.println(a-b);
                
                break;
                case 3  : System.out.println(a*b);
                
                break;
                case 4  : System.out.println(a/b);
                
                break;
            default:
                System.err.println("not a arthmetic");
        }
    }
}
