import java.util.Scanner;
import java.util.Random;
public class Test1 {
    public int sumLastNums(int x) { //сумма двух последних цифр числа
        int x1=x%10;//получение последней цифры
        x/=10;
        int x2=x%10;//получение предпоследней цифры
        return x1+x2;
    }
    public boolean isPositive(int x) { //проверка на положительность
        return x >= 0;
    }
    public boolean isDivisor(int a,int b) { //проверка на делители
        if(a%b==0) {
            return true;
        }
        return (b % a) == 0;
    }
    public boolean isUpperCase(char x) { //проверка на заглавную букву
        return Character.isUpperCase(x);

    }
    public int lastNumSum(int a,int b) { //сумма последних цифр двух чисел
        int k1=a%10;
        int k2=b%10;
        return k1 + k2;
    }
    public double safeDiv(int x,int y) { //безопасное деление (с проверкой деления на ноль)
        if(y==0) {
            return 0;
        }
        return (double) x/y;
    }
    public String makeDecision(int x,int y) { //сравнение двух чисел и возврат строки с результатом
        if(x>y) {
            return x+">"+y;
        }
        if(x<y) {
            return x+"<"+y;
        }
        return x+"="+y;
    }
    public boolean sum3(int x,int y,int z) { //проверка, равна ли сумма двух чисел третьему
        return (z + x == y) || (x + y == z) || (y + z == x);
    }
    public String age(int x) { //определение правильного склонения для возраста
        int last=x%10;//для последней цифры
        int lastTwo=x%100;//для последних двух цифр
        if(lastTwo>=11&&lastTwo<=14) {
            return x+" лет";
        }
        if(last==1) {
            return x+" год";
        }
        if((last==2)||(last==3)||(last==4)) {
            return x+" года";
        }
        return x+" лет";
    }

    public void printDays(String x) {//вывод дней недели начиная с введённого дня
        switch(x) {
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("это не день недели");
        }
    }

    public String reverseListNums(int x) { //вывод чисел в обратном порядке
        String result="";
        for(int i=x;i>0;i--) {
            result+=i+" ";
        }
        return result;
    }

    public int pow(int x,int y) { //Возведение числа в степень
        int result=1;
        for(int i=0;i<y;i++) {
            result*=x;
        }
        return result;
    }
    public boolean equalNum(int x) { //проверка, все ли цифры в числе одинаковы
        int last=x%10;//переменная для символов кажого разряда
        while(x>0) {
            int current=x%10;
            if(current!=last) {
                return false; //если нашлась отличающаяся цифра
            }
            x/=10;
        }
        return true; //все цифры одинаковы
    }

    public void leftTriangle(int x) { //вывод левого треугольника из звездочек
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();//переход на новую строку
        }
    }

    public void guessGame() { //Игра
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        int randNum=random.nextInt(10);//случайное число от 1 до 10
        int count=0;//попытки
        int guess;//попытка угадать
        do{
            System.out.println("Введите число от 0 до 9: ");
            guess=scanner.nextInt();
            count++;
            if(guess==randNum){
                System.out.println("Вы угадали!");
            } else{
                System.out.println("Вы не угадали, введите число от 0 до 9: ");
            }
        }while(guess!=randNum);
        System.out.println("Вы отгадали числа за "+count+" попыток");
    }
    //статический метод для создания массива с пользовательским вводом
    public static int[] createArr(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int size=scanner.nextInt();
        int[] arr=new int[size];
        System.out.println("Введите элементы массива: ");
        for(int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
        return arr;
    }

    public int findLast(int[] arr,int x){ //поиск последнего вхождения числа в массиве
        for(int i=arr.length-1;i>=0;i--){ //прохождение с конца списка
            if(arr[i]==x){
                return i; //возвращаем индекс найденного элемента
            }
        }
        return -1; //если элемент не найден
    }

    public int[]add (int[] arr, int x, int pos){ //добавление элемента в массив на указанную позицию
        int[]newArr=new int[arr.length+1]; //новый массив на 1 элемент больше
        for(int i=0;i<pos;i++){ //копируем элементы до позиции вставки
            newArr[i]=arr[i];
        }
        newArr[pos]=x; //вставляем новый элемент
        for(int i=pos;i<arr.length;i++){ //копируем оставшиеся элементы
            newArr[i+1]=arr[i];
        }
        return newArr;
    }

    public void reverse(int[] arr){ //реверс массива (переворот элементов на месте)
        int left=0;
        int right=arr.length-1;
        while(left<right){ //меняем местами элементы
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;//сдвиг указателей
            right--;
        }
    }

    public int[] concat(int[] arr1,int[] arr2){ //объединение двух массивов
        int[] result=new int[arr1.length+arr2.length]; //новый массив размером как два
        for(int i=0;i<arr1.length;i++){ //копируем первый массив
            result[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){ //копируем второй массив
            result[arr1.length+i]=arr2[i];
        }
        return result;
    }

    public int[] deleteNegative(int[] arr){ //даление отрицательных элементов из массива
        int positive=0; //число положительных элементов массива
        for (int j : arr) { //считаем количество положительных элементов
            if (j >= 0) {
                positive++;
            }
        }
        int[] result=new int[positive];//новый массив для положительных чисел
        int index=0;
        for(int num:arr){ //заполняем новый массив положительными числами
            if(num>=0){
                result[index]=num;
                index++;
            }
        }
        return result;
    }



}
