package dynamicProgramming;

/** Уродливый номер - число, имеющее своим делителем из простых чисел только 2, 3, 5. 1 - тоже является уродливым по умолчанию.
 * @author Сергей Шершавин*/

public class UglyNumber {

    /**@return n-е уродливое число*/
    public int nthUglyNumber(int n) {
        int[] uglyNumbers = new int[n]; // хранение уродливых чисел для соответствующего n, под индексом n-1.
        int indexOf2 = 0, indexOf3 = 0, indexOf5 = 0; // текущий индекс для получения очередного числа через соответствующий множитель
        int curOf2 = 2, curOf3 = 3, curOf5 = 5; // храним последние значения для множителей 2, 3 и 5 соответственно
        uglyNumbers[0] = 1;
        for (int i = 1; i < n; i++) {
            int ugly = Math.min(curOf2, Math.min(curOf3, curOf5));
            uglyNumbers[i] = ugly;

            if (ugly == curOf2) {
                indexOf2++;
                curOf2 = uglyNumbers[indexOf2] * 2;
            }

            if (ugly == curOf3) {
                indexOf3++;
                curOf3 = uglyNumbers[indexOf3] * 3;
            }

            if (ugly == curOf5) {
                indexOf5++;
                curOf5 = uglyNumbers[indexOf5] * 5;
            }
        }
        return uglyNumbers[n-1];
    }
}
