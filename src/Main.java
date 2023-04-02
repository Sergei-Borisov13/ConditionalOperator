public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1 (){
        int age = 16;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");}
        else {
            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать");}}
    public static void task2 (){
        int temp = 10;
        if (temp < 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");}
        else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");}}
    public static void task3 (){
    int speed = 70;
    if (speed <= 60) {
        System.out.println("Если скорость " + speed + " то можно ездить спокойно");}
    else {
        System.out.println("Если скорость " + speed + " то придется заплатить штраф");}}
    public static void task4 () {
        int age = 20;
        if (age >= 2 && age <8) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад");
        } else if (age >=8 && age <18) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу");
        } else if (age >= 18 && age <24) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить на работу");
        }
    }
    public static void task5 () {
        int age = 15;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + " то ему нельзя кататься на аттракционе");
        } else if (age >=5 && age < 14) {
            System.out.println ("Если возраст ребенка равен " + age + " то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + " то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }
    public static void task6 () {
        int wagonCapacity = 102;
        int seating = 60;
        int passengers = 20;
        if (passengers < seating){
            System.out.println("в вагоне ещё есть сидячие места");}
        else if (passengers >= seating && passengers < wagonCapacity) {
            System.out.println("В вагоне остались стоячие места");
        } else if (passengers >= wagonCapacity) {
            System.out.println("В вагоне не осталось мест");
        }
       }
    public static void task7() {
        int one = 25;
        int two = 22;
        int three = 30;
        if (one > two && one > three){
            System.out.println( one + " самое большое число из трёх");}
        else if (two > one && two > three) {
            System.out.println( two + " самое большое число из трёх");
        } else if (three >one && three > two) {
            System.out.println( three + " самое большое число из трёх");
        }
    }
}