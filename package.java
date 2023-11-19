PROGRAM 1(MyPackageClass.java)
    package demo_pack;
class MyPackageClass
{
public
    static void main(String[] args)
    {
        System.out.println("THis is my package!");
    }
}
 PROGRAM 2(A.java)
    package pack;
public class A
{
public void msg()
    {
        System.out.println("Hello");
    }
} 
PROGRAM 3(B.java)
    package mypack;
class B
{
public static void main(String args[])
    {
        pack.A obj = new pack.A();
        obj.msg();
    }
}
