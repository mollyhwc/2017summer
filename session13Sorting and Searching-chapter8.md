### Sorting and Searching

#### Bubble sort

原理是临近的数字两两进行比较,按照从小到大或者从大到小的顺序进行交换,

这样一趟过去后,最大或最小的数字被交换到了最后一位,

然后再从头开始进行两两比较交换,直到倒数第二位时结束.

```
见code session13 BubbleSortd.java
```

#### selection sort

* Find the smallest element and exchange it with a[0],then find the smallest element in subarray a[1]...a[n-1], and swap it with a[1].

* **2， 1， 5， 4， 9**

     1， 2， 5， 4， 9     first pass

     1， 2， 5， 4， 9     second pass

     1， 2， 4， 5， 9     third  pass

     1， 2， 4， 5， 9     forth pass    

* implementing code

  ```java
  见session13 SelectionSort.java
  ```

* Note:

  * for an array of n elements,the array is sorted after n-1 pass.
  * after the kth pass , the first k are in their final sorted position.

#### Insertion Sort

* definition
* for an array of n elements,the array is sorted after n-1pass.
* The worst case for insertion ----stored in reverse order
* the best case----already sorted in increasing order.

```
见 session13 InsertSort.java
```



#### Recursive sorts: Mergesort and Quicksort

* inefficient:when selection and insertion sorts for large n,requiring approximately n pass.
* efficient: **divide-and-conquer** approach

##### Mergesort

**how to do?**

1. break the array into two halves

2. Mergesort the left half

3. Mergesort the right half

4. merge the two subarrays into a sorted array.

   演示：https://en.wikipedia.org/wiki/Merge_sort

   ```
   session 13 MergeSort.java
   ```

   Note

   * the major *disadvantage* is it needs a temporary array, this could be a problem if space is a factor.
   * Mergesort is not affected by the initial ordering of elements, best and worst and  average cases have similar run times.

##### Quicksort

**how to do ?**

1. choose a pivot(random from the array)
2. placed all item to the left of pivot which are less or equal to the pivot.
3. whereas those to the right are greater than or equal to it.

```java
见session13 QuickSort.java
```

Note

* for the *fastest run time*,the array should be partitioned into two parts of roughly the **same size**.

* if pivot happens to be the **smallest or largest** element in the array,one of the subarray is empty!!!!

  then quicksort becomes a version of selection sort

* so u can shuffle up the given array. or examining several elements of the array and taken median.



##### Sequential Search

start at the first element and compares the key to the each element in turn until the key is found or not found

1. the best case is the key in the first slot
2. the worst case is the key in the last case.
3. on average, there will be n/2 comparisons

##### binary search

if the elements are in a **sorted** array.

Note

* the best case,the key is found in the first try.
* the worst case, the key is not in the list or is at either end of a sublist.
* 2^n^
* exe:9 10 11 12  13 28 30