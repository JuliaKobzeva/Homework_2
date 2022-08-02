public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }
    public static void task1() {
        byte aaa = 10;
        short bbb = 1_000;
        int ccc = 100_000;
        long ddd = 1_000_000_000_000_000L;
        float eee = 5.7f;
        double fff = 5.7777777;
        boolean sentence = true;
        char c = 'c';
        System.out.println(aaa);
        System.out.println(bbb);
        System.out.println(ccc);
        System.out.println(ddd);
        System.out.println(eee);
        System.out.println(fff);
        System.out.println(sentence);
        System.out.println(c);

    }

    public static void task2() {

        float Weight1 = 78.2f;
        float Weight2 = 82.7f;
        float Weight3 = Weight1 + Weight2;
        float WeightDifference = Math.abs(Weight1 - Weight2);
        System.out.println("Общий вес боксеров " + Weight3 + " кг");
        System.out.println("Разница между весом бойцов " + WeightDifference + " кг");

    }

    public static void task3() {

        short bananaWeight = 80;
        short milkWeight = 105;
        short icecreamWeight = 100;
        short eggWeight = 70;
        short banana = 5;
        short milk = 2;
        short icecream = 2;
        short egg = 4;
        int breakfastWeight = (bananaWeight * banana) + (milkWeight * milk) + (icecreamWeight * icecream) + (eggWeight * egg);
        System.out.println(breakfastWeight);
        double Kg = breakfastWeight / (1000 * 1.0);
        System.out.println(Kg);

    }

    public static void task4() {

        int WeightLoss = 7000;
        int Days1 = WeightLoss / 250;
        int Days2 = WeightLoss / 500;
        double Days3 = (Days1 + Days2) / (2*1.0);
        int TimeDifference = Days2 % Days1;
        System.out.println("При потере веса 250 г в день спорсмен похудеет за " + Days1 + " дней");
        System.out.println("При потере веса 500 г в день спорсмен похудеет за " + Days2 + " дней");
        System.out.println("В среднем ему потребуется " + Days3 + " дней");
        System.out.println("Разница между диетами " + TimeDifference + " дней");

    }

    public static void task5() {

        int MashaSalary1 = 67_760;
        int DenisSalary1 = 83_690;
        int KristinaSalary1 = 76_230;
        int MashaSalaryIncrease = MashaSalary1 / 100 * 10;
        int DenisSalaryIncrease = DenisSalary1 / 100 * 10;
        int KristinaSalaryIncrease = KristinaSalary1 / 100 * 10;
        int MashaSalary2 = MashaSalary1 + MashaSalaryIncrease;
        int DenisSalary2 = DenisSalary1 + DenisSalaryIncrease;
        int KristinaSalary2 = KristinaSalary1 + KristinaSalaryIncrease;
        int MashaSalaryYear1 = MashaSalary1 * 12;
        int DenisSalaryYear1 = DenisSalary1 * 12;
        int KristinaSalaryYear1 = KristinaSalary1 * 12;
        int MashaSalaryYear2 = MashaSalary2 * 12;
        int DenisSalaryYear2 = DenisSalary2 * 12;
        int KristinaSalaryYear2 = KristinaSalary2 * 12;
        int MashaSalaryDifference = MashaSalaryYear2 % MashaSalaryYear1;
        int DenisSalaryDifference = DenisSalaryYear2 % DenisSalaryYear1;
        int KristinaSalaryDifference = KristinaSalaryYear2 % KristinaSalaryYear1;
        System.out.println("Маша получает " + MashaSalary2 + " рублей. " + "Ее годовой доход " + MashaSalaryYear2 + " рублей. " + "Это больше, чем в прошлом году на  " + MashaSalaryDifference + " рублей.");
        System.out.println("Денис получает " + DenisSalary2 + " рублей. " + "Его годовой доход " + DenisSalaryYear2 + " рублей. " + "Это больше, чем в прошлом году на  " + DenisSalaryDifference + " рублей.");
        System.out.println("Кристина получает " + KristinaSalary2 + " рублей. " + "Ее годовой доход " + KristinaSalaryYear2 + " рублей. " + "Это больше, чем в прошлом году на  " + KristinaSalaryDifference + " рублей.");

    }
}