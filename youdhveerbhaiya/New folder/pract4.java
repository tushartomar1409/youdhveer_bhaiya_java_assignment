class A{
int meth1(int a){
System.out.println("simple...");
return 0;
}
int meth1(int a,int b){
System.out.println("method overloading...");
return 0;
}
}

class B{
public static void main(String ar[]){
A a1=new A();
a1.meth1(1);
a1.meth1(1,2);
}
}