import java.util.Scanner;

class Demo{
    public int  check(int x){
        int sum=1;
        for(int i=2;i<=x/2;i++){
            if(x%i==0){
                sum+=i;
            }
        }
        return sum;
    }
}
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner init=new Scanner(System.in);
        int in=init.nextInt();
        Demo d=new Demo();
        int d1=d.check(in);
        System.out.println(in==d1);
    }
}
