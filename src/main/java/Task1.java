public class Task1 {
    //посчитать факториал числа n
    //0.5 балла - если посчитаете в цикле
    //1 балл - если посчитаете рекурсией
    public static int fact(int n) {
        if (n == 2)
            return n;
        return n * fact(n - 1);
    }

    //вывести таблицу умножения на экран - 1 балл
    //подсказка - использовать двойной for
    public static void table() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++)
                System.out.print(i * j + "\t");
            System.out.println();
        }
    }

    //посчитать сумму цифр числа
    //можно посчитать для трехзначного - 0.5 балла
    //для любого числа - 1 балл
    //подсказка - в случае для любого числа используйте while
    public static int sum(int n) {
        int res = 0;
        while (n > 0) {
            res += n % 10;
            n /= 10;
        }
        return res;
    }

    //определить, является ли год високосным
    //В високосном году - 366 дней, тогда как в обычном - 365.
    //Високосным годом является каждый четвёртый год, за исключением столетий, которые не кратны 400.
    //Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
    //Годы 1600 и 2000 - високосные, так как они кратны 100 и кратны 400.
    //Годы 2100, 2200 и 2300 - не високосные.
    //за правильный ответ - 0.5 балла
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year%100!=0) || year%400==0)
            return true;
        return false;
    }

    //здесь вам нужно будет использовать результат прошлой задачи
    //и вывести, сколько дней в году
    //правильный ответ - 0.5 балла
    public static int daysInYear(int year) {
        if (isLeapYear(year)) {
            return 366;
        } else {
            return 365;
        }
    }

    //определить номер дня недели по строке
    //например: Понедельник - 1
    //правильный ответ - 1 балл
    public static int dayOfTheWeek(String n) {
        switch (n.toLowerCase()) {
            case "понедельник":
                return 1;
            case "вторник":
                return 2;
            case "среда":
                return 3;
            case "четверг":
                return 4;
            case "пятница":
                return 5;
            case "суббота":
                return 6;
            case "воскресенье":
                return 7;
            default:
                return 0;
        }
    }

    //вывести массив на экран в виде: [1, 5, 3, 7, 10, 2, 5]
    //правильное решение - 0.5 балла
    public static void printArray(int[] array) {
        int n = array.length;
        System.out.print("[");
        for (int i = 0; i < n - 1; i++)
            System.out.print(array[i] + ", ");
        System.out.println(array[n - 1] + "]");
    }

    //вывести двойной массив на экран в виде:
    // [1, 5, 3, 7, 10, 2, 5]
    // [1, 5, 3, 7, 10, 2, 5]
    // ...
    //правильное решение - 0.5 балла
    public static void printArray(int[][] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.print("[");
            int m = array[i].length;
            for (int j = 0; j < m - 1; j++)
                System.out.print(array[i][j] + ", ");
            System.out.println(array[i][m - 1] + "]");
        }
    }

    //отсортировать одномерный массив в порядке возрастания
    //если не знаете, как сортировать, то подсказка -
    //метод пузырька (один из самых простых для понимания)
    //правильный ответ - 1 балл
    public static int[] sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    int k = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = k;
                }
        return array;
    }


    //здесь можете тестировать свои решения
    public static void main(String[] args) {
    }
}