
package HW2;
public class MainException2_3 {


    //Если необходимо, исправьте данный код
    // Задание 2
    //try {
    //   int d = 0;
    //   double catchedRes1 = intArray[8] / d;
    //   System.out.println("catchedRes1 = " + catchedRes1);
    //} catch (ArithmeticException e) {
    //   System.out.println("Catching exception: " + e);
    //}

    public static void number(){
        try {
            int[] intArray = new int[]{1,2,3,4,5,6,7,8,9};
            int d =0;
            double catchRes1 = intArray[8] / d;
            System.out.println("catchRes1 = " + catchRes1);
        }catch (ArithmeticException e){
            System.out.println("Catching exception: " + e);
        }
    }

//Задание 3
//
//public static void main(String[] args) throws Exception {
//        try {
//        int a = 90;
//        int b = 3;
//        System.out.println(a / b);
//        printSum(23, 234);
//        int[] abc = { 1, 2 };
//        abc[3] = 9;
//        } catch (Throwable ex) {
//        System.out.println("Что-то пошло не так...");
//        } catch (NullPointerException ex) {
//        System.out.println("Указатель не может указывать на null!");
//        } catch (IndexOutOfBoundsException ex) {
//        System.out.println("Массив выходит за пределы своего размера!");
//        }
//        }
//public static void printSum(Integer a, Integer b) throws FileNotFoundException {
//        System.out.println(a + b);
//        }



    public static void main(String [] args)throws Exception{
        number_1();
    }

    public static void number_1(){
        try {
            int a = 90;
            int b =  3;
            System.out.println(a / b );
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        }catch (NullPointerException ex){
            System.out.println("Указатель не может указывать на null");
        }catch (IndexOutOfBoundsException ex){
            System.out.println("Массив выходит за пределы своего размера! ");
        }catch (Throwable ex){
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b){
        System.out.println(a+b);
    }
}





