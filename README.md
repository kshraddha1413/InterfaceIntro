Like a class, interfaces in Java can have methods and variables, but the methods declared in interface are by default abstract (only method signature, no body).

Interfaces specify what a class must do and not how. It is the blueprint of the class.
An Interface is about capabilities like a Player may be an interface and any class implementing Player must be able to (or must implement) move(). So it specifies a set of methods that the class has to implement.
If a class implements an interface and does not provide method bodies for all functions specified in the interface, then class must be declared abstract.
A Java library example is, Comparator Interface. If a class implements this interface, then it can be used to sort a collection.

Why do we use interface ?

It is used to achieve total abstraction.
Since java does not support multiple inheritance in case of class, but by using interface it can achieve multiple inheritance .
It is also used to achieve loose coupling.
Interfaces are used to implement abstraction. So the question arises why use interfaces when we have abstract classes?
The reason is, abstract classes may contain non-final variables, whereas variables in interface are final, public and static.

We can’t create instance(interface can’t be instantiated) of interface but we can make reference of it that refers to the Object of its implementing class.
A class can implement more than one interface.
An interface can extends another interface (but only one interface).
A class that implements interface must implements all the methods in interface.
All the methods are public and abstract. And all the fields are public, static, and final.
It is used to achieve multiple inheritance.
It is used to achieve loose coupling.

New Features:
1)We can now add default implementation for interface methods. This default implementation has special use and does not affect the intention behind interfaces.
2)we can now define static methods in interfaces which can be called independently without an object. Note: these methods are not inherited.
