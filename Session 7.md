### Session 7

### ABSTRACT CLASS

* 抽象类是父类。为什么有抽象类的概念？因为父类中的

- definition: an abstract class is a superclass that represents **an abstract concept**. And should not be instantiated.(**不能被实例化**)
- abstract methods:`public abstract double area();`
  - no implementation code,just a header
  - a placeholder
  - every subclass need to override this method.
- if a class contains any abstract methods,it must be declared an abstract class.

`public abstract class AbstractClass{.......}`

- if a subclass does not provide implementation code for all abstract methods,it must become an abstract class.

  `public abstract class SubClass extends AbtractClass{......}`

- note: 

  - it is possible for an abstract class to have no abstracts methods.
  - an abstract class may or may not have constructors.

```
见package shape
```



------

### INTERFACES

- definition: a collection of related methods whose headers are provided without implementation. All of the methods are both public and abstract.  （default methods are new in java8）
- example:  flyingObject /computable 
- a class  **implements** an interface need to implement **all the methods** in the interface.
- if cannot implement all the method,the class must be declared abstract.

```
public interface FlyingObject{

void fly();

boolean is Flying();

}
```

```
pulic class Bird implements FlyingObject{
  .....
}
```

```
public class Mosqutio extends Insect implements FlyingObject{
  .....
}
```

- Note:

  - the extends clause must precede the implements clause.

  - a class can have only  one superclass, but can implement any number of interfaces:

    ```
    public class SubClass extends SuperClass implements Interface1,Interface2,.......
    ```

    ```
    见code package  project5
    ```

------

### Interface vs. Abstract class

1. Use an abstract class for an object is application-specific but incomplete without its subclass.
2. Using an interface when its method are suitable for your program but could be equally applicable in variety of programs.
3. An interface does not provide any implementations for its methods(before java8),whereas an abstract class does.
4. An interface cannot contain instance variables,whereas an abstract class can .
5. It is not possible to create an instance of an interface object or an abstract class object.

------

### summary

* design , create ,modify a class that ` implements ` an interface
* explain the difference between the following concepts:
  - an abstract class and an interface
