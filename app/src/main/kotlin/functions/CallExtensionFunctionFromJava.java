package functions;

import lambdas.Car;

/**
 * Created by jesse on 11/16/19.
 * This is a part of the project Mastering Kotlin.
 */
public class CallExtensionFunctionFromJava {

    public void callExtensionFunction() {
        Car car = new Car("xyz", 2010);
        //car.isOld(); // Does not work from Java
        boolean isOld = ExtensionsFunctionsKt.isOld(car);
    }
}
