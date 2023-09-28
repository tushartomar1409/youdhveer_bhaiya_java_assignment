class M{
int add(int a ,int b){
int c=a+b;
System.out.println(c);
return 0;
}
}

class B{
public static void main(String args[]){
M v=new M();
v.add(3,7);
}
}