import file.*;
import java.util.Scanner;

class Main {
    public static void main(String ar[]) {
        int t,y,u,q;
        M a1 = new M();
        M1 a2 = new M1();
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        y=sc.nextInt();
        u=sc.nextInt();
        q=sc.nextInt();
        a1.sub(t,y);
        a2.add(u,q);
        sc.close();
        System.out.println("Compiled");
    }
}