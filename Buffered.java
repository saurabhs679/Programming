import java.util.Scanner;
import java.io.*;
class Buffered
{
public static void main (String[] args)
throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a =Integer.parseInt(br.readLine());
String s=br.readLine();
System.out.println(a+s);
}
}