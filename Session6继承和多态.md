- **concept**

  - class and object

  - private\public\static

    ```
    //BankAccount.java
    public class BankAccount{
      public static void print(){
        、、、
      }
    }

    //main.java
    BankAccount b1=new BankAccount();
    b1.print();
    ```

    right or wrong????	

  - all parameter in java are passed by value.

  - method overload

    - two overloaded methods in the same class must have parameters with different name. ??
    - two different constructors in a given class can have the same number of parameters. ??

  - references 

    ```
    int a=2;
    int b=a;

    BankAccount b1=new BankAccount();
    BankAccount b2=b1;
    BankAccount b3=new BankAccount();
    ```

  - scope 

    - during execution of the method,the parameters are local to the method. 
    - any changes made to the parameters will not affect the value of the arguments in the calling program. 
    - when the method is exited,the local memory slots for parameters are eased.

  - formal vs actual parameter

    - ```
      //BankAccount.java
      public class BankAccount(){
        public void print(int account,string password){
          \\\
        }
      }

      //main.java
      BankAccount b1=new BankAccount();
      b1.print(2222.00,"skdhsdjs",222);
      ```

      right or wrong?? why???

## Session 6 Inheritance and Polymorphism

#### Inheritance

- definition: defines a relationship between objects that share characteristics.

- specifically, a new class (**subclass**) is created from an existing class( **superclass**)

- 狗类--动物   儿子---父亲

  ![inheritance1](B:\pangpang\AP\2017暑假Java课外辅导\image\inheritance1.jpg)

  ![inheritance2](B:\pangpang\AP\2017暑假Java课外辅导\image\inheritance2.PNG)

- Inheritance Hierarchy: "is- a" relationship/transitive/arrow/opposite is not true

- Benefit: code reuse/ subclass only need to focus on new code required.

  ------

  #### Implementing Subclasses

  - keyword: ``extends``

  - inheriting instance methods and variables:

    - Subclasses **do not** inherit the **private instance variable** or **private methods** of their superclass.
    - objects of subclass contain memory for private instance variables,even though they cannot access them directly.
    - a subclass can invoke **public accessor or mutator** . 

  - class on the same level in a hierarchy diagram do not inherit anything from each other.​

    ------

    #### Method overriding

  - definition: a method in  superclass is overridden in a subclass by definition a method with same return type and signature(name and parameter types)

  - partial overriding ：subclass method wants to do what superclass does,plus something extra.

    `super.computeGrade()`

  - private methods cannot be overridden。

    ```java
    见package session6---Shape.java and Circle.java
    ```

    ------

    ### constructors and `super`

    - **constructors are never inherited!**

    - if no constructors in subclass?

      - the superclass default constructor with no parameter is generated.
      - superclass only have a constructor with parameter,**error**.

    - a subclass method can be implemented with call the super method.

      - super()/super(type parameter).

      - note : super is used in subclass constructor,must be used in **first line.**

      - if no constructors is provided in the subclass,the compiler provides the following default constructors.

        ```
        public SubClass(){
          super();
        }
        ```

        ````
        见package  inheritance
        ````

------

### declaring subclass objects

​    **valid**

​	`Student s =new Student();`

​	`Student g =new GradStudent();`

​	`Student u=new UnderGrad();`

- a GraderStudent is-a student; a UnderStudent is-a studet;

  `s.setGrade("pass"）;`

  `g.setGrade("pass");`

- superclass does not inherit from a subclass.

  `g.setGrade("Pass");`

  `u.setGrade("pass")`

- GradStudent and UnderStudent both inherit the setGrade() from Student.

**Invalid**

 `s.getID();`

` u.getID();`

- a student is not necessarily a GradStudent nor an UnderStudent.

------

### polymorphism

- definition: a method has been overridden in at least one subclass. eg,computeGrade

- it is the mechanism of selecting the appropriate method for a particular object.

- method calls are always determined by **the type of actual object**,not the type of object reference.

  `s.computeGrade()`

  `g.computeGrade()`

  `u.computeGrade()`

  - selection of the correct method occurs during **run of the program**.

  ````
  见package Student test.java
  ````

  ##### Dynamic Binding(late Binding)

- definition: making a run-time decision about which instance method to call.

- contrast overloaded && overridden

  - overloaded:
    - select correct overloaded method at compile time by comparing **method signature**
    - static binding,early binding
  - overridden:
    - definition a method with same return type and signature(name and parameter types) in subclass.
    - actual method is called **not** by the compiler.
    - the compiler determines if a method can be called (such is legal??),while the run-time environment determines if it will be called.
  - using super in a subclass -----**coding**

------

### type compatibility

#### Downcasting

`Student s =new GradStudent();`

`GradStudent g=new GradStudent()`

`int x=s.getID()`

`int y =g.getID()`

***ERROR!!!***

- WHY??
  - Student class does not have a getID() method 
  - at compile time,only nonprivate methods of Student class can appear to the right of the dot operator.
- Resolve
  - casting s to the correct type: `int x =((GradStudent)s).getID();`
- definition: Casting a **superclass** to a **subclass** type is called a **downcast**.
- Note: `int x=(GradStudent)s.getID();` cause error!! 
  - dot operator has higher precedence than casting.

### type rules for polymorphic method calls

`SuperClass a=new SubClass()`

`a.method(b)`

- type of a at compile time is SuperClass, at run time is SubClass.
- at compile time ,method must be found in the class(SuperClass) of a,if not, u need an explicit cast.
- for a polymorphism method,at run time the actual type of a is determined.
- the type of b is checked at compile time.

------

### The ClassCastException

- definition: a run-time exception thrown to cast an object to a class of which is not an instance.

  `Student u =new UnderGrad()`

  `System.out.println((String)u)`   ClassCastException

  `int x =((Gradstudent)u).getID()`

  ---

  ##### summary


- u can write subclass ,given any superclass.

- super:both in writing constructors and calling methods of superclass.

- understand polymorphism : when methods have been overridden in at least one subclass.

- explain the difference between the following concepts:

  - an overloaded method and overridden methods
  - dynamic binding (late binding ) and static binding (early binding )

  ​