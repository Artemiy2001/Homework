package home_work_1;

public class TestPriority {

    public static void main(String[] args) {

        int a = 8;
        int b = 2;
        int res;

        res = 5 + b / a;
        System.out.println(res);
        /* выводит 5, т.к. первое дейстиве деление */

        res = (5 + b) / a;
        System.out.println(res);
        /* выводит 0, так как первое действие в скобках */

        res = (5 + b++) / a;
        System.out.println(res);
        /* выводит 0, так как b инкементируется после решения */

        a = 8;
        b = 2;

        res = (5 + b++) / --a;
        System.out.println(res);
        /* выводит 1, так как a дикриментируется до решения и получается а = 7  */

        a = 8;
        b = 2;

        res = (5 * 2 >> b++) / --a;
        System.out.println(res);
        /* выводит 0, так как 10 >> 2 = 2 */

        a = 8;
        b = 2;

        res = (5 + 7 > 20 ? 68 : 22 * 2 >> b++) / --a;
        System.out.println(res);
        /* выводит 1, так как 20 > 12 и выполняется второе условие, 44 >> 2 = 11, а потом 11 / 7 = 1 */

        a = 8;
        b = 2;

        // res = (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> b++) / --a; ошибка в первом условии

        // res = 6 - 2 > 3 && 12 * 12 <= 119; ошибка везде

        boolean x = true && false;
        System.out.println(x);
        // выводит false так как && выводит true если два значения true



    }

}
