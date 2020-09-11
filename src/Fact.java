import java.util.Scanner;
public class Fact {
    static int f(int a){
        int res=1;
        for(int i=1;i<=a;i++){
            res=i*res;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n =in.nextInt();
        System.out.println(f(n));
    }
}
