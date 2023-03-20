public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);// код для задачи 1
        System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper); // код для задачи 2
        System.out.println("Задача 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper); // код для задачи 3
    }

    public static void task2() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }

    public static void task3() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task4() {
        System.out.println("Задача 6");
        var BoxerWeight1 = 78.2;
        System.out.println("Вес первого боксера " + BoxerWeight1 + " кг");
        var BoxerWeight2 = 82.7;
        System.out.println("Вес второго боксера " + BoxerWeight2 + " кг");
        var fullWeight = BoxerWeight1 + BoxerWeight2;
        System.out.println("Общий вес бойцов составил " + fullWeight + " кг");
        var differenceWeight = BoxerWeight1 - BoxerWeight2;
        System.out.println("Разница между бойцами составила " + differenceWeight + " кг");
        System.out.println("Задача 7");
        var weightDifference = BoxerWeight2 - BoxerWeight1;
        System.out.println(weightDifference);
        var remainderWeight = (BoxerWeight2 % BoxerWeight1);
        System.out.println(remainderWeight);
    }
    public static void task5() {
        System.out.println("Задача 8");
        var workTime = 640;
        System.out.println("Всего " + workTime + " рабочих часов");
        var employeeWork = 8;
        System.out.println("Каждый сотрудник работает " + employeeWork + " часов");
        var totalEmployees = workTime / employeeWork;
        System.out.println("Всего работников в компании - " + totalEmployees + " человек");
        var newTeam = 94;
        var fullTeam = totalEmployees + newTeam;
        var newWorkTime = fullTeam * employeeWork;
        System.out.println("Если в комании работает " + fullTeam + " человека, то всего " + newWorkTime + " часов работы может быть поделено между сотрудниками");
    }
}