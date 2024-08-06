class lowertoupper{
    public static void main (String [] arg){
        char ch ='a';
        if(ch>='A' && ch<='Z'){
            System.err.println("upper");
        }
        else{
            ch = (char )(ch-32);
            System.out.println(ch);
        }
}
}