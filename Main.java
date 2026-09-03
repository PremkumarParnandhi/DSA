class Main {
    public static void main(String[] args){
        int a=20;int b=10;
        a=b^a;
        b=a^b;
        a=a^b;
        System.out.print(a+" "+b);
    }
    
}
