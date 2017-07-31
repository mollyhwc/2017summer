#### Session 1 :welcome and chapter 1

* Guideline

  *  Spend some time and practice more after class
  *  Feedback to me, if you feel uncomfortable
  *  Don't trust me, sometimes…  Always listen to your faithful friend, IDE!

* Let's start!

  * java 历史
  * 核心概念：JVM 、JDK、 JRE
  * 搭建Java开发环境
  * 使用工具开发Java程序
  * 经验技巧分析

* RECOMMEND!

  AP JAVA 课件网站：http://edu.nju.edu.cn/moodle/course/view.php?id=3

  Java资源大全中文版 http://t.cn/R4AAViR
  Java 程序员必读的 9 本书 http://t.cn/R4AAwgE
  Java 必须会的编码规范 http://t.cn/R4AAGPE
  Google Java 编程风格指南 http://t.cn/R4AAqjD

---

ABOUT JAVA

* HISTORY

  JAVA是在1995年由sun公司推出的一门高级编程语言，至今20年左右，但是发展是很快的，2009年Oracle公司收购sun公司，

  * ![1.1](B:\pangpang\AP\2017暑假Java课外辅导\image\1.1.PNG)

在Java的整个体系当中，最基础的部分就是Javase部分，Java的标准版本。me微型版本，ee企业版本。都是从se发展出来的一套规范。

![1.2](B:\pangpang\AP\2017暑假Java课外辅导\image\1.2.PNG)

 	

**JVM (Java virtual Machine)**

myProgram.java(源代码文件)----compiler（编译器）-->myProgram.class(二进制的字节码文件，与平台无关)------ interpreter(解释器)----->myProgram

JVM 中包含了解释器，跨平台通过jvm实现的。

example：想吃鱼~，去菜市场买了一条鱼， 鱼相当于源文件，这个鱼能吃么？？是吃不了的。用菜刀处理鱼，开肠刮肚，去鱼鳞，去腮，杀鱼过程相当于编译器对源代码进行编译，杀完的鱼类似于生成的字节码文件，杀了的鱼可以直接吃吗？虽然已经被直接杀过了，还是不能吃，这是需要用灶具对于进行红烧清蒸。

![1.3](B:\pangpang\AP\2017暑假Java课外辅导\image\1.3.PNG)

**JDK**  :  JAVA Development kit(Java 开发工具包)

没有jdk就没法进行Java的开发

JDK包含的基本组件包括：

javac – 编译器，将源程序转成字节码

jar – 打包工具，将相关的类文件打包成一个文件

javadoc – 文档生成器，从源码注释中提取文档

jdb – debugger，查错工具

java – 运行编译后的java程序（.class后缀的）

appletviewer：小程序浏览器，一种执行HTML文件上的Java小程序的Java浏览器。

Javah：产生可以调用Java过程的C过程，或建立能被Java程序调用的C过程的头文件。

Javap：Java反汇编器，显示编译类文件中的可访问功能和数据，同时显示字节代码含义。

Jconsole: Java进行系统调试和监控的工具



**JRE** ： JAVA Runtime Environment(java 运行时环境)  如果想只运行Java程序，要确保已安装相应的JRE。

它包括Java虚拟机（jvm）、Java核心类库和支持文件。它不包含开发工具(JDK)--编译器、调试器和其它工具。

![1.4](B:\pangpang\AP\2017暑假Java课外辅导\image\1.4.PNG)

**JAVA 开发环境的搭建**

https://www.ntu.edu.sg/home/ehchua/programming/howto/EclipseJava_HowTo.html

1. install jdk
2. 配置环境变量
   1. JAVA_HOME  配置jdk安装路径
   2. PATH              配置jdk命令文件的位置（bin目录）
   3. CLASSPATH   配置类库文件的位置（lib目录）(**格式**:     .;路径    )
   4. 配置好打开cmd命令输入Java
3. download eclipse
4. unzip
5. NOTE:正常安装在c盘一个Java的文件夹，jdk文件夹包括 bin,jre




---

#### 使用记事本编写Java程序

![1.5](B:\pangpang\AP\2017暑假Java课外辅导\image\1.5.PNG)

1. 新建helloWorld.Java

   ​

2. ```java
   public class helloJava{
   	public static void main(String[] args){
   	System.out.println("hello world");
   	}
   }
   ```

3. 找到所在目录，在cmd中输入Javac helloWorld.java

4. 执行字节码文件。

   ```java
   java helloWorld.class  //error
   java helloWorld       //correct
   //执行字节码文件的时候，Java命令后不能跟文件后缀。
   ```

   ​

   -----

   #### ECLIPSE 介绍

   IDE（Integrated Development Environment ，集成开发环境） 工具

   * 将开发调试集成在一起提高开发效率。
   * 类似的：MyEclipse  NetBeans.
   * 下载eclipse时候需根据不同平台下载不同软件包

   Java程序开发：

   1. 创建Java项目 （ 为什么创建项目呢？）
   2. 创建程序包 （便于源代码的管理）
   3. 编写Java源程序 （IDE可以自动生成一些代码）
   4. 运行Java程序

   ----

   #### 程序的移植

   查看属性位置-----拷贝------import

   ​

   -----

   #### 嘱咐

   1. 多练习 日常练习网站http://codingbat.com/java
   2. 多问
   3. 自己动手，调试错误
   4. 复习和总结
   5. 学虽容易，学好不易。

