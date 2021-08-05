package depthFirstSearch;

/** Целочисленный массив длины n состоит из чисел от 0 до n-1. Получим длину самой длинной последовательности следующего вида:
 * nums[index], nums[nums[index]], nums[nums[nums[index]]],... до момента, когда попадём на уже имеющейся в последовательности элемент
 * @author Сергей Шершавин*/

public class ArrayNesting {

    /**@return максимальную длину последовательности*/
    public int getMaxLength(int[] nums) {
        int maxLength = 0;
        /*Из условия получаем граф, состоящий из нескольких циклов "без хвостов", таким образом не имеет значения с какого
        * индекса начинать обход*/
        for (int i = 0; i < nums.length; i++) {
            int currentLength = 0, currentIndex = i;
            while (nums[currentIndex] != -1) {
                currentLength++;
                int temp = nums[currentIndex];
                nums[currentIndex] = -1; // отмечаем уже посещённые элементы
                currentIndex = temp;
            }
            maxLength = Math.max(maxLength, currentLength);
        }
        return maxLength;
    }
}
