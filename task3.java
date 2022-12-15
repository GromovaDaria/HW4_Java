/*Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.*/

import java.util.LinkedList;

public class task3 {
    public static void main(String[] args) {
       LinkedList <String> first = new LinkedList<>();
       first.add("a");
       first.add("b");
       first.add("c");
       first.add("d");

       System.out.println("Исходный список: "+ first);
       System.out.println("Перевернутый список: " + reverse(first));
    }

    static <T> LinkedList<T> reverse(LinkedList<T> listik) { 
        LinkedList <T> second = new LinkedList<>();
        for(int i = listik.size()-1; i >= 0; i--){
            second.add(listik.get(i));
        }
        return second; }
    
}