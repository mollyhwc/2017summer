#### input and print

````java
import java.util.*;
class Area {
public static void main (String[] args)
{
double width, height, area;
Scanner scan = new Scanner(System.in);
System.out.println("type two doubles for the width and height of a rectangle");
width = scan.nextDouble();
height = scan.nextDouble();
assert (width > 0 & height > 0);
area = width * height;
System.out.print("The area is ");
System.out.println(area);
}
}
````

![3.2](B:\pangpang\AP\2017暑假Java课外辅导\image\3.2.PNG)

**输出**

* print , println(), printf()

  ````java
  见 code session3. java
  ````

  ![3.3](B:\pangpang\AP\2017暑假Java课外辅导\image\3.3.PNG)

  ---

  ​

  ### session3：Control structures

  ##### Decision-making Control 

  1. **if** 

  ```java
  if(BooleanExpr)
  statement
  ```

  **common programming error**

  ```java
  if (x < y);
   System.out.println("The smaller is " + x);
  if (y < x);
   System.out.println("The smaller is " + y);
  ```

  ```java
  if (temperature < 32)
   System.out.print("It is now");
   System.out.print(32 - temperature);
   System.out.println(" below freezing.");
  System.out.println("It's " + temperature + "degrees");

  //输入temperature =45
  //输出是什么？
  ```

  **practice：**

  使用if找出完成下面练习

  ```java
  A different number is initially placed in each of three boxes, labeled a, b, and c, respectively. The problem is to rearrange or sort the numbers so that the final number in box a is less than that in box b and that the number in box b is less than that in box c. Initial and final states for a particular set of numbers are as follows.
  ```

  ![3.1](B:\pangpang\AP\2017暑假Java课外辅导\image\3.1.PNG)

  ```
  见 session3 IfabcPractice.java
  ```

  1. **if-else**

  ```java
  if ( BooleanExpr ) Statement1 else Statement2
  ```

  **practice**

  输入两个数字x和y,将最小的数字赋值给变量min，使用if-else

  ​

  3. **nested if-else**

  ```java
  if (temperature < 32) {
  	System.out.println("Warning Warning Warning!");
  	if (temperature < 0){
  	System.out.println((-temperature) + " degrees below Zero!"
      }else{
  	System.out.println(32 - temperature + "(F) below Freezing!");
  	System.out.println("Warning Warning Warning!");
  	}
      }else {
  	System.out.println("It is " + temperature + " degrees fahrenheit.");
  	}
  ```

  **COMMON PROGRAMMING ERROR**

  ```java 
  if (18 <= age < 65) ...
  ```

  4.**if-else-if-else-if . . .**

  ```
  if (ageOfPerson < 18)
  System.out.println("child fare");
  else {
  if (ageOfPerson < 65)
  System.out.println("adult fare");
  else
  System.out.println("senior fare");
  }
  ```

  ```java
  if (ageOfPerson < 18)
  System.out.println("child fare");
  else if (ageOfPerson < 65)
  System.out.println("adult fare");
  else
  System.out.println("senior fare"); 
  ```

  **The danging else problem**

  ```java
  if (Expression1)
    if (Expression2)
  	Statement1
  else
    Statement2
  ```

  ```java
  if (Expression1)
    if (Expression2)
      Statement1
    else
      Statement2
  ```

  **else is always matched with the nearest preceding if **

  CORRECT:

  ```
  if (Expression1) {
    if (Expression2)
      Statement1
  }
  else
  Statement2
  ```

  ​

  ##### Iteration

  1. **while**

  ```java
  while ( BooleanExpr )
  Statement
  ```

  ```java
  // Valentine.java - a simple while loop
  class Valentine {
  public static void main(String[] args) {
  int howMuch = 0;
  while (howMuch++ < 5)
  System.out.println("I love you.");
  }
  }
  ```

  **what is the problem with the following code?**

  ```java
  int count = 13;
  System.out.println("The multiples of 13 between 1 and 100 are:");
  while (count != 100){
   System.out.println(count);
   count = count + 13;
  }
  ```

  2. **the do statement**

   ```java
  do
  Statement
  while ( BooleanExpr ) 
   ```

  ```java
  import java.util.*;
  class GreatestCommonDivisor{
   public static void main(String[] args)
   {
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter 2 integers.");
   int num1 = scan.nextInt();
   int num2 = scan.nextInt();
   int m = num1, n = num2, remainder;
   do {
   remainder = m % n;
   m = n;
   n = remainder;
   } while( n != 0);
   System.out.println("GCD (" + num1 + ", " + num2 +
  ") = " + m );
   }
  }
  ```

  3. **for**

  ```java
  for ( ForInit; BooleanExpr ; UpdateExpr )
  Statement
  ```

  ![3.4](B:\pangpang\AP\2017暑假Java课外辅导\image\3.4.PNG)

  ```java
  code见Session3 For.java
  ```

  4. **the break and continue**

  * The break statement causes an exit from the **innermost enclosing loop**. 

  ```java
  code见Session3 Break.java
  ```

  * The continue statement causes the **current iteration of a loop to stop** and causes the **next iteration of the loop to begin immediately**. 

  ```
  code 见Session3 Continue.java
  ```

  The **continue** statement may only occur inside **for, while, and do loops**. **continue** transfers control to the **end of the current iteration**, whereas **break**  **terminates **the loop.

  5. **switch**

  The **switch** statement can be used in place of a long chain of **if-else-if-else-if-else** statements.

  ```java
  switch (dayOfWeek) {
  case 1:
  System.out.println("Sunday");
  break;
  case 2:
  System.out.println("Monday");
  break;
  case 3:
  System.out.println("Tuesday");
  break;
  case 4:
  System.out.println("Wednesday");
  break;
  case 5:
  System.out.println("Thursday");
  break;
  case 6:
  System.out.println("Friday");
  break;
  case 7:
  System.out.println("Saturday");
  break;
  default:
  System.out.println("Not a day number " + dayOfWeek);
  }
  ```

  将switch改成if--else 语句




**作业**

1.复习所学内容

2.写一个小程序。判断一个数的位数。例如输入123，则输出 “它是个3位的数！”

3.使用while循环，为指定的次数加一，直到达到60次。下面是部分代码，请补充完整。

```java
public class HelloWorld {
    public static void main(String[] args) {
        
        // 变量保存成绩
        int score = 53; 
        
        // 变量保存加分次数
        int count = 0;

        //打印输出加分前成绩 
        
        // 只要成绩小于60，就循环执行加分操作，并统计加分次数
        
        
        //打印输出加分后成绩，以及加分次数

    }
}
```

