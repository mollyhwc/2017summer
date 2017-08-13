#### Session14 coping with errors



* 有异于常态，和正常情况不一样，有错误出现。阻止当前方法或作用域继续执行，称之为异常。（交试卷发现原来是正反面）

  * 出现异常，程序得不到正确的运行，导致不正常退出，有时候导致用户数据丢失，程序运行占用的资源得不到有效的释放。

  ![14.2](B:\pangpang\AP\2017暑假Java课外辅导\image\14.2.PNG)

  * 异常处理作用体现出来，通过异常处理将异常提示给用户或程序员，使本来中断了的程序以适当的方式运行或者退出，保存当前操作或者适当回滚，再把当前占用的资源释放掉。

* 例子:一个工厂，原料用完导致停工，没有人处理，最终无法按期交付导致损失大量客户。

![14.3](B:\pangpang\AP\2017暑假Java课外辅导\image\14.3.PNG)

处理：采购人员紧急处理，跟客户说明情况保证不耽误出货，最后拉闸断电关机器，将损失降到最小。

以上就是什么是异常以及作用意义。

![14.1](B:\pangpang\AP\2017暑假Java课外辅导\image\14.1.PNG)

Throwable,万恶之源，Java中所有不正常类都继承与它。

* Error:错误
  * 是程序无法处理的错误，表示运行应用程序中较严重问题。大多数错误与代码编写者执行的操作无关，而表示代码运行时 JVM（Java 虚拟机）出现的问题。例如，Java虚拟机运行错误（Virtual MachineError），当 JVM 不再有继续执行操作所需的内存资源时，将出现 OutOfMemoryError。这些异常发生时，表示你的程序崩溃了。
  * 对于工厂相当于停水停电机器坏了。
* Exception:编码、环境、用户操作输入出现问题。
  * RuntimeException
    * NullPointerException
    * ArithmeticException
    * ArrayIndexOutOfBoundException  

![14.4](B:\pangpang\AP\2017暑假Java课外辅导\image\14.4.PNG)

运行时异常会由Java虚拟机自动抛出并自动捕获，运行时候异常的出现说明代码有问题，应该调整代码。

**处理异常**

异常处理机制为：抛出异常，捕捉异常。

```
try {  
    // 可能会发生异常的程序代码  
} catch (Type1 id1){  
    // 捕获并处置try抛出的异常类型Type1  
}  
```

1. 关键词try后的一对大括号将一块可能发生异常的代码包起来，称为**监控区域**。
2.  Java方法在运行过程中出现异常，则创建异常对象。将异常抛出监控区域之外，由Java运行时系统试图寻找匹配的catch子句以捕获异常。若有匹配的catch子句,则运行其异常处理代码，try-catch语句结束。
3. 匹配的原则是：如果抛出的异常对象属于catch子句的异常类，或者属于该异常类的子类，则认为生成的异常对象与catch块捕获的异常类型相匹配。
4. 整个流程：出现异常，抛出异常的方法终止执行，程序的控制权交给catch块中异常处理程序，catch中的代码如何写可以根据具体情形，比如可以发出**警告**,提示用户或编程人员检查一些配置或者网络连接。或者记录一下错误日志

**捕捉throw语句抛出的“除数为0”异常。**

```java
public class TestException {  
    public static void main(String[] args) {  
        int a = 6;  
        int b = 0;  
        try { // try监控区域  
              
            if (b == 0) throw new ArithmeticException(); // 通过throw语句抛出异常  
            System.out.println("a/b的值是：" + a / b);  
        }  
        catch (ArithmeticException e) { // catch捕捉异常  
            System.out.println("程序出现异常，变量b不能为0。");  
        }  
        System.out.println("程序正常结束。");  
    }  
}  
运行结果：程序出现异常，变量b不能为0。

         程序正常结束。
```

* 在try监控区域通过if语句进行判断，当“除数为0”的错误条件成立时引发ArithmeticException异常，创建 ArithmeticException异常对象，并由throw语句将异常抛给Java运行时系统，由系统寻找匹配的异常处理器catch并运行相应异 常处理代码，打印输出“程序出现异常，变量b不能为0。”try-catch语句结束，继续程序流程。
* 事实上，“除数为0”等ArithmeticException，是RuntimException的子类。而运行时异常将由运行时系统自动抛出，不需要使用throw语句。



**try 会抛出很多类型的异常**

如果使用同一个catch会模糊不清，这时候使用多个catch块捕获多重不同的异常来对其进行处理。

```
try {  
    // 可能会发生异常的程序代码  
} catch (Type1 id1){  
    // 捕获并处置try抛出的异常类型Type1  
}  
catch (Type2 id2){  
     //捕获并处置try抛出的异常类型Type2  
}  
```

catch块要先子类再父类的顺序，来编写多重catch语句块，当程序抛出异常的时候，异常处理系统会就近的寻找匹配的异常处理程序，子类继承与父类，针对父类的异常处理程序子类也是适用的。

```
代码见 imooc_exception_demo InputException.java
```

