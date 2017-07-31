* 封装
* 包
* 函数

#### Session 5:Encapsulation

java面向对象三大特性：封装 继承和多态

**封装**

1. 概念：

   把对象的属性和操作结合为一个独立的整体，并尽可能隐藏对象的内部实现细节。

2. 好处：

   只能通过规定的方法访问数据。隐藏类的实例细节，方便修改和实现。

   因为我们使用类的时候关注的是类解决的问题并不关注类如何实现。

3. 封装实现步骤

   ​

   ![4.7](B:\pangpang\AP\2017暑假Java课外辅导\image\4.7.PNG)

```
见code  Session5 Dog.java 和DogInitial.java
```



 **Benefit of encapsulation**

1. Modularity: The source code for an object can be written and maintained independently of the source code. Once created, an object can be easily passed around inside the system.
2. Information-hiding: By interacting only with an object's methods, the details of its internal implementation remain hidden from the outside world.
3. Code re-use: If an object already exists(perhaps written by another software developer), you can use that object in your program. This allows specialists to implement/test/debug complex,task-specific objects, which you can then trust to run in your own code.
4. Pluggability and debugging ease: If a particular object turns out to be problematic, you can simply remove it from your application and plug in a different object as its replacement. This is analogous to fixing mechanical problems in the real world. If a bolt breaks,you replace *it*, not the entire machine.

------

**java中的包**

**包的作用：（和文件夹类似）**

1. 管理Java文件

2. 解决同名文件冲突

   -music  com.music.MyClassMusic

   -movie  com.movie.MyClassMusic

**定义包名  package 包名** （规范是全小写字母）

eg: com.test.MyClass

**系统中的包**

* java.(功能).(类)
* java.lang.(类)包含Java语言基础的类
* java.util.(类)包含Java语言各种工具类
* java.io.(类)    包含输入输出相关功能的类

**使用包**

import 包名

---

**The this keyword**

this 代表当前对象

this.属性 代表当前对象的属性

this.方法 调用当前对象的方法

 ````
见code 中Session5 Tele.java
//source中setter和getter自动生成器
//this 可以区分属性名和参数名
 ````

----

**Reference vs primitive data types**

![2.2](B:\pangpang\AP\2017暑假Java课外辅导\image\2.2.jpg)

​    **Primitive data type:** int, double… 

​    **Reference data types: **object

​    The way they are stored is different 

* **The null reference**：An uninitialized object variable 
  * NullpointerException

  ```
  见BankAccount test3Null.java
  ```

* 未初始化的变量：
  * local variable: compile-time error
  * instance variable 
    * primitive type: provide reasonable default values ( 0 for numbers, falsefor booleans)
    * ref. type: set to null

----

**Method parameters**

* **Formal vs Actual Parameters**

1. Formal Parameter(**Parameter**) --The header of a method defines the parameters of that method. Placeholder
2. Actual Parameter(**Argument**)—supplied by a particular method call in client program.

 **Note: **

* the number of arguments must **equal** the number of parameters
* the type of each arguments must be **compatible** with the type of each corresponding parameter 

```
见BankAccount TypeCompatible.java
```

**Passing primitive types as parameters**

Passed by value/ a new memory slot

```
见BankAccount test4Parameter.java
```

**Passing objects as parameters**

Copy the address

```java
见BankAccount test2Reference.java  ObjectParameter.java
```







 