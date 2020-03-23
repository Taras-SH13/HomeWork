package homeworkGeneric;

public class Programm {

    public static void main(String[] args) {
        Number number1 = new Number(12); // создаем обьект номер 1 тип Number
        Number number2 = new Number(67); // создаем объект номер 2 тип Number
        MyList<Number> numberMyList = new MyList<Number>(); // создаем объект номер 1 тип numberMyList
        numberMyList.add(number1, number2); // вызываем метот добавляющий в список 2 объекта типа Number
        System.out.println(numberMyList.max(number1,number2)); // вызываем методы для сравнения щбїектов в списке
        System.out.println(numberMyList.min(number1,number2));

    }


}
