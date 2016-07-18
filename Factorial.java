import java.util.Scanner;
class Factorial
{
public static void main(String args[])
{
int a,f=1,n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(a=1;a<=n;a++)
f=f*a;
System.out.println(f);
}
}
