package class37;
//interface i just like an abstract class cannot be initialized
//interface cannot be marked final => bc the whole point of interface is to
//be IMPLEMENTED(extended)
//cannot be declared private or protected

//Why do we need interfaces?
//Interfaces are needed to tell the subclasses what they must do
//but not how to do it.
//Interfaces are very similar to abstract classes
//but the biggest difference is that
//abstract classes can have characteristics(instance variables)
//whereas in interfaces you only have behavior(methods).

public interface FirstInterface {
    //in abstract classes you have to declare the method abstract explicitly
    //whereas in interfaces methods are by default public and abstract
    //one of the best coding practices is to remove redundant code.
    public abstract /* <- by default*/  void play();
}
