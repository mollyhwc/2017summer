### session9

- **analyzing array algorithms**

  ```java
  public static int countNegs(int[] arr){
    int count=0;
    for(int num: arr){
      if(num<0){
        count++;
      }
    }
    return count;
  }
  ```

  ```java
  {
  /** 
  arr[0]....arr[n-1] contain integers sorted in increasing order
  num need to be inserted in its correct position
  n is arr.length
  **/
  //find insertion positioin
  int i =0;
  while (i<n && num>arr[i]){
    i++;
  }
  for(int j=n;j>=i+1;j--){
    arr[j]=arr[j-1];
    //insert num in i-th slot and update n
    arr[i]=num;
    n++;
  }
  }
  ```

  1. ​

  - best---when ??/  worst---when ??
  - so ,**insertion or deletion of an element in an ordered list is inefficient.**

  ------

  #### ARRAY LISTS


- an ArrayList is an alternative way of storing a list of object.

- Advantages:

  - ArrayList shrinks and grows as needed in a program, whereas  an array has a fixed length.

  - in ArrayList , the last slot is **list.size()-1**,whereas in array you need keep track of the last slot currently in use.

  - do insertion or deletion with just a single statement.![捕获](B:\pangpang\AP\chapter4\捕获.PNG)

  - **Collections and generics**（泛型）

    - ArrayList<E> contain elements of type E.
    - EXAMPLE: private ArrayList<Clown> clowns;

    ![9.1](B:\pangpang\AP\2017暑假Java课外辅导\image\9.1.PNG)

    ```java
    // StringArrayList.java - uses an ArrayList Container
    import java.util.*;
    class StringArrayList {
    public static void main(String[] args)
    {
    ArrayList<String> myStringArray= new ArrayList<String>();
    String[] data = {"one", "two", "three"};
    for(int i = 0; i < 5; i++)
    for (String s : data )
    myStringArray.add(s);
    System.out.println("\n ArrayList of Strings\n");
    for (String s : myStringArray )
    System.out.println(s);
    }
    }	
    ```

    **PROBLEM SOLVING: PALINDROMES **

    ```java
    // Palindrome.java - uses an ArrayList container
    import java.util.*;
    class Palindrome
    {
    public static void main(String[] args)
    {
    ArrayList<String> words = new ArrayList<String>();
    Scanner scan = new Scanner(System.in);
    while(scan.hasNext())
    words.add(scan.next());
    System.out.println("Is it a palindrome? " + isPalindrome(words));
    }
    static boolean isPalindrome(ArrayList<String> w)
    {
    int front = 0, back = w.size() - 1;
    while( front < back)
    if (!w.get(front++).equals(w.get(back--)))
    return false;
    return true;
    }
    }
    ```

    ------

    #### TWO-DIMENSIONAL ARRAYS

    A two-dimensional array(matrix) is often the data structure of choice for theater seats,mazes.

  - declarations

  - - ```java
      int[][] table;
      double[][] matrix =new double[3][4]//3*4,each element has value 0.0
      String[][] str = new String[3][5]//3*5,each element is null
      int[][] mat={{1,2,3},//row0
      			{4,,5,6}};//row1
      ```

  ```java
  1 1 1 1
  2 2 2 2
  3 3 3 3
  4 4 4 4// SUM()   for/for-each
  ​````

  * row-column(access ,modify , replacement)
  * for-each (access,modify, cannot replacement)
  * row-by-row(access ,modify , replacement)
  ```

----

### Recursion

##### recursion methods

- a recursion  method is a method that calls itself. see example,P290. code.....
- imagine the statements are stacked like plates.

##### general from of simple recursion methods

every recursion method has two distinct parts:

- a base case or termination condition that causes the method to end .

- a non-base case whose actions move the algorithm towards the base case and termination.

  ```java
  public void recursiveMethod(){
    if(base case){
      <perform some action>
    }
    else{
      <perform some other method>
      recursiveMehtod();//recursive  method call
    }  
  }
  ```

  ```java
  // Recur.java - recursive goodbye
  public class Recur {
  public static void main(String[] args) {
  sayGoodBye(5);
  }
  static void sayGoodBye(int n) {
  if (n < 1) //base case
  System.out.println("########");
  else {
  System.out.println("Say goodbye Gracie.");
  sayGoodBye(n - 1); //recursion
  }
  }
  }
  ```

  ​

##### practice

1. n!
   - what is the terminate condition?
2. ouput the integer parameter with the digits reversed.  method name revDigs()
   - for example:
     - revDigs(176)     outputs 671
     - revDigs(78)       outputs 87

#### analysis of recursive methods

fibonacci sequence:1,1,2,3,5,8,13

```java
public static int fib(int n){
  if(n==1||n==2){
    return 1;
  }
  else{
    return fib(n-1)+fib(n-2);
    
  }
}
```

what is the number of 7th in fibonacci? fib(7)

- this is an exponential algorithm,very **inefficient**!!!
- so :    !!what we should do ?

```java
public static int fib(int n){
  int prev = 1;
  int next = 1;
  int sum = 1;
  for(int i=3;i<=n;i++){ //start from 3th
    sum=prev+next;
    prev=next;
    next=sum;
  }
  return sum;
}
```

- **use recursion when it significantly simplifies code**

------

#### Recursion in two-dimensional grids

```
public void eraseBlob(int row,int col){
  if（row >= 0 && row < size && col >= 0 && col < size）
  {
    if(image[row][col]==BLACK){
      eraseBlob(row-1,col);
      eraseBlob(row+1,col);
      eraseBlob(row,col-1);
      eraseBlob(row,col+1);
      image[row][col]==WHITE;
    }
  }
}
```

- what is the problem?

