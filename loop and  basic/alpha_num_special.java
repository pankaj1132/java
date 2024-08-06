

class alpha_num_special {

    public static void main(String[] args) {
        char ch = '9';
        if ((ch >= 65 && ch <= 95) || (ch >= 'a' && ch <= 'z')) {
            System.out.println("alphabet");
        }
         else if (ch >= 48 && ch <= 57) {
            System.out.println("digit");

        }
        else{
            System.out.println("special character");
        }
    }

}
