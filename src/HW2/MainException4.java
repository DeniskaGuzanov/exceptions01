//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
// Далее запросить повторный ввод строки

package HW2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainException4 {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст");
        try {
            String result = reader.readLine();
            if (result.equals("")) throw new RuntimeException("Пустую строку вводить нельзя");

            System.out.println(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
