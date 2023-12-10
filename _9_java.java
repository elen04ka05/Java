import java.lang.reflect.Method;

class MyClass {
    public void myMethod() {
        System.out.println("Hello world");
    }
}
public class _9_java {
    public static void main(String[] args) throws Exception {
        //Получаем объект Class по имени класса
        Class<?> clazz = Class.forName("MyClass");
        //Создаем экземпляр класса с использованием конструктора по умолчанию
        Object instance = clazz.getDeclaredConstructor().newInstance();
        String methodName = "myMethod";
        //Получаем объект Method по имени метода
        Method method = clazz.getDeclaredMethod(methodName);
        //Вызываем метод
        method.invoke(instance);
        //Вывод:Метод myMethod() был вызван
    }
}
