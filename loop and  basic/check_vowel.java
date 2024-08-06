 class check_vowel {
    public static void main(String[] args) {
        char ch = 'a';
        if(ch >='a' && ch <='z'){
            ch = (char )(ch -32);
             }
        switch (ch) {
            case  'A': 
            System.err.println("vowel");
            break;
            case  'E': 
            System.err.println("vowel");
            break;
            case  'I': 
            System.err.println("vowel");
            
            break;
            case  'U': 
            System.err.println("vowel");
            break;
            case  'O': 
            System.err.println("vowel");
                
                break;
            default:
                System.err.println("not vowel");;
        }
        System.err.println("progra m has been excuted ");
    }
    
}


// draw back of switch in switch if any value of is getting match with
//  the value of switvh then that value of case along with 
// the all the remaining block excuted 