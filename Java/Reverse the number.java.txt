public class ReverseNumber
{  
public static void main(String[] args)  
{  
int number = 321456, reverse = 0;  
while(number != 0)  
{  
int remainder = number % 10;  
reverse = reverse * 10 + remainder;  
number = number/10;  
}  
System.out.println("The reverse of number is: " + reverse);  
}  
}