

public class _1_java {
    public static void main(String[] args) {
        //Сложение строк
        String hello = "Hello";
        String java = "java";
        System.out.println(hello + " " + java); //результат: Hello java

        //Сравнение строк
        System.out.println("Hello".equals(hello));//true
        System.out.println("java".equals(hello));//false

        //Сравнение строк без учета регистра
        System.out.println("HELLO".equalsIgnoreCase(hello));//true
        System.out.println("JAVA".equalsIgnoreCase(hello));//false

        //применение любого примитивного типа данных к строке
        //рассмотрим float и boolean, остальные аналогично
        System.out.println(String.valueOf(0.123F));//0.123
        System.out.println(String.valueOf(true));//true

        //перевод строки в число
        System.out.println(Integer.parseInt("9"));//9
        System.out.println(Double.parseDouble("0.1D"));//0.1

        //Разбиение строки на массивы
        String[] lettersArray = "A, B, C, D, ".split(", ");
        for (String letter : lettersArray) {
            System.out.println(letter);
            /*A
              B
              C
              D*/
        }

        //Поиск позиции в строке
        System.out.println("ABCDEFG".indexOf('C'));//2

        //Изменение регистра
        System.out.println("AbCdEfG".toLowerCase());//abcdefg
        System.out.println("AbCdEfG".toUpperCase());//ABCDEFG


        //Работа с классом StringBuilder
        // так же существует аналогичный ему класс StringBuffer, но у второго еще есть потокобезопасность

        StringBuilder alpha = new StringBuilder("alpha");

        //Приведение элемента StringBuilder к String
        String alphaString = alpha.toString();

        //Добавление элемента в конец
        System.out.println(alpha.append("h"));//было: alpha, стало:alphah

        //Добавление элемента по индексу
        System.out.println(alpha.insert(3, "U"));//было: alphah, стало:alpUhah

        //Удаление элемента строки по индексу
        System.out.println(alpha.deleteCharAt(1));//было: alpUhah, стало: apUhah

        //Удаление части строки с одной позиции до другой
        System.out.println(alpha.delete(0, 3));//было: apUhah, стало: hah

        //Замена части строки на другую
        //.replace(start int, end int, new String)
        System.out.println(alpha.replace(1, 3, " xo xo xo"));//было: hah, стало: h xo xo xo

        //Разворот строки
        System.out.println(alpha.reverse());//было: h xo xo xo, стало: ox ox ox h

        //Обрезка строки
        //с начала до опреленного символа
        System.out.println(alpha.substring(5));//было: ox ox ox h, стало:  ox h
        //с одного идекса до другого
        System.out.println(alpha.substring(2, 4));//было:  ox h, стало:  o
    }

}

