import java.util.Scanner;
class M{
void add(){
int a,b,c;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=a+b;
System.out.println(c);
}
}

class A{
public static void main(String ar[]){
M a1=new M();
a1.add();
}
}