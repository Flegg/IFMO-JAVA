package com.ifmo.objects.list;

public class TestMain {
    public static void main(String[] args) {
//        LinkedList<String> list = new LinkedList<>();
//
//        list.add("hello");
//        list.add("world");
//        list.add("!");
//        list.remove(2);

//        ArrayList<Integer> ar = new ArrayList();
//
//        ar.add(1);
//        ar.add(2);
//        ar.add(3);
//
//        for (Integer i : ar) {
//            System.out.println(i);
//        }

        ArrayList<String> list = new ArrayList<>();
        list.add("Всё");
        list.add("работает");
        list.add("!!!");
        System.out.println(list.size());
        list.add("test1");
        System.out.println(list.size());

        for (String s : list) {
            System.out.println(s);
        }


    }
}
