package Task1;

import java.util.ArrayList;
import java.util.List;

// Задание 1

// 1.Пусть дан произвольный список целых чисел.

// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

public class Task1 {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    numbers.add(5);
    numbers.add(2);
    numbers.add(9);
    numbers.add(4);
    numbers.add(7);

    System.out.println("Исходный список чисел: " + numbers);

    removeEvenNumbers(numbers);
    System.out.println("Список чисел без четных чисел: " + numbers);

    int min = findMinimum(numbers);
    System.out.println("Минимальное значение: " + min);

    int max = findMaximum(numbers);
    System.out.println("Максимальное значение: " + max);

    double average = findAverage(numbers);
    System.out.println("Среднее значение: " + average);
  }

  public static void removeEvenNumbers(List<Integer> numbers) {
    numbers.removeIf(num -> num % 2 == 0);
  }

  public static int findMinimum(List<Integer> numbers) {
    int min = Integer.MAX_VALUE;
    for (int num : numbers) {
      if (num < min) {
        min = num;
      }
    }
    return min;
  }

  public static int findMaximum(List<Integer> numbers) {
    int max = Integer.MIN_VALUE;
    for (int num : numbers) {
      if (num > max) {
        max = num;
      }
    }
    return max;
  }

  public static double findAverage(List<Integer> numbers) {
    if (numbers.isEmpty()) {
      return 0.0;
    }

    int sum = 0;
    for (int num : numbers) {
      sum += num;
    }
    return (double) sum / numbers.size();
  }
}
