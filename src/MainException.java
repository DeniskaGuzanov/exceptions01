//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainException {
    public static void main (String[] args){
        number(10, 0);
        number1(null);
        File file = new File("file.txt");
        file1(file);

        int [] array1 = new int[]{1,2,3,4,5,6,7,8,9,10};
        int [] array2 = new int[]{1,2,3,4,1,2,3,2,5,10};
    System.out.println("Первый массив " + Arrays.toString(array1));
    System.out.println("Второй массив " + Arrays.toString(array2));
    System.out.println("Частное двух массивов" + array(array1, array2));


    }


    public static void number(int a, int b){
        try {
            int result = a / b ;
            System.out.println(result);
        } catch (ArithmeticException e){
            System.out.println("На ноль делить нельзя");
        }
    }

    public static void number1 (String a){
        String b = null;

        try {
            System.out.println(b.charAt(0));
        }catch (NullPointerException e){
            System.out.println("Вы обратились к элементу нулевого обьекта, null ничего не представляет");
        }
    }

    public static void file1 (File file){
        try {
            Scanner scanner = new Scanner(file);

        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }
    }

    public static int sum2d(String[][] arr){
        int sum = 0; for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val; }
        } return sum;
    }

    //Еслм заданое значение массива не принадлежит допустимому диапазону,
    // то ArrayIndexOutOfBoundsException
    //Если строка, которая, как предпологалось должна содержать представление числа,
    //не отвечает этому требованию, то NumberFormatException



   // Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
    // и возвращающий новый массив, каждый элемент которого равен частному
    // элементов двух входящих массивов в той же ячейке.
    // Если длины массивов не равны, необходимо как-то оповестить пользователя.
    // Важно: При выполнении метода единственное исключение, которое пользователь может увидеть -
    // RuntimeException

    public static ArrayList<Float> array(int[] array1, int[] array2){
        ArrayList<Float> result = new ArrayList<>();
        int min = Math.min(array1.length , array2.length);
        int max = Math.max(array1.length, array2.length);
        if (min < max){
            throw new RuntimeException("Длины массивов не равны");
        }
        for (int i = 0; i < min; i++){
            if(array2 [i] != 0){
                result.add((float) (array1[i] / array2 [i]));
            }else {
                throw new RuntimeException("Нельзя делить на ноль");
            }
        }
        return result;

    }

}