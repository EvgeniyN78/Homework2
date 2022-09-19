public class Main {
    public static void main(String[] args) {

        //task 1
        System.out.println("Задание 1.");
        var dog = 8.0;//из-за ошибки в третьем задании, пришлось изменить значение переменной с 8 на 8.0
                      //можно было бы для исправления ошибки, изменить тип переменной с var на double.
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        //task 2
        System.out.println("Задание 2.");
        dog = dog +4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        //task 3
        System.out.println("Задание 3.");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        //task 4
        System.out.println("Задание 4.");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //task 5
        System.out.println("Задание 5.");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //task 6
        System.out.println("Задание 6.");
        var weightOfTheFirstBoxer = 78.2;
        var weightOfTheSecondBoxer = 82.7;
        var totalWeight = weightOfTheFirstBoxer + weightOfTheSecondBoxer;
        System.out.println("Общий вес двух боксёров " + totalWeight + " кг.");

        var weightDifference = weightOfTheSecondBoxer - weightOfTheFirstBoxer;
        System.out.println("Разница в весе " + weightDifference + " кг.");

        //task 7
        System.out.println("Задание 7.");
        var weightDifference1 = weightOfTheSecondBoxer - weightOfTheFirstBoxer;
        System.out.println("Разница в весе (с помощью вычитания) " + weightDifference1 + " кг.");
        var weightDifference2 = weightOfTheSecondBoxer % weightOfTheFirstBoxer;
        System.out.println("Разница в весе (с помощью остатка от деления) " + weightDifference2 + " кг.");

        //task 8
        System.out.println("Задание 8.");
        var totalHoursOfOperation = 640;
        var workingHoursOfOneEmployee = 8;
        var numberOfEmployees = totalHoursOfOperation / workingHoursOfOneEmployee;
        System.out.println("Всего работников в компании – " + numberOfEmployees + " человек.");

        numberOfEmployees = numberOfEmployees + 94;
        totalHoursOfOperation = numberOfEmployees * workingHoursOfOneEmployee;
        System.out.println("Если в компании работает " + numberOfEmployees + " человека, то всего " + totalHoursOfOperation + " часа работы может быть поделено между сотрудниками.");

    }
}