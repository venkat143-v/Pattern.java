import java.util.*;
public class Pattern {
	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
System.out.println("enter number:");
int n= sc.nextInt(); //5 ->  n-1 * 2+1 = 9 rows & cols
for(int i = n-1; i >= 1-n; i-- ) // 1 0 -1 -> 3 rows 
{
	for(int j=n-1; j >= 1-n; j--) // 1 0 -1 -> 3 cols
	{
		if( Math.abs(i) > Math.abs(j) ) // 0 > 1,0,1
			 System.out.print(Math.abs(i)  + 1+ " "); //2
		else
			System.out.print(Math.abs(j)  + 1+ " ");// 2 1 2
	}
	System.out.println();
} 

} }