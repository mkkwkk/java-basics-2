package pl.edu.wszib.app.mypackage;

import pl.edu.wszib.app.MyClass;
import pl.edu.wszib.app.MyInterface;
import pl.edu.wszib.app.MyInterface2;

public class MyClass2 extends MyClass implements MyInterface, MyInterface2 {
    public static final String MY_STATIC_FILED = "My static field";

//    public MyClass myClass;

    @Override
    public void run() {
//        myClass.run4();
        field3 = "Field3 from extended";
        run3();
    }

    @Override
    public void run2() {

    }

}
