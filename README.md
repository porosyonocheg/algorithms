## Алгоритмы на Java
1. Данный проект представляет собой примеры реализации классических алгоритмов на языке Java таких как:
 - сортировка массива
 - backtracking
 - бинарный поиск
 - динамическое программирование
 - жадный алгоритм
 
2. В проекте представлены результаты сравнения различных алгоритмов в зависимости от входных данных.
3. Данный проект задокументирован на русском языке с целью большей доступности для русскоязычного пользователя, поскольку носит исключительно образовательную функцию.

### Виды представленных сортировок:
1. [Пузырьковая](https://github.com/porosyonocheg/algorithms/blob/master/src/arraySorting/BubbleSort.java)
2. [Блочная](https://github.com/porosyonocheg/algorithms/blob/master/src/arraySorting/BucketSort.java)
3. [Расческой](https://github.com/porosyonocheg/algorithms/blob/master/src/arraySorting/CombSort.java)
4. [Подсчётом](https://github.com/porosyonocheg/algorithms/blob/master/src/arraySorting/CountingSort.java)
5. [Вставками](https://github.com/porosyonocheg/algorithms/blob/master/src/arraySorting/InsertionSort.java)
6. [Слиянием](https://github.com/porosyonocheg/algorithms/blob/master/src/arraySorting/MergeSort.java)
7. Две реализации быстрой сортировки: [1](https://github.com/porosyonocheg/algorithms/blob/master/src/arraySorting/QuickSort.java), [2](https://github.com/porosyonocheg/algorithms/blob/master/src/arraySorting/QuickSort2.java)
8. [Выбором](https://github.com/porosyonocheg/algorithms/blob/master/src/arraySorting/SelectionSort.java)
9. [Методом Шелла](https://github.com/porosyonocheg/algorithms/blob/master/src/arraySorting/ShellSort.java)

#### Сравнение сортировок с java.util.Arrays.sort()
Первая строка соответствует отсортированному массиву
Вторая строка соответствует массиву отсортированному в обратном порядке
Третья строка соответствует массиву случайных чисел

### Задачи с использованием алгоритма backtracking
1. [Получить все возможные комбинации букв для переданного набора цифр. Каждой цифре соответствует набор букв в точности, как кнопочном мобильном телефоне](https://github.com/porosyonocheg/algorithms/blob/master/src/backtracking/LetterCombinationsOfAPhoneNumber.java)
![](https://www.yorku.ca/mack/chapter5-f2.jpg)
2. [Получение уникальных комбинаций чисел из переданного массива](https://github.com/porosyonocheg/algorithms/blob/master/src/backtracking/Subsets.java)
3. [Получение всех возможных представлений массива после перестановок его элементов](https://github.com/porosyonocheg/algorithms/blob/master/src/backtracking/Permutations.java)
4. [Получение всех возможных правильных комбинаций открытых-закрытых скобок для заданного числа пар](https://github.com/porosyonocheg/algorithms/blob/master/src/backtracking/PairsOfParentheses.java)
5. [Получение всех возможных комбинаций элементов массива с сохранением порядка следования и в неубывающем порядке значений](https://github.com/porosyonocheg/algorithms/blob/master/src/backtracking/IncreasingSubsequences.java)
6. [Получение комбинаций чисел на отрезке от 1 до заданного числа](https://github.com/porosyonocheg/algorithms/blob/master/src/backtracking/Combinations.java)
7. [Получение всех уникальных наборов чисел из переданного массива, сумма которых равна заданному числу](https://github.com/porosyonocheg/algorithms/blob/master/src/backtracking/CombinationSum.java)
8. [Получение всех возможных разбиений переданной строки на подстроки-палиндромы](https://github.com/porosyonocheg/algorithms/blob/master/src/backtracking/PalindromePartitioning.java)
9. [Получение всех возможных комбинаций символов для данной строки с изменением регистра букв](https://github.com/porosyonocheg/algorithms/blob/master/src/backtracking/LetterCasePermutation.java)
10. [Поиск всех возможных путей от начального узла до конечного в направленном ациклическом графе](https://github.com/porosyonocheg/algorithms/blob/master/src/backtracking/AllPathsFromSourceToTarget.java)
11. [Получение количества всех возможных уникальных комбинаций из букв переданной буквенной строки](https://github.com/porosyonocheg/algorithms/blob/master/src/backtracking/LetterTilePossibilities.java)
12. [Поиск переданного слова в матрице символов](https://github.com/porosyonocheg/algorithms/blob/master/src/backtracking/WordSearch.java)
13. [Поиск количества красивых композиций](https://github.com/porosyonocheg/algorithms/blob/master/src/backtracking/BeautifulArrangement.java)
14. [Разбиение целочисленного массива на k-подмножеств с равными суммами их значений](https://github.com/porosyonocheg/algorithms/blob/master/src/backtracking/PartitionToEqualSumSubsets.java)

### Задачи с использованием бинарного поиска
1. [Поиск элемента в повёрнутом массиве, отсортированном в неубывающем порядке](https://github.com/porosyonocheg/algorithms/blob/master/src/binarySearch/SearchInRotatedSortedArray.java)
2. [Поиск первого и последнего индекса заданного элемента в отсортированном массиве](https://github.com/porosyonocheg/algorithms/blob/master/src/binarySearch/FirstAndLastPositionOfElementInSortedArray.java)
3. [Поиск первого индекса элемента с заданным значением в отсортированном по возрастанию массиве](https://github.com/porosyonocheg/algorithms/blob/master/src/binarySearch/InsertPosition.java)
4. [Определение является ли переданное число "идеальным квадратом"](https://github.com/porosyonocheg/algorithms/blob/master/src/binarySearch/IsPerfectSquare.java)
5. [Поиск k-го наименьшего элемента в матрице, в которой ряды и столбцы отсортированы в возрастающем порядке](https://github.com/porosyonocheg/algorithms/blob/master/src/binarySearch/KthSmallestElementInSortedMatrix.java)
6. [Поиск уникального элемента в отсортированном по возрастанию массиве целых чисел, все остальные элементы которого дублированы](https://github.com/porosyonocheg/algorithms/blob/master/src/binarySearch/SingleElementInSortedArray.java)
7. [Поиск пикового элемента в целочисленной матрице](https://github.com/porosyonocheg/algorithms/blob/master/src/binarySearch/FindPeakElement.java)
8. [Определение содержится ли целевой элемент в матрице, ряды которой отсортированы в возрастающем порядке, а первый элемент следующего ряда всегда больше последнего элемента в предыдущем ряду](https://github.com/porosyonocheg/algorithms/blob/master/src/binarySearch/SearchTargetInMatrix.java)

### Задачи с использованием поиска в глубину
1. [Поиск максимальной длины строки, образованной при конкатенации строк из переданного списка и содержащей только уникальные буквы](https://github.com/porosyonocheg/algorithms/blob/master/src/depthFirstSearch/ConcatenatedStringWithUniqueCharacters.java)
2. [Поиск количества "островов" из единиц в бинарной матрице](https://github.com/porosyonocheg/algorithms/blob/master/src/depthFirstSearch/Islands.java)
3. [Поиск количества "провинций" для заданной матрицы связей "городов"](https://github.com/porosyonocheg/algorithms/blob/master/src/depthFirstSearch/Provinces.java)
4. [Получение численных результатов соотношений двух параметров из строковых запросов](https://github.com/porosyonocheg/algorithms/blob/master/src/depthFirstSearch/EvaluateDivision.java)
5. [Сортировка целых чисел в лексикографическом порядке](https://github.com/porosyonocheg/algorithms/blob/master/src/depthFirstSearch/LexicographicalNumbers.java)
6. [Перемещение по целочисленному массиву неотрицательных чисел в соответствии с условиями](https://github.com/porosyonocheg/algorithms/blob/master/src/depthFirstSearch/JumpGame.java)
7. [Получение максимальной суммы значений элементов, доступных для первого игрока](https://github.com/porosyonocheg/algorithms/blob/master/src/depthFirstSearch/StoneGame.java)
8. [Поиск всех существующих путей выхода объекта за границы поля заданного размера](https://github.com/porosyonocheg/algorithms/blob/master/src/depthFirstSearch/OutOfBoundaryPaths.java)
9. [Получение индексов столбцов, из которых "выпадает мяч"](https://github.com/porosyonocheg/algorithms/blob/master/src/depthFirstSearch/FallingBall.java)
10. [Получение максимальной длины последовательности элементов массива вида: a{i}, a{a{i}}, a{a{a{i}}},...](https://github.com/porosyonocheg/algorithms/blob/master/src/depthFirstSearch/ArrayNesting.java)
11. [Поиск безопасных узлов направленного графа](https://github.com/porosyonocheg/algorithms/blob/master/src/depthFirstSearch/FindEventualSafeStates.java)
12. [Поиск пути с минимальным усилием](https://github.com/porosyonocheg/algorithms/blob/master/src/depthFirstSearch/PathWithMinimumEffort.java)
13. [Поиск минимальной длины моста для соединения двух островов](https://github.com/porosyonocheg/algorithms/blob/master/src/depthFirstSearch/ShortestBridge.java)
14. [Подсчёт времени необходимого на оповещение всех сотрудников компании](https://github.com/porosyonocheg/algorithms/blob/master/src/depthFirstSearch/TimeNeededToInformAllEmployees.java)
15. [Проверка является ли неориентированный граф двудольным](https://github.com/porosyonocheg/algorithms/blob/master/src/depthFirstSearch/IsGraphBipartite.java)
16. [Поиск минимально возможного времени для обход дерева с целью сбора всех яблок в его узлах и возвращения в вершину](https://github.com/porosyonocheg/algorithms/blob/master/src/depthFirstSearch/CollectAllApplesInATree.java)

![](https://assets.leetcode.com/uploads/2020/04/23/min_time_collect_apple_1.png)

### Задачи с использованием динамического программирования
1. [Задачи размена суммы монетами заданных номиналов](https://github.com/porosyonocheg/algorithms/blob/master/src/dynamicProgramming/CoinChange.java)
2. [Поиск различных комбинаций элементов массива уникальных целых чисел, сумма которых равна целевой](https://github.com/porosyonocheg/algorithms/blob/master/src/dynamicProgramming/CombinationSum.java)
3. [Получение количества квадратных подматриц, состоящих только из 1, в целочисленной матрице](https://github.com/porosyonocheg/algorithms/blob/master/src/dynamicProgramming/CountSquareSubmatricesWithAllOnes.java)
4. [Подсчёт минимального числа операций удаления символов из двух исходных строк, чтобы получить эквивалентные строки](https://github.com/porosyonocheg/algorithms/blob/master/src/dynamicProgramming/DeleteOperationsForTwoStrings.java)
5. [Получение всех возможных калькуляций при различных комбинациях скобок в математическом выражении](https://github.com/porosyonocheg/algorithms/blob/master/src/dynamicProgramming/DifferentWaysToAddParentheses.java)
6. [Задачи о максимизации награбленной суммы при обходе домов домушником](https://github.com/porosyonocheg/algorithms/blob/master/src/dynamicProgramming/HouseRobber.java)
7. [Перемещение по элементам массива от нулевого к последнему в соответствии с условиями](https://github.com/porosyonocheg/algorithms/blob/master/src/dynamicProgramming/JumpGame.java)
8. [Получение самого длинного делимого поднабора из целочисленного массива](https://github.com/porosyonocheg/algorithms/blob/master/src/dynamicProgramming/LargestDivisibleSubset.java)
9. [Поиск максимальной длины общего подмножества символов двух строк](https://github.com/porosyonocheg/algorithms/blob/master/src/dynamicProgramming/LongestCommonSubsequence.java)
10. [Поиск длины самой большой возрастающей последовательности чисел в переданном массиве](https://github.com/porosyonocheg/algorithms/blob/master/src/dynamicProgramming/LongestIncreasingSubsequence.java)
11. [Поиск длины самой большой палиндромической подпоследовательности символов в строке](https://github.com/porosyonocheg/algorithms/blob/master/src/dynamicProgramming/LongestPalindromicSubsequence.java)
12. [Поиск в бинарной символьной матрице максимальной площади квадрата, состоящего только из '1'](https://github.com/porosyonocheg/algorithms/blob/master/src/dynamicProgramming/MaximalSquare.java)
13. [Поиск максимальной длины цепи отрезков](https://github.com/porosyonocheg/algorithms/blob/master/src/dynamicProgramming/MaximumLengthOfPairChain.java)
14. [Поиск максимального по значению произведения элементов среди подмассивов исходного массива](https://github.com/porosyonocheg/algorithms/blob/master/src/dynamicProgramming/MaximumProductSubarray.java)
15. [Подсчёт минимальной стоимости билетов для покрытия всех дней для путешествий](https://github.com/porosyonocheg/algorithms/blob/master/src/dynamicProgramming/MinimumCostForTickets.java)
16. [Получение минимальной суммы падающего пути](https://github.com/porosyonocheg/algorithms/blob/master/src/dynamicProgramming/MinimumFallingPathSum.java)
17. [Поиск количества хороших способов разбиения строки](https://github.com/porosyonocheg/algorithms/blob/master/src/dynamicProgramming/NumberOfGoodWaysToSplitString.java)
18. [Получение максимального набора бинарных строк из массива в соответствии с ограничениями на общее количество нулей и единиц](https://github.com/porosyonocheg/algorithms/blob/master/src/dynamicProgramming/OnesAndZeroes.java)
19. [Определение возможности разбиения переданного массива положительных целых чисел на две части с равными суммами значений элементов](https://github.com/porosyonocheg/algorithms/blob/master/src/dynamicProgramming/PartitionEqualSubsetSum.java)
20. [Определение является ли сумма элементов, доступная первому игроку больше или равной сумме элементов, доступной второму игроку](https://github.com/porosyonocheg/algorithms/blob/master/src/dynamicProgramming/PredictTheWinner.java)
21. [Получение количества строк заданной длины, состоящих из гласных отсортированных в лексико-графическом порядке](https://github.com/porosyonocheg/algorithms/blob/master/src/dynamicProgramming/SortedVowelStrings.java)
22. [Получение целевой суммы различными комбинациями знаков для элементов исходного массива](https://github.com/porosyonocheg/algorithms/blob/master/src/dynamicProgramming/TargetSum.java)
23. [Поиск минимальной суммы прохождения от головы до низа треугольного массива](https://github.com/porosyonocheg/algorithms/blob/master/src/dynamicProgramming/Triangle.java)
24. [Поиск минимального числа операций копирований-вставок для получения заданного числа исходного символа](https://github.com/porosyonocheg/algorithms/blob/master/src/dynamicProgramming/TwoKeysKeyboard.java)
25. [Поиск n-го уродливого числа](https://github.com/porosyonocheg/algorithms/blob/master/src/dynamicProgramming/UglyNumber.java)
26. [Поиск количества уникальных путей, которыми робот, двигаясь из верхнего левого угла поля заданного размера, может достичь правого нижнего угла](https://github.com/porosyonocheg/algorithms/blob/master/src/dynamicProgramming/UniquePaths.java)
27. [Провера валидности скобок](https://github.com/porosyonocheg/algorithms/blob/master/src/dynamicProgramming/ValidParenthesisString.java)
28. [Получение размера самой длинной качающейся подпоследовательности](https://github.com/porosyonocheg/algorithms/blob/master/src/dynamicProgramming/WiggleSubsequence.java)
29. [Разбиение целочисленного массива на подмассивы, значение каждого элемента в которых будет равно максимальному значению в данном подмассиве](https://github.com/porosyonocheg/algorithms/blob/master/src/dynamicProgramming/NetworkDelayTime.java)
30. [Определение максимального времени задержки при прохождении сигнала от заданного узла до всех остальных](https://github.com/porosyonocheg/algorithms/blob/master/src/dynamicProgramming/NetworkDelayTime.java)
31. [Задачи подсчёта максимальной прибыли от покупки-продажи акций](https://github.com/porosyonocheg/algorithms/blob/master/src/dynamicProgramming/BestTimeToBuyAndSellStock.java)
32. [Поиск минимальной цены полёта из одного города в другой с ограничением на количество транзитных городов](https://github.com/porosyonocheg/algorithms/blob/master/src/dynamicProgramming/CheapestFlightsWithinKStops.java)

### Задачи с использованием жадного алгоритма
1. [Поиск минимального необходимого числа стрел необходимого, чтобы лопнуть все шары, размещённые один над другим](https://github.com/porosyonocheg/algorithms/blob/master/src/greedy/MinimumNumberOfArrowsToBurstBalloons.java)
2. [Поиск максимальной вместимости среди всех контейнеров](https://github.com/porosyonocheg/algorithms/blob/master/src/greedy/ContainerWithMostWater.java)
3. [Преобразование массива целых чисел в наибольшее возможное целое число, путём слияния элементов](https://github.com/porosyonocheg/algorithms/blob/master/src/greedy/LargestNumber.java)
4. [Поиск максимального числа курсов, которые возможно пройти](https://github.com/porosyonocheg/algorithms/blob/master/src/greedy/CourseSchedule.java)
5. [Поиск минимальной суммы нелистовых узлов дерева, построенного на основе произведений максимальных значений листьев поддеревьев каждого узла](https://github.com/porosyonocheg/algorithms/blob/master/src/greedy/MinimumCostTreeFromLeafValues.java)
