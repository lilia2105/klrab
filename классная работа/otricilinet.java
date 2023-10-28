import java.util.Scanner;//Эта строка импортирует класс `Scanner`из пакета `java.util`.
// Класс `Scanner` используется для ввода данных из консоли.
public class otricilinet {//Создаем публичный класс с именем z2
        public static void main(String[] args) {//Этот метод `main` является точкой входа в программу.
            Scanner scanner = new Scanner(System.in);//Создадим объект класса `Scanner` с именем `scanner`, который будет использоваться для считывания данных из консоли.
            System.out.print("Введите число: ");//Эта строка выводит текст "Введите число: " на консоль
            int number = scanner.nextInt();//здесь пользователь вводит свое число и значение этого числа присваивается переменной number
            if (number < 0) {
                System.out.println("Число отрицательное");
            } else {
                System.out.println("Число неотрицательное");
            }
        }
    }

