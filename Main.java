import java.util.Scanner;
import java.util.Arrays;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        Scanner scanner= new Scanner(System.in);
        int choice;
        do{
            System.out.println("1.Сумма двух последних цифр числа");
            System.out.println("2.Положительное или отрицательное");
            System.out.println("3.Проверка на делители");
            System.out.println("4.Проверка на заглавную букву");
            System.out.println("5.Сумма последних цифр двух чисел");
            System.out.println("6.Безопасное деление");
            System.out.println("7.Сравнение двух чисел и возврат строки с результатом");
            System.out.println("8.Проверка, равна ли сумма двух чисел третьему");
            System.out.println("9.Определение правильного склонения для возраста");
            System.out.println("10.Вывод дней недели");
            System.out.println("11.Вывод чисел в обратном порядке");
            System.out.println("12.Степень числа");
            System.out.println("13.Проверка, все ли цифры в числе одинаковы");
            System.out.println("14.Левый треугольник");
            System.out.println("15.Игра "Угадай число"");
            System.out.println("16.Поиск последнего значения");
            System.out.println("17.Добавление в массив");
            System.out.println("18.Реверс");
            System.out.println("19.Объединение двух массивов");
            System.out.println("20.Удаление отрицательных элементов из массива");
            System.out.println("0.Выход");
            choice=scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Введите 1-ое целое число: ");
                    int number1 = scanner.nextInt();
                    System.out.println(test.sumLastNums(number1));
                    break;
                case 2:
                    System.out.print("Введите целое число: ");
                    int number2 = scanner.nextInt();
                    if(test.isPositive(number2)){
                        System.out.println("Число положительное");
                    }
                    else {
                        System.out.println("Число отрицательное");
                    }
                    break;
                case 3:
                    System.out.print("Введите 1-ое целое число: ");
                    int number3 = scanner.nextInt();
                    System.out.print("Введите 2-ое целое число: ");
                    int number4 = scanner.nextInt();
                    if (test.isDivisor(number3,number4)) {
                        System.out.println("Одно из чисел является делителем другого");
                    }
                    else{
                        System.out.println("Из двух чисел ни одно не является делителем другого");
                    }
                    break;
                case 4:
                    System.out.print("Введите букву: ");
                    String input=scanner.next();
                    char symbol=input.charAt(0);
                    if(test.isUpperCase(symbol)) {
                        System.out.println("Буква заглавная");
                    }
                    else {
                        System.out.println("Буква не является заглавной");
                    }
                    break;
                case 5:
                    System.out.println("Введите пары чисел: ");
                    for(int i=1;i<6;i++){
                        int num1 = scanner.nextInt();
                        int num2 = scanner.nextInt();
                        System.out.println("Сумма последнего разряда "+i+" пары чисел=" + test.lastNumSum(num1,num2));
                    }
                    break;
                case 6:
                    System.out.println("Введите два числа: ");
                    int divNum1 = scanner.nextInt();
                    int divNum2 = scanner.nextInt();
                    System.out.println("Результат: "+ test.safeDiv(divNum1,divNum2));
                    break;
                case 7:
                    System.out.println("Введите два числа: ");
                    int strNum1 = scanner.nextInt();
                    int strNum2 = scanner.nextInt();
                    System.out.println("Результат: "+ test.makeDecision(strNum1,strNum2));
                    break;
                case 8:
                    System.out.println("Введите три числа: ");
                    int sumNum1 = scanner.nextInt();
                    int sumNum2 = scanner.nextInt();
                    int sumNum3 = scanner.nextInt();
                    System.out.println("Результат: "+test.sum3(sumNum1,sumNum2,sumNum3));
                    break;
                case 9:
                    System.out.println("Введите число: ");
                    int ageNum = scanner.nextInt();
                    System.out.println("Результат: "+test.age(ageNum));
                    break;
                case 10:
                    System.out.println("Введите день недели: ");
                    String day = scanner.next().toLowerCase();
                    System.out.println("Результат: ");
                    test.printDays(day);
                    break;
                case 11:
                    System.out.println("Введите целое число: ");
                    int reverseNum = scanner.nextInt();
                    System.out.println("Результат: "+test.reverseListNums(reverseNum));
                    break;
                case 12:
                    System.out.println("Введите целое число, которое хотите возвести в степень: ");
                    int degNum = scanner.nextInt();//число возводимое в степень
                    System.out.println("Введите степень: ");
                    int degree = scanner.nextInt();//степень
                    System.out.println("Результат: "+test.pow(degNum,degree));
                    break;
                case 13:
                    System.out.println("Введите число: ");
                    int equal=scanner.nextInt();
                    System.out.println("Результат: "+test.equalNum(equal));
                    break;
                case 14:
                    System.out.println("Введите число: ");
                    int treeNum=scanner.nextInt();
                    System.out.println("Результат: ");
                    test.leftTriangle(treeNum);
                    break;
                case 15:
                    test.guessGame();
                    break;
                case 16:
                    int[] arr1= Test1.createArr();
                    System.out.println("Введите число для поиска: ");
                    int findNum=scanner.nextInt();
                    System.out.println("Результат: "+test.findLast(arr1,findNum));
                    break;
                case 17:
                    int[] arr2= Test1.createArr();
                    System.out.println("Введите число для вставки в массив: ");
                    int addNum=scanner.nextInt();//добавление числа в массив
                    System.out.println("Укажите позицию для вставки: ");
                    int pos=scanner.nextInt();//указатель позиции для вставки
                    int[] result1=test.add(arr2,addNum,pos);
                    System.out.println(Arrays.toString(result1));
                    break;
                case 18:
                    int[] arr3= Test1.createArr();
                    test.reverse(arr3);
                    System.out.println(Arrays.toString(arr3));
                    break;
                case 19:
                    int[] arr4= Test1.createArr();
                    int[] arr5= Test1.createArr();
                    int[] result2=test.concat(arr4,arr5);//создание массива с результатом объединения
                    System.out.println(Arrays.toString(result2));
                    break;
                case 20:
                    System.out.println("Удалить негатив: ");
                    int[] arr6= Test1.createArr();
                    int[] result3=test.deleteNegative(arr6);
                    System.out.println(Arrays.toString(result3));
                    break;
                case 0:
                    System.out.println("Выход из программы");
                    break;
                default:
                    System.out.println("Неверный выбор, выберите пункт от 0 до 20");
            }
        }while (choice!=0);
    }
}
