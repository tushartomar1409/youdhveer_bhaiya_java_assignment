class A{
int m1(int a,int b){
int c=a+b;
System.out.println(c);
return 0;
}
}

class B{
int m1(int a,int b){
int c=a-b;
System.out.println(c);
return 0;
}
}

class C{
public static void main(String ar[]){
A a1=new A();
a1.m1(2,3);
B a2=new B();
a2.m1(10,4);
}
}