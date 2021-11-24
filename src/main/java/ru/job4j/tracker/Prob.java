package ru.job4j.tracker;

public class Prob {
    public static int sum(int[] mas, int a){
        int rst = -1;
        for (int i = 0; i < mas.length; i++) {
            if(mas[i] == a){
               rst = mas[i];
               break;
            }
        }
        return rst;
    }

    public static int[] swap(int[] array, int source, int dest){
        int a = array[source];
        array[source] = array[dest];
        array[dest] = a;
        return array;
    }

    public static void main(String[] args){
        int[] mas = new int[5];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = i;
        }
         mas = Prob.swap(mas, 1, 3);
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }



    }
}
