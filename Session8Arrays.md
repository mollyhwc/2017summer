### chapter8 ---Arrays and Array Lists 

##### one-dimensional arrays

* **Definition**:  a data structure to implement a list object, where the element in the list are of **the same type**.

  * for an array of N elements in java, index values ( **"subscripts"**) from **0 to N-1**
  * ArrayIndexOutOfBoundsException is thrown: subscript is negative or subscript is k where k>=N

* **Initialization**

  * array is an **object** , the keyword **new** can be used in its creation.

  * the **size ** of an array remains fixed once it has been created.

  * example:

  * ```java
    double[] data = new double[25];
    double data[] = new double[25];
    double data[];   data= new double[25];  data =new double[40];//memory allocated for previous data array is recycled.
    ```

    * zero for the primitive numeric type / false for boolean variable / null for object reference

  * initializer list---when small arrays whose values are known

  * ```java
    int[] coins = new int[3];
    coins[0] = 1;
    coins[1] = 2;
    coins[2] = 3;

    or

    int[] coins={1,2,3}
    ```

  * **length of array**:*names.length*  vs **length of String objects** :*objectName.length()*

    ```java
    String s = "abc"; s.length();//String object length
    int[] a = new int[6]; a.length;//Array length
    ```

  * **Traversing an Array**

    * for-each loop: without replacing or removing any elements  

      ```java
      for ( Type Identifier : Iterable Expression)
      statement
      //data是一维度数组	
      for (int d : data) {
      sum = sum + d; //replaces data[i] with d
      System.out.print(d + ", ");
      }
      ```

      * practice: return the number of even integer in array arr of integers.

    * for loop: access the index of any element ,to replace or remove elements, or to access just some of the elements.
      * practice: change each even-indexed element in array arr to 0.

        ```
        可不可以使用for-each loop
        见code Summer session8 Array.java
        ```

  * **Arrays as Parameters**

    * arrays are treated as *object*, so passing a parameter means passing its *object reference*.
    * Q: So,the element of actual array can be modified????

    ```java
    // ArraySum2.java - sum the elements in an array
    // using a method
    class ArraySum2 {
    public static void main(String[] args) {
    int[] data1 = {1, 2, 3, 4, 5, 6, 7};
    int[] data2 = {16, 18, 77};
    System.out.println("data1:" + sum(data1));
    System.out.println("data2:" + sum(data2));
    }
    // sum the elements in an array
    static int sum (int[] a) {
    int sum = 0;
    for (int d: a)
    sum = sum + d;
    return sum;
    }
    }
    ```

    ```java
    //目的：将data1中的数据赋值到data2，data1和data2还是两个数组
    // TestCopy.java - demonstrate that array
    // parameters can be modified
    class TestCopy {
    public static void main(String[] args) {
    int[] data1 = {1, 2, 3, 4, 5, 6, 7};
    int[] data2 = {8, 9, 10, 11, 12, 13, 14};
    copy(data1, data2);
    System.out.println("data1:");
    for (int d: data1)
    System.out.println(d);
    System.out.println("data2:");
    for (int d: data2)
    System.out.println(d);
    }
    static void copy(int[] from, int[] to) {
    for (int i = 0; i < from.length; i++)
    to[i] = from[i]; //mutates so we use indexing
    }
    }
    ----------
    //以下代码正确吗？
      static void copy(int[] from, int[] to) {
     to = from; // failed attempt to copy an array
    }
      
    ```

    ![6.3](B:\pangpang\AP\2017暑假Java课外辅导\image\6.3.PNG)

    ![6.4](B:\pangpang\AP\2017暑假Java课外辅导\image\6.4.PNG)

    * **coding**

      * practice1: return index of smallest element in array arr of integer

      ```java
      见session 8 MinOfArray.java
      ```

      * practice2: add 3 to each element of array b

        ```java
        //method 1
        int a[]={1,2,3};
        public static void main(String[] args) {
          addThree(a);
        }
        public static void addThree(int b[]){
          for(int m:b){
            m+=3;
          }
        }
        //method2
        int a[]={1,2,3};
        public static void main(String[] args) {
          for(int i=0;i<a.length;i++)
          addThree(a[i]);
        }
        public static void addThree(int b){
          b+=3;
        }
        //method 3
        int a[]={1,2,3};
        public static void main(String[] args) {
          addThree(a)
        }
        public static void addThree(int b[]){
          for(int i=0;i<b.length;i++){
            b[i]+=3;
          }
        }
        ```

        以上哪个可以实现对数组a中的每个元素实现加3的操作？

  * **common programming error**

    * IndexOutOfBoundsException

    ```
    //data是一维数组
    for (int i=1;i<=data.length;i++){
      sum=sum+data[i];
    }
    ```

  * **选择排序selection sort**

  ```java
  // SelectionSort.java - sort an array of integers
  class SelectionSort {
  public static void main(String[] args) {
  int[] a = {7, 3, 66, 3, -5, 22, -77, 2};
  sort(a);
  for (int d : a){
  System.out.println(d);
  }
  }
  // sort using the selection sort algorithm
  static void sort(int[] data) {
  int next, indexOfNext;
  for (next = 0; next < data.length - 1; next++) {
  indexOfNext = min(data,next,data.length - 1);
  swap(data, indexOfNext, next);
  }
  }
  // find the index of the smallest element in
  // a specified range of indices in an array
  static int min(int[] data, int start, int end) {
  int indexOfMin = start; // initial guess
  for (int i = start+1; i <= end; i++)
  if (data[i] < data[indexOfMin])
  indexOfMin = i; // found a smaller value
  return indexOfMin;
  }
  // swap two entries in an array
  static void swap(int[] data, int first, int second){
  int temp;
  temp = data[first];
  data[first] = data[second];
  data[second] = temp;
  }
  }
  ```

  7 3 6 78 -2 89 78 7  每一次程序执行 这组数的顺序是什么？

  * 顺序查找&&二分查找

    * 顺序查找

      ```java
      static int linearSearch(int[] keys, int v) {
      for (int i = 0; i < keys.length; i++)
      if ( keys[i] == v)
      return i;
      return -1;
      }
      ```

    * 二分查找对于排好顺序的数组

      ```java
      // BinarySearch.java - use bisection search to find
      // a selected value in an ordered array
      class BinarySearch {
      public static void main(String[] args) {
      int[] data = {100, 110, 120, 130, 140, 150};
      int index = binarySearch(data, 120);
      System.out.println(index);
      }
      // find the index of element v in array keys
      // return -1 if it is not found
      static int binarySearch(int[] keys, int v) {
      int position;
      int begin = 0, end = keys.length - 1;
      while (begin <= end) {
      position = (begin + end) / 2;
      if (keys[position] == v)
      return position; // just right
      else if (keys[position] < v)
      begin = position + 1; // too small
      else
      end = position - 1; // too big
      }
      return -1;
      }
      }
      ```

      Note

      - the best case,the key is found in the first try.
      - the worst case, the key is not in the list or is at either end of a sublist.
      - 2^n^


```
看代码 array  ManyDecks.java ManyDeckMain.java Deck.java  DeckMain.java
```

