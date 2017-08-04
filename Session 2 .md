#### Session 2

##### review

1. 在控制台运行一个 Java 程序 Test . java ，使用的命令是?
2. 在控制台运行一个 Java 程序 Test . class ，使用的命令是?

---



#### Java基础语法介绍

* keywords

  ![2.4](B:\pangpang\AP\2017暑假Java课外辅导\image\2.4.PNG)

下面列出了Java保留字。这些保留字不能用于常量、变量、和任何标识符的名称。（中国 美国）

| 关键字          | 描述                                       |
| ------------ | ---------------------------------------- |
| abstract     | 抽象方法，抽象类的修饰符                             |
| assert       | 断言条件是否满足                                 |
| boolean      | 布尔数据类型                                   |
| break        | 跳出循环或者label代码段                           |
| byte         | 8-bit 有符号数据类型                            |
| case         | switch语句的一个条件                            |
| catch        | 和try搭配捕捉异常信息                             |
| char         | 16-bit Unicode字符数据类型                     |
| class        | 定义类                                      |
| const        | 未使用                                      |
| continue     | 不执行循环体剩余部分                               |
| default      | switch语句中的默认分支                           |
| do           | 循环语句，循环体至少会执行一次                          |
| double       | 64-bit双精度浮点数                             |
| else         | if条件不成立时执行的分支                            |
| enum         | 枚举类型                                     |
| extends      | 表示一个类是另一个类的子类                            |
| final        | 表示一个值在初始化之后就不能再改变了表示方法不能被重写，或者一个类不能有子类   |
| finally      | 为了完成执行的代码而设计的，主要是为了程序的健壮性和完整性，无论有没有异常发生都执行代码。 |
| float        | 32-bit单精度浮点数                             |
| for          | for循环语句                                  |
| goto         | 未使用                                      |
| if           | 条件语句                                     |
| implements   | 表示一个类实现了接口                               |
| import       | 导入类                                      |
| instanceof   | 测试一个对象是否是某个类的实例                          |
| int          | 32位整型数                                   |
| interface    | 接口，一种抽象的类型，仅有方法和常量的定义                    |
| long         | 64位整型数                                   |
| native       | 表示方法用非java代码实现                           |
| new          | 分配新的类实例                                  |
| package      | 一系列相关类组成一个包                              |
| private      | 表示私有字段，或者方法等，只能从类内部访问                    |
| protected    | 表示字段只能通过类或者其子类访问子类或者在同一个包内的其他类           |
| public       | 表示共有属性或者方法                               |
| return       | 方法返回值                                    |
| short        | 16位数字                                    |
| static       | 表示在类级别定义，所有实例共享的                         |
| strictfp     | 浮点数比较使用严格的规则                             |
| super        | 表示基类                                     |
| switch       | 选择语句                                     |
| synchronized | 表示同一时间只能由一个线程访问的代码块                      |
| **this**     | 表示调用当前实例或者调用另一个构造函数                      |
| throw        | 抛出异常                                     |
| throws       | 定义方法可能抛出的异常                              |
| transient    | 修饰不要序列化的字段                               |
| try          | 表示代码块要做异常处理或者和finally配合表示是否抛出异常都执行finally中的代码 |
| **void**     | 标记方法不返回任何值                               |
| volatile     | 标记字段可能会被多个线程同时访问，而不做同步                   |
| **while**    | while循环                                  |

```java
public class HelloWorld {
    public static void main(String[] args){
		System.out.println("hello imooc");
	}
}
```

---

* **identifiers**

a name for a variable, constant, user-defined method, or user-defined class

```java
package com.imooc;
public class Demo{
  	public static void main(String[] args){
      System.out.println("hello imooc");
  	}
}
```

1. Letters, digits,  underscore(_) and $，不能包含 @、%、空格等其它特殊字符

2. May not begin with a digit  `123name`错的！

3. Case-sensitive 

4. Concise and self-documenting 

   website:https://en.wikipedia.org/wiki/Naming_convention_(programming)#Java

   命名规范十分十分重要！！！！


练习：

```
123nike    my home       hi*huhu      _sun     hi$hi
```

----

形如：

`type identifier [ = value][, identifier [= value] ...] ;[, identifier [= value] ...] ;`

##### variables

```java
public class HelloWorld{
    public static void main(String[] args) {
		String hobby="java";
		System.out.println(hobby);
	}
}
```

在 Java 中，我们通过三个元素描述变量：**变量类型、变量名**以及**变量值**。

![2.1](B:\pangpang\AP\2017暑假Java课外辅导\image\2.1.jpg)

把变量比作房间，要存储的数据相当于住宿的客人。客人可以要求住标间或者总统套件，我们可以根据房间的信息查询客人的信息。

为什么需要变量名？？(类似域名)

```
int a =22222;
int b=333333;
System.out.println(22222+333333);
System.out.println(22222-333333);
System.out.println(22222*333333);
System.out.println(22222/333333);

System.out.println(a+b);
System.out.println(a-b);
System.out.println(a*b);
System.out.println(a/b);
System.out.println(a%b);
```

---

##### data types



![2.2](B:\pangpang\AP\2017暑假Java课外辅导\image\2.2.jpg)

**byte：**

- byte 数据类型是8位、有符号的，以二进制补码表示的整数；
- 最小值是 -128（-2^7）；
- 最大值是 127（2^7-1）；
- 默认值是 0；
- byte 类型用在大型数组中节约空间，主要代替整数，因为 byte 变量占用的空间只有 int 类型的四分之一；
- 例子：byte a = 100，byte b = -50。
- 补码反码http://blog.csdn.net/u011080472/article/details/51280919

**short：**

- short 数据类型是 16 位、有符号的以二进制补码表示的整数
- 最小值是 -32768（-2^15）；
- 最大值是 32767（2^15 - 1）；
- Short 数据类型也可以像 byte 那样节省空间。一个short变量是int型变量所占空间的二分之一；
- 默认值是 0；
- 例子：short s = 1000，short r = -20000。

**int：**

- int 数据类型是32位、有符号的以二进制补码表示的整数；
- 最小值是 -2,147,483,648（-2^31）；
- 最大值是 2,147,483,647（2^31 - 1）；
- 一般地整型变量默认为 int 类型；
- 默认值是 0 ；
- 例子：int a = 100000, int b = -200000。

**long：**

- long 数据类型是 64 位、有符号的以二进制补码表示的整数；
- 最小值是 -9,223,372,036,854,775,808（-2^63）；
- 最大值是 9,223,372,036,854,775,807（2^63 -1）；
- 这种类型主要使用在需要比较大整数的系统上；
- 默认值是 0L；
- 例子： long a = 100000L，Long b = -200000L。
  "L"理论上不分大小写，但是若写成"l"容易与数字"1"混淆，不容易分辩。所以最好大写。

**float：**

- float 数据类型是单精度、32位。
- float 在储存大型浮点数组的时候可节省内存空间；
- 默认值是 0.0f；
- 浮点数不能用来表示精确的值，如货币；
- 例子：float f1 = 234.5f。

**double：**

- double 数据类型是双精度、64 位。
- 浮点数的默认类型为double类型；
- double类型同样不能表示精确的值，如货币；
- 默认值是 0.0d；
- 例子：double d1 = 123.4。

**boolean：**

- boolean数据类型表示一位的信息；
- 只有两个取值：true 和 false；
- 这种类型只作为一种标志来记录 true/false 情况；
- 默认值是 false；
- 例子：boolean one = true。

**char：**

- char类型是一个单一的 16 位 Unicode 字符；
- 最小值是 \u0000（即为0）；
- 最大值是 \uffff（即为65,535）；
- char 数据类型可以储存任何字符；
- 例子：char letter = 'A';。

----

* 十进制 123=123
* 八进制 0123
* 十六进制 0x123
* 进制之间的转化



```java
//姓名：张三	性别：男
//中奖数字：18	价格：120.5
//确认要关闭程序吗：true	 
public class HelloWorld{
    public static void main(String[] args) {
		String name="张三";
		char sex='男';
		int num=18;
		double price=120.5;
		boolean isOK=true;
		System.out.println(name);
		System.out.println(sex);
		System.out.println(num);
		System.out.println(price);
		System.out.println(isOK);
	}
}
```

在 Java 的领域里**，基本数据类型变量**存的是**数据本身**，而**引用型变量**存的是保存**数据的空间地址**。

基本数据类型变量里存储的是直接放在抽屉里的东西，而引用数据类型变量里存储的是这个抽屉的钥匙，钥匙和抽屉一一对应。	

* 变量需要注意的事项

```
见summer session2 Variable.java
```

---

#####  TYPE CONVERSION类型转换



![2.3](B:\pangpang\AP\2017暑假Java课外辅导\image\2.3.PNG)

在Java中，整数类型（byte/short/int/long）中，对于未声明数据类型的整形，其默认类型为int型。在浮点类型（float/double）中，对于未声明数据类型的浮点型，默认为double型。

Note:

- 不能对boolean类型进行类型转换。
- 在把容量大的类型转换为容量小的类型时必须使用强制类型转换。
- 转换过程中可能导致溢出或损失精度，例如：

```
int i =128;   
byte b = (byte)i;
```

-  浮点数到整数的转换是通过舍弃小数得到，而不是四舍五入，例如：

````java
(int)23.7 == 23;		
(int)-45.89f == -45
````

```
见summer session2 Convert.java
```



**ARITHMETIC EXPRESSIONS**

1. If either operand is a **double**, then the other is converted to double.

2. Otherwise, if either operand is a **float**, then the other is converted to float.

3. Otherwise, if either operand is a **long**, then the other is converted to a long.

4. Otherwise, both are converted to int.

   ```java
   3.0 /4
   3 / 4
   (int) 3.0 / 4
   (double) (3/4)
   ```

---

##### comments

```java
package com.test;
//import packagename.subpackagename.ClassName 
//import packagename.subpackagename.*
/**
 *注解
 *@author haungweicong
 *@version 1.0
 */

public class HelloWorld {
   /* 这是第一个Java程序
    *它将打印Hello World
    * 这是一个多行注释的示例
    */
    public static void main(String []args){
       // 这是单行注释的示例
       /* 这个也是单行注释的示例 */
       System.out.println("Hello World"); 
    }
}
```

空白行或者被注释掉的行都会被忽略。

##### CONSTANT常量

一种特殊变量，设置之后不允许改变,使用关键字final。

```java
final String LOVE="JAVA"
final int number=5;
//more ...
//try in eclipse
//见session2 Final.java
```

---

##### Escape Sequences转义字符

作用：避免二义性。

```
\b：退格
\n：换行
\t：制表符，相当于tab键
\r：回车
\\：表示反斜杠
\'：表示单引号
\"：表示双引号
\x表示后面的字符是十六进制
\0表示后面的字符是八进制数
```

```java
\n，换行符
如果在字符串中间直接按回车，java是不会对字符串做换行操作的，因为他不知道你想将代码分两行写还是字符串分两行显示，这时候就需要在字符串中间加上\n转义字符来将字符串换行。
" " 是字符串中的""，还是表示字符串的结尾。
```

-----

##### operator

* Arithmetic operators

A的值为10，变量B的值为20：

| 操作符  | 描述                 | 例子              |
| ---- | ------------------ | --------------- |
| +    | 加法 - 相加运算符两侧的值     | A + B 等于 30     |
| -    | 减法 - 左操作数减去右操作数    | A – B 等于 -10    |
| *    | 乘法 - 相乘操作符两侧的值     | A * B等于200      |
| /    | 除法 - 左操作数除以右操作数    | B / A等于2        |
| ％    | 取模 - 左操作数除以右操作数的余数 | B%A等于0          |
| ++   | 自增: 操作数的值增加1       | B++ 或 ++B 等于 21 |
| --   | 自减: 操作数的值减少1       | B-- 或 --B 等于 19 |

* Increment and Decrement Operators

Diff between prefix(++i) and postfix(i++): side effect before/after evaluation

```java
public class selfAddMinus{
    public static void main(String[] args){
        int a = 5;//定义一个变量；
        int b = 5;
        int x = 2*++a;
        int y = 2*b++;
        System.out.println("自增运算符前缀运算后a="+a+",x="+x);
        System.out.println("自增运算符后缀运算后b="+b+",y="+y);
    }
}
```

* Relational operators

  A的值为10，变量B的值为20：

  | 运算符  | 描述                               | 例子           |
  | ---- | -------------------------------- | ------------ |
  | ==   | 检查如果两个操作数的值是否相等，如果相等则条件为真。       | （A == B）为假   |
  | !=   | 检查如果两个操作数的值是否相等，如果值不相等则条件为真。     | (A != B) 为真。 |
  | >    | 检查左操作数的值是否大于右操作数的值，如果是那么条件为真。    | （A> B）非真。    |
  | <    | 检查左操作数的值是否小于右操作数的值，如果是那么条件为真。    | （A <B）为真。    |
  | >=   | 检查左操作数的值是否大于或等于右操作数的值，如果是那么条件为真。 | （A> = B）为假。  |
  | <=   | 检查左操作数的值是否小于或等于右操作数的值，如果是那么条件为真。 | （A <= B）为真。  |



* Logical operators

  | 操作符   | 描述                             | 例子             |
  | ----- | ------------------------------ | -------------- |
  | &&    | 称为逻辑与运算符。当且仅当两个操作数都为真，条件才为真。   | （A && B）为假。    |
  | \| \| | 称为逻辑或操作符。如果任何两个操作数任何一个为真，条件为真。 | （A \| \| B）为真。 |
  | ！     | 称为逻辑非运算符。用来反转操作数的逻辑状态。         | ！（A && B）为真。   |

  ​

* Assignment operator

| 操作符  | 描述                             | 例子                      |
| ---- | ------------------------------ | ----------------------- |
| =    | 简单的赋值运算符，将右操作数的值赋给左侧操作数        | C = A + B将把A + B得到的值赋给C |
| + =  | 加和赋值操作符，它把左操作数和右操作数相加赋值给左操作数   | C + = A等价于C = C + A     |
| - =  | 减和赋值操作符，它把左操作数和右操作数相减赋值给左操作数   | C - = A等价于C = C - A     |
| * =  | 乘和赋值操作符，它把左操作数和右操作数相乘赋值给左操作数   | C * = A等价于C = C * A     |
| / =  | 除和赋值操作符，它把左操作数和右操作数相除赋值给左操作数   | C / = A等价于C = C / A     |
| ％=   | 取模和赋值操作符，它把左操作数和右操作数取模后赋值给左操作数 | C％= A等价于C = C％A         |
| << = | 左移位赋值运算符                       | C << = 2等价于C = C << 2   |
| >> = | 右移位赋值运算符                       | C >> = 2等价于C = C >> 2   |
| ＆=   | 按位与赋值运算符                       | C＆= 2等价于C = C＆2         |
| ^ =  | 按位异或赋值操作符                      | C ^ = 2等价于C = C ^ 2     |
| \| = | 按位或赋值操作符                       | C \| = 2等价于C = C \| 2   |

```java
int a1=9;
int a2=9;
int a3=9;
a1>>=1; //4
a2>>=2; //2
a3<<=2;//18
```

Q:    == VS =    ???

**precedence**

![2.6](B:\pangpang\AP\2017暑假Java课外辅导\image\2.6.PNG)

**practice**

![2.7](B:\pangpang\AP\2017暑假Java课外辅导\image\2.7.PNG)

answer:0      0011      0001       00010001

---

**summary**

* keywords
* identifier
* variable
* data type
* type conversion
* comments
* escape sequence
* constant
* operator
* precedence

