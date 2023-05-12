// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список. Постараться не обращаться к листу по индексам

package Seminars.Sem04HW;

import java.util.LinkedList;

public class task01 {
    public static <T> LinkedList<T> reverseList(LinkedList<T> list) {
        LinkedList<T> reversed = new LinkedList<>();
        for (T element : list) {
            reversed.addFirst(element);
        }
        return reversed;
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        System.out.println("Исходный список: " + list);

        LinkedList<String> reversed = reverseList(list);

        System.out.println("Перевернутый список: " + reversed);
    }
}
