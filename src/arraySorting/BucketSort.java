package arraySorting;

/**Блочная сортировка.
 * @author Сергей Шершавин*/

public class BucketSort extends Sorting {
    public BucketSort(int[] array) {
        super(array);
    }

    private void bucketSort(int left, int right, int[] temp) {
        if (right - left <= 64) {
            new InsertionSort(array).sort();
            return;
        }
        int curMin = array[left], curMax = array[left];
        boolean isSorted = true;
        for (int i = left + 1; i < right; i++) {
            curMin = Math.min(curMin, array[i]);
            curMax = Math.max(curMax, array[i]);
            if (array[i] < array[i - 1]) isSorted = false;
        }
        if (isSorted) return;

        int diff = curMax - curMin + 1;
        int numBuckets;
        if (right - left <= 1e7) numBuckets = 1500;
        else numBuckets = 3000;

        int range = (diff + numBuckets - 1) / numBuckets;
        int[] count = new int[numBuckets + 1];
        int cur = 0;
        for (int i = left; i < right; i++) {
            temp[cur++] = array[i];
            int ind = (array[i] - curMin) / range;
            count[ind + 1]++;
        }

        int size = 0;
        for (int i = 0; i < numBuckets; i++)
            if (count[i] != 0) size++;

        int[] run = new int[size];
        cur = 0;
        for (int i = 0; i < numBuckets; i++)
            if (count[i] != 0) run[cur++] = i - 1;

        for (int i = 1; i <= numBuckets; i++)
            count[i] += count[i - 1];

        cur = 0;
        for (int i = left; i < right; i++) {
            int ind = (temp[cur] - curMin) / range;
            array[count[ind]] = temp[cur];
            cur++;
            count[ind]++;
        }
        for (int i = 0; i < size; i++) {
            int r = run[i];
            if (r != 0) bucketSort(left + count[r - 1], left + count[r], temp);
            else bucketSort(left, left + count[r], temp);
        }
    }

    @Override
    public void sort() {
        int[] temp = new int[array.length];
        bucketSort(0, array.length, temp);
    }
}
