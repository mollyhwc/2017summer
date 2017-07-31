### Session 4：  Class and Objects

1. 对象的概念
2. 什么是面向对象
3. 类
4. 什么是对象的属性
5. 什么是对象的方法
6. 类与对象的关系与区别

---

##### Object  万物皆对象

* An object is a software bundle of related state and behavior.

##### Class 类

* Blueprint for implementing objects.An object is a single instance of the class.
* In java, a variable that represents an object is called an **object reference**.

![4.1](B:\pangpang\AP\2017暑假Java课外辅导\image\4.1.PNG)





![4.2](B:\pangpang\AP\2017暑假Java课外辅导\image\4.2.png)

**定义一个类的步骤：**

1. 定义类名
2. 编写类的属性
3. 编写类的方法

```
public class 类名{
  //定义属性部分（成员变量）
  属性1类型 属性1；
  属性2类型 属性2；
  ...
  //定义方法部分
  方法1
  方法2
  ...
}
```

```
code见session4  Dog.java
```

思考：身边还有哪些是对象？这台电脑有什么属性和行为？

**practice**:买手机~~写一个Phone类,属性：screen,cpu,mem,方法：call(),sendMessage();

---

**类中的变量类型**

- **局部变量**：
  - 在**方法、构造方法或者语句块**中定义的变量被称为局部变量。
  - 变量声明和初始化都是在方法中，方法结束后，变量就会自动销毁。

- **成员变量**：
  - 成员变量是定义在**类中，方法体之外**的变量。
  - 这种变量在创建对象的时候实例化。
  - 成员变量可以被类中方法、构造方法和特定类的语句块访问。
  - 初始化时系统赋予默认的值。

  ```
  见scope Scope.java 
  ```

  ​

- **类变量**：类变量也声明在类中，方法体之外，但必须声明为static类型。
  - **Comparison between static and non-static :**
    -  When the class is loaded ,member variable is initialized, associated with the class.
    -  A static variable separately divided a storage space, the storage space is shared by all objects of a class.
    -  When created a new object, non-static variables are divided storage space.
    -  className.staticVariable objectName.nonstaticVariable

    ````java
    见session4  static.java 和staticInitial.java
    ````

**成员变量和局部变量区别：**

* 作用范围不同：局部变量作用域仅限于定义他的方法。成员变量作用域在整个类的内部可以看见。
* 初始值不同：会给成员变量赋一个初始值，而局部变量没有初始值
* 在同一个方法中，不允许同名的局部变量。不同方法允许名字相同。
* 两类变量同名时，局部变量具有更高优先级。

```
见code Session VariableScope.java
读code  ---package scope
```

---

**Methods**

![4.4](B:\pangpang\AP\2017暑假Java课外辅导\image\4.4.png)

**Keywords—access specifier**

1. **Public**

​       Public class is usable by all client programs.Public methods are accessible to all client program.

2. **Private**

   Private variables can be access only by methods of that class.

 ![4.3](B:\pangpang\AP\2017暑假Java课外辅导\image\4.3.png)

 ```
见code Session4 Method.java
 ```

同一类中方法调用直接调用函数名。

**Method overloading**

define:In the same class have the same name but different parameter lists.

![4.5](B:\pangpang\AP\2017暑假Java课外辅导\image\4.5.png)

what is the method’s signature？

* Method’s name and a list of parameter types。
* The return type of the method is irrelevant.
* Error: two methods with identical signature but different return.

```
见code package-----overloding.java
```



**Type of methods**

1. **Constructor** 定义在Java类中一个用来初始化对象的方法

   * How to identify: 

     * The **same name **as the class, and **no return type**.
     * **default constructor has no parameters**: provides reasonable initial/default values for an object.
     * **the constructor with parameters**:初始化对象成员变量的值。

     ![4.6](B:\pangpang\AP\2017暑假Java课外辅导\image\4.6.PNG)

   * Functionality

     *   Implicitly called when creating an object(instance) of/instantiating/initializing a class. 
     *   new operator returns the address in memory of the newly constructed object.

   * Example

     *   BankAccount b = newBankAccount()
     *   ​    b stores the address of BankAccount object. Not the object itself.

     ````java
     见code BankAccount.java
     ````

2. ACCESSORS

   Access a class object without altering the object. Return some information about object

3. MUTATORS

​    Change the state of an object by modifying at least one of its instance variables.

```
见code package---BankAccount.BankAccont.java
```



**Static methods vs instance methods**

1. Instance methods: all operate on individual object of a class.
2. Static methods: a method that performs an operation for the entire class. Not individual object.
3. Recall instance method, object.methodname();Recall static methods, classname.methodname();

**Static methods in a driver class**

​    A class contains main() is used to test other class.

​    Create no objects. 

```java
见session4 static.java 和 staticInitial.java
```

---

**如何使用Java对象**

1. 创建对象 `类名 对象名=new 类名()；   Dog dog=new Dog();`

2. 使用对象

   引用对象的属性：对象名.属性 `dog.color="white"`

   引用对象的方法：对象名.方法名() `dog.barking()`

```java
见code session4 DogInitial.java
```

