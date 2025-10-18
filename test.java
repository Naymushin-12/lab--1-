import java.util.Scanner;
import java.util.Random;
public class Test1 {
    public int sumLastNums(int x) {
        int x1=x%10;//получение последней цифры
        x/=10;
        int x2=x%10;//получение предпоследней цифры
        return x1+x2;
    }
    public boolean isPositive(int x) {
        return x >= 0;
    }
    public boolean isUpperCase(char x) {
        return Character.isUpperCase(x);

    }
    public boolean isDivisor(int a,int b) {
        if(a%b==0) {
            return true;
        }
        return (b % a) == 0;
    }
    public int lastNumSum(int a,int b) {
        int k1=a%10;
        int k2=b%10;
        return k1 + k2;
    }
    public double safeDiv(int x,int y) {
        if(y==0) {
            return 0;
        }
        return (double) x/y;
    }
    public String makeDecision(int x,int y) {
        if(x>y) {
            return x+">"+y;
        }
        if(x<y) {
            return x+"<"+y;
        }
        return x+"="+y;
    }
    public boolean sum3(int x,int y,int z) {
        return (z + x == y) || (x + y == z) || (y + z == x);
    }
    public String age(int x) {
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

    public void printDays(String x) {
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

    public String reverseListNums(int x) {
        String result="";
        for(int i=x;i>0;i--) {
            result+=i+" ";
        }
        return result;
    }

    public int pow(int x,int y) {
        int result=1;
        for(int i=0;i<y;i++) {
            result*=x;
        }
        return result;
    }
    public boolean equalNum(int x) {
        int last=x%10;//переменная для символов кажого разряда
        while(x>0) {
            int current=x%10;
            if(current!=last) {
                return false;
            }
            x/=10;
        }
        return true;
    }

    public void leftTriangle(int x) {
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();//переход на новую строку
        }
    }

    public void guessGame() {
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

    public int findLast(int[] arr,int x){
        for(int i=arr.length-1;i>=0;i--){//прохожу с конца списка
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }

    public int[]add (int[] arr, int x, int pos){
        int[]newArr=new int[arr.length+1];
        for(int i=0;i<pos;i++){
            newArr[i]=arr[i];
        }
        newArr[pos]=x;
        for(int i=pos;i<arr.length;i++){
            newArr[i+1]=arr[i];
        }
        return newArr;
    }

    public void reverse(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;//сдвиг указателей
            right--;
        }
    }

    public int[] concat(int[] arr1,int[] arr2){
        int[] result=new int[arr1.length+arr2.length];//новый массив размером как два
        for(int i=0;i<arr1.length;i++){
            result[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            result[arr1.length+i]=arr2[i];
        }
        return result;
    }

    public int[] deleteNegative(int[] arr){
        int positive=0;//число положительных элементов массива
        for (int j : arr) {
            if (j >= 0) {
                positive++;
            }
        }
        int[] result=new int[positive];//новый массив для положительных чисел
        int index=0;
        for(int num:arr){
            if(num>=0){
                result[index]=num;
                index++;
            }
        }
        return result;
    }



}
