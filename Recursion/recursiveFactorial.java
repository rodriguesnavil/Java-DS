class recursiveFactorial{
    public static void main(String[] args) {
        long num = 5;
        System.out.println("factorial "+recursiveFactorial(num));
    
    }

    public static long recursiveFactorial(long num){
        if(num == 0){
            return 1;
        }
        return num * recursiveFactorial(num - 1); 
    }
}