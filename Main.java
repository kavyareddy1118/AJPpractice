//super class

class A
{
int num;
void getNum()
{
  System.out.println("num="+num);
}
}
//sub class
class B extends A
{
int num1;
void getvalue()
{
   System.out.println("num1="+num1);
}
}
class Main
{
public static void main(String args[])
{
B b=new B();
b.num=10;
b.num1=20;
b.getNum();
b.getvalue();
}
}