
import java.util.Scanner;
class Patterns {
public static void main(String[] args) {
/*
       Scanner s = new Scanner(System.in);
       System.out.println("Enter no of rows:");
       int rows =s.nextInt();
 
        for (int i = 1; i <= rows; i++) 
           {         
            for (int j = 1; j <= rows; j++)
           {     
            System.out.print("* " );
            }
            
       
      System.out.println();
    }
  }
}
output:Enter no of rows:6
* * * * * *
* * * * * *
* * * * * *
* * * * * *
* * * * * *
* * * * * *
*/
      /* Scanner s = new Scanner(System.in);
       System.out.println("Enter no of rows:");
       int rows =s.nextInt();
 
        for (int i = 1; i <= 5; i++) 
           {         
            for (int j = 1; j <= 5; j++)
           {     
            System.out.print(i);
            }
            
       
      System.out.println();
    }
  }
}
output:Enter no of rows:5
11111
22222
33333
44444
55555
*/
/*
       Scanner s = new Scanner(System.in);
       System.out.println("Enter no of rows:");
       int rows =s.nextInt();
 
        for (int i = 1; i <= 5; i++) 
           {         
            for (int j = 1; j <rows ; j++)
           {     
            System.out.print(j+" ");
            }
            
       
      System.out.println();
    }
  }
}
output:Enter no of rows:6
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
*/
    
     /*Scanner s = new Scanner(System.in);
       System.out.println("Enter no of rows:");
       int rows =s.nextInt();
 
        for (int i = 1; i <= rows; i++) 
           {         
            for (int j = 1; j <rows ; j++)
           {     
            System.out.print(j%2==0?"0":"1");
            }
            
       
      System.out.println();
    }
  }
}
output:Enter no of rows:6
10101
10101
10101
10101
10101
10101
*/

Scanner s = new Scanner(System.in);
       System.out.println("Enter no of rows:");
       int rows =1;
        for (int i = 0; i < 5; i++) 
         { 
            for (int j = 0; j < 5; j++) { 
                System.out.print(rows + "\t"); 
                rows++ ;
         }
      System.out.println();
    } 
  }
}
output:Enter no of rows:5
1       2       3       4       5
6       7       8       9       10
11      12      13      14      15
16      17      18      19      20
21      22      23      24      25
*/





/* 
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
System.out.print(i+" " );
}
System.out.println(" ");
}
}
}
output:enter no of rows:
5
1 1 1 1 1
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4
5 5 5 5 5 */


/* 
Scanner sc=new Scanner(System.in);
System.out.println("enter number:");
int n=sc.nextInt();
int x=1;
for(int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
System.out.print(x+" " );
x++;

if(x>9)

x=1;
}
System.out.println(" ");
}
}
}
output:
enter number of rows :
5
1 2 3 4 5
6 7 8 9 1
2 3 4 5 6
7 8 9 1 2
3 4 5 6 7 */

/* 
Scanner sc=new Scanner(System.in);
System.out.println("enter number:");
int n=sc.nextInt();
int x=1;
for(int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
System.out.print(x+" " );
x=x+2;
}
System.out.println(" ");
}
}
}
output:
enter number of rows :
5
1 3 5 7 9
11 13 15 17 19
21 23 25 27 29
31 33 35 37 39
41 43 45 47 49 */

/*

Scanner sc=new Scanner(System.in);
System.out.println("enter number:");
int n=sc.nextInt();

for(int i=1;i<=n;i++)
{
for(int j=n-i;j>1;j--)
{
System.out.print(" ");
}
for (int j = 1; j <= i; j++) {


System.out.print("* ");

}
System.out.println();
}
}
}
output:
enter number:
5
    *
   * *
  * * *
 * * * *
* * * * * 
*/
Scanner sc=new Scanner(System.in);
System.out.println("enter number:");
int n=sc.nextInt();

for(int i=1;i<=n;i++)
{
for(int j=n-i;j>1;j--)
{
System.out.print(" ");
}
for (int j = 1; j <= i; j++) {


System.out.print(2*j+"  ");

}
System.out.println();
}
}
}
output:
enter number of rows:
5
    2
   2 4
  2 4 6
 2 4 6 8
2 4 6 8 10 */

/*
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine(); 

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(word.charAt(j) + " ");
            }
            System.out.println();
        }
    }
}
output:
Enter a word: INDIA
I
I N
I N D
I N D I
I N D I A
*/
/*
Scanner sc=new Scanner(System.in);
System.out.println("enter n:"); 
int a=sc.nextInt();  
System.out.println(" ");  
for(int i=a;i>=1;i--)
{   
for(int j=1;j<=i;j++)
{
if(j== 1||j==i||i==a)
{
System.out.print("* ");
}
else
{
System.out.print("  ");
}
} 
System.out.println();
}  
}
}
output:
enter n value:
5

* * * * *
*     *
*   *
* *
* 
/*
Scanner sc=new Scanner(System.in);
System.out.println("enter n:");
int a=sc.nextInt();
System.out.println("");  
for(int i=1;i<=a;i++) {
for(int j=1;j<=a;j++) 
{
if(i==1||j==1||j==a||i==a) 
{
System.out.print("* ");
}
else
{
System.out.print("  ");
}
}        
System.out.println();
}  
}
}
output:
enter n:
5

* * * * *
*       *
*       *
*       *
* * * * * 
*/

Scanner sc = new Scanner(System.in);
System.out.println("enter n:");
int a= sc.nextInt();
System.out.println(""); 
for (int i = 1; i <=a; i++)
{
for (int j = 1; j <=a-i; j++)
{
System.out.print(" ");
}
for (int j = 1; j <= i; j++)
{
if (j == 1 || j == i)
{
System.out.print("* ");
}
else
{
System.out.print("  ");
}
}
System.out.println();
}      
for(int i=a-1;i>=1;i--)
{
for(int j=1;j<=a-i;j++)
{
System.out.print(" ");
}
for (int j=1;j<=i;j++)
{
if (j==1||j==i)
{
System.out.print("* ");
}
else
{
System.out.print("  ");
}
}
System.out.println();
}
}
}
output:
enter n:
5

    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    * 
*/
/*

Scanner sc=new Scanner(System.in);
System.out.print("enter n:");
int n=sc.nextInt();
for(int i=0;i<n;i++) {
for(int j=0;j<n;j++) {
if(i==n/2||j==n/2) {
System.out.print("* ");
} else {
System.out.print("  ");
}
}
System.out.println();
}
}
}
output:
enter n:5
    *
    *
* * * * *
    *
    * 
/*