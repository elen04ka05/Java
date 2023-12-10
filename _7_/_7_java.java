package _7_;

public class _7_java {
    public static <T> void swapValues(Wrapper<T> obj1, Wrapper<T> obj2) {
        T temp = obj1.getValue();
        obj1.setValue(obj2.getValue());
        obj2.setValue(temp);
    }

    public static void main(String[] args) {
        Wrapper<Double> obj1 = new Wrapper<>(6.9);
        Wrapper<Double> obj2 = new Wrapper<>(11.2);

        System.out.println("Before swap:");
        System.out.println("obj1 value: " + obj1.getValue()); // Вывод: 6.9
        System.out.println("obj2 value: " + obj2.getValue()); // Вывод: 11.2

        // Обмен значениями
        swapValues(obj1, obj2);

        System.out.println("After swap:");
        System.out.println("obj1 value: " + obj1.getValue()); // Вывод: 11.2
        System.out.println("obj2 value: " + obj2.getValue()); // Вывод: 6.9
    }
}
