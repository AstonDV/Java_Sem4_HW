// Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор

package Seminars.Sem04HW;

import java.util.LinkedList;
import java.util.Iterator;

public class task03 {
    public static int getSum(LinkedList<Integer> list) {
        int sum = 0;
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            sum += iterator.next();
        }
        return sum;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Исходный список: " + list);

        int sum = getSum(list);

        System.out.println("Сумма всех элементов списка: " + sum);
    }
}
