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

    public static void task6() {
        System.out.println("Домашнее задание - Переменные. Урок 2");
        System.out.println("Задача 1");
        byte a = -10;
        System.out.println("Значение переменной а с типом byte = " + a);
        short b = 150;
        System.out.println("Значение переменной b с типом short = " + b);
        int c = 500;
        System.out.println("Значение переменной c с типом int = " + c);
        long d = 900L;
        System.out.println("Значение переменной d с типом long = " + d);
        float e = 0.2f;
        System.out.println("Значение переменной e с типом float = " + e);
        double f = 1.265;
        System.out.println("Значение переменной f с типом double = " + f);
    }
    public static void task7() {
        System.out.println("Задача 2");
        float a1 = 27.12f;
        System.out.println(a1);
        long b1 = 987678965549L;
        System.out.println(b1);
        double c1 = 2.786;
        System.out.println(c1);
        short d1 = 569;
        System.out.println(d1);
        short e1 = -159;
        System.out.println(e1);
        int f1 = 27897;
        System.out.println(f1);
        byte g1 = 67;
        System.out.println(g1);

        System.out.println("Задача 3");
        byte classL_P = 23;
        System.out.println("Людмила Павловна обучает класс из " + classL_P + " учеников");
        byte classA_S = 27;
        System.out.println("Анна Сергеевна обучает класс из " + classA_S + " учеников");
        byte classE_A = 30;
        System.out.println("Екатерина Андреевна обучает класс из " + classE_A + " учеников");
        short paper = 480;
        System.out.println("Три учительницы купили " + paper + " листов бумаги на три класса");
        int classPaper = paper / (classL_P + classA_S + classE_A);
        System.out.println("На каждого ученика рассчитано " + classPaper + " листов бумаги");

        System.out.println("Задача 4");
        byte startBottle = 16;
        byte twoMin = 2;
        System.out.println("Производительность машины для изготовления бутылок - " + startBottle + " бутылок за " + twoMin + " минуты");
        byte time20Min = 20;
        int bottle1 = time20Min / twoMin * startBottle;
        System.out.println("За 20 минут машина произвела " + bottle1 + " штук бутылок");
        int day = time20Min * 3 * 24;
        int bottle2 = day / twoMin * startBottle;
        System.out.println("За сутки машина произвела " + bottle2 + " штук бутылок");
        int day3 = day * 3;
        int bottle3 = day3 / twoMin * startBottle;
        System.out.println("За 3 дня машина произвела " + bottle3 + " штук бутылок");
        int month = day3 * 10;
        int bottle4 = month / twoMin * startBottle;
        System.out.println("За месяц машина произвела " + bottle4 + " штук бутылок");

        System.out.println("Задача 5");
        byte jars = 120;
        byte jarW = 2;
        byte jarB = 4;
        int classes = 120 / (jarW + jarB);
        int whiteJ = classes * jarW;
        int brownJ = jars - whiteJ;
        System.out.println("В школе, где " + classes + " классов, нужно " + whiteJ + " банок белой краски и " + brownJ + " банок коричневой краски");

        System.out.println("Задача 6");
        byte banana = 5;
        byte bananaWeight = 80;
        byte milk = 2;
        byte milkWeight = 105;
        byte ice = 2;
        byte iceWeight = 100;
        byte egg = 4;
        byte eggWeight = 70;
        int recipeGrams = (banana * bananaWeight) + (milk * milkWeight) + (ice * iceWeight) + (egg * eggWeight);
        System.out.println("Вес спортивного завтрака " + recipeGrams + " граммов");
        float recipeKg = recipeGrams / 1000f;
        System.out.println("Вес спортивного завтра " + recipeKg + " кг");

        System.out.println("Задача 7");
        byte fitOver = 7;
        short gramV1 = 250;
        short gramV2 = 500;
        int fitV1 = fitOver * 1000 / gramV1;
        System.out.println("Если спортсмен будет терять каждый день по " + gramV1 + " грамм, то на похудение уйдет " + fitV1 + " дней");
        int fitV2 = fitOver * 1000 / gramV2;
        System.out.println("Если спортсмен будет терять каждый день по " + gramV2 + " грамм, то на похудение уйдет " + fitV2 + " дней");
        int fitSr = (fitV1 + fitV2) / 2;
        System.out.println("В среднем потребуется " + fitSr + " день, чтобы добиться результата");

        System.out.println("Задача 8");
        int salaryMaria = 67760;
        System.out.println("Маша получает " + salaryMaria + " рублей в месяц");
        int salaryDenis = 83690;
        System.out.println("Денис получает " + salaryDenis + " рублей в месяц");
        int salaryKristina = 76230;
        System.out.println("Кристина получает " + salaryKristina + " рублей в месяц");
        int rate = 10;
        int increaseSalary_M = salaryMaria * (100 + rate) / 100;
        int incomeM = (increaseSalary_M - salaryMaria) * 12;
        System.out.println("Маша теперь получает " + increaseSalary_M + " рублей. Годовой доход вырос на " + incomeM + " рублей");
        int increaseSalary_D = salaryDenis * (100 + rate) / 100;
        int incomeD = (increaseSalary_D - salaryDenis) * 12;
        System.out.println("Денис теперь получает " + increaseSalary_D + " рублей. Годовой доход вырос на " + incomeD + " рублей");
        int increaseSalary_K = salaryKristina * (100 + rate) / 100;
        int incomeK = (increaseSalary_K - salaryKristina) * 12;
        System.out.println("Кристина теперь получает " + increaseSalary_K + " рублей. Годовой доход вырос на " + incomeK + " рублей");
    }

}