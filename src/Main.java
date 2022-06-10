public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------------");
        System.out.println("-                         Home Works                           -");
        System.out.println("----------------------------------------------------------------");
        homeWork1();
        homeWork2();
        homeWork3();
        homeWork4();
        homeWork5();
        homeWork6();
        homeWork7();
    }
    public static  void homeWork1(){

        int clientOS=0;
        System.out.println("Home work 1");
        if (clientOS==0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS==1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("----------------------------------------------------------------");
    }
    public static  void homeWork2(){
        int clientDeviceYear=2014;
        int clientOS=1;
        System.out.println("Home work 2");

        if (clientOS==0 ){
            if (clientDeviceYear>2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }else System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS==1){
            if (clientDeviceYear>2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        System.out.println("----------------------------------------------------------------");
    }
    public static  void homeWork3(){
        int year=2021;
        System.out.println("Home work 3");
        if (year%4==0){
            if (year%100!=0||year%400==0){
                System.out.println(year+" год является високосным");
            }else System.out.println(year+" год не является високосным");
        }else System.out.println(year+" год не является високосным");
        System.out.println("----------------------------------------------------------------");
    }

    public static  void homeWork4(){
        int deliveryDistance = 95;
        int deliveryDays;
        System.out.println("Home work 4");
        if (deliveryDistance<20){
            deliveryDays=1;
            System.out.println("Потребуется дней: " + deliveryDays);
        }else {
            deliveryDays=(int)Math.ceil((double) (deliveryDistance-20)/40.0)+1;
            System.out.println("Потребуется дней: " + deliveryDays);
        }
        System.out.println("----------------------------------------------------------------");
    }
    public static  void homeWork5(){
        int monthNumber = 11;
        String season;
        System.out.println("Home work 5");

        switch (monthNumber) {
            case (1):
                season="Зима";
                break;
            case (2):
                season="Зима";
                break;
            case (12):
                season="Зима";
                break;
            case (3):
                season="Весна";
                break;
            case (4):
                season="Весна";
                break;
            case (5):
                season="Весна";
                break;
            case (6):
                season="Лето";
                break;
            case (7):
                season="Лето";
                break;
            case (8):
                season="Лето";
                break;
            case (9):
                season="Осень";
                break;
            case (10):
                season="Осень";
                break;
            case (11):
                season="Осень";
                break;
            default:
                season="Выбран не верный номер месяца";
                break;
        }
        System.out.println("Месяц "+monthNumber+" "+season);
        System.out.println("----------------------------------------------------------------");



    }
    public static  void homeWork6(){

        int age = 19;
        int salary = 58_000;
        double koefLimit;
        int credit;
        System.out.println("Home work 6");
        if (salary>=50_000) {
            koefLimit = 1.3;
        }
        if (salary>=80_000){
            koefLimit=1.5;
        }else koefLimit=1;
        if(age<23){
            credit=(int)(salary*2*koefLimit);
        }else credit=(int)(salary*3*koefLimit);
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом "+credit+" рублей");


        System.out.println("----------------------------------------------------------------");
    }
    public static  void homeWork7(){
        int age = 25;
        int salary = 60_000;
        int wantedSum = 330_000;
        double creditRate=10;
        double creditMonthPay;
        double maxCreditMonthPay;
        System.out.println("Home work 7");


        if (age<30&&age>=23){
            creditRate=creditRate+0.5;
        }
        if (age<23){
            creditRate=creditRate+1;
        }

        if (salary>80_000){
            creditRate=creditRate-0.7;
        }
        creditMonthPay=((wantedSum*creditRate/100.0)+wantedSum)/12;
        maxCreditMonthPay=(double)salary/2;
        System.out.println("Максимальный платеж при ЗП "+salary+" равен "+maxCreditMonthPay+" рублей.");
        if (creditMonthPay>maxCreditMonthPay){
            System.out.println("Платеж по кредиту "+creditMonthPay+" рублей. Отказано.");
        } else System.out.println("Платеж по кредиту "+creditMonthPay+" рублей. Одобрено.");
        System.out.println("----------------------------------------------------------------");
    }
}