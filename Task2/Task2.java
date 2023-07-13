package Task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Task2 {

  public static void main(String[] args) {
    planetsCounter(7);
  }

  static void randomNumbers(int size, int maxValue) {
    ArrayList<Integer> nums = new ArrayList<>(size);
    Random rand = new Random();

    for (Integer num : nums)
      System.out.println();

    nums.sort(null);

    Iterator<Integer> iter = nums.iterator();

    while (iter.hasNext())
      System.out.print(iter.next() + " ");
  }

  static void removeDuplicates(List<String> list) {
    List<String> uniqueList = new ArrayList<>(list);
    uniqueList.removeAll(List.copyOf(list));
    list.clear();
    list.addAll(uniqueList);
  }

  static void planetsCounter(int n) {
    List<String> listPlanets = List.of("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune");
    List<String> randPlanets = new ArrayList<String>(n);
    int[] counts = new int[listPlanets.size()];

    Random rand = new Random();

    System.out.println("Список с повторениями:");

    for (int i = 0; i < n; i++) {
      randPlanets.add(listPlanets.get(rand.nextInt(listPlanets.size())));
      System.out.println(randPlanets.get(i) + " ");
      counts[listPlanets.indexOf(randPlanets.get(i))]++;
    }
    System.out.println();

    System.out.println("Список без повторений:");
    for (int i = 0; i < counts.length; i++) {
      System.out.printf("%s - %s\n", listPlanets.get(i), counts[i]);
    }

    removeDuplicates(randPlanets);

    System.out.println();
    System.out.println("Список без повторений:");
    for (String planet : randPlanets) {
      System.out.println(planet);
    }
  }
}
