
import java.io.*;
class String_problem
{
public static void main(String[] args)
throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

int array[]={'a','b','c','z','a','a','z'};
int a=97,count=0;
for(int i=0;i<array.length;i++)
{
for(int j=i+1;j<array.length;j++)
{
if(array[i]==a)
{
count++;
System.out.println(array[i]);
}
}
a++;
}
}
}

