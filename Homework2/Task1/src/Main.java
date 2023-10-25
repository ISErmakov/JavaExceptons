import java.util.Scanner;

//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
// вместо этого, необходимо повторно запросить у пользователя ввод данных.
public class Main {
    public static void main(String[] args) {
        System.out.println(getFloat());
        }
    private static float getFloat(){
        System.out.println("Enter float");
        Scanner sc = new Scanner(System.in);
        float res = 0;
        try{
            res = sc.nextFloat();
        } catch (Exception e){
            e.printStackTrace();
            return getFloat();
        }
        return res;
    }
}