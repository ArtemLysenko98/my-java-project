public class Calculator {
 public static String calculate(int a, char o, int b){
         if(o == '+') {
             return String.valueOf(a + b);
         } else if (o == '-') {
                 return String.valueOf(a-b);
         } else if (o == '*') {
             return String.valueOf(a*b);
         } else if (o == '/') {
             return String.valueOf(a/b);
         } else {
             return "Goodbye";
         }

 }
}


// Консоль писать число + ентер + опрератор + число = результат
// 1. Метод який приймає 3 числа (число, оператор, число).
// 2. Потрібно створити цикл і умова щоб вийти.
// 3. Потрібно пободувати ланцюг умов. "
// 4. Буде 4 оператора (/*-+).