package HW2;//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainException1 {
    public static void main (String [] args){
            boolean number = true;
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            while (number){
                System.out.println("Введите дробное число, через точку: ");
                try{
                    float floatNumber = Float.parseFloat(reader.readLine());
                    System.out.printf("Введенное число равно %f\n", floatNumber);
                    number = false;
                }catch (IOException |NumberFormatException e){
                    System.out.println("Неверный ввод. Введите дробное число");
                }
            }
        }
    }

