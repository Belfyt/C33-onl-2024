package lesson_2_homework;
class ArithmeticOperators {
    public static void main (String[] args){
        getTaskOne();
        getTaskTwo();
        getTaskThree();
        getTaskFour();
        getTaskFive();
        getTaskStar();
    }

    public static void getTaskOne() {
        System.out.println("-------------------------Задание 1--------------------------");
        int Bvalue = 4;
        int Cvalue = 3;
        int Avalue = 4*(Bvalue + Cvalue - 1)/2;
        System.out.println("Выводим значение А: " + Avalue);
    }
    public static void getTaskTwo(){
        System.out.println("-------------------------Задание 2--------------------------");
        int NValue = 64;
        int FirstDigit = NValue/10;
        int SecondDigit = NValue%10;
        int sum = FirstDigit + SecondDigit;
        System.out.println("Сумма цифр числа " + NValue + " равна " + sum);

    }
    public static void getTaskThree(){
        System.out.println("-------------------------Задание 3--------------------------");
        int NValue = 841;
        int FirstDigit = NValue/100;
        int SecondDigit = (NValue/10)%10;
        int ThirdDigit = NValue%10;
        int sum = FirstDigit+SecondDigit+ThirdDigit;
        System.out.println("Сумма цифр числа " + NValue + " равна " + sum);
    }
    public static void getTaskFour(){
        System.out.println("-------------------------Задание 4--------------------------");
        double NValue = 876.498;
        int BValue = (int) NValue;
        System.out.println("Округленное число " + BValue);
    }
    public static void getTaskFive(){
        System.out.println("-------------------------Задание 5--------------------------");
        int QValue = 21;
        int WValue = 8;
        int Division = QValue/WValue;
        int Remainder = QValue%WValue;
        System.out.println(QValue + " / " + WValue + " = " + Division + " и " + Remainder
                + " в остатке ");

    }
    public static void getTaskStar(){
        System.out.println("-------------------------Задание *--------------------------");
        int AValue = 1;
        int Bvalue = 2;
        AValue = AValue + Bvalue;
        Bvalue = AValue - Bvalue;
        AValue = AValue - Bvalue;
        System.out.println("Значение А после обмена " + AValue);
        System.out.println("Значение B после обмена " + Bvalue);
    }

}