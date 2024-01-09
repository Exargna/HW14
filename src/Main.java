import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите любое целое не отрицательное число: ");
        int input = new Scanner(System.in).nextInt();
        System.out.println(avg(input));
    }

    public static double avg(int num) {
        //Как сделать из числа строку:
        String numStr = String.valueOf(num);
        //Создаем переменную, которая будет принимать в себя результат сложения.
        double sum = 0;
        //Используем цикл, делаем i = 0 по причине того, что массив начинается с нулевого индекса
        //i < numStr.length, чтобы цикл не заходил дальше длины массива
        for (int i = 0; i < numStr.length(); i++) {
            //Извлекает число из индекса(индекс выяснялся через i++) идет преобразование в строку(String.valueOf)
            //Далее, полученная строка (символ) преобразуется в целое число(Integer.parseInt)
            sum += Integer.parseInt(String.valueOf(numStr.charAt(i)));
        }
        return sum / numStr.length();
    }
}
